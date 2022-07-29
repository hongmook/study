package day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		Properties pro = new Properties();
		String path = PropertiesExam.class.getResource("database.properties").getPath();
		System.out.println(path);
		
		try {
			path = URLDecoder.decode(path, "utf-8");
			pro.load(new FileReader(path));
			
			String driver = pro.getProperty("driver");
			String url = pro.getProperty("url");
			String id = pro.getProperty("id");
			String pw = pro.getProperty("pw");
			
			System.out.println(driver);
			System.out.println(url);
			System.out.println(id);
			System.out.println(pw);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
