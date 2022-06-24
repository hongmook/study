package day07;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqlconn {
	
	private static Mysqlconn my = new Mysqlconn();
	private Connection conn;
	
	private Mysqlconn() {
	}
	
	public static Mysqlconn getInstance() {
		return my;
	}
	
	public Connection mysql() {
		final String url="jdbc:mysql://localhost/khm";
		//Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","wotn6589");
			System.out.println("mysql 연결성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
		
		

	}
}
