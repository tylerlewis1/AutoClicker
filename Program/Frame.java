import java.awt.BorderLayout;
import java.awt.Robot;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class Frame {
	int time = 1000;
	clicker click;
	public Frame(clicker click) {
		this.click =  click;
		JFrame f = new JFrame("Auto Clicker");
		f.setAlwaysOnTop(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setAlwaysOnTop(true);
		f.setResizable(false);
		f.setVisible(true);
		f.setSize(200, 200);
		TextField text = new TextField("");
		JPanel pan = new JPanel(new BorderLayout());
		JLabel label = new JLabel("Delay in milliseconds:");
		JButton button = new JButton("SET");
		f.add(pan, SpringLayout.NORTH);
		pan.add(label, BorderLayout.NORTH);
		pan.add(text, BorderLayout.CENTER);
		pan.add(button, BorderLayout.SOUTH);
		f.add((new JLabel("Press F6 to start and F7 to stop.")));
		f.addKeyListener(new Keyinput(this));
		button.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            System.out.println(text.getText());  
			            time = Integer.parseInt(text.getText());
			            f.requestFocus();
			        }  
			    }); 
	}
	public void start() {
		click.start(time);
		return;
	}public void stop() {
		click.stop();
		return;
	}
	
	
}
