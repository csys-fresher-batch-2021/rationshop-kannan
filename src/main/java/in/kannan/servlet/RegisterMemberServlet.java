package in.kannan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.kannan.exception.InValidUserDataException;
import in.kannan.exception.ValidationException;
import in.kannan.service.RationCardDAO;

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
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		try {
			int userId = Integer.parseInt(request.getParameter("userId"));// NumberFormatException

			RationCardDAO.addMember(name, userId);
			String message = "Successfully Registered";

			response.sendRedirect("usersDetail.jsp?message" + message);
		} catch (ValidationException | InValidUserDataException | NumberFormatException e) {
			String errorMessage = "UnSuccessfully Registered";
			request.setAttribute("errorMessage", "Sorry InValid Details");
			try {
				request.getRequestDispatcher("Registrationform.jsp").forward(request, response);
				response.sendRedirect("Registrationform.jsp?errorMessage" + errorMessage);
			} catch (ServletException | IOException e1) {

				e1.printStackTrace();
			}

		}

	}
}
