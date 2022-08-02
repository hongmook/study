package day15;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class FileIoExam {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("d:/KHM/upload/");
		File file1 = new File("d:/KHM/upload/file1.txt");
		File file2 = new File("d:/KHM/upload/hello.java");
		System.out.println("디렉토리 존재여부 확인 : " + dir.exists());
		
		if(!dir.exists()) {
			dir.mkdir(); // 폴더생성
		}
		
		if(!file1.exists()) {
			file1.createNewFile();
		}
		
		String strval = "반갑습니다. hello^^";
		char[] data = strval.toCharArray();
		
		Writer writer = new FileWriter(file1);
		
			writer.write(data);
			writer.flush();
			
		String strval2 = "public class Hello { public static void main(String[] args){} }";	
			
		if(!file2.exists()) {
			file2.createNewFile();
		}
		
		char[] java = strval2.toCharArray();
		Writer wr = new FileWriter(file2);
		
		wr.write(java);
		wr.flush();
		
		//d:/KHM/upload/img
		File dir2 = new File("d:/KHM/upload/img");
		if(!dir2.exists()) {
			dir2.mkdir();
		}
		File[] contents = dir.listFiles();
		//디렉토리에 파일리스트 출력
		for(File file : contents) {
			if(file.isDirectory()) {
				System.out.println("<DIR>\t" + file.getName());
			} else {
				System.out.println("\t\t" + file.getName() + "\t" + file.length());
			}
		}
		
			
	}

}
