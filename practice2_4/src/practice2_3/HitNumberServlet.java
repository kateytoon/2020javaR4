package practice2_3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccessCounterServlet
 */
@WebServlet("/HitNumberServlet")
public class HitNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private int aCounter = 0;
	@Override
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String num =request.getParameter("number");
		aCounter++;
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<metacharset = \"UTF-8\"/>");
		out.println("<title>数当てゲーム結果</title>");
		out.println("<body>");
		out.println("<h1>数当てゲーム結果</h1>");
		out.println("<p>"+aCounter+"回目　あなたが選んだ数:"+num);
		String[] hands = { "1", "2", "3" , "4", "5" , "6", "7" , "8", "9" };
		Random r = new Random();
		String hand = hands[r.nextInt(9)];
		if(hand.equals(num)) {
			out.println("<p>結果は、当たり");
		}else {
			out.println("<p>結果は、はずれ～！");
		}
		out.println("<p><a href=\"http://localhost:8080/practice2_4/hitnumber.html\">もう一度やる</a>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
