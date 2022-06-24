package day06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	//필드
	//Static  --- > 클래스를 메모리로 로딩될때 자동으로 실행
	//        --- > new 생성자로 호출하지 않아도 된다.
	//사용이유?  --- > 객체마다 공통의 속성값이나 메소드를 정의할때 사용
	private static String url="jdbc:mysql://localhost/khm";
	
	//메소드
	static Connection mysqlConn(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","wotn6589");
			System.out.println("mysql 연결완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}