package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestController extends HttpServlet {

	public static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var xxx = req.getParameter("path"); //取得xxx(path)的參數
		System.out.println();
		req.setAttribute("nickname", xxx);  //取得參數後將參數丟到nickname屬性上
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
	
}
