package pac1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccessCounterServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int num1 =Integer.parseInt(request.getParameter("number1"));
		int num2 =Integer.parseInt(request.getParameter("number2"));
		String calc =request.getParameter("number1");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<metacharset = \"UTF-8\"/>");
		out.println("<title>四則演算結果</title>");
		out.println("<body>");
		out.println("<h1>四則演算の結果</h1>");
		int ans = 0;
		switch(calc) {
		case "tasu":
			ans = num1+num2;
			break;
		case "hiku":
			ans = num1-num2;
			break;
		case "kake":
			ans = num1*num2;
			break;
		case "waru":
			ans = num1/num2;
			break;

		}
		out.println("答えは、"+ans+"です。");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
