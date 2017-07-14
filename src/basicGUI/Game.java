package basicGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Game {

	private JFrame root;

	private JPanel gamePanel;
	
	private JButton b1 = new JButton("Generate New Question");
	private JButton b2 = new JButton("Submit");
	

	public Game() {
		
		root = new JFrame("Game");
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		root.setLayout(new GridBagLayout());
			
		gamePanel = new JPanel() {
			
			public void paint(Graphics g) {
				super.paint(g);
				g.setColor(Color.RED);
				g.fillRect(0, 0, 500, 1000);
			}
			
		};

		gamePanel.setBackground(Color.BLUE);
		gamePanel.repaint();

	
		//gamePanel.setPreferredSize(new Dimension(1000,1000));
	
		
		GridBagConstraints c = new GridBagConstraints(); //sets constraints for object being added. 
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.ipady = 1000;
		c.ipadx = 1000;

		c.fill = GridBagConstraints.BOTH;
		root.getContentPane().add(gamePanel,c);

	
		
		GridBagConstraints c1 = new GridBagConstraints(); //sets constraints for object being added. 


		c1.gridx = 0;
		c1.gridy = 1;
		c1.ipady = 50;
		c1.ipadx = 500;
		root.getContentPane().add(b1,c1);

		
		GridBagConstraints c2 = new GridBagConstraints(); //sets constraints for object being added. 
		c2.gridx = 1;
		c2.gridy = 1;
		c2.ipady = 50;
		c2.anchor = GridBagConstraints.WEST;
		root.getContentPane().add(b2,c2);
		
		root.pack();
		root.setResizable(false);
		root.setVisible(true);
		
	}
	public static void main(String arg[]) {

	    SwingUtilities.invokeLater(new Runnable() {

	        @Override
	        public void run() {
	            // TODO Auto-generated method stub
	            new Game();
	        }
	    });
	}
}
