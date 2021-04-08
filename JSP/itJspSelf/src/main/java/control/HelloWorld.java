package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld") // /Helloworld를 주소 URL에 표시해주어야 이 서블릿 클래스가 실행된다.
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloWorld() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}

	// 하나의 메소드로 get, post를 일괄처리한다.
	// 
	protected void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO : 화면에 헬로월드 출력하기
		String msg = "Hello World~ 안녕하세요~";
		int data = 12;
		
		// jsp에 data 올리기
		request.setAttribute("msg", msg);
		request.setAttribute("data", data);
		
		// TODO : Servlet에서 jsp 호출하면서 data 넘겨주는 객체를 선언!
		// RequestDispatcher : jsp 호출 + data 넘기기
		RequestDispatcher dsp  = request.getRequestDispatcher("/el/HelloWorld.jsp"); //jsp 받아오기
		dsp.forward(request, response);
		
	}
}


