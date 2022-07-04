package day10;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracleconn {
	
	private static Oracleconn my = new Oracleconn();
	private Connection conn;
	
	private Oracleconn() {
		oracleConn();
	}
	
	public static Oracleconn getInstance() {
		return my;
	}
	
	public void oracleConn() {
		final String url="jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"joy","0070");
			System.out.println("오라클 연결완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	

	}
	
	public Connection getConn(){
		return conn;
	}
	
	public static void main(String[] args) {
		Oracleconn.getInstance().getConn();
	}
}
