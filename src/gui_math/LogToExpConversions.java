package gui_math;

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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LogToExpConversions {

	private JFrame frame;
	
	private JPanel gamePanel;
	private JPanel displayPanel;
	private JPanel algebraPanel;
	
	private JButton b1 = new JButton("Generate New Question");
	private JButton b2 = new JButton("Submit");
	
	private JTextField xin = new JTextField();
	private JLabel equalSign = new JLabel("  =");
	private JTextField ain = new JTextField();
	private JTextField nin = new JTextField();
	
	private JLabel labScore = new JLabel (" score: 0");
	private JLabel labStreak = new JLabel("streak: 0");
	private int score = 0;
	private int streak = 0;
	private int wrong = 0;
	
	
	private static final Insets insets = new Insets(10, 10, 10, 10);
	
	//******************************
	
	private int a = (int)(Math.random()*9+1);
	private int n = (int)(Math.random()*5+1);
	private int x = (int)Math.pow(n, a);
	


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
			
			if (e.getSource().equals(b1)) {
				a = (int)(Math.random()*10+1);
				n = (int)(Math.random()*5+1);
				x = (int)Math.pow(a, n);

				xin.setText("");
				xin.setBackground(Color.WHITE);
				
				ain.setText("");
				ain.setBackground(Color.WHITE);
				
				nin.setText("");
				nin.setBackground(Color.WHITE);
				
				b2.setEnabled(true);
				displayPanel.repaint();
				algebraPanel.repaint();
			
			}
			else {
				
				int check = 0;
				try {
					
					int xinVal = Integer.parseInt(xin.getText());
					System.out.println(xinVal);
					
					if (xinVal == x) {
						xin.setBackground(Color.GREEN);
						check = check + 1;
					}
				}catch (Exception exc) {
					xin.setText("");
					System.out.println("ERROR");
					xin.setBackground(Color.RED);
				}
				try {
					
					int ainVal = Integer.parseInt(ain.getText());
					System.out.println(ainVal);
					
					if (ainVal == a) {
						ain.setBackground(Color.GREEN);
						check = check + 1;
					}
				}catch (Exception exc) {
					ain.setText("");
					System.out.println("ERROR");
					ain.setBackground(Color.RED);
					
				}
				
				try {
					
					int ninVal = Integer.parseInt(nin.getText());
					System.out.println(ninVal);
					
					if (ninVal == n) {
						nin.setBackground(Color.GREEN);
						check = check + 1;
					}
				}catch (Exception exc) {
					nin.setText("");
					System.out.println("ERROR");
					nin.setBackground(Color.RED);
				}
				
				if (check == 3) {
					b2.setEnabled(false);
					score = score + 1;
					streak = streak + 1;
					labScore.setText( " score: "+score);
					labStreak.setText("streak: "+streak);
				}
				else {
					wrong = wrong + 1;
					streak = 0;
					labStreak.setText("streak: "+streak);
					if (wrong == 2) {
						algebraPanel.repaint();
					}
				}
			}
			
		}
		
	};
	
	
	public LogToExpConversions() {
		
		frame = new JFrame("Convert to Exponential Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		xin.setHorizontalAlignment(JTextField.CENTER);
		ain.setHorizontalAlignment(JTextField.CENTER);
		nin.setHorizontalAlignment(JTextField.CENTER);
		
		gamePanel = new JPanel();
		gamePanel.setLayout(new GridBagLayout());
		
		Font buttonFont = new Font("Ariel",Font.PLAIN,20);
		b1.setFont(buttonFont);
		b2.setFont(buttonFont);
		
		b1.addActionListener(al);
		b2.addActionListener(al);
		
		Font inputFont = new Font("Ariel",Font.PLAIN,40);
		xin.setFont(inputFont);
		ain.setFont(inputFont);
		nin.setFont(inputFont);
		
		frame.getContentPane().add(gamePanel);

		displayPanel = new JPanel() {
			
			public void paint(Graphics g) {
				super.paint(g);
				super.setBackground(Color.WHITE);
				
				int noffset = (""+n).length();
				
				AttributedString as = new AttributedString("Log"+n+""+x+" = "+a);
				as.addAttribute(TextAttribute.FAMILY, "Courier"); 
				
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
		//displayPanel.addMouseMotionListener(mml);
		
		algebraPanel = new JPanel() {
			
			public void paint(Graphics g) {
				
				super.paint(g);
				super.setBackground(Color.WHITE);
				if (wrong == 2) {
					Font algFont = new Font(Font.MONOSPACED,Font.PLAIN,40);
				
					int yloc = 60;
					int pixelsh = 50;
					
					int noffset = (""+n).length();
					int xoffset = (""+x).length();
					int aoffset = (""+a).length();
					
				  String spacex = "";
				    
				    for (int i = 0; i < xoffset; i =i + 1) {
				    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				    	spacex = spacex + " ";
				    }
					
				    
				 
				    String spacen = "";
				    
				    for (int i = 0; i < noffset; i = i + 1) {
				    	spacen = spacen + " ";
				    }
				
					System.out.println(xoffset+"*********************************************");
					System.out.println("noff: "+noffset);
	
					System.out.println("xoff: "+xoffset);
					//LINE 1****************************
					String str = spacen+"Log"+n+""+x+" = "+a;
					
					AttributedString as = new AttributedString(str);
					as.addAttribute(TextAttribute.FAMILY, "Courier"); 
					as.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUB, noffset+ 3, noffset + 3 +noffset);
				   
				    as.addAttribute(TextAttribute.SIZE,pixelsh);
				
				    
				    int pixelsw = g.getFontMetrics().stringWidth(""+as.getIterator());
				    System.out.println(pixelsw);
				    g.drawString(as.getIterator(), 50, yloc);
				    
				    //LINE 2****************************
				    
				    yloc = yloc + 110;
				    
				  
				
				    str = spacen+"Log"+n+""+x+"   "+spacen+""+a;
					
					as = new AttributedString(str);
					as.addAttribute(TextAttribute.FAMILY, "Courier"); 
					
					as.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUB, noffset + 3,  3 +2*noffset);
				    
				    as.addAttribute(TextAttribute.SIZE,pixelsh);
				
				    System.out.println(pixelsw);
				    g.drawString(as.getIterator(), 50, yloc);
				   
				    
				    System.out.println(pixelsw);
				    g.drawString(as.getIterator(), 50, yloc);
				    
				    //LINE 2.5****************************
				    System.out.println(spacen.length());
				    System.out.println(spacex.length());
				    yloc = yloc + 40;
					str = ""+n+"   "+spacen+spacex+" = "+n;
					as = new AttributedString(str);
					as.addAttribute(TextAttribute.FAMILY, "Courier"); 
					
					
					as.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUB, 4, 4+noffset);
				    
				    as.addAttribute(TextAttribute.SIZE,pixelsh);
			
				    System.out.println(pixelsw);
				    g.drawString(as.getIterator(), 50, yloc);
				   
				    //LINE 3****************************
				    
				    yloc = yloc + 110;
				    str = spacen+"   "+spacen+x+" = "+n+a;
				    
					as = new AttributedString(str);
					as.addAttribute(TextAttribute.FAMILY, "Courier"); 
					
					as.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUB, 0, noffset);
					   
					as.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUPER, str.length() - aoffset, str.length());
				    
				    as.addAttribute(TextAttribute.SIZE,pixelsh);
			
				    System.out.println(pixelsw);
				    g.drawString(as.getIterator(), 50, yloc);
				    wrong = 0;
				}
			    
		
				
				
			}
			
		};
		//algebraPanel.addMouseMotionListener(mml);
		//gamePanel.setPreferredSize(new Dimension(1000,1000));
	
		
		GridBagConstraints c = new GridBagConstraints(); //sets constraints for object being added. 
		//addComponent(root,gamePanel,0,0,5,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		addComponent(gamePanel,displayPanel,0,0,5,1,1.0,0.9,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		
		addComponent(gamePanel,b1,0,2,4,1,1.0,0.1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		addComponent(gamePanel,b2,4,2,1,1,1.0,0.1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		
		addComponent(gamePanel,xin,0,5,1,1,0.5,0.1,GridBagConstraints.LINE_END,GridBagConstraints.BOTH,0,10,10,0);
		
		equalSign.setFont(new Font("Ariel",Font.BOLD,50));
		addComponent(gamePanel,equalSign,1,5,1,1,0.1,0.1,GridBagConstraints.CENTER,GridBagConstraints.BOTH,0,0,10,0);
		
		addComponent(gamePanel,nin,2,5,1,1,0.5,0.1,GridBagConstraints.LINE_START,GridBagConstraints.BOTH,0,0,10,0);
		addComponent(gamePanel,ain,3,4,1,1,0.5,0.1,GridBagConstraints.LINE_START,GridBagConstraints.BOTH,0,0,0,0);
		
		labScore.setFont(new Font("Ariel",Font.BOLD,50));
		addComponent(gamePanel,labScore,4,4,1,1,0.1,0.1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		
		labStreak.setFont(new Font("Ariel",Font.BOLD,50));
		addComponent(gamePanel,labStreak,4,5,1,1,1.0,0.1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		
		addComponent(gamePanel,algebraPanel,0,6,5,1,1.0,0.9,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		
		
		

		JRootPane rootPane = SwingUtilities.getRootPane(b2); 
		rootPane.setDefaultButton(b2);

		frame.setSize(800,1500);
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
