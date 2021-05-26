package in.kannan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.kannan.exception.MyException;
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name1 = request.getParameter("name2");

		boolean isAdded;
		try {
			 MemberDetailService.addMember(name1);
			
				String Message = "Member Name Added";
				response.sendRedirect("displayMembers.jsp?Message" + Message);

			
		} catch (MyException e) {
			String errorMessage = "Unable to add Member Name";
			request.setAttribute("errorMessage", "Sorry InValid Details");
			request.getRequestDispatcher("AddMember.jsp").forward(request, response);
			response.sendRedirect("AddMember.jsp?errorMessage" + errorMessage);
		}

	}
}
