package CRUD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  

        Properties prop = new Properties();

	    prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));

	    Connection conn=DBCOnfig.getConnect(prop);

        String PName=request.getParameter("PName");                          

        try{
               PreparedStatement ps=conn.prepareStatement("select * from Product where PName=?");
               ps.setString(1,PName);                   
               out.print("<table width=25% border=1>");
               out.print("<center><h1>Result:</h1></center>");
               ResultSet rs=ps.executeQuery();                
               ResultSetMetaData rsmd=rs.getMetaData();
               while(rs.next())
              {
            	   out.print("<td>"+rsmd.getColumnName(1)+"</td>"+"<td>"+rsmd.getColumnName(2)+"</td>"+"<td>"
							+ rsmd.getColumnName(3)+"</td>"+"<td>"+rsmd.getColumnName(4)+"</td>");
					out.println("</tr>");
					out.print("<td>"+rs.getString("PType")+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"
							+ rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>");
					out.println("</tr>");
              }
        }
               catch (Exception e2)
          {
              e2.printStackTrace();
          }
        finally{
        	out.close();
          }
 }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}