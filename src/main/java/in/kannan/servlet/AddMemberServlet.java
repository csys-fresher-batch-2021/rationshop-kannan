package in.kannan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.kannan.exception.ValidationException;
import in.kannan.service.MemberDetailService;

/**
 * Servlet implementation class AddMemberServlet
 */
@WebServlet("/AddMemberServlet")
public class AddMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name1 = request.getParameter("name2");

		try {
			 MemberDetailService.addMember(name1);
			
				String message = "Member Name Added";
				response.sendRedirect("displayMembers.jsp?Message" + message);

			
		} catch (ValidationException | IOException e) {
			String errorMessage = "Unable to add Member Name";
			request.setAttribute("errorMessage", "Sorry InValid Details");
			try {
				request.getRequestDispatcher("AddMember.jsp").forward(request, response);
				response.sendRedirect("AddMember.jsp?errorMessage" + errorMessage);
			} catch (ServletException |IOException e1) {

				e1.printStackTrace();
			}
		}

	}
}
