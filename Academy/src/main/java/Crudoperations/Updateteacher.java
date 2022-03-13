package Crudoperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Updateteacher
 */
@WebServlet("/Updateteacher")
public class Updateteacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			 String name=request.getParameter("Name");
			 String subject=request.getParameter("subject");
			 String param=request.getParameter("age");
			 int age=Integer.parseInt(param);
			 String param1=request.getParameter("id");
			 int id= Integer.parseInt(param1);
			Connection conn = databaseconnection.initializeDatabase();
			PreparedStatement stmt= conn.prepareStatement("update teachers set name=?,subject=?,age=? where id=?");

			stmt.setString(1, name);
			stmt.setInt(3, age);
			stmt.setString(2, subject);
			stmt.setInt(4, id);


			int rs=stmt.executeUpdate();
			if(rs>0)
			{
				 out.print("<html><body><b><h1 align='center'>Successfully updated</h3>"
		                    + "</b>"+"<br>"+"<h3 align='center'><a href='teachers.jsp'>Return to teachers</a></h3>"
		                    + "</body></html>");   
			}
			else
			{
				System.out.println("error while updating a data");
				response.sendRedirect("index.html");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}