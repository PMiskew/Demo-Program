package basicGUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LogToExpConversions {

	private JFrame frame;
	private JPanel gamePanel;
	private JPanel displayPanel;
	
	private JButton b1 = new JButton("Generate New Question");
	private JButton b2 = new JButton("Submit");
	
	private JTextField xin = new JTextField();
	private JLabel equalSign = new JLabel(" = ");
	private JTextField ain = new JTextField();
	private JTextField nin = new JTextField();
	
	
	private static final Insets insets = new Insets(10, 10, 10, 10);
	
	//******************************
	private int n = 2;
	private int x = 64;
	private int a = 8;
	
	
	//************************MOUSE MOTION LISTENER*********************************
	private MouseMotionListener mml = new MouseMotionListener() {

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println(e.getX()+","+e.getY());
			
		}
		
	};
	

	//************************ACTION LISTENER*********************************
	private ActionListener al = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			a = (int)(Math.random()*10+1);
			n = (int)(Math.random()*5+1);
			x = (int)Math.pow(a, n);
			
			displayPanel.repaint();
		}
		
		
	};
	
	
	public LogToExpConversions() {
		
		frame = new JFrame("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		gamePanel = new JPanel();
		gamePanel.setLayout(new GridBagLayout());
		
		b1.addActionListener(al);
		
		frame.getContentPane().add(gamePanel);

		displayPanel = new JPanel() {
			
			public void paint(Graphics g) {
				super.paint(g);
				super.setBackground(Color.WHITE);
				
				int noffset = (""+n).length();
				
				AttributedString as = new AttributedString("Log"+n+""+x+" = "+a);
			    as.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUB, 3, 3+noffset);
			    //as.addAttribute(TextAttribute.FOREGROUND, Color.RED, 2, 6);
			    int pixelsh = 50;
			    as.addAttribute(TextAttribute.SIZE,pixelsh);
			   
			    int pixelsw = g.getFontMetrics().stringWidth(""+as.getIterator());
			    System.out.println(pixelsw);
			    g.drawString(as.getIterator(), displayPanel.getWidth()/2 - pixelsw/2, displayPanel.getHeight()/2+pixelsh/2);
			    //g.drawString(as.getIterator(), 0, 40);
			    
			  
				
			}
			
		};
		displayPanel.addMouseMotionListener(mml);
	
		//gamePanel.setPreferredSize(new Dimension(1000,1000));
	
		
		GridBagConstraints c = new GridBagConstraints(); //sets constraints for object being added. 
		//addComponent(root,gamePanel,0,0,5,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		addComponent(gamePanel,displayPanel,0,0,5,1,1.0,0.9,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		
		addComponent(gamePanel,b1,0,2,4,1,1.0,0.1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		addComponent(gamePanel,b2,4,2,1,1,1.0,0.1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		
		addComponent(gamePanel,xin,0,5,1,1,0.5,0.1,GridBagConstraints.EAST,GridBagConstraints.BOTH,0,0,10,0);
		equalSign.setFont(new Font("Ariel",Font.BOLD,50));
		
		addComponent(gamePanel,equalSign,1,5,1,1,1.0,0.1,GridBagConstraints.EAST,GridBagConstraints.BOTH,0,0,10,0);
		addComponent(gamePanel,ain,2,5,1,1,1.0,0.1,GridBagConstraints.EAST,GridBagConstraints.BOTH,0,0,10,0);
		addComponent(gamePanel,nin,3,4,1,1,1.0,0.1,GridBagConstraints.EAST,GridBagConstraints.BOTH,0,0,0,0);
			
		
		
		
		
		frame.setSize(500,400);
		//root.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
	private static void addComponent(Container container, Component component, int gridx, int gridy,
		      int gridwidth, int gridheight, int anchor, int fill) {
		    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
		        anchor, fill, insets, 0, 0);
		    container.add(component, gbc);
	}
	
	private static void addComponent(Container container, Component component, int gridx, int gridy, 
			int gridwidth, int gridheight, double weightx, double weighty, int anchor, int fill) {
		 
		GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty,
		        anchor, fill, insets, 0, 0);
		    container.add(component, gbc);
	}
	private static void addComponent(Container container, Component component, int gridx, int gridy, 
			int gridwidth, int gridheight, double weightx, double weighty, int anchor, int fill,int insetN,int insetE,int insetS, int insetW) {
		 
		GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty,
		        anchor, fill, new Insets(insetN,insetE,insetS,insetW), 0, 0);
		    container.add(component, gbc);
	}
	
	
	public static void main(String arg[]) {

	    SwingUtilities.invokeLater(new Runnable() {

	        @Override
	        public void run() {
	            // TODO Auto-generated method stub
	            new LogToExpConversions();
	        }
	    });
	}
}
