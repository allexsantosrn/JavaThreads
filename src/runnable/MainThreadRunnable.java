package runnable;


public class MainThreadRunnable {

	public static void main(String[] args) {
		
		Runnable runabble1 = new ThreadExRunnable("Thread1");
		Runnable runabble2 = new ThreadExRunnable("Thread2");
		
		Thread thread1 = new Thread(runabble1);
		Thread thread2 = new Thread(runabble2);
		
		thread1.start();
		thread2.start();
	}

}
