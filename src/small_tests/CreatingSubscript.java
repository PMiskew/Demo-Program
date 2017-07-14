package small_tests;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreatingSubscript {

	public static void main(String[] args) {
		
		//THIS ONLY WILL WORK IN GUI SCREENS NOT IN CONSOLE!
		String html = "CO<sub>2</sub>"; //Doesn't work yet
		System.out.println(html);
		
		String string = "CO\u2082"; //Works
		System.out.println(string);
	
		JFrame frame = new JFrame("Subscript Test");
		
		JPanel panel = new JPanel() {
			
			public void paint(Graphics g) {
				
		
				g.setFont(new Font("Ariel",Font.BOLD,45));
				g.drawString(string, 10, 50);
			}
		};
		
		frame.getContentPane().add(panel);
		frame.setSize(200,200);
		frame.setVisible(true);
	}

}
