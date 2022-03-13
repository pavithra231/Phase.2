package FruitShop;

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
public class RetriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();


			try {
				Connection conn = databaseconnection.initializeDatabase();

				if(conn!=null)
				{
				Statement stmt= conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from addproduct");
				out.print("<h1>Product Details</h1><hr>");
				out.print("<table border=1 cellspacing=0 cellpadding=10><tr><th>Name</th><th>City</th><th>Value</th></tr>");

				while(rs.next())
				{
					out.print("<td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"
							+ rs.getString(3)+"</td>");
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