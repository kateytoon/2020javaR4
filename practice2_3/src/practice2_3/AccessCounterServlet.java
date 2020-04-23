package practice2_3;

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
@WebServlet("/AccessCounterServlet")
public class AccessCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private int aCounter = 0;
	@Override
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		aCounter++;
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<metacharset = \"UTF-8\"/>");
		out.println("<title>アクセスカウンタ</title>");
		out.println("<body>");
		out.println("<h1>アクセスカウンタ</h1>");
		out.println("<p>あなたは、"+aCounter+"人目の訪問者です！");
		out.println("</body>");
		out.println("</html>");
	}

}
