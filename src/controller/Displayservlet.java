package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/display")
public class Displayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Displayservlet() {
        super();
      
    }

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String dept=request.getParameter("dept");
		System.out.println(username);
		System.out.println(dept);
		request.setAttribute("name",username );
		request.setAttribute("dept", dept);
		RequestDispatcher rd= this.getServletContext().getRequestDispatcher("/result.jsp");
		rd.forward(request, response);
	}

}
