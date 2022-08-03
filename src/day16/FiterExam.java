package day16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Serializable;

import day05.Member;
import day13.Person;
import day13.Student;

public class FiterExam {
	
	public static void main(String[] args) throws Exception {
		//보조스트림 : 문자변환, 입출력성능향상, 기본데이터 타입 입출력, 객체 입출력 등
		//바이트기반 : xxxInputStream, xxxOutputStream
		//문자기반 : xxxReader, xxxWriter
		//문자변환 보조스트림
/*		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readCnt;
		char[] cbuf = new char[100];
		while((readCnt = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCnt);
			System.out.println(data);
		}
		reader.close();
*/		
		//기본데이터 타입(boolean, char, short, int, long, float, double) 입출력
		FileOutputStream fos = new FileOutputStream("D:/KHM/upload/file.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		dos.flush();
		
		dos.writeUTF("백두산");
		dos.writeDouble(88.8);
		dos.writeInt(2);
		dos.flush();
		
		dos.writeUTF("한라산");
		dos.writeDouble(78.8);
		dos.writeInt(3);
		dos.flush();
		
		dos.close();
		fos.close();

		//file.dat 파일을 읽어서 화면에 출력
		FileInputStream fis = new FileInputStream("D:/KHM/upload/file.dat");
		DataInputStream dis = new DataInputStream(fis);
		
				
		for(int i=0; i<1; i++) {
			
			String name = dis.readUTF();
			double score = dis.readDouble();
			int num = dis.readInt();
			
			System.out.println(name + ", " + score + ", " + num);
			
		}
		
		dis.close();
		fis.close();
		
		//객체입출력 보조스트림
		fos = new FileOutputStream("d:/KHM/upload/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		//직렬화된 객체만 저장 가능 
		Member member = new Member(); //Member 클래스가 직렬화가 안되어있어서 implements Serializable 선언해줘야함
		member.setAge(10);
		member.setGender('F');
		member.setId("joy");

		oos.writeObject(member); 
		oos.writeObject(new String("홍길동"));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new Double(3.14));
		
		oos.close();
		fos.close();
		
		//역직렬화 하여 객체 참조
		fis = new FileInputStream("d:/KHM/upload/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Member m = (Member)ois.readObject();
		String s = (String)ois.readObject();
		int[] i = (int[])ois.readObject();
		double d = (double)ois.readObject();
		
		System.out.println(m.getId());
		System.out.println(m.getAge());
		System.out.println(m.getGender());
		System.out.println(s);
		System.out.println(i[0] + ", " + i[1] + ", " + i[2]);
		System.out.println(d);
		
		ois.close();
		fis.close();
		
		//부모클래스 직렬화, 자식클래스 직렬화 X ==> 자동 직렬화
		//부모클래스 직렬화X, 자식클래스 직렬화 ==> 부모는 직렬화 X
		
		fos = new FileOutputStream("d:/KHM/upload/member.dat");
		oos = new ObjectOutputStream(fos);
		
		Student student = new Student();
		student.setName("홍길동");
		student.setSchool("초등");
		student.age=100;
		oos.writeObject(student);

		fis = new FileInputStream("d:/KHM/upload/member.dat");
		ois = new ObjectInputStream(fis);
		
		Student obj1 = (Student)ois.readObject();
		System.out.println(obj1.getSchool());
		System.out.println(obj1.age);
	}
}
