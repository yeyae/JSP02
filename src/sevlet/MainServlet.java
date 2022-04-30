package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// session을 검사
		// 검사해서 session안에 attribute에 사용자 정보가 들어있으면
		// 로그인 된 상태
		// 로그인 된 상태면 => main.jsp 로 보내서 웹 페이지 이용 가능하도록
		// 로그인 된 상태가 아니면 => loginForm.jsp로 보내서 로그인 하도록
		HttpSession session = req.getSession();
		if(session.getAttribute("userid") != null) {
			// 로그인 된 상태
			req.getRequestDispatcher("main.jsp").forward(req, resp);
			// main.jsp 로 forward 보내기
		} else {
			// 로그인이 안된 상태 (비로그인)
			// 파라미터 다 필요 없으므로 리다이렉트해서 보내버린다.
			resp.sendRedirect("loginForm.jsp");
		}
	
	}
	
}
