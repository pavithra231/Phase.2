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

import details.subjects;
/**
 * Servlet implementation class Addsubject
 */
@WebServlet("/Addsubject")
public class Addsubject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  try {
			  String param=request.getParameter("Id");
			   int Id=Integer.parseInt(param);
			   String name=request.getParameter("Name");
			   String shortcut=request.getParameter("shortcut");


	        Connection conn = databaseconnection.initializeDatabase();

	        PreparedStatement st = conn.prepareStatement("insert into subjects(id,name,shortcut) values(?,?,?)");
	        st.setInt(1, Id);
			st.setString(2, name);
			st.setString(3, shortcut);

	        st.executeUpdate();

	        st.close();
	        conn.close();

	        PrintWriter out = response.getWriter();
	        out.println("<html><body><b><h1 align='center'>Successfully Inserted</h1>"
                    + "</b><br>"+"<h3 align='center'><a href='subject.jsp'>Return to Subjects</a></h3>\"</body></html>");
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
