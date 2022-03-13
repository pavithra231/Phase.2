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
 * Servlet implementation class Updatesubject
 */
@WebServlet("/Updatesubject")
public class Updatesubject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			 String shortcut=request.getParameter("shortcut");
			 String name=request.getParameter("Name");
			 String param=request.getParameter("Id");
			 int id= Integer.parseInt(param);
			Connection conn = databaseconnection.initializeDatabase();
			PreparedStatement stmt= 
					conn.prepareStatement("update subjects set name=?,shortcut=? where id=?");

			stmt.setString(1, name);
			stmt.setString(2, shortcut);
			stmt.setInt(3, id);


			int rs=stmt.executeUpdate();
			if(rs>0)
			{
				 out.print("<html><body><b><h1 align='center'>Successfully updated</h3>"
		                    + "</b>"+"<br>"+"<h3 align='center'><a href='subject.jsp'>Return to subjects</a></h3>"
		                    + "</body></html>");   
			}
			else
			{
				out.print("error while updating a data");

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