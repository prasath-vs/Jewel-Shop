package prasath;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String first_name = request.getParameter("first_name");
		String type = request.getParameter("type");
		String price = request.getParameter("price");
		String dis = request.getParameter("dis");
		String fprice = request.getParameter("fprice");
		
		if(first_name.isEmpty() || type.isEmpty() || price.isEmpty() || 
				dis.isEmpty() || fprice.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("Web.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("Web2.jsp");
			req.forward(request, response);
		}
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public DemoServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter pw = response.getWriter();
//		response.setContentType("text/html");
//		pw.println("<h1>Hello!</h1>");
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
