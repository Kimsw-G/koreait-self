package com.btodo.todo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DailyTodoDAO;
import com.model.DailyTodoVO;
import com.model.MemberVO;
import com.util.ServletUtil;

@WebServlet("/todo/daily")
public class DailyServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO mv = ServletUtil.getSessionInfo(request);
		List<DailyTodoVO> list_ = DailyTodoDAO.selectDailyTodoList(mv);
		List<DailyTodoVO> list = new ArrayList<DailyTodoVO>();
		// mv.todoDate의 값은 이 일을 해야하는 요일이 담겨져있다.
		// 월 1, 화 2, 수 4, 목 8, 금 16, 토 32, 일 64 의 7비트의 값이다.
		// 왜 Cal은 일요일부터 시작?? 꼴받네
		// ex)월 화 일 => 1+2+64 => 67
		// 오늘의 의 요일값을 받아와서, 해당 값이 존재하는지 검사를 한다.
		// 수요일 => 4, 67에 4가 들어있는지 검사.
		// 해당값이 false일시 그 요일을 삭제한다
		for (DailyTodoVO dv : list_) {
			if (checkDate(dv.getTodoDate())) list.add(dv); //오늘 체크된 list만 반환해주기!
		}
		
		request.setAttribute("todoList", list);
		ServletUtil.goJSP("/privacy/daily", request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private boolean checkDate(int dateBin) {
		int date = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)-1;
		System.out.println((int)Math.pow(2, date));
		if(((int)Math.pow(2, date)&dateBin)==0) return false;
		return true;
	}

	
}
