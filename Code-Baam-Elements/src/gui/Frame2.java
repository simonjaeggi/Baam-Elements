package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Frame2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame2() {
		initialize();
	}

	/**
	 * Inizialisierung des Frames
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100,  1137, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//Titel
		JLabel lblKampf = new JLabel("Kampf");
		lblKampf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 70));
		lblKampf.setForeground(new Color(255, 255, 255));
		lblKampf.setBounds(54, 34, 546, 109);
		frame.getContentPane().add(lblKampf);
		
	//Spieler1:
		//Button Schlag
		JButton btnNewButton = new JButton("Schlag");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.setBounds(54, 525, 256, 51);
		frame.getContentPane().add(btnNewButton);
		
		//Bild für Avatar
		JLabel Spieler_Avatar_Lable = new JLabel();
		Spieler_Avatar_Lable.setIcon(new ImageIcon(this.getClass().getResource("/data/Feuer_Avatar.png")));
		Spieler_Avatar_Lable.setBounds(54, 225, 256, 256);
		frame.getContentPane().add(Spieler_Avatar_Lable);
		
		//Lebensanzeige
		JLabel Lebensanzeige = new JLabel("100");
		Lebensanzeige.setFont(new Font("Tahoma", Font.BOLD, 32));
		Lebensanzeige.setForeground(new Color(255, 255, 255));
		Lebensanzeige.setBackground(new Color(255, 255, 255));
		Lebensanzeige.setBounds(414, 330, 60, 46);
		frame.getContentPane().add(Lebensanzeige);
		
		//Hintergrund für Lebensanzeige(Herz)
		JLabel Lebensanzeige_Hintergrund = new JLabel();
		Lebensanzeige_Hintergrund.setIcon(new ImageIcon(this.getClass().getResource("/data/Lebensanzeige_Hintergrund.png")));
		Lebensanzeige_Hintergrund.setBounds(380, 289, 128, 128);
		frame.getContentPane().add(Lebensanzeige_Hintergrund);
		
		
		
	//Spieler2:
		//Bild für Gegnerischen Avatar
		JLabel Spieler2_Avatar_Lable = new JLabel("");
		Spieler2_Avatar_Lable.setBounds(824, 105, 128, 128);
		frame.getContentPane().add(Spieler2_Avatar_Lable);
		
		//Lebensanzeige für Gegneravatar
		JLabel lblNewLabel = new JLabel("100");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(635, 174, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		//Hintergrund für Lebensanzeige(Herz)
		JLabel Spieler2_Lebensanzeige_Hintergrund = new JLabel();
		Spieler2_Lebensanzeige_Hintergrund.setIcon(new ImageIcon(this.getClass().getResource("/data/Lebensanzeige_Hintergrund.png")));
		/*
		ImageIcon Spieler2_Lebensanzeige_Hintergrund_resized = new ImageIcon();
		Image img = Spieler2_Lebensanzeige_Hintergrund_resized.getImage(); 
        Image newimg = img.getScaledInstance(Spieler2_Lebensanzeige_Hintergrund.getWidth(), Spieler2_Lebensanzeige_Hintergrund.getHeight(),  java.awt.Image.SCALE_SMOOTH);
        Spieler2_Lebensanzeige_Hintergrund.setIcon(Spieler2_Lebensanzeige_Hintergrund_resized);
	
		 /* BufferedImage img = null;
		try {
			img = ImageIO.read(new File("/data/Lebensanzeige_Hintergrund.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(Spieler2_Lebensanzeige_Hintergrund.getWidth(), Spieler2_Lebensanzeige_Hintergrund.getHeight(),
		        Image.SCALE_SMOOTH);
		ImageIcon Spieler2_Lebensanzeige_Hintergrund_resized = new ImageIcon(dimg);
		*/
		Spieler2_Lebensanzeige_Hintergrund.setBounds(728, 135, 64, 64);
		frame.getContentPane().add(Spieler2_Lebensanzeige_Hintergrund);
		
		
		
	}
}
