package com.btodo.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.dao.MemberDAO;
import com.model.MemberVO;
import com.util.ServletUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/member/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletUtil.goJSP("/public/main", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO memberVO = new MemberVO();
		memberVO = MemberDAO.selectMemberVOById(ServletUtil.getParamString("id", request));
		
		// TODO : 받아온 회원 정보를 통해 pw체크 후 로그인 하기
		boolean flag = BCrypt.checkpw(ServletUtil.getParamString("pw", request), MemberDAO.selectPw(memberVO));
		if (flag) { // 인증 성공!
			System.out.println("인증 성공!");
			// 인증이 성공하였다는 정보를 session에 저장하자
			HttpSession session = request.getSession();
			memberVO.setM_pw(null);
			session.setAttribute("memberVO", memberVO); // session 지정!!
			response.sendRedirect("/todo/normal");
			return;
		}//실패?
		request.setAttribute("flag", false);
		doGet(request, response);
	}

}
