package gui;


import javax.swing.JFrame;

import java.awt.Color;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import data.FileLocations;

import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logic.Avatar;
import logic.Kampf;


/**
 * 
 * @author Simon Jaeggi, Lukas Reinhardt
 * Die Klasse ist die Oberflaeche des Spiels, hier werden saemtliche Kampfhandlungen vollzogen.
 */

public class Frame2 {

	private JFrame frame;
	private Avatar Avatar_1;
	private Avatar Avatar_2;
	private Kampf k;
	private int RoundedUp_1;
	private int RoundedUp_2;
	private FileLocations FL = new FileLocations();

	/**
	 * Create the application.
	 */
	public Frame2(Avatar Avatar_1, Avatar Avatar_2) {
		this.Avatar_1 = Avatar_1;
		this.Avatar_2 = Avatar_2;
		initialize();

		k = new Kampf(this.Avatar_1, this.Avatar_2);

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
		Spieler_Avatar_Lable.setIcon(new ImageIcon(this.getClass().getResource(FL.getAvatarImage(Avatar_1))));
		Spieler_Avatar_Lable.setBounds(54, 225, 256, 256);
		frame.getContentPane().add(Spieler_Avatar_Lable);

		//Lebensanzeige
		
		RoundedUp_1 = (int) Math.ceil(Avatar_1.getLebenspunkte());
		
		JLabel Lebensanzeige = new JLabel(Integer.toString((RoundedUp_1)));
		Lebensanzeige.setFont(new Font("Tahoma", Font.BOLD, 32));
		Lebensanzeige.setForeground(new Color(255, 255, 255));

		Lebensanzeige.setBounds(380, 289, 128, 128);
		frame.getContentPane().add(Lebensanzeige);
		Lebensanzeige.setIcon(new ImageIcon(this.getClass().getResource(FL.getHPImage())));
		Lebensanzeige.setHorizontalTextPosition(JLabel.CENTER);

		//Hintergrund für Lebensanzeige(Herz)






		//Spieler2:
		//Bild für Gegnerischen Avatar
		JLabel Spieler2_Avatar_Lable = new JLabel("");
		Spieler2_Avatar_Lable.setBounds(824, 105, 128, 128);
		frame.getContentPane().add(Spieler2_Avatar_Lable);

		BufferedImage imgA = null;
		try {
			imgA = ImageIO.read(this.getClass().getResource(FL.getAvatarImage(Avatar_2)));

		} catch (IOException e) {
			e.printStackTrace();
		}
		Image dimgA = imgA.getScaledInstance(Spieler2_Avatar_Lable.getWidth(), Spieler2_Avatar_Lable.getHeight(),
				Image.SCALE_SMOOTH);

		ImageIcon imageIconA = new ImageIcon(dimgA);
		Spieler2_Avatar_Lable.setIcon(imageIconA);

		//Lebensanzeige für Gegneravatar
		RoundedUp_2 = (int) Math.ceil(Avatar_2.getLebenspunkte());
		
		JLabel Spieler2_Lebensanzeige = new JLabel(Integer.toString((RoundedUp_2)));
		Spieler2_Lebensanzeige.setHorizontalTextPosition(JLabel.CENTER);
		Spieler2_Lebensanzeige.setBounds(728, 135, 64, 64);
		Spieler2_Lebensanzeige.setForeground(new Color(255, 255, 255));
		Spieler2_Lebensanzeige.setFont(new Font("Tahoma", Font.BOLD, 16));


		//Passt die groesse des Bildes an die groesse des JLabels an

		BufferedImage img = null;
		try {
			img = ImageIO.read(this.getClass().getResource(FL.getHPImage()));

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
				
				RoundedUp_1 = (int) Math.ceil(Avatar_1.getLebenspunkte());
				Lebensanzeige.setText(Integer.toString((RoundedUp_1)));

				RoundedUp_2 = (int) Math.ceil(Avatar_2.getLebenspunkte());
				Spieler2_Lebensanzeige.setText(Integer.toString((RoundedUp_2)));

				k.kaempfen();

				RoundedUp_1 = (int) Math.ceil(Avatar_1.getLebenspunkte());
				Lebensanzeige.setText(Integer.toString((RoundedUp_1)));

				RoundedUp_2 = (int) Math.ceil(Avatar_2.getLebenspunkte());
				Spieler2_Lebensanzeige.setText(Integer.toString((RoundedUp_2)));
				
				

			}
		});
		
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.setBounds(70, 524, 256, 51);
		frame.getContentPane().add(btnNewButton);


	}
}
