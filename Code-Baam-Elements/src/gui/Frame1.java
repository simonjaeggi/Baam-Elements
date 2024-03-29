package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import logic.*;

/**
 * 
 * @author Simon Jaeggi, Lukas Reinhardt
 * Die Klasse funktionier als die Start-Oberflaeche des Spiels, der Eigene Avatar kann hier ausgewaehlt werden.
 */



public class Frame1 {
	private AuswahlAvatar AA = new AuswahlAvatar();
	protected JFrame frame;
	private Avatar Avatar_1;
	private Avatar Avatar_2;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	protected Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frame = new JFrame("Waehle deinen Kaempfer");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100,  1060, 666);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//Button Feueravatar
		JButton FeuerElementar = new JButton("Feuer");
		FeuerElementar.setFocusPainted(false);
		FeuerElementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Avatar_1 = new Feuerelementar();
				Avatar_2 = AA.RandomAvatar();
				
				new Frame2(Avatar_1, Avatar_2);

				frame.dispose();


			}
		});
		FeuerElementar.setForeground(new Color(255, 255, 255));
		FeuerElementar.setBackground(new Color(128, 0, 0));
		FeuerElementar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		FeuerElementar.setBounds(16, 451, 240, 73);
		frame.getContentPane().add(FeuerElementar);

		//Button Wasseravatar
		JButton WasserElementar = new JButton("Wasser");
		WasserElementar.setFocusPainted(false);
		WasserElementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avatar_1 = new Wasserelementar();
				Avatar_2 = AA.RandomAvatar();
				new Frame2(Avatar_1, Avatar_2);

				frame.dispose();
			}
		});
		WasserElementar.setForeground(new Color(255, 255, 255));
		WasserElementar.setBackground(new Color(0, 0, 255));
		WasserElementar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		WasserElementar.setBounds(272, 451, 240, 73);
		frame.getContentPane().add(WasserElementar);

		//Button Erdavatar
		JButton ErdElementar = new JButton("Erde");
		ErdElementar.setFocusPainted(false);
		ErdElementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avatar_1 = new Erdelementar();
				Avatar_2 = AA.RandomAvatar();
				new Frame2(Avatar_1, Avatar_2);

				frame.dispose();
			}
		});
		ErdElementar.setForeground(new Color(255, 255, 255));
		ErdElementar.setBackground(new Color(153, 102, 0));
		ErdElementar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ErdElementar.setBounds(528, 451, 240, 73);
		frame.getContentPane().add(ErdElementar);

		//Button Luftavatar
		JButton LuftElementar = new JButton("Luft");
		LuftElementar.setFocusPainted(false);

		LuftElementar.setBackground(new Color(135, 206, 235));
		LuftElementar.setForeground(new Color(255, 255, 255));
		LuftElementar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LuftElementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Avatar_1 = new Luftelementar();
				Avatar_2 = AA.RandomAvatar();
				new Frame2(Avatar_1, Avatar_2);

				frame.dispose();
			}
		});
		LuftElementar.setBounds(784, 451, 240, 73);
		frame.getContentPane().add(LuftElementar);

		//Button Zufaelliger Avatar auswaehlen
		JButton RandomAvatar = new JButton("Zufalls Avatar");
		RandomAvatar.setFocusPainted(false);

		RandomAvatar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Avatar_1 = AA.RandomAvatar();
				Avatar_2 = AA.RandomAvatar();
				new Frame2(Avatar_1, Avatar_2);

				frame.dispose();

			}
		});
		RandomAvatar.setForeground(Color.WHITE);
		RandomAvatar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RandomAvatar.setBackground(new Color(255, 0, 255));
		RandomAvatar.setBounds(414, 383, 215, 57);
		frame.getContentPane().add(RandomAvatar);

		//Titel "Waehle deinen Avatar"
		JLabel lblWhleDeinenAvatar = new JLabel("Waehle deinen Avatar:");
		lblWhleDeinenAvatar.setForeground(new Color(230, 230, 250));
		lblWhleDeinenAvatar.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblWhleDeinenAvatar.setBounds(161, 170, 721, 91);
		frame.getContentPane().add(lblWhleDeinenAvatar);

		//helpbox
		JButton help = new JButton("?");
		help.setFocusPainted(false);
		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Waehle den Avatar aus mit dem du dich ins Gefecht stuerzen moechtest!");
			}
		});
		help.setFont(new Font("Tahoma", Font.BOLD, 19));
		help.setBounds(10, 11, 48, 43);
		frame.getContentPane().add(help);



	}

	
}
