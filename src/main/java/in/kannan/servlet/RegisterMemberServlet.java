package in.kannan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.kannan.exception.MyException;
import in.kannan.service.UserDetailService;

/**
 * Servlet implementation class RegisterMemberServlet
 */
@WebServlet("/RegisterMemberServlet")
public class RegisterMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterMemberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		try {
		int age = Integer.parseInt(request.getParameter("age"));//NumberFormatException
		
		
		String gender = request.getParameter("gender");

		try {
			UserDetailService.userDetailRegister(name, age, gender);
			String message = "Successfully Registered";
		
				response.sendRedirect("usersDetail.jsp?message" + message);
			
		} catch (MyException e) {
			
			String errorMessage = "UnSuccessfully Registered";
			request.setAttribute("errorMessage", "Sorry InValid Details");
			request.getRequestDispatcher("Registrationform.jsp").forward(request, response);
		
			
				response.sendRedirect("Registrationform.jsp?errorMessage" + errorMessage);
			

			
		}	

	}catch(NumberFormatException  e)//Catching the Number format Exception
		{
		request.setAttribute("NumericalError", "Sorry Invalid Details");
		request.getRequestDispatcher("Registrationform.jsp").forward(request,response);
		}

}
}
