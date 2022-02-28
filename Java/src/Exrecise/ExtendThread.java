package Exrecise;
class work extends Thread{
	public void run() {
	for(int i=0;i<3;i++) {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	System.out.println("sirius");
	}
	}
}
public class ExtendThread extends Thread{
	public void run() {
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	for(int i=0;i<3;i++) {
	System.out.println("java");
	}
	}
	public static void main(String[] args) {
		ExtendThread e1=new ExtendThread ();
		e1.start();
        work w1=new work();
        w1.start();
      
	}

}
