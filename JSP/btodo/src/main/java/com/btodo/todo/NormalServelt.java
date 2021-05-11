package com.btodo.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.NormalTodoDao;
import com.model.MemberVO;
import com.model.NormalTodoVO;
import com.util.ServletUtil;

@WebServlet("/todo/normal")
public class NormalServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		// TODO : todo 날짜, todo 내용을 session에 저장된 id 정보를 통하여 가져오기
		MemberVO mv = new MemberVO();
		mv.setM_id((String)session.getAttribute("id"));
		List<NormalTodoVO> list = NormalTodoDao.selectNormalTodoList(mv);
		
		request.setAttribute("todoList", list);
		
		
		ServletUtil.goJSP("/privacy/normal", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NormalTodoVO
		doGet(request, response);
	}

}
