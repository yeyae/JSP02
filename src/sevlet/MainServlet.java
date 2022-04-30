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
		// session�� �˻�
		// �˻��ؼ� session�ȿ� attribute�� ����� ������ ���������
		// �α��� �� ����
		// �α��� �� ���¸� => main.jsp �� ������ �� ������ �̿� �����ϵ���
		// �α��� �� ���°� �ƴϸ� => loginForm.jsp�� ������ �α��� �ϵ���
		HttpSession session = req.getSession();
		if(session.getAttribute("userid") != null) {
			// �α��� �� ����
			req.getRequestDispatcher("main.jsp").forward(req, resp);
			// main.jsp �� forward ������
		} else {
			// �α����� �ȵ� ���� (��α���)
			// �Ķ���� �� �ʿ� �����Ƿ� �����̷�Ʈ�ؼ� ����������.
			resp.sendRedirect("loginForm.jsp");
		}
	
	}
	
}
