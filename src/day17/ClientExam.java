package day17;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		socket = new Socket();
		
		System.out.println("[연결요청]");
		try {
			
			socket.connect(new InetSocketAddress("192.168.10.238", 9999));
			System.out.println("[연결성공]");
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "배고파요";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			
			System.out.println("[데이터 전송 완료]");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			
			System.out.println("[서버로부터 데이터 받기 완료]" + message);
			
			os.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if(!socket.isClosed()) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
	}

}
