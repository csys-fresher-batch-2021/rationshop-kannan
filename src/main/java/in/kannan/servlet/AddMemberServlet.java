package in.kannan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		PrintWriter out = response.getWriter();

		String name1 = request.getParameter("name2");
		// System.out.println(name1);
		boolean isAdded = MemberDetailService.addMember(name1);

		if (isAdded) {
			String Message = "Member Name Added";
			response.sendRedirect("AddMember.jsp?Message=" + Message);

		} else {
			String errorMessage = "Unable to add Member Name";
			response.sendRedirect("AddMember.jsp?errorMessage=" + errorMessage);
		}

	}

}
