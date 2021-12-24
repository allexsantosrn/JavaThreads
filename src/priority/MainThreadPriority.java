package priority;

public class MainThreadPriority {

	public static void main(String[] args) {

		ThreadExPriority thread1 = new ThreadExPriority("Thread1", 5000);
		ThreadExPriority thread2 = new ThreadExPriority("Thread2", 2500);
		ThreadExPriority thread3 = new ThreadExPriority("Thread3", 1250);

		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(8);
		thread1.setPriority(Thread.MAX_PRIORITY);
		
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
