package abc_lab;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.AppointmentController;
import test.Appointment;

import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;



@WebServlet("/Appointment/ModifyAppointmentServlet")

@MultipartConfig

public class ModifyAppointmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<String, String> fieldErrors = new HashMap<>();
        Appointment appointment = null;

     
        String appoiment_id = request.getParameter("appoiment_id");
        String status = request.getParameter("status");
        String result = request.getParameter("result");
        System.out.println(status+ "status");
        // Handle file upload
        Part filePart = request.getPart("reportFile");
        String uploadDir = getServletContext().getRealPath("/") + "uploads/";
        File directory = new File(uploadDir);
        if (!directory.exists()) {
            directory.mkdir();
        }
        System.out.println(filePart);
        String fileName = getFileName(filePart);
        String filePath = uploadDir + File.separator + fileName;
        try (InputStream input = filePart.getInputStream();
             OutputStream output = new FileOutputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            
        }
        String fileUrl = request.getContextPath() + "/uploads/" + fileName;

        if (fieldErrors.isEmpty()) {
            try {
               
                String id = String.valueOf(session.getAttribute("user-id"));
                String email = (String) session.getAttribute("user-email");
                if (id != null && email != null) {
                    appointment = AppointmentController.updateAppoiments(appoiment_id, status, result,
                    		fileUrl, id);
                } else {
                    fieldErrors.put("common", "User not logged in or identified.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                fieldErrors.put("common", "Something went wrong. please try again later.");
            }
        }

        // Handling success or failure
        if (appointment == null) {
           
            session.setAttribute("fieldErrors", fieldErrors);
        } else {
           
            session.setAttribute("user-create-status",
                    "Your Booking has been confirmed. You will receive a confirmation email shortly with all the details of your reservation");
        }

      
        response.sendRedirect("create.jsp");
    }
    
    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : partHeader.split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}

