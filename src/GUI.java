
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI {
	
	//Look, I did recursion!
	public static void spam(int i) {
		if (i == 0) {
			return;
		}
		else {
			for (int j = 0; j < i; ++j) {
				System.out.print("SPAM");
			}
			System.out.print("\n");
			spam(i - 1);
		}
	}
	
	private final static int WIDTH = 400;
	private final static int HEIGHT = 400;
	
	public static void main (String[] args) {
		spam(3);
		System.out.print("\n");
		JFrame frame = new JFrame("Dark Wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		JButton best = new JButton("The best button");
		JButton worst = new JButton("This button sucks");
		JButton mediocre = new JButton("Ok"); 
		JButton doNotPushMe = new JButton("SELF DESTRUCT");
		
		best.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Stop staring!!!");
			}
			
		});
		
		frame.add(best);
		frame.add(worst);
		frame.add(mediocre);
		frame.add(doNotPushMe);
		
		frame.pack();
		
		frame.setVisible(true);
	}

}
