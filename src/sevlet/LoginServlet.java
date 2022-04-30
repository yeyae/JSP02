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

// /login ���� ���� ��û�� ó�����ִ� ����
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
		
		// �ӽ� �������̵� user
		// �ӽ� ������й�ȣ�� 1234
		
		// ���̵�� ��й�ȣ�� ������ �α��� ����
		// ���̵�� ������ ��й�ȣ�� �ٸ��� �α��� ����
		// ���̵� �ٸ��� �α��� ����
		String url = ""; // ó���� ���� ������ �ּ�
		String msg = ""; // �α����� �� �����ߴ��� �˷��ִ� �޽���
		
		// req ��ü�������� session ��������
		HttpSession session = req.getSession();
		Member member = (Member)session.getAttribute("member");
		tmpId = member.getId();
		tmpPw = member.getPassword();
		tmpId = (String)session.getAttribute("id");
		tmpPw = (String)session.getAttribute("pw");
		
		if(userId != null && userId.equals(tmpId)) {
			// ���̵� ����
			
			if(userPw != null && userPw.equals(tmpPw)) {
				// ���̵� �ְ�, ��й�ȣ�� ��ġ
				// => �α��� ����
				msg = "�α��� ����!";
				// forward�� loginsuccess.jsp�� ������
				// �α��� ������ ���ǿ� ����� ���̵� ����
				session.setAttribute("userid", userId);
				url = "main";
			} else {
				// ���̵� ������ ��й�ȣ�� Ʋ�ȴ�.
				// => �α��� ����
				msg = "�����ȣ�� Ʋ�Ƚ��ϴ�.";
				// forward�� loginfail.jsp�� ������
				url = "loginfail.jsp";
			}
		} else {
			// ���̵� Ʋ����
			// => �α��� ����
			msg = "���̵� Ʋ�Ƚ��ϴ�.";
			// forward�� loginfail.jsp�� ������
			url = "loginfail.jsp";
		}
		
		// forward �ѹ��� ó��
		req.setAttribute("msg", msg);
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}
	
}
