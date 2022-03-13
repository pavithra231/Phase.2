package Crudoperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import details.Students;

/**
 * Servlet implementation class Deletestudent
 */
@WebServlet("/Deletestudent")
public class Deletestudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		        Connection conn;
				try {
					conn = databaseconnection.initializeDatabase();
					PreparedStatement stmt= conn.prepareStatement("delete from students where id=?");
					String param= request.getParameter("id");
					int id= Integer.parseInt(param);
					stmt.setInt(1, id);
					int rs=stmt.executeUpdate();
					if(rs>0){
						out.print(rs+ " deleted from DB");	
						out.print("<html><body><b><h1 align='center'>"+rs+ " deleted from DB</h3>"
			                    + "</b>"+"<br>"+"<h3 align='center'><a href='student.jsp'>Return to Classes</a></h3>"
			                    + "</body></html>");  

					}
					else {
						out.print("Error while deleting a data");

					}
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}