package Fetch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Crudoperations.databaseconnection;


@WebServlet("/retrieveclasses")
public class Retrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();


			try {
				Connection conn = databaseconnection.initializeDatabase();

				if(conn!=null)
				{
				Statement stmt= conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from classes");
				out.print("<h1>Class Details</h1><hr>");
				out.print("<table border=1 cellspacing=0 cellpadding=10><tr><th>ID</th><th>section</th><th>teacher</th><th>subjects</th><th>Update</th><th>Delete</th></tr>");

				while(rs.next())
				{
					out.print("<td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getInt(2)+"</td>"+"<td>"
							+ rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>");
					out.print("<td>"+"<a href='Updateclass.jsp'>update</a>"+"</td>");
					out.print("<td>"+"<a href='DeleteClass.jsp'>Delete</a>"+"</td>");
					out.println("</tr>");
				}
				out.print("</table>");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

		}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doGet(req, resp);
    }

} 
