package reclamationProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListModel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Admin_recla extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Admin_recla(String name) {
		super(name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(5, 0, 808, 427);
		contentPane.add(tabbedPane);
		 DefaultListModel<String> l1 = new DefaultListModel<>();
						  
		DefaultListModel<String> l2 = new DefaultListModel<>();
	     
	     JPanel panel = new JPanel();
	     tabbedPane.addTab("Liste Utilisateur", null, panel, null);
	     panel.setLayout(null);
	     
	     JScrollPane scrollPane = new JScrollPane();
	     scrollPane.setBounds(41, 49, 191, 278);
	     panel.add(scrollPane);
	     JList<String> list = new JList<>(l1);
	     
	     scrollPane.setViewportView(list);
	     scrollPane.setBounds(41, 49, 191, 278);
	     
	     	
	     	JLabel lblCompteInformation = new JLabel("Information");
	     	lblCompteInformation.setFont(new Font("Sylfaen", Font.ITALIC, 35));
	     	lblCompteInformation.setForeground(Color.RED);
	     	lblCompteInformation.setBounds(250, 31, 331, 39);
	     	panel.add(lblCompteInformation);
	     	
	     	JLabel lblUsername = new JLabel("Username :");
	     	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lblUsername.setBounds(290, 100, 87, 15);
	     	panel.add(lblUsername);
	     	
	     	JLabel lblNom = new JLabel("Nom :");
	     	lblNom.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lblNom.setBounds(290, 142, 87, 15);
	     	panel.add(lblNom);
	     	
	     	JLabel lblPrenom = new JLabel("Prenom :");
	     	lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lblPrenom.setBounds(290, 184, 74, 15);
	     	panel.add(lblPrenom);
	     	
	     	JLabel lbldate= new JLabel("Date naissance :");
	     	lbldate.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lbldate.setBounds(547, 223, 117, 15);
	     	panel.add(lbldate);
	     	
	     	JLabel lblCin = new JLabel(" CIN :");
	     	lblCin.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lblCin.setBounds(547, 142, 76, 15);
	     	panel.add(lblCin);
	     	
	     	JLabel lblTelephone = new JLabel("Telephone :");
	     	lblTelephone.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lblTelephone.setBounds(290, 263, 87, 15);
	     	panel.add(lblTelephone);
	     	
	     	JLabel lblAddresse = new JLabel("Adresse :");
	     	lblAddresse.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lblAddresse.setBounds(547, 184, 98, 15);
	     	panel.add(lblAddresse);
	     	
	     	JLabel lblVille = new JLabel("Ville :");
	     	lblVille.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lblVille.setBounds(547, 100, 76, 15);
	     	panel.add(lblVille);
	     	
	     	JLabel lblCodePostal = new JLabel("Code postal :");
	     	lblCodePostal.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lblCodePostal.setBounds(552, 259, 112, 23);
	     	panel.add(lblCodePostal);
	     	
	     	JLabel lblEmail = new JLabel("Email :");
	     	lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
	     	lblEmail.setBounds(290, 223, 87, 15);
	     	panel.add(lblEmail);
	     	
	     		
	     		JLabel Username = new JLabel("");
	     		Username.setBounds(392, 114, 66, 15);
	     		panel.add(Username);
	     		
	     		JLabel Nom = new JLabel("");
	     		Nom.setBounds(391, 141, 66, 15);
	     		panel.add(Nom);
	     		
	     		JLabel Prenom = new JLabel("");
	     		Prenom.setBounds(392, 176, 124, 23);
	     		panel.add(Prenom);
	     		
	     		JLabel Email = new JLabel("");
	     		Email.setBounds(389, 223, 127, 15);
	     		panel.add(Email);
	     		
	     		JLabel Telephone = new JLabel("");
	     		Telephone.setBounds(389, 259, 127, 15);
	     		panel.add(Telephone);
	     		
	     		JLabel Ville = new JLabel("");
	     		Ville.setBounds(619, 92, 152, 23);
	     		panel.add(Ville);
	     		
	     		JLabel Cin = new JLabel("");
	     		Cin.setBounds(607, 127, 152, 29);
	     		panel.add(Cin);
	     		
	     		JLabel Adresse = new JLabel("");
	     		Adresse.setBounds(653, 176, 106, 15);
	     		panel.add(Adresse);
	     		
	     		JLabel Naissance = new JLabel("");
	     		Naissance.setBounds(686, 211, 105, 15);
	     		panel.add(Naissance);
	     		
	     		JLabel Codepostale = new JLabel("");
	     		Codepostale.setFont(new Font("Tahoma", Font.BOLD, 15));
	     		Codepostale.setBounds(676, 259, 95, 15);
	     		panel.add(Codepostale);
	     		list.setSelectedIndex(0);
	     		//get information about users selected in the list	
	     		list.addListSelectionListener(new ListSelectionListener() {
	     				public void valueChanged(ListSelectionEvent arg0) {
	     					
	     					try {
	     						ResultSet query = mainWindow.stt.executeQuery("select * from users where id=" + (list.getSelectedIndex()+1) );
	     						  while(query.next()) {
	     							  Username.setText(query.getString(2));
	     							  Nom.setText(query.getString(4));
	     							  Prenom.setText(query.getString(5));
	     							  Email.setText( query.getString(6));
	     							  Telephone.setText(query.getString(7));
	     							  Naissance.setText(query.getString(8));
	     							  Cin.setText(query.getString(9));
	     							  Adresse.setText( query.getString(10));
	     							  Ville.setText(query.getString(11));
	     							  Codepostale.setText(query.getString(12));
	     						  }
	     						
	     					} catch (SQLException e) {
	     						// TODO Auto-generated catch block
	     						e.printStackTrace();
	     					}
	     		
	     				}
	     			});
		
	     JScrollPane scrollPane1 = new JScrollPane();
	     scrollPane1.setBounds(72, 54, 225, 273);
	     
	     JPanel panel_1 = new JPanel();
	     tabbedPane.addTab("Liste reclamtion", null, panel_1, null);
	     panel_1.setLayout(null);
	     panel_1.add(scrollPane1);
	     
	     JList<String> list_1 = new JList<String>(l2);
	   	     scrollPane1.setViewportView(list_1);
	     
	     JLabel lblCreerPar = new JLabel("Par Mr :");
	     lblCreerPar.setFont(new Font("Tahoma", Font.BOLD, 12));
	     lblCreerPar.setBounds(328, 56, 100, 30);
	     panel_1.add(lblCreerPar);
	     
	     JLabel UserNom = new JLabel("New label");
	     UserNom.setBounds(420, 60, 131, 23);
	     panel_1.add(UserNom);
	     
	     JLabel lblDateDeCreation = new JLabel("Date de Creation :");
	     lblDateDeCreation.setFont(new Font("Tahoma", Font.BOLD, 12));
	     lblDateDeCreation.setBounds(328, 88, 131, 30);
	     panel_1.add(lblDateDeCreation);
	     
	     JLabel UserDate = new JLabel("");
	     UserDate.setBounds(486, 91, 131, 15);
	     panel_1.add(UserDate);
	     
	     JLabel lblDansLobjet = new JLabel("Objet :");
	     lblDansLobjet.setFont(new Font("Tahoma", Font.BOLD, 12));
	     lblDansLobjet.setBounds(328, 118, 121, 30);
	     panel_1.add(lblDansLobjet);
	     
	     JLabel UserObjet = new JLabel("New label");
	     UserObjet.setBounds(410, 118, 146, 23);
	     panel_1.add(UserObjet);
	     
	     JTextPane UserContent = new JTextPane();
	     UserContent.setBounds(390, 170, 258, 157);
	     panel_1.add(UserContent);
	     
	     JLabel lblContent = new JLabel("Content :");
	     lblContent.setFont(new Font("Tahoma", Font.BOLD, 12));
	     lblContent.setBounds(328, 152, 100, 19);
	     panel_1.add(lblContent);
	     
	     JLabel lblNewLabel = new JLabel("");
	     lblNewLabel.setIcon(new ImageIcon("/home/jamal/IdeaProjects/reclamation_project/photo/sans-titre.png"));
	     lblNewLabel.setBounds(72, 0, 225, 55);
	     panel_1.add(lblNewLabel);
	     
	     		
	     		JPanel panel_2 = new JPanel();
	     		tabbedPane.addTab("Options", null, panel_2, null);
	     		
	     		JPanel panel_3 = new JPanel();
	     		panel_3.setBackground(Color.WHITE);
	     		tabbedPane.addTab("L'aide", null, panel_3, null);
	     		panel_3.setLayout(null);
	     		
	     		JTextPane txtpnLePortailOffre = new JTextPane();
	     		txtpnLePortailOffre.setFont(new Font("Tahoma", Font.BOLD, 12));
	     		txtpnLePortailOffre.setBounds(66, 46, 666, 265);
	     		txtpnLePortailOffre.setText("L'application offre un ensemble de services notamment :\r\n\r\n- Soumettre une demande : qui consiste \u00E0 identifier l\u2019organisme concern\u00E9 et l'introduction des renseignements personnels et les donn\u00E9es n\u00E9cessaires relatives \u00E0 la nature de la demande.\r\n\r\n- Suivre une r\u00E9clamation et communiquer avec l\u2019administration : cette op\u00E9ration n\u00E9cessite le num\u00E9ro de la r\u00E9clamation et l\u2019adresse \u00E9lectronique du plaignant pour acc\u00E9der \u00E0 l\u2019espace de suivi d\u2019une r\u00E9clamation qui permet de consulter l\u2019\u00E9tat d\u2019avancement de son traitement. Cet espace permet \u00E9galement l\u2019envoi d\u2019un message \u00E0 l\u2019administration concern\u00E9e et l\u2019attachement de nouvelles pi\u00E8ces jointes qui peuvent renforcer le contenu de la r\u00E9clamation.\r\n\r\n - Exprimer le niveau de satisfaction apr\u00E8s le traitement : Le citoyen peut \u00E9valuer la r\u00E9ponse de l\u2019administration et exprimer son niveau de satisfaction concernant ce service.\r\n\r\n - R\u00E9-ouvrir une r\u00E9clamation : Dans le cas de doute ou de non conviction, le citoyen peut r\u00E9-ouvrir sa r\u00E9clamation pour la traiter de nouveau.\r\n\r\n");
	     		panel_3.add(txtpnLePortailOffre);
	     		
	     		JLabel lblNewLabel_1 = new JLabel("New label");
	     		lblNewLabel_1.setIcon(new ImageIcon("/home/jamal/IdeaProjects/reclamation_project/photo/images.jpg"));
	     		lblNewLabel_1.setBounds(529, 312, 274, 87);
	     		panel_3.add(lblNewLabel_1);
	     list_1.addListSelectionListener(new ListSelectionListener() {
		     	public void valueChanged(ListSelectionEvent arg0) {
		     	try {
		    			ResultSet query = mainWindow.stt.executeQuery("select username,nom,prenom,Date,objet,contenu from users,reclamation where users.id=reclamation.cli_id and reclamation.id = " + (list_1.getSelectedIndex()+1));
		    			  while(query.next()) { 
		                     UserNom.setText(query.getString(2) +" "+ query.getString(3));
		                     UserDate.setText(query.getString(4));
		                     UserObjet.setText(query.getString(5));
		                     UserContent.setText(query.getString(6));
		    			  }
		    			  
		    			
		    		} catch (SQLException e) {
		    			// TODO Auto-generated catch block
		    			e.printStackTrace();
		    		}
		    	
		     		
		     	}
		     });
  

	//get liste Users and set to list
			try {
			ResultSet query = mainWindow.stt.executeQuery("select username from  users" );
			  while(query.next()) {
				  l1.addElement(query.getString(1));
			  }
		  query = mainWindow.stt.executeQuery("select objet from  reclamation" );
			  while(query.next()) {
				  l2.addElement(query.getString(1));
			  }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
