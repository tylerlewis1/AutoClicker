import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keyinput extends KeyAdapter{
	Frame f;
	public Keyinput(Frame f) {
		this.f = f;
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == e.VK_F6) {
			f.start();
		}
		if(key == e.VK_F7) {
			f.stop();
		}
	}
}
