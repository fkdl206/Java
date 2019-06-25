

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckOut
 */
@WebServlet("/CheckOut")
public class CheckOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckOut() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter print = response.getWriter();
		print.println("<center>");
		print.println("<h2>선택한 상품 목록</h2>");
		print.println("<hr>");
		HttpSession session = request.getSession();
		ArrayList<String> al = (ArrayList<String>)session.getAttribute("pList");
//		print.println(al);
		for (String product : al) {
			print.println("<b>" + product + "</b><br>");
		}
		int count = al.size();
		print.println("===================================");
		print.println("당신이 입금할 금액은>>> " +count*5000); // 우선 apple,lemon,orange 각각 5000,10000,15000 
		print.println("</center>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
