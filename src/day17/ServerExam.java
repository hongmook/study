package day17;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.10.135", 9999));
			while(true) {
				System.out.println("[���� ��ٸ�]");
				Socket socket = serverSocket.accept(); //Ŭ���̾�Ʈ ���� ����
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
				
				System.out.println("[���� ������]" + isa.getAddress());
				
				byte[] bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[���� �޼���] : " + message);
				
				OutputStream os = socket.getOutputStream();
				message = "�ȳ� Ŭ���̾�Ʈ";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[Ŭ���̾�Ʈ�� �޼��� ���� �Ϸ�]");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if(!serverSocket.isClosed()){
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}