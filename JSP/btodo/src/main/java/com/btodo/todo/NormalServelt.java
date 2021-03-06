package com.btodo.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.NormalTodoDAO;
import com.model.MemberVO;
import com.model.NormalTodoVO;
import com.util.ServletUtil;

@WebServlet("/todo/normal")
public class NormalServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO : todo 날짜, todo 내용을 session에 저장된 id 정보를 통하여 가져오기
		MemberVO mv = ServletUtil.getSessionInfo(request);
		if (mv==null) {
			response.sendRedirect("/member/login");
			return;
		}
		List<NormalTodoVO> list = NormalTodoDAO.selectNormalTodoList(mv);
		
		request.setAttribute("todoList", list);
		
		ServletUtil.goJSP("/privacy/normal", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// normal.jsp 에서 ctnt 값을 넘겼을때.
		MemberVO mv = ServletUtil.getSessionInfo(request);
		NormalTodoVO nv = new NormalTodoVO();
		nv.setCtnt(ServletUtil.getParamString("ctnt", request));
		nv.setM_pk(mv.getM_pk());
		
		// TODO : normal todo에 todolist 추가하기
		NormalTodoDAO.insertNormalTodo(nv);
		
		doGet(request, response);
	}

}
