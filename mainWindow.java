package reclamationProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class mainWindow {

	public JFrame frame;
	private JTextField username;
	private JLabel lblLogin;
	private JLabel lblPassword;
	private JLabel lblError ;
	public static Connection con;
	public static Statement stt;
	public static int userId;
	public static String userName;
	private JPasswordField password;
	/**
	 * Create the application.
	 */
	public mainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ClassNotFoundException 
	 */
	private void initialize() {
		// init connection to mysql database :recla/root/root
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
		    this.con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/recla?user=root&password=root");
		    if (con != null) {
		    	 System.out.println("connected");
		    }else {
		    	System.out.println("not connected");
		    }
		    stt = con.createStatement();
		     
		} catch(SQLException e) {
			System.out.println(e);
			}
		
		} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		 
		// Jfram desgining
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(100, 100, 818, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("/home/jamal/IdeaProjects/reclamation_project/photo/ob_bc38a6_fr7-ambassade-reclamations.jpg"));
		lblNewLabel_1.setBounds(0, 0, 359, 381);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Claim System");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Te X Gyre Chorus", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(314, 22, 523, 47);
		frame.getContentPane().add(lblNewLabel);
		username = new JTextField();
		username.setBounds(499, 140, 167, 31);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		lblLogin = new JLabel("Login  :");
		lblLogin.setForeground(Color.BLUE);
		lblLogin.setFont(new Font("Dialog", Font.BOLD, 15));
		lblLogin.setBounds(415, 148, 66, 15);
		frame.getContentPane().add(lblLogin);
		
		lblPassword = new JLabel("Password  :");
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPassword.setBounds(384, 191, 97, 15);
		frame.getContentPane().add(lblPassword);
		
		JButton btnConnecte = new JButton("Se connecter");
		btnConnecte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnConnecte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
				   connecteToSql(username.getText(),String.valueOf(password.getPassword()));	
				   
				} catch(SQLException e1) {
					
					e1.getMessage();
				}
			  
			}
		});

		btnConnecte.setBounds(499, 226, 167, 31);
		frame.getContentPane().add(btnConnecte);
		
		JLabel lblInscrit = new JLabel("Create  account");
		lblInscrit.setFont(new Font("Dialog", Font.ITALIC, 15));
		lblInscrit.setToolTipText("");
		lblInscrit.setForeground(Color.BLUE);
		lblInscrit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register kframe = new register("registration");
			    kframe.frame.setVisible(true);
			}
		});
		lblInscrit.setBackground(Color.BLUE);
		lblInscrit.setBounds(515, 252, 177, 31);
		frame.getContentPane().add(lblInscrit);
		lblError = new JLabel("error");
		lblError.setForeground(Color.RED);
		lblError.setVisible(false);
		lblError.setBounds(415, 79, 277, 30);
		frame.getContentPane().add(lblError);
		
		JLabel label = new JLabel("");
		label.setBounds(26, 109, 66, 15);
		frame.getContentPane().add(label);
		
		password = new JPasswordField();
		password.setBounds(499, 183, 167, 31);
		frame.getContentPane().add(password);
	}
	// function connnect to user
	public  void connecteToSql(String user,String pass)  throws  SQLException {
		
	   
		ResultSet  query = stt.executeQuery("select id,username, password, priv  from users");
		
		
	    while(query.next()) {
	    	if(query.getString(2).equals(user) && query.getString(3).equals( pass)) {
	              userId=Integer.parseInt(query.getString(1));
	              userName=query.getString(2);
	              
	    		 int pri = Integer.parseInt(query.getString(4));
	    		 frame.setVisible(false);
	    		 if(pri == 1) {
	    			 //admin
	    			 Admin_recla admin = new Admin_recla("admin");
	    			             admin.setVisible(true);
	    			 
	    		 }else {
	    			//utilusateur
	    			 User_recla user1 = new User_recla("user");
	    			            user1.frame.setVisible(true);
	    		 }
	    		 
	  
	    		return;
	    		
	    	}
	    		
	    } 
	    
	    lblError.setVisible(true);
	    lblError.setText("incorect username or password ");
	 
	}
}
