package guisJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LoginGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton loginButton;
	private List<User> userList;
 	
	public LoginGui() {
		userList = new ArrayList<>();
		
		usernameField = new JTextField(20);
		passwordField = new JPasswordField(20);
		loginButton = new JButton("Login");
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				char[] password = passwordField.getPassword();
				userList.add(new User(username, new String(password)));
				usernameField.setText("");
				passwordField.setText("");
				JOptionPane.showMessageDialog(LoginGui.this, "Usuário registrado com sucesso!!");
			}// actionPerformed
			
		}) ;// login button. addActionListener
		
		setLayout(new GridLayout(3, 2));
		add(new JLabel ("Nome de Uruário: "));
		add(usernameField);
		add(new JLabel ("Senha: "));
		add(passwordField);
		add(new JLabel());
		add(loginButton);
		
		setTitle("Login de Usuário");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}// login gui
	public static void main(String[] args) {
		SwingUtilities.invokeLater( new Runnable() 
		{
			public void run() 
			{
				new LoginGui();
			}// fim do método run
		}); // fim do método SwingUtilities
	}// fim do método principal que vai gerar a saída
	private class User 
	{
		private String username;
		private String password;
		
		public User(String username, String password)
		{
			this.username = username;
			this.password = password;
		}// fim do construtor
	}// fim do método User
	

}// fim da classe LoginGui
