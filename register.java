package reclamationProject;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class register {
	
	public JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;
	private JPasswordField  textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	/**
	 * Create the application.
	 */
	public register(String app) {
		initialize(app);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize(String appName) {
		
		frame = new JFrame(appName);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setForeground(Color.LIGHT_GRAY);
		textField = new JTextField();
		textField.setBounds(33, 86, 220, 26);
		panel.add(textField);
		textField.setColumns(10);
		JLabel lblNewLabel_7 = new JLabel("Formulaire  d'inscription  ");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBackground(Color.GREEN);
		lblNewLabel_7.setBounds(302, 0, 344, 45);
		panel.add(lblNewLabel_7);
		
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL :\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(33, 291, 66, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(33, 130, 223, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(33, 117, 100, 14);
		panel.add(lblPassword);
		
		textField_2 = new JPasswordField();
		textField_2.setColumns(10);
		textField_2.setBounds(33, 174, 223, 26);
		panel.add(textField_2);
		
		JLabel lblRepeatpassword = new JLabel("Repeat Password :");
		lblRepeatpassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRepeatpassword.setBounds(33, 161, 132, 14);
		panel.add(lblRepeatpassword);
		
		JLabel lblTel = new JLabel("TEL :");
		lblTel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTel.setBounds(33, 335, 46, 14);
		panel.add(lblTel);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(33, 217, 223, 26);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(33, 260, 223, 26);
		panel.add(textField_4);
		
		JLabel lblAdresse = new JLabel("CIN :");
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdresse.setBounds(33, 423, 100, 14);
		panel.add(lblAdresse);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(33, 304, 223, 26);
		panel.add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Nom :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(33, 205, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pr\u00E9nom :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(33, 248, 66, 14);
		panel.add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(33, 349, 223, 26);
		panel.add(textField_6);
		
		JLabel lblNewLabel_4 = new JLabel("Date Naissance format : y-m-d");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(33, 380, 201, 14);
		panel.add(lblNewLabel_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(33, 392, 223, 26);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(33, 436, 223, 26);
		panel.add(textField_8);
		
		JLabel lblNewLabel_5 = new JLabel("Adresse :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(33, 467, 100, 14);
		
		panel.add(lblNewLabel_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(33, 480, 223, 26);
		panel.add(textField_9);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setFont(new Font("Dialog", Font.BOLD, 11));
		lblVille.setBounds(33, 512, 100, 14);
	panel.add(lblVille);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(30, 562, 223, 26);
		panel.add(textField_11);
		
		JLabel lblCodePostal = new JLabel("Code postal :");
		lblCodePostal.setFont(new Font("Dialog", Font.BOLD, 11));
		lblCodePostal.setBounds(33, 550, 100, 14);
		panel.add(lblCodePostal);
		
		
		panel.setBounds(0, 0, 979, 703);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Button button_1 = new Button("Quitter");
		button_1.setBounds(33, 649, 223, 33);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBackground(Color.RED);
		//**********************************************************
				//*********************************************************
	
		
		Button button = new Button("SignUp");
		button.setBounds(33, 599, 223, 33);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 
			try {
//				int query = mainWindow.stt.executeUpdate("insert into users(username,password,nom,prenom,email,tel,cin,ddn,adresse,ville,code_postal,priv) values('"
//						+ textField.getText() + "','"
//						+ textField_1.getPassword().toString() + "','"
//						+ textField_3.getText() + "','"
//						+ textField_4.getText() + "','"
//						+ textField_5.getText() + "','"
//						+ textField_6.getText() + "','"
//						+ textField_7.getText() + "','"
//						+ textField_8.getText() + "','"
//						+ textField_9.getText() + "','"
//						+ "'jamal','"
//						+ textField_10.getText() + "',"
//						+ 0 );
				PreparedStatement stt = mainWindow.con.prepareStatement("insert into users("
						+ "username,password,nom,prenom,email,tel,ddn,cin,adresse,ville,code_postal,priv) "
						+ "values(?,?,?,?,?,?,?,?,?,?,?,?)");
				        stt.setString(1, textField.getText());
				        stt.setString(2, String.valueOf(textField_1.getPassword()));
				        stt.setString(3, textField_3.getText());
				        stt.setString(4, textField_4.getText());
				        stt.setString(5, textField_5.getText());
				        stt.setString(6, textField_6.getText());
				        stt.setString(7, textField_7.getText());
				        stt.setString(8, textField_8.getText());
				        stt.setString(9, textField_9.getText());
				        stt.setString(10, textField_10.getText());
				        stt.setString(11, textField_11.getText());
				        stt.setInt(12, 0);
				int query=stt.executeUpdate();
				if(query==1) {
					System.out.print("user created");
					JOptionPane.showMessageDialog(null, "Registratiom reusite");
					mainWindow.userName=textField.getText();
			            frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "erreur incorrect donnees");
					System.out.print("incorectt data");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch blocker
				e.printStackTrace();
			}
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.RED);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setBounds(33, 69, 69, 17);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_10 = new JTextField();
		textField_10.setBounds(33, 524, 223, 26);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(Color.GREEN);
		lblNewLabel_6.setForeground(Color.GREEN);
		lblNewLabel_6.setIcon(new ImageIcon("/home/jamal/IdeaProjects/reclamation_project/photo/58a5f10a2011d4c97aad8fd32e1e8012cc4c9cec.jpg"));
		lblNewLabel_6.setBounds(0, 45, 1000, 647);
		panel.add(lblNewLabel_6);
		
		JLabel lblYourWelcome = new JLabel(" your welcome");
		lblYourWelcome.setForeground(Color.RED);
		lblYourWelcome.setBounds(366, 52, 132, 59);
		panel.add(lblYourWelcome);
		
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(434, 134, 100, 15);
		panel.add(lblNewLabel_8);
		frame.setBounds(100, 100, 979, 739);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}