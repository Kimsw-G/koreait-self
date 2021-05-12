package com.btodo.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MemberDAO;
import com.model.MemberVO;
import com.util.ServletUtil;

@WebServlet("/member/regist")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletUtil.goJSP("/public/regist", request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO memberVO = new MemberVO();
		memberVO.setM_id(ServletUtil.getParamString("id", request));
		memberVO.setM_name(ServletUtil.getParamString("name", request));
		memberVO.setM_tel(ServletUtil.getParamStrings("tel", request));
		if(!comparePW(request))doGet(request, response);
		memberVO.setM_pw(ServletUtil.getHashedString("pw", request));
		
		//request.setAttribute("member", memberVO);
		//DAO에 vo를 넘겨 값들을 넘겨주자
		MemberDAO.insertMember(memberVO); // 0일시 에러 발생!
		
		// 로그인 페이지로 넘겨주자
		ServletUtil.goJSP("/member/login", request, response);
		
	}
	
	private boolean comparePW(HttpServletRequest request) {
		return ServletUtil.getParamString("pw", request).equals(ServletUtil.getParamString("pwck", request));
	}

}
