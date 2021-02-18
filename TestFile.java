import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.util.HashMap;
import java.util.ArrayList;


public class TestFile implements ActionListener {

	//declaring/initilalizing all things required for initial page
	JFrame frame = new JFrame("Password Storage");
	JLabel label = new JLabel("Username:");
	JLabel label2 = new JLabel("Password:");
	JTextField username = new JTextField();
	JPasswordField password = new JPasswordField();
	JButton loginButton = new JButton("Login");
	HashMap<String,String> userInfo = new HashMap<String,String>();
	JLabel testLabel = new JLabel();
	ArrayList<Integer> errors = new ArrayList<Integer>();

	//timer stuff to make delay for new frame to pop up
	ActionListener ticktock = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			StuffStorer lastPage = new StuffStorer();
		}
	};
	Timer timer = new Timer(2000, ticktock);




	public TestFile(HashMap<String,String> userAndPassFile) {

		//setting the real file of passwords to a copy of the passwords in a diff hashmap
		this.userInfo = userAndPassFile;

		//frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,400);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(102,178,255));

		//buttons
		loginButton.setFocusable(false);
		loginButton.setBounds(225,200,150,40);
		loginButton.addActionListener(this);

		//labels
		label.setFont(new Font("MV Boli", Font.BOLD,25));
		label.setBounds(50,100,200,50);
		label2.setFont(new Font(null, Font.BOLD, 25));
		label2.setBounds(50,140,200,50);
		

		//textfields
		username.setBounds(200,110,200,40);
		password.setBounds(200,150,200,40);

		//adding components to frame
		frame.add(loginButton);
		frame.add(username);
		frame.add(password);
		frame.add(label2);
		frame.add(label);
		frame.add(testLabel);
		frame.setVisible(true);

	
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == loginButton) {

			int i = 0;

			String userCheck = username.getText();
			String passCheck = String.valueOf(password.getPassword());

			if(userInfo.containsKey(userCheck)) {
				if(userInfo.get(userCheck).equals(passCheck)){ 

					testLabel.setBounds(100,50,350,40);
					testLabel.setFont(new Font("MV Boli", Font.BOLD, 35));
					testLabel.setForeground(Color.white);
					testLabel.setText("Welcome Jared!");
					timer.setRepeats(false);
					timer.start();



				}
				else {
					testLabel.setBounds(275,250,200,40);
					testLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
					testLabel.setText("Error");
					testLabel.setForeground(Color.red);
					errors.add(i);
					i++;
					



				}

			} 
			else {
				testLabel.setBounds(275,250,200,40);
				testLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
				testLabel.setText("Error");
				testLabel.setForeground(Color.red);
				errors.add(i);
				i++;
				

			}

			if(errors.size() == 4) {
				frame.dispose();
			}


		}

	}

}