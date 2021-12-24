package code;

public class ThreadEx extends Thread {
	
	public ThreadEx(String nome) {
		super(nome);		
	}
	
	@Override
	public void run() {
		System.out.println("Hi, my name is: "+this.getName()+"-"+getId());		
	}


}
