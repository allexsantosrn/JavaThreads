package runnable;

public class ThreadExRunnable implements Runnable {
	
	protected String name;
	
	public ThreadExRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Hi, my name is: "+this.name);		
	}
	

	
	
}
