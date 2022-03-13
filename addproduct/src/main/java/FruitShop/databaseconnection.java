package FruitShop;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class databaseconnection  {

	protected static Connection initializeDatabase()throws SQLException, ClassNotFoundException
    {

        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql:// localhost:3306/";
        String dbName = "simplilearn";
        String dbUsername = "root";
        String dbPassword = "pavi";

        Class.forName(dbDriver);
        Connection conn = DriverManager.getConnection(dbURL+dbName,
                                                     dbUsername, 
                                                     dbPassword);
        return conn;
    }
}