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
		// 1. session 에 있는 userid 속성 삭제
		// 2. loginForm.jsp 로 redirect
		HttpSession session = req.getSession();
		session.removeAttribute("userid");
		resp.sendRedirect("loginForm.jsp");
	}
}
