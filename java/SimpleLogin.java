import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class SimpleLogin extends JApplet implements ActionListener
{
	// MEMBER VARIABLES

	private JTextField txtUser = new JTextField(10);
	private JPasswordField txtPassword = new JPasswordField(10);
	private JButton btnLogin = new JButton("Login");
	private JButton btnReset = new JButton("Reset");

	/** The number of columns in a text field **/
	private final int TEXT_COLS = 10;

	private final String USER = "userX";
	private final String PASSWORD = "passwordX";

	// INIT METHOD

	public void init()
	{
		// add applet as action listener
		btnLogin.addActionListener(this);
		btnReset.addActionListener(this);
		// set button mnemonic
		btnLogin.setMnemonic(KeyEvent.VK_L);
		btnReset.setMnemonic(KeyEvent.VK_R);
		// create panel and add components
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(new JLabel("User name"));
		panel.add(txtUser);
		panel.add(new JLabel("Password"));
		panel.add(txtPassword);
		panel.add(btnLogin);
		panel.add(btnReset);
		// add panel to applet
		getContentPane().add(panel);
	}

	public void start() {}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnLogin)
			login();
		else if (e.getSource() == btnReset)
			reset();
	}

	private void login()
	{
		if (txtUser.getText().equals(USER) && (new String(txtPassword.getPassword())).equals(PASSWORD))
		{
			//JOptionPane.showMessageDialog(this, "Login Success!");
			reset();
			try
			{
				URL redirect = new URL("http://www.southwestmsu.edu");
				getAppletContext().showDocument(redirect);
			}
			catch (Exception e)
			{
				System.out.println("Could not redirect page");
				JOptionPane.showMessageDialog(this, "Could not redirect page");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Login Failed!");
			txtPassword.setText("");
		}
	}

	private void reset()
	{
		txtUser.setText("");
		txtPassword.setText("");
	}

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Test Login");
		SimpleLogin applet = new SimpleLogin();
		frame.getContentPane().add(applet);
		applet.init();
		applet.start();
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

} // end of class SimpleLogin
