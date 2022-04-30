package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. session �� �ִ� userid �Ӽ� ����
		// 2. loginForm.jsp �� redirect
		HttpSession session = req.getSession();
		session.removeAttribute("userid");
		resp.sendRedirect("loginForm.jsp");
	}
}
