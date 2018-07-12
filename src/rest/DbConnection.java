package rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

public Connection getConnection() throws Exception
{
try
{
String connectionURL = "jdbc:mysql://localhost:3306/rest";
//Connection connection = null;
//Class.forName("com.mysql.jdbc.Driver").newInstance();
//connection = DriverManager.getConnection(connectionURL, "root", "");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection("jdbc:mysql://localhost/rest","root", "");
System.out.print("Database is connected !");
return conn;
}
catch (SQLException e)
{
	System.out.println("error sql");
	System.out.println(e.getMessage());
throw e;
}
catch (Exception e)
{
	System.out.println("error exception");
	System.out.println(e.getMessage());
throw e;
}
}

}
