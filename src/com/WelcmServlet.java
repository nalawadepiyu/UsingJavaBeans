package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcmServlet
 */
@WebServlet("/WelcmServlet")
public class WelcmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
			User user = new User();
			
			StringBuffer errors = new StringBuffer();
	    
			String firstName = request.getParameter("firstname");
	    	String lastName = request.getParameter("lastname");
	    	
	    	user.setFirstName(firstName);
	    	user.setLastName(lastName);
	    	
	    	if(isFieldEmpty(firstName)){
	    		errors.append("First name cant be blank");
	    	}
	    	
	    	if(isFieldEmpty(lastName)){
	    		errors.append("last name cant be blank");
	    	}
	    	
	    	if(isFieldEmpty(user.getFirstName()) && isFieldEmpty(user.getLastName()))
	    	{
	    		errors.append("firstname andlast name cant be blank");
	    	}
	    		    	
	    	if(isFieldEmpty(errors.toString()))
	    	{	    		
	    		
	    		HttpSession session = request.getSession();
		    	session.setAttribute("userinfo", user);
				response.sendRedirect("jsp/display.jsp");
	    	}
	    	
	    	else
	    	{
	    		request.setAttribute("errors", errors.toString());
	    		RequestDispatcher rd = request.getRequestDispatcher("jsp/welcome.jsp");
	    		rd.forward(request, response);
	    	}
	    	
	    	
	        
	}

	private boolean isFieldEmpty(String field) {
		return field == null || field.trim().length() == 0;
	}


	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}

