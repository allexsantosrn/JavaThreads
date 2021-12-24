package code;

public class ThreadExSleeep extends Thread {
	
	protected long time;
	
	public ThreadExSleeep(String name, long time) {
		super(name);
		this.time = time;		
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Suspend Thread: "+	this.getName()+"-"+this.getId());
			Thread.sleep(time);
			System.out.println("Resumind Thread: "+	this.getName()+"-"+this.getId());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
