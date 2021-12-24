package code;

public class MainThreadSleep {

	public static void main(String[] args) {

		ThreadExSleeep thread1 = new ThreadExSleeep("Thread1", 5000);
		ThreadExSleeep thread2 = new ThreadExSleeep("Thread2", 2500);
		ThreadExSleeep thread3 = new ThreadExSleeep("Thread3", 1250);

		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Finishing de main thread");
	}

}
