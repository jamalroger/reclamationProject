package reclamationProject;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Button;

import javax.swing.*;

import java.awt.Label;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class User_recla {

	public JFrame frame;
	private JTextField objet;
	private JTextField content;
	/**
	 * Create the application.
	 */
	public User_recla(String app) {
		initialize(app);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String app_name) {
		
		frame = new JFrame(app_name);
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 812, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//		Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
//		frame.setMaximumSize(DimMax);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(0, 0, 817, 607);
		frame.getContentPane().add(tabbedPane);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Mon compte", null, panel_1, null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(null);
		
		JLabel lblCompteInformation = new JLabel("Information du compte  ");
		lblCompteInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompteInformation.setFont(new Font("Sylfaen", Font.ITALIC, 35));
		lblCompteInformation.setForeground(Color.RED);
		lblCompteInformation.setBounds(32, 27, 527, 49);
		panel_1.add(lblCompteInformation);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(147, 111, 170, 15);
		panel_1.add(lblUsername);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNom.setBounds(147, 148, 234, 15);
		panel_1.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrenom.setBounds(147, 186, 208, 15);
		panel_1.add(lblPrenom);
		
		JLabel lbldate= new JLabel("Date naissance :");
		lbldate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldate.setBounds(487, 111, 196, 15);
		panel_1.add(lbldate);
		
		JLabel lblCin = new JLabel(" CIN :");
		lblCin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCin.setBounds(487, 148, 131, 15);
		panel_1.add(lblCin);
		
		JLabel lblTelephone = new JLabel("Telephone :");
		lblTelephone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelephone.setBounds(147, 255, 196, 15);
		panel_1.add(lblTelephone);
		
		JLabel lblAddresse = new JLabel("Adresse :");
		lblAddresse.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddresse.setBounds(487, 186, 196, 15);
		panel_1.add(lblAddresse);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVille.setBounds(487, 223, 184, 15);
		panel_1.add(lblVille);
		
		JLabel lblCodePostal = new JLabel("Code postal :");
		lblCodePostal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCodePostal.setBounds(487, 255, 218, 15);
		panel_1.add(lblCodePostal);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(147, 223, 218, 15);
		panel_1.add(lblEmail);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnModifier.setForeground(UIManager.getColor("Button.shadow"));
		btnModifier.setBackground(UIManager.getColor("Button.background"));
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModifier.setBounds(239, 324, 281, 25);
		panel_1.add(btnModifier);

		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Mais reclamation", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 97, 188, 303);
		panel_2.add(scrollPane);
		
	
		
		JTextPane contentSelected = new JTextPane();
		contentSelected.setBounds(344, 184, 391, 210);
		panel_2.add(contentSelected);
		
		JLabel lblContent = new JLabel("Content :");
		lblContent.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContent.setBounds(344, 155, 66, 17);
		panel_2.add(lblContent);
		
		JLabel lblObject = new JLabel("Object :");
		lblObject.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblObject.setBounds(344, 97, 58, 17);
		panel_2.add(lblObject);
		DefaultListModel<String> l1 = new DefaultListModel<>();
		JList<String> list = new JList<>(l1);
	    scrollPane.setViewportView(list);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(344, 126, 53, 17);
		panel_2.add(lblDate);
		
		JLabel objetSelected = new JLabel("");
		objetSelected.setBounds(412, 98, 292, 15);
		panel_2.add(objetSelected);
		
		JLabel dateSelected = new JLabel("");
		dateSelected.setBounds(409, 125, 326, 17);
		panel_2.add(dateSelected);		
		
		JLabel lblMaisReclamation = new JLabel("Mais reclamation :");
		lblMaisReclamation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMaisReclamation.setBounds(59, 70, 188, 15);
		panel_2.add(lblMaisReclamation);
		//get Selected Reclamation
        list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				try {
				PreparedStatement stt = mainWindow.con.prepareStatement("select * from reclamation where objet=? and cli_id=?");
				stt.setString(1, list.getSelectedValue());
				stt.setInt(2, mainWindow.userId);
				
                   ResultSet query =stt.executeQuery();
					while(query.next()) {
					objetSelected.setText(query.getString(3));
					dateSelected.setText(query.getString(4));
					contentSelected.setText(query.getString(5));
				  }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  

				
			}
		});
        
        // add all reclamation objet to list
        
			 try {
			 
			 
			 
				ResultSet query = mainWindow.stt.executeQuery("select objet from reclamation where cli_id=" + mainWindow.userId );
				  while(query.next()) {
					  l1.addElement(query.getString(1));
				  }
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		list.setSelectedIndex(0);
		
		JLabel lblNewLabel = new JLabel("Historique des reclamation");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 35));
		lblNewLabel.setBounds(59, 12, 496, 46);
		panel_2.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Nouveau reclamation", null, panel, null);
		panel.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("Ajouter une reclamation");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 35));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(33, 25, 548, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Type de reclamation :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(53, 99, 210, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Object :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(188, 145, 75, 20);
		panel.add(lblNewLabel_3);
		
		objet = new JTextField();
		objet.setBounds(293, 147, 343, 19);
		panel.add(objet);
		objet.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Description :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setBounds(140, 194, 123, 20);
		panel.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mat\u00E9riel", "Syst\u00E8me", "Service", "r\u00E9ception", ""}));
		comboBox.setBounds(293, 99, 343, 24);
		panel.add(comboBox);
		
		content = new JTextField();
		content.setBounds(293, 194, 343, 100);
		panel.add(content);
		content.setColumns(10);
		
		JButton btnNewButton = new JButton("Envoyer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				insertRecla(objet.getText(), content.getText());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(293, 325, 343, 34);
		panel.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setForeground(Color.WHITE);
		tabbedPane.addTab("Afficher l'aide", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextPane txtpnLePortailOffre = new JTextPane();
		txtpnLePortailOffre.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnLePortailOffre.setText("L'application offre un ensemble de services notamment :\r\n\r\n- Soumettre une demande : qui consiste \u00E0 identifier l\u2019organisme concern\u00E9 et l'introduction des renseignements personnels et les donn\u00E9es n\u00E9cessaires relatives \u00E0 la nature de la demande.\r\n\r\n- Suivre une r\u00E9clamation et communiquer avec l\u2019administration : cette op\u00E9ration n\u00E9cessite le num\u00E9ro de la r\u00E9clamation et l\u2019adresse \u00E9lectronique du plaignant pour acc\u00E9der \u00E0 l\u2019espace de suivi d\u2019une r\u00E9clamation qui permet de consulter l\u2019\u00E9tat d\u2019avancement de son traitement. Cet espace permet \u00E9galement l\u2019envoi d\u2019un message \u00E0 l\u2019administration concern\u00E9e et l\u2019attachement de nouvelles pi\u00E8ces jointes qui peuvent renforcer le contenu de la r\u00E9clamation.\r\n\r\n - Exprimer le niveau de satisfaction apr\u00E8s le traitement : Le citoyen peut \u00E9valuer la r\u00E9ponse de l\u2019administration et exprimer son niveau de satisfaction concernant ce service.\r\n\r\n - R\u00E9-ouvrir une r\u00E9clamation : Dans le cas de doute ou de non conviction, le citoyen peut r\u00E9-ouvrir sa r\u00E9clamation pour la traiter de nouveau.\r\n\r\n");
		txtpnLePortailOffre.setBounds(50, 39, 672, 263);
		panel_3.add(txtpnLePortailOffre);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("/home/jamal/IdeaProjects/reclamation_project/photo/images.jpg"));
		lblNewLabel_5.setBounds(501, 313, 275, 91);
		panel_3.add(lblNewLabel_5);

// inisialise panel Mon compte	
		
 try {
		ResultSet query = mainWindow.stt.executeQuery("select * from users where id=" + mainWindow.userId );
		  while(query.next()) {
			  lblUsername.setText(lblUsername.getText()+ " " + query.getString(2));
			  lblNom.setText(lblNom.getText()+ " " + query.getString(4));
			  lblPrenom.setText(lblPrenom.getText()+ " " + query.getString(5));
			  lblEmail.setText(lblEmail.getText()+ " " + query.getString(6));
			  lblTelephone.setText(lblTelephone.getText()+ " " + query.getString(7));
			  lbldate.setText(lbldate.getText()+ " " + query.getString(8));
			  lblCin.setText(lblCin.getText()+ " " + query.getString(9));
			  lblAddresse.setText(lblAddresse.getText()+ " " + query.getString(10));
			  lblVille.setText(lblVille.getText()+ " " + query.getString(11));
			  lblCodePostal.setText(lblCodePostal.getText()+ " " + query.getString(12));

		  }
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
// insert new reclamation
public void insertRecla(String objet,String content) throws SQLException {
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		  LocalDateTime now = LocalDateTime.now();  
		PreparedStatement stt = mainWindow.con.prepareStatement("insert into reclamation("
				+ "cli_id,objet,Date,contenu) "
				+ "values(?,?,?,?)");
		        stt.setInt(1,mainWindow.userId );
		        stt.setString(2, objet);
		        stt.setString(3,dtf.format(now));
		        stt.setString(4,content);
		        
		int query=stt.executeUpdate();
		if(query==1) {
			System.out.print("reclamation insert");	
			JOptionPane.showMessageDialog(null, "Registration envoyer merci !!");
		} else {
			System.out.print("incorectt data");
		}
		
		
	}
}