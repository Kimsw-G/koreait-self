package com.btodo.todo;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DailyTodoDAO;
import com.model.DailyTodoVO;
import com.model.MemberVO;
import com.util.JDBCUtil;
import com.util.ServletUtil;

@WebServlet("/todo/dailyWrite")
public class DailyWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO mv = ServletUtil.getSessionInfo(request);
		String[] date = {"일","월","화","수","목","금","토"};
		
		request.setAttribute("date", date);
		
		ServletUtil.goJSP("/privacy/dailyWrite", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO mv = ServletUtil.getSessionInfo(request);
		DailyTodoVO dv = new DailyTodoVO();
		dv.setCtnt(ServletUtil.getParamString("ctnt", request));
		dv.setTodoDate(calcDate(request));
		dv.setM_pk(mv.getM_pk());
		// ++ dv.setDday_pk(); //도 구현하세요
		
		// TODO : DAO에서 dailyTODO에 넣기!
		DailyTodoDAO.insertDailyTodoList(dv);
		
		response.sendRedirect("./daily");
	}
	
	private int calcDate(HttpServletRequest request) {
		int cnt = 0;
		String[] todoDates = request.getParameterValues("todoDate");
		for (int i = 0; i < 7; i++) {
			cnt += Math.pow(i,2) * Integer.parseInt(todoDates[i]);
		}
		return cnt;
	}

}
