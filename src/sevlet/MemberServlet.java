package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Member;

@WebServlet("/regist")
public class MemberServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		
		Member member = new Member();
		member.setId(id);
		member.setPassword(password);
		member.setEmail(email);
		member.setName(name);
		
		HttpSession session = req.getSession();
		session.setAttribute("member", member);
		session.setAttribute("id", id);
		session.setAttribute("pw", password);
		session.setAttribute("email", email);
		session.setAttribute("name", name);
		
		req.getRequestDispatcher("loginForm.jsp").forward(req, resp);
	}

}
