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
import details.Students;
/**
 * Servlet implementation class Addstudents
 */
@WebServlet("/Addstudents")
public class Addstudents extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {

	        Connection conn = databaseconnection.initializeDatabase();

	        PreparedStatement st = conn.prepareStatement("insert into students (id,fname,lname,age,class) values (?,?,?,?,?);");

	        st.setInt(1, Integer.valueOf(request.getParameter("id")));
	        st.setString(2, request.getParameter("fName"));
	        st.setString(3, request.getParameter("lName"));

	        st.setInt(4, Integer.valueOf(request.getParameter("age")));

	        st.setInt(5, Integer.valueOf(request.getParameter("class1")));

	        st.executeUpdate();

	        st.close();
	        conn.close();

	        PrintWriter out = response.getWriter();
	        out.print("<html><body><b><h1 align='center'>Successfully Inserted</h1>"
                    + "</b><br>"+"<h3 align='center'><a href='student.jsp'>Return to Students</a></h3>\"</body></html>");
		 }
	    catch (Exception e) 
	    {
	        e.printStackTrace();
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}