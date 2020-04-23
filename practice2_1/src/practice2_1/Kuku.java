package practice2_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kuku
 */
@WebServlet("/Kuku")
public class Kuku extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<metacharset = \"UTF-8\"/>");
		out.println("<title>九九の表</title>");
		out.println("<body>");
		out.println("<h1>九九の表</h1>");
		out.println("<table border=\"3\">");
		for(int i = 0 ; i < 10;i++) {
			out.println("<tr>");
			for(int j = 0; j < 10;j++) {
				if(i == 0 && j == 0) {
					out.println("<th> </th>");
				}else if(i == 0) {
					out.println("<th align=\"right\">"+j+"</th>");
				}else {
					if(j == 0) {
						out.println("<td align=\"right\">"+i+"</td>");
					}else {
						out.println("<td align=\"right\">"+j*i+"</td>");
					}
				}

				out.println("");
			}
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<p>以上");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
