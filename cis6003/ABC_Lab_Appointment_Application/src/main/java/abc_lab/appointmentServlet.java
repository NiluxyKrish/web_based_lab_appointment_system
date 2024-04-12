package abc_lab;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import controller.AppointmentController;
import test.Appointment;
import test.User;


@WebServlet("/ABCLabAppointments")

public class appointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public appointmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<String, String> fieldErrors = new HashMap<>();
        User user = null;
        Appointment appointment = null;

       
        String booking_date = request.getParameter("booking_date");
        String booking_time = request.getParameter("booking_time");
        String recommended_doctor = request.getParameter("recommended_doctor");
        String[] medical_test = request.getParameterValues("medical_test");

     
        if (fieldErrors.isEmpty()) {
            try {
              
            	System.err.println("hello1");
                String id = String.valueOf(session.getAttribute("user-id"));
                String email = (String)session.getAttribute("user-email");
                if (id != null && email != null) {
                	System.err.println("hello2");
                    appointment = AppointmentController.createAppointment(id, email, recommended_doctor, booking_date,
                            booking_time, medical_test);
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
                    "Your appointment has been booked successfully. Your appointment details will be sent to your email shortly.");
        }
        System.err.println(fieldErrors);
        
        // Redirect appropriate page
        response.sendRedirect("appoiment.jsp");
    }
}
