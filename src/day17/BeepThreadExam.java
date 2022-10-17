package day17;

public class BeepThreadExam {

	public static void main(String[] args) {
		
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		Thread thread2 = new BeepThread2();
		thread2.start();
	}

}
