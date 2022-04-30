package sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Member;

// /login 으로 오는 요청을 처리해주는 서블릿
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private String tmpId = "user";
	private String tmpPw = "1234";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// <form method="get" action="login">
		// ajax method:"get"
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// <form method="post" action="login">
		// ajax method:"post"
		String userId = req.getParameter("userid");
		String userPw = req.getParameter("userpw");
		
		// 임시 유저아이디를 user
		// 임시 유저비밀번호를 1234
		
		// 아이디와 비밀번호가 같으면 로그인 성공
		// 아이디는 같으나 비밀번호가 다르면 로그인 실패
		// 아이디가 다르면 로그인 실패
		String url = ""; // 처리후 보낼 페이지 주소
		String msg = ""; // 로그인이 왜 실패했는지 알려주는 메시지
		
		// req 객체에서부터 session 가져오기
		HttpSession session = req.getSession();
		Member member = (Member)session.getAttribute("member");
		tmpId = member.getId();
		tmpPw = member.getPassword();
		tmpId = (String)session.getAttribute("id");
		tmpPw = (String)session.getAttribute("pw");
		
		if(userId != null && userId.equals(tmpId)) {
			// 아이디 있음
			
			if(userPw != null && userPw.equals(tmpPw)) {
				// 아이디도 있고, 비밀번호도 일치
				// => 로그인 성공
				msg = "로그인 성공!";
				// forward로 loginsuccess.jsp로 보내기
				// 로그인 성공시 세션에 사용자 아이디를 저장
				session.setAttribute("userid", userId);
				url = "main";
			} else {
				// 아이디가 있으나 비밀번호가 틀렸다.
				// => 로그인 실패
				msg = "비빌번호가 틀렸습니다.";
				// forward로 loginfail.jsp로 보내기
				url = "loginfail.jsp";
			}
		} else {
			// 아이디가 틀렸음
			// => 로그인 실패
			msg = "아이디가 틀렸습니다.";
			// forward로 loginfail.jsp로 보내기
			url = "loginfail.jsp";
		}
		
		// forward 한번에 처리
		req.setAttribute("msg", msg);
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}
	
}
