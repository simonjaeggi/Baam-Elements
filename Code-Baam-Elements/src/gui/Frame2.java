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
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logic.Avatar;


/**
 * 
 * @author Simon Jaeggi, Lukas Reinhardt
 * Die Klasse ist die Oberflaeche des Spiels, hier werden saemtliche Kampfhandlungen vollzogen.
 */

public class Frame2 {

	private JFrame frame;
	private Avatar Avatar_1;
	private Avatar Avatar_2;
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
		frame.setVisible(true);
		
		
		
		
		//Titel
		JLabel lblKampf = new JLabel("Kampf");
		lblKampf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 70));
		lblKampf.setForeground(new Color(255, 255, 255));
		lblKampf.setBounds(54, 34, 546, 109);
		frame.getContentPane().add(lblKampf);
		
	//Spieler1:
		
		//Bild für Avatar
		JLabel Spieler_Avatar_Lable = new JLabel();
		Spieler_Avatar_Lable.setIcon(new ImageIcon(this.getClass().getResource("/data/Feuer_Avatar.png")));
		Spieler_Avatar_Lable.setBounds(54, 225, 256, 256);
		frame.getContentPane().add(Spieler_Avatar_Lable);
		
		//Lebensanzeige
		JLabel Lebensanzeige = new JLabel("100");
		Lebensanzeige.setFont(new Font("Tahoma", Font.BOLD, 32));
		Lebensanzeige.setForeground(new Color(255, 255, 255));
	
		Lebensanzeige.setBounds(380, 289, 128, 128);
		frame.getContentPane().add(Lebensanzeige);
		Lebensanzeige.setIcon(new ImageIcon(this.getClass().getResource("/data/Lebensanzeige_Hintergrund.png")));
		Lebensanzeige.setHorizontalTextPosition(JLabel.CENTER);
		
		//Hintergrund für Lebensanzeige(Herz)
	
		
		
		
		
		
	//Spieler2:
		//Bild für Gegnerischen Avatar
		JLabel Spieler2_Avatar_Lable = new JLabel("");
		Spieler2_Avatar_Lable.setBounds(824, 105, 128, 128);
		frame.getContentPane().add(Spieler2_Avatar_Lable);
		
		BufferedImage imgA = null;
		try {
		    imgA = ImageIO.read(this.getClass().getResource("/data/Wasser_Avatar.png"));
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimgA = imgA.getScaledInstance(Spieler2_Avatar_Lable.getWidth(), Spieler2_Avatar_Lable.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIconA = new ImageIcon(dimgA);
		Spieler2_Avatar_Lable.setIcon(imageIconA);
		
		//Lebensanzeige für Gegneravatar
	
		JLabel Spieler2_Lebensanzeige = new JLabel("100");
		Spieler2_Lebensanzeige.setHorizontalTextPosition(JLabel.CENTER);
		Spieler2_Lebensanzeige.setBounds(728, 135, 64, 64);
		Spieler2_Lebensanzeige.setForeground(new Color(255, 255, 255));
		Spieler2_Lebensanzeige.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		//Passt die groesse des Bildes an die groesse des JLabels an
	
		BufferedImage img = null;
		try {
		    img = ImageIO.read(this.getClass().getResource("/data/Lebensanzeige_Hintergrund.png"));
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg = img.getScaledInstance(Spieler2_Lebensanzeige.getWidth(), Spieler2_Lebensanzeige.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon = new ImageIcon(dimg);
		Spieler2_Lebensanzeige.setIcon(imageIcon);
		
		
		frame.getContentPane().add(Spieler2_Lebensanzeige);
		
		//Button Schlag
		JButton btnNewButton = new JButton("Schlag");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.setBounds(70, 524, 256, 51);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
