import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class clicker implements Runnable{
	boolean on = false;
	int time = 100;
	public clicker(){
		new Frame(this);
		Thread t = new Thread(this);
		t.start();
	}
	public static void main(String [] args) throws InterruptedException, AWTException {
		new clicker();
	}
	public void start(int time){
		this.time = time;
		on = true;
		
	}
	public void stop(){
		on = false;
	}
	
	
	public void click(Robot r) {
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	}	
	public void re(Robot r) {
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	public void run() {
		try {
			Robot r = new Robot();
			while(true) {
				System.out.println("Starting");	
				while(on == true) {
					click(r);
					Thread.sleep(time);
					re(r);
				}
			}
			} catch (AWTException | InterruptedException e) {
				e.printStackTrace();
			}
			
			
		
	}


}
