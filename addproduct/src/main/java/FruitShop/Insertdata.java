package FruitShop;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create")
public class Insertdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   try {

        Connection conn = databaseconnection.initializeDatabase();
        PreparedStatement st = conn.prepareStatement("insert into addproduct(PName,PCity,PValue) values(?,?,?)");
		st.setString(1, request.getParameter("PName"));

        st.setString(2, request.getParameter("PCity"));

        st.setInt(3, Integer.valueOf(request.getParameter("PValue")));

        st.executeUpdate();

        st.close();
        conn.close();

        PrintWriter out = response.getWriter();
        out.println("<html><body><b>Successfully Inserted"
                    + "</b></body></html>");
    }
    catch (Exception e) 
    {
        e.printStackTrace();
    }
}

}