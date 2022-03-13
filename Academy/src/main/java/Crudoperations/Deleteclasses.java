package Crudoperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deleteclasses")
public class Deleteclasses extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		        Connection conn;
				try {
					conn = databaseconnection.initializeDatabase();
					String param= request.getParameter("id");
					int id= Integer.parseInt(param);
					PreparedStatement stmt= conn.prepareStatement("delete from classes where id=?");

					stmt.setInt(1, id);
					int rs=stmt.executeUpdate();
					if(rs>0){
						 out.print("<html><body><b><h1 align='center'>Successfully Deleted</h3>"
				                    + "</b>"+"<br>"+"<h3 align='center'><a href='class.jsp'>Return to Classes</a></h3>"
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}