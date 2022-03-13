
package CRUD;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBCOnfig {

	public static Connection getConnect(Properties props)
	{
		Connection connection=null;
		try {
			String driver=props.getProperty("driver");
			String url=props.getProperty("url");
			String username=props.getProperty("username");
			String password=props.getProperty("password");

			Class.forName(driver);
			connection= DriverManager.getConnection(url,username,password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}