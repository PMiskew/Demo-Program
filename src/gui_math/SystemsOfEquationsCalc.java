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
import java.awt.font.TextAttribute;
import java.text.AttributedString;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SystemsOfEquationsCalc {


	private static final Insets insets = new Insets(10, 10, 10, 10);
	
	private JFrame frame = new JFrame("Systems of Equations");
	
	private JPanel mainPanel = new JPanel();
	
	private JLabel xLabel = new JLabel(" x");
	private JLabel plusLabel = new JLabel("+");
	private JLabel yLabel = new JLabel(" y");
	private JLabel equalLabel = new JLabel("=");


	private JLabel xLabel1 = new JLabel(" x");
	private JLabel plusLabel1 = new JLabel("+");
	private JLabel yLabel1 = new JLabel(" y");
	private JLabel equalLabel1 = new JLabel("=");


	private JTextField aField = new JTextField();
	private JTextField bField = new JTextField();
	private JTextField cField = new JTextField();
	private JTextField dField = new JTextField();
	private JTextField eField = new JTextField();
	private JTextField fField = new JTextField();
	
	private JButton solveBtn = new JButton("Solve");
	
	double a = 0;
	double b = 0;
	double c = 0;
	double d = 0;
	double e = 0;
	double f = 0;
	
	boolean solve = false;
	
	private JPanel display;
	
	private ActionListener al = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			
			try {				
				a = Double.parseDouble(aField.getText());
				aField.setBackground(Color.GREEN);
			}  catch (Exception exc) {
				System.out.println("INVALID ENTRY");
				aField.setText("");
				aField.setBackground(Color.RED);
			}
			
			try {				
				b = Double.parseDouble(bField.getText());
				bField.setBackground(Color.GREEN);
			}  catch (Exception exc) {
				System.out.println("INVALID ENTRY");
				bField.setText("");
				bField.setBackground(Color.RED);
			}
			

			try {				
				c = Double.parseDouble(cField.getText());
				cField.setBackground(Color.GREEN);
			}  catch (Exception exc) {
				System.out.println("INVALID ENTRY");
				cField.setText("");
				cField.setBackground(Color.RED);
			}
		

			try {				
				d = Double.parseDouble(dField.getText());
				dField.setBackground(Color.GREEN);
			}  catch (Exception exc) {
				System.out.println("INVALID ENTRY");
				dField.setText("");
				dField.setBackground(Color.RED);
			}
		

			try {				
				e = Double.parseDouble(eField.getText());
				eField.setBackground(Color.GREEN);
			}  catch (Exception exc) {
				System.out.println("INVALID ENTRY");
				eField.setText("");
				eField.setBackground(Color.RED);
			}
		

			try {				
				f = Double.parseDouble(fField.getText());
				fField.setBackground(Color.GREEN);
			}  catch (Exception exc) {
				System.out.println("INVALID ENTRY");
				fField.setText("");
				fField.setBackground(Color.RED);
			}
			
			solve = true;
			display.repaint(); //ALWAYS USE REPAINT NOT PAINT!

		}
		
		
	};
	
	
	
	public SystemsOfEquationsCalc() {
		
		Font tfFont = new Font("Ariel",Font.PLAIN,50);
		
		//INITIALIZED FIELDS
		aField.setHorizontalAlignment(JTextField.CENTER);
		aField.setFont(tfFont);
		
		bField.setHorizontalAlignment(JTextField.CENTER);
		bField.setFont(tfFont);
		
		cField.setHorizontalAlignment(JTextField.CENTER);
		cField.setFont(tfFont);
		
		dField.setHorizontalAlignment(JTextField.CENTER);
		dField.setFont(tfFont);
		
		eField.setHorizontalAlignment(JTextField.CENTER);
		eField.setFont(tfFont);
		
		fField.setHorizontalAlignment(JTextField.CENTER);
		fField.setFont(tfFont);
		
		//INITALIZE BUTTON
		solveBtn.addActionListener(al);
		solveBtn.setFont(tfFont);
		
		//Set up Display
		display = new JPanel() {
			
			public void paint(Graphics g) {
				
				super.paint(g);
				super.setBackground(Color.WHITE);
				
				String eq1 = "ax + by = c";
				String eq2 = "dx + ey = f";
				
				AttributedString as = new AttributedString(eq1);
				as.addAttribute(TextAttribute.FAMILY, "Courier"); 
				as.addAttribute(TextAttribute.SIZE, 40);
				g.drawString(as.getIterator(), 40, 60);
				
				as = new AttributedString(eq2);
				as.addAttribute(TextAttribute.FAMILY, "Courier"); 
				as.addAttribute(TextAttribute.SIZE, 40);
				g.drawString(as.getIterator(), 40, 120);
				
				if (solve == true) {
				
					eq1 = ""+a+"x + "+b+"y = "+c;
					eq2 = ""+d+"x + "+e+"y = "+f;
					

					as = new AttributedString(eq1);
					as.addAttribute(TextAttribute.FAMILY, "Courier"); 
					as.addAttribute(TextAttribute.SIZE, 40);
					g.drawString(as.getIterator(), 40, 200);
					
					as = new AttributedString(eq2);
					as.addAttribute(TextAttribute.FAMILY, "Courier"); 
					as.addAttribute(TextAttribute.SIZE, 40);
					g.drawString(as.getIterator(), 40, 260);
				
					
				
					if (-1.0*a/b == -1.0*d/e && c/b != f/e) {
						
						
						/*
						 * y = (-a/b)x + c/b
						 * y = (-d/e)x + f/e
						 */
						
						
						as = new AttributedString("DISTINCT AND PARALLEL");
						as.addAttribute(TextAttribute.FAMILY, "Courier"); 
						as.addAttribute(TextAttribute.SIZE, 40);
						g.drawString(as.getIterator(), 40, 340);
						
						as = new AttributedString("NO SOLUTION");
						as.addAttribute(TextAttribute.FAMILY, "Courier"); 
						as.addAttribute(TextAttribute.SIZE, 40);
						g.drawString(as.getIterator(), 40, 400);
						
					
					
					
						
						System.out.println("DISTINCT AND PARALLEL - NO SOLUTION");
						
						
						
					}

					else if (-a/b == -d/e && c/b == f/e) {
						
						
						/*
						 * y = (a/b)x + c/b
						 * y = (d/e)x + f/e
						 */
						
						
						
						

						System.out.println("COINCIDENT LINES - INFITIE SOLUTIONS");
						
						
						
					}
					else {
						double xVal = (d*c - a*f)/(d*b - a*e);
						double yVal = (e*c - a*f)/(e*a - b*d);
						
						as = new AttributedString("Single Point of Intersection:");
						as.addAttribute(TextAttribute.FAMILY, "Courier"); 
						as.addAttribute(TextAttribute.SIZE, 40);
						g.drawString(as.getIterator(), 40, 340);
						
						as = new AttributedString("("+xVal+","+yVal+")");
						as.addAttribute(TextAttribute.FAMILY, "Courier"); 
						as.addAttribute(TextAttribute.SIZE, 40);
						g.drawString(as.getIterator(), 40, 400);
	
						
						
						
						System.out.println(xVal);
						System.out.println(yVal);							
				
					}
				}
					
				
				
			}
			
			
		};
		
		frame.getContentPane().add(mainPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font textFont = new Font("ARIEL",Font.PLAIN,60);
		
		mainPanel.setLayout(new GridBagLayout());
		//addComponent(root,gamePanel,0,0,5,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		addComponent(mainPanel,display,0,0,7,1,1.0,0.9,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
		//*********************************
	
	
		addComponent(mainPanel,aField,0,1,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.BOTH,10,0,10,0);
		
		xLabel.setFont(textFont);
		
		addComponent(mainPanel,xLabel,1,1,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.WEST,10,0,10,0);
		
		plusLabel.setFont(textFont);
		addComponent(mainPanel,plusLabel,2,1,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.WEST,10,0,10,0);
		
		
		addComponent(mainPanel,bField,3,1,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.BOTH,10,0,10,0);
		
		yLabel.setFont(textFont);
		addComponent(mainPanel,yLabel,4,1,1,1,1.0,0.1,GridBagConstraints.WEST,GridBagConstraints.NONE,10,0,10,0);
		
		equalLabel.setFont(textFont);
		addComponent(mainPanel,equalLabel,5,1,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.NONE,10,0,10,0);
	
		addComponent(mainPanel,cField,6,1,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.BOTH,10,0,10,0);
		

		//*********************************
		
		addComponent(mainPanel,dField,0,2,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.BOTH,10,0,10,0);
		
		xLabel1.setFont(textFont);
		
		addComponent(mainPanel,xLabel1,1,2,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.WEST,10,0,10,0);
		
		plusLabel1.setFont(textFont);
		addComponent(mainPanel,plusLabel1,2,2,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.WEST,10,0,10,0);
		
		
		addComponent(mainPanel,eField,3,2,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.BOTH,10,0,10,0);
		
		yLabel1.setFont(textFont);
		addComponent(mainPanel,yLabel1,4,2,1,1,1.0,0.1,GridBagConstraints.WEST,GridBagConstraints.NONE,10,0,10,0);
		
		equalLabel1.setFont(textFont);
		addComponent(mainPanel,equalLabel1,5,2,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.NONE,10,0,10,0);
	
		addComponent(mainPanel,fField,6,2,1,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.BOTH,10,0,10,0);
		
		//*********************************
		
		addComponent(mainPanel,solveBtn,0,3,7,1,1.0,0.1,GridBagConstraints.LINE_START,GridBagConstraints.BOTH);
		
		frame.setSize(800,1000);
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
	            new SystemsOfEquationsCalc();
	        }
	    });
	}

}
