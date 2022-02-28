package Exrecise;
class A implements Runnable{
	public void run() {
	for(int i=0;i<5;i++)
	{
		System.out.println("Suganya");
		System.out.println(Thread.currentThread().getName());
	}
	}
	}
class B implements Runnable{
	public void run() {
	for(int i=0;i<5;i++)
	{
		System.out.println("Kandasamy");
		System.out.println(Thread.currentThread().getName());
	}
	}
	}
public class R implements Runnable {
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Sirius");
			System.out.println(Thread.currentThread().getName());
		}
		}
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		R r1=new R();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		Thread t3=new Thread(r1);
		
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
