
public class ThreadTest {

	public static void main(String[] args) {
		//1. Thread �����ϴ� ���
		//Thread Ŭ������ ��ӹ޴´�.
		Thread t1 = new MyThread();
		t1.setName("�Ѹ�");
		t1.start();
		
		//2. Runnable ��ü�� �����ؼ� Thread�� ���ڷ� �����ϴ� ���
		Thread t2 = new Thread(new MyRunnable());
		t2.setName("���");
		t2.start();
		
		//3. Lambda ������ Runnable ����
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
		System.out.println(Thread.currentThread().getName() + " ����");
		
		
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
		System.out.println(Thread.currentThread().getName() + " ����");
		for(int i=0; i<10; ++i) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}
