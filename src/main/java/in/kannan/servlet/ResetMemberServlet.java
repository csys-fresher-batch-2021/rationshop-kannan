package in.kannan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.kannan.service.UserDetailService;

/**
 * Servlet implementation class ResetMemberServlet   ResetUserServlet
 */
@WebServlet(name = "ResetUserServlet", urlPatterns = { "/ResetUserServlet" })
public class ResetMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetMemberServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	UserDetailService.userDetailsReset();
	response.sendRedirect("usersDetail.jsp");
	}


}
