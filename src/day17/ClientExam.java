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
		
		System.out.println("[�����û]");
		try {
			
			socket.connect(new InetSocketAddress("192.168.10.238", 9999));
			System.out.println("[���Ἲ��]");
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "����Ŀ�";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			
			System.out.println("[������ ���� �Ϸ�]");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			
			System.out.println("[�����κ��� ������ �ޱ� �Ϸ�]" + message);
			
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
