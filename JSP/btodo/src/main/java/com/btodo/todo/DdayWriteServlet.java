package com.btodo.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DdayTodoDAO;
import com.model.DdayTodoVO;
import com.model.MemberVO;
import com.util.ServletUtil;

@WebServlet("/todo/ddayWrite")
public class DdayWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO mv = ServletUtil.getSessionInfo(request);
		
		ServletUtil.goJSP("/privacy/ddayWrite", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO mv = ServletUtil.getSessionInfo(request);
		DdayTodoVO dv = new DdayTodoVO();
		dv.setContent(ServletUtil.getParamString("content", request));
		dv.setDday(ServletUtil.getParamDate("dday", request));
		dv.setM_pk(mv.getM_pk());
		
		// dv를 dao로 보내서 출력하세요!!
		DdayTodoDAO.insertDdayTodo(dv);
		
		response.sendRedirect("/todo/dday");
		
	}

}
