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
 * Servlet implementation class Updateclasses
 */
@WebServlet("/Updateclasses")
public class Updateclasses extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

			try {

				 String Subject=request.getParameter("subject");
				 String Teacher=request.getParameter("teacher");
				 String param=request.getParameter("id");
				 int Id= Integer.parseInt(param);
				 String param1=request.getParameter("section");
				 int Section= Integer.parseInt(param1);
				Connection conn = databaseconnection.initializeDatabase();
				PreparedStatement stmt= conn.prepareStatement("update classes set section=?, teacher=?, subject=? where id=?");

				stmt.setInt(1, Section);
				stmt.setString(2, Teacher);
				stmt.setString(3, Subject);
				stmt.setInt(4, Id);

				int rs=stmt.executeUpdate();
				if(rs>0)
				{
				    out.print("<html><body><b><h1 align='center'>Successfully updated</h3>"
		                    + "</b>"+"<br>"+"<h3 align='center'><a href='class.jsp'>Return to Classes</a></h3>"
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
