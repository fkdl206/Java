

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SelectProduct
 */
@WebServlet("/selectProduct")
public class SelectProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		
		PrintWriter print = response.getWriter();
		print.println("<center>");
		print.println("<h2>상품선택</h2>");
		print.println(id+"님이 로그인한 상태입니다.");
		print.println("<form name=form3 method=post action=/Basket/AddProduct>");
		print.println("<select name=product>");
		print.println("<option>apple</option>");
		print.println("<option>orange</option>");
		print.println("<option>lemon</option>");
		print.println("</select>");
		print.println("<input type=submit value=장바구니에추가>");
		print.println("</form>");
		print.println("<a href=CheckOut>결제</a>");
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
