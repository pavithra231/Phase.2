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
 * Servlet implementation class Updatestudent
 */
@WebServlet("/Updatestudent")
public class Updatestudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			 String fname=request.getParameter("fName");
			 String lname=request.getParameter("lName");
			 String param=request.getParameter("age");
			 int age=Integer.parseInt(param);
			 String param1=request.getParameter("id");
			 int id= Integer.parseInt(param1);
			 String param2=request.getParameter("class1");
			 int Class=Integer.parseInt(param2);
			Connection conn = databaseconnection.initializeDatabase();
			PreparedStatement stmt= 
					conn.prepareStatement("update students set fname=?,lname=?,age=?,class=? where id=?");
			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setInt(3, age);
			stmt.setInt(4, Class);
			stmt.setInt(5, id);


			int rs=stmt.executeUpdate();
			if(rs>0)
			{
				  out.print("<html><body><b><h1 align='center'>Successfully updated</h3>"
		                    + "</b>"+"<br>"+"<h3 align='center'><a href='student.jsp'>Return to Students</a></h3>"
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