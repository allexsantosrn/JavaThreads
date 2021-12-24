package thread;

public class MainThread {

	public static void main(String[] args) {

		ThreadEx thread1 = new ThreadEx("Thread1");
		ThreadEx thread2 = new ThreadEx("Thread2");
		ThreadEx thread3 = new ThreadEx("Thread3");
		ThreadEx thread4 = new ThreadEx("Thread4");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
