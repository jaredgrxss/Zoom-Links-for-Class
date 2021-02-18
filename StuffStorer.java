import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.util.*;
import java.awt.*;
import java.net.*;

public class StuffStorer implements ActionListener {

	//sending user to link


	//frame initialization
	JFrame frame = new JFrame("Hello, Jared");

	//label initialization
	JLabel label1 = new JLabel();


	//labels for classes
	JLabel label2 = new JLabel("English:");
	JLabel label3 = new JLabel("Comp-Sci:");
	JLabel label4 = new JLabel("Speech:");

	//labels for zoom links
	JButton english = new JButton("English Class");
	JButton compsci = new JButton("Computer Science Class");
	JButton speech = new JButton("Speech Class");

	//panel initialzation
	JPanel zoomPanel = new JPanel();
	JPanel titlePanel = new JPanel();



	public StuffStorer() {

		//title panel w/ label1
		titlePanel.setLayout(new BorderLayout());
		titlePanel.setBounds(0,0,600,600);
		label1.setText("Zoom Links for Class");
		label1.setFont(new Font("MV Boli",Font.BOLD,60));
		label1.setOpaque(true);
		label1.setForeground(Color.white);
		label1.setBackground(Color.black);
		label1.setHorizontalAlignment(JLabel.CENTER);
		titlePanel.add(label1);

		//zoom link storer panel w/ labels and buttons
		zoomPanel.setBackground(new Color(204,229,255));
		zoomPanel.setLayout(new GridLayout(3,2));
		zoomPanel.add(label2);
		zoomPanel.add(english);
		zoomPanel.add(label3);
		zoomPanel.add(compsci);
		zoomPanel.add(label4);
		zoomPanel.add(speech);
		label2.setFont(new Font("MV Boli",Font.BOLD, 30));
		label2.setForeground(Color.black);
		label3.setFont(new Font("MV Boli",Font.BOLD, 30));
		label3.setForeground(Color.black);
		label4.setFont(new Font("MV Boli",Font.BOLD, 30));
		label4.setForeground(Color.black);

		//buttons for zoom links
		english.setFocusable(false);
		english.addActionListener(this);
		english.setFont(new Font("MV Boli", Font.BOLD, 25));
		compsci.setFocusable(false);
		compsci.addActionListener(this);
		compsci.setFont(new Font("MV Boli", Font.BOLD,25));
		speech.setFocusable(false);
		speech.addActionListener(this);
		speech.setFont(new Font("MV Boli", Font.BOLD,25));







		//frame work
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,600);
		frame.getContentPane().setBackground(new Color(102,102,255));

		//adding components to the frame
		frame.add(titlePanel, BorderLayout.NORTH);
		frame.add(zoomPanel);




		frame.setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == english) {
			Desktop browser = Desktop.getDesktop();
			try {
				browser.browse(new URI("https://olemiss.zoom.us/j/8328499592"));
			} catch(Exception evt) {

			} 


		}
		if(e.getSource() == compsci) {
			Desktop browser = Desktop.getDesktop();
			try {
				browser.browse(new URI("https://olemiss.zoom.us/j/95593183711"));
			} catch(Exception evt) {

			}
		}
		if(e.getSource() == speech) {
			Desktop browser = Desktop.getDesktop();
			try {
				browser.browse(new URI("https://olemiss.zoom.us/j/96755321535?pwd=Q1pvTFdneVRGSUJHN3pKeXkvMGxsUT09"));
			} catch(Exception evt) {

			}
		}


	}
	

}