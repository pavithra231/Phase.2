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

import details.Teacher;

/**
 * Servlet implementation class Addteacher
 */
@WebServlet("/Addteacher")
public class Addteacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String param=request.getParameter("id");
			   int id=Integer.parseInt(param);
			   String Name=request.getParameter("Name");
			   String subject=request.getParameter("subject");
			   String param1=request.getParameter("age");
			   int age=Integer.parseInt(param1);
	        Connection conn = databaseconnection.initializeDatabase();

	        PreparedStatement st = conn.prepareStatement("insert into teachers (id,name,subject,age) values(?,?,?,?)");

			st.setString(2, Name);
			st.setInt(1,id);
	        st.setInt(4,age);

	        st.setString(3,subject);
	        st.executeUpdate();

	        st.close();
	        conn.close();

	        PrintWriter out = response.getWriter();
	        out.println("<html><body><b><h1 align='center'>Successfully Inserted</h1>"
                    + "</b><br>"+"<h3 align='center'><a href='teachers.jsp'>Return to teachers</a></h3>\"</body></html>");
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
 