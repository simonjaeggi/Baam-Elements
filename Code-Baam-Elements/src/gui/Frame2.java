package gui;


import javax.swing.JFrame;

import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import data.FileLocations;

import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logic.Avatar;
import logic.Kampf;
import javax.swing.border.Border;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


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
		frame.setBounds(100, 100,  1060, 666);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		




		//Titel
		JLabel lblKampf = new JLabel("Kampf");
		lblKampf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		lblKampf.setForeground(new Color(255, 255, 255));
		lblKampf.setBounds(25, 0, 546, 109);
		frame.getContentPane().add(lblKampf);

		//Spieler1:

		//Anschrift Avatar
		JLabel lblNewLabel = new JLabel(Avatar_1.getClass().getSimpleName());
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 178, 263, 21);
		frame.getContentPane().add(lblNewLabel);
		//Bild f�r Avatar
		JLabel Spieler_Avatar_Lable = new JLabel();
		Spieler_Avatar_Lable.setIcon(new ImageIcon(this.getClass().getResource(FL.getAvatarImage(Avatar_1))));
		Spieler_Avatar_Lable.setBounds(49, 231, 263, 256);
		frame.getContentPane().add(Spieler_Avatar_Lable);

		//Lebensanzeige

		RoundedUp_1 = (int) Math.ceil(Avatar_1.getLebenspunkte());

		JLabel Lebensanzeige = new JLabel(Integer.toString((RoundedUp_1)));
		Lebensanzeige.setFont(new Font("Tahoma", Font.BOLD, 32));
		Lebensanzeige.setForeground(new Color(255, 255, 255));

		Lebensanzeige.setBounds(335, 289, 128, 128);
		frame.getContentPane().add(Lebensanzeige);
		Lebensanzeige.setIcon(new ImageIcon(this.getClass().getResource(FL.getHPImage())));
		Lebensanzeige.setHorizontalTextPosition(JLabel.CENTER);

		//Hintergrund f�r Lebensanzeige(Herz)






		//Spieler2:
		//Anschrift Avatar
		JLabel lblNewLabel_1 = new JLabel(Avatar_2.getClass().getSimpleName());

		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(850, 76, 128, 33);
		frame.getContentPane().add(lblNewLabel_1);

		//Bild f�r Gegnerischen Avatar
		JLabel Spieler2_Avatar_Lable = new JLabel("");
		Spieler2_Avatar_Lable.setBounds(850, 119, 128, 128);
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

		//Lebensanzeige f�r Gegneravatar
		RoundedUp_2 = (int) Math.ceil(Avatar_2.getLebenspunkte());

		JLabel Spieler2_Lebensanzeige = new JLabel(Integer.toString((RoundedUp_2)));
		Spieler2_Lebensanzeige.setHorizontalTextPosition(JLabel.CENTER);
		Spieler2_Lebensanzeige.setBounds(767, 113, 64, 64);
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

		//Button playAgain
		JButton playAgain = new JButton("Play Again!");
		playAgain.addActionListener(new ActionListener() {
			Frame1 F1 = new Frame1();

	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		}
		//Button Schlag
		JButton btnNewButton = new JButton("Schlag");
		btnNewButton.setFocusPainted(false);


		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				RoundedUp_1 = (int) Math.ceil(Avatar_1.getLebenspunkte());
				Lebensanzeige.setText(Integer.toString((RoundedUp_1)));

				RoundedUp_2 = (int) Math.ceil(Avatar_2.getLebenspunkte());
				Spieler2_Lebensanzeige.setText(Integer.toString((RoundedUp_2)));

				if(k.gestorben(Avatar_1) == false && k.gestorben(Avatar_2) == false) {
					k.kaempfen();
				}
				RoundedUp_1 = (int) Math.ceil(Avatar_1.getLebenspunkte());
				Lebensanzeige.setText(Integer.toString((RoundedUp_1)));

				RoundedUp_2 = (int) Math.ceil(Avatar_2.getLebenspunkte());
				Spieler2_Lebensanzeige.setText(Integer.toString((RoundedUp_2)));
				if(k.gestorben(Avatar_1) == true) {
					JOptionPane.showMessageDialog(playAgain,  "AWWWWWWWW YOU LOST");

				}else if(k.gestorben(Avatar_2) == true){
					
				}
				

			}
		});

		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton.setBounds(70, 524, 242, 45);
		frame.getContentPane().add(btnNewButton);



	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
