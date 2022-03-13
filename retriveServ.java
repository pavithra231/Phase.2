package CRUD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fetch")
public class retriveServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);

		if(conn!=null)
		{
			try {

				Statement stmt= conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from Product");
				out.print("<h1>Product Details</h1><hr>");
				out.print("<table border=1 cellspacing=0 cellpadding=10><tr><th>PType</th><th>PName</th><th>PCity</th><th>PValue</th></tr>");

				while(rs.next())
				{
					out.print("<td>"+rs.getString("PType")+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"
							+ rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>");
					out.println("</tr>");
				}
				out.print("</table>");

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		else
			out.print("Error while connecting with database");
	}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doGet(req, resp);
    }



}