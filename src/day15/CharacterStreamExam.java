package day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Flushable;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharacterStreamExam {

	public static void main(String[] args) {
		
		try {
			Reader reader = new FileReader("d:/hello.txt");
			Writer writer = new FileWriter("d:/hello3.txt");
			//read() : 입력스트림으로부터 한개의 문자를 읽고 리턴
			int readData;
			
			while((readData=reader.read()) != -1) {
				
				System.out.print((char)readData);
				writer.write(readData);
				writer.flush();
			}
			
			reader.close();
			writer.close();
			
			System.out.println();
			
			//read(char[] c) : 배열의 사이즈 만큼 입력스트림으로 저장
			Reader reader2 = new FileReader("d:/hello.txt");
			Writer writer2 = new FileWriter("d:/hello4.txt");

			char[] cbuf = new char[18];
			
/*			
			int readChar = reader2.read(cbuf);
			System.out.println(readChar);
			readChar = reader2.read(cbuf);
			System.out.println(readChar);
*/
			
			int readChar2;
			
			while((readChar2=reader2.read(cbuf)) != -1) {
				writer2.write(cbuf);
				writer2.flush();
			}
			
			reader2.close();
			writer2.close();
			
			//read(char[] c, int 시작인덱스, int 길이) 
			Reader reader3 = new FileReader("d:/hello.txt");
			Writer writer3 = new FileWriter("d:/hello5.txt");
//			readChar2 = reader3.read(cbuf, 0, cbuf.length);
			System.out.println(readChar2);
			
			for(char charval : cbuf) {
				System.out.print(charval);
			}
			
			while((readChar2 = reader3.read(cbuf)) != -1) {
				writer3.write(cbuf, 0, cbuf.length);
				writer3.flush();
			}

			reader3.close();
			writer3.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
