package com.btodo.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DdayTodoDAO;
import com.model.DdayTodoVO;
import com.model.MemberVO;
import com.util.ServletUtil;

@WebServlet("/todo/dday")
public class DdayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO mv = ServletUtil.getSessionInfo(request);
		if (mv==null) {
			response.sendRedirect("/member/login");
			return;
		}
		List<DdayTodoVO> list = DdayTodoDAO.selectDdayTodoList(mv);
		request.setAttribute("todoList", list);
		
		ServletUtil.goJSP("/privacy/dday", request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
