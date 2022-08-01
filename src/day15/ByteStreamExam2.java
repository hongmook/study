package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExam2 {

	public static void main(String[] args) {
		
		try {
			
			InputStream is = new FileInputStream("d:/hello.txt");
			//true 내용 추가할때 사용
			OutputStream os = new FileOutputStream("d:/hello_copy.txt", true);
			
/*
			int read;
			int cnt=1;
			while((read=is.read()) != -1) {
				System.out.println("횟수 : " + cnt++ + ",  1바이트값" + read);
				os.write(read);
			}
*/
			os.write(is.readAllBytes());
			System.out.println("파일복사 완료");
			
			//내용추가
			byte[] data = "ABC".getBytes();
			os.write(data);
			
			is.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
