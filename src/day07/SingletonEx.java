package day07;

import java.sql.Connection;

public class SingletonEx {

	public static void main(String[] args) {

		System.out.println(Singleton.getInstance());
		
		Mysqlconn db1 = Mysqlconn.getInstance();
		Mysqlconn db2 = Mysqlconn.getInstance();
		System.out.println("db1의 객체:" + db1);
		System.out.println("db2의 객체:" + db2);
		
		System.out.println("db1의 연결주소:" + db1.mysql());
		System.out.println("db2의 연결주소:" + db2.mysql());
		
		
		//Message msg = new Message();
		//Message msg2 = new Message ();
		
		
//		Message m1 = Message.getInstance("hello");
//		Message m2 = Message.getInstance("hello2");
		
		
//		System.out.println(m1);
//		System.out.println(m2);
		
		
		
		
		
		
		
	}

}