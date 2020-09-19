
public class ThreadTest {

	public static void main(String[] args) {
		//1. Thread 생성하는 방법
		//Thread 클래스를 상속받는다.
		Thread t1 = new MyThread();
		t1.setName("둘리");
		t1.start();
		
		//2. Runnable 객체를 생성해서 Thread에 인자로 전달하는 방법
		Thread t2 = new Thread(new MyRunnable());
		t2.setName("펭수");
		t2.start();
		
		//3. Lambda 식으로 Runnable 구현
		Thread t3 = new Thread(() -> {
			for(int i=0; i<10; ++i) {
			System.out.println(Thread.currentThread().getName() + i);
			}
		} );
		
		t3.start();
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " 시작");
		
		
		for(int i=0; i<10; ++i) {
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " 시작");
		for(int i=0; i<10; ++i) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}
