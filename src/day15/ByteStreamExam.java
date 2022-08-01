package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExam {

	public static void main(String[] args) {
		
		try {

			//입력 스트림
			InputStream is = new FileInputStream("D:/KHM/air.jpg");
			
			//출력 스트림
			OutputStream os = new FileOutputStream("D:/KHM/air_bak.jpg");
		
			
			
			//read() : 입력스트림으로부터 1바이트를 읽고 읽은 바이트를 리턴
			int readByte;
			int cnt=1;
			while((readByte=is.read()) != -1) {
				
				System.out.println("횟수 : " + cnt++ + ", 1바이트값" + readByte);
				
				//write(int b) : 출력스트림으로 1byte 보냄
				os.write(readByte);
			}
			
			//자원반납
			is.close();
			os.close();
			
			InputStream is2 = new FileInputStream("D:/KHM/air.jpg");
			OutputStream os2 = new FileOutputStream("D:/KHM/air_bak2.jpg");

			//read(byte[] b) : 읽은 바이트들을 바이트배열 b에 저장하고 읽은 바이트수를 리턴
			int readByte2;
			cnt = 1;
			byte[] b = new byte[1000];
			while((readByte2 = is2.read(b)) != -1) {
				System.out.println(cnt++ + "번째 읽은 바이트 수" + readByte2);
				//write(byte[] b) : 출력스트림으로 주어진 바이트 배열b의 모든 바이트를 보냄
				os2.write(b);
			}
			
			//자원반납
			is2.close();
			os2.close();
			
			/*
			 * System.out.println("첫번째 읽은 바이트수 : " + is2.read(b));
			 */
			
			//read(byte[] b, int 시작위치인덱스, int len) : 배열 인덱스로부터 len개까지 저장, 리턴값 : len개
			InputStream is3 = new FileInputStream("D:/KHM/lun.jpg");
			OutputStream os3 = new FileOutputStream("D:/KHM/lun_bak2.jpg");

			int readByte3;
			cnt = 1;
			while((readByte3 = is3.read(b, 0, 1000)) != -1) {
				System.out.println(cnt++ + "번째 읽은 바이트 수" + readByte3);
				
				os3.write(b, 0, readByte3);
				
			}
			
			//자원반납
			is3.close();
			os3.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
