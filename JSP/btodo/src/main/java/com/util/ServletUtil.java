package com.util;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.model.MemberVO;

public class ServletUtil {
	
	public static void goJSP(String uri, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/"+uri+".jsp").forward(request, response);
	}
	
	// getParam
	public static String getParamStrings(String str, HttpServletRequest request) {
		String[] strArray = request.getParameterValues(str);
		String result = "";
		for (String string : strArray) {
			result += string;
		}
		return result;
	}
	
	public static String getParamString(String str, HttpServletRequest request) {
		return request.getParameter(str);
	}
	
	public static int getParamInt(String str, HttpServletRequest request) {
		return Integer.parseInt(getParamString(str, request));
	}
	
	public static String getHashedString(String str, HttpServletRequest request) {
		return BCrypt.hashpw(getParamString(str, request), BCrypt.gensalt());
	}
	
	public static Date getParamDate(String str, HttpServletRequest request) {
		return Date.valueOf(getParamString(str, request));
	}
	
	//
	public static MemberVO getSessionInfo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (MemberVO)session.getAttribute("memberVO");
	}
	public static int getSessionPk(HttpServletRequest request) {
		return getSessionInfo(request).getM_pk();
	}
}
