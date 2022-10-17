package day17;

import java.awt.Toolkit;

public class BeepThread2 extends Thread {

	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println("¶ò2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}

}
