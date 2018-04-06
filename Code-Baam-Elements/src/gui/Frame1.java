package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

/**
 * 
 * @author Simon Jaeggi, Lukas Reinhardt
 * Die Klasse ist die Start-Oberfläche des Spiels, der Eigene Avatar kann hier ausgewählt werden.
 */


public class Frame1 {

	private JFrame frame;

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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Wähle deinen Kämpfer");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1137, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Button Feueravatar
		JButton FeuerElementar = new JButton("Feuer");
		FeuerElementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		FeuerElementar.setForeground(new Color(255, 255, 255));
		FeuerElementar.setBackground(new Color(128, 0, 0));
		FeuerElementar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		FeuerElementar.setBounds(10, 451, 261, 73);
		frame.getContentPane().add(FeuerElementar);
		
		//Button Wasseravatar
		JButton WasserElementar = new JButton("Wasser");
		WasserElementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		WasserElementar.setForeground(new Color(255, 255, 255));
		WasserElementar.setBackground(new Color(0, 0, 255));
		WasserElementar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		WasserElementar.setBounds(286, 451, 261, 73);
		frame.getContentPane().add(WasserElementar);
		
		//Button Erdavatar
		JButton ErdElementar = new JButton("Erde");
		ErdElementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ErdElementar.setForeground(new Color(255, 255, 255));
		ErdElementar.setBackground(new Color(153, 102, 0));
		ErdElementar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ErdElementar.setBounds(562, 451, 261, 73);
		frame.getContentPane().add(ErdElementar);
		
		//Button Luftavatar
		JButton LuftElementar = new JButton("Luft");
		LuftElementar.setBackground(new Color(135, 206, 235));
		LuftElementar.setForeground(new Color(255, 255, 255));
		LuftElementar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LuftElementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		LuftElementar.setBounds(838, 451, 261, 73);
		frame.getContentPane().add(LuftElementar);
	
		//Button Zufälliger Avatar auswählen
		JButton RandomAvatar = new JButton("Zufalls Avatar");
		RandomAvatar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ZUFALLL");
			}
		});
		RandomAvatar.setForeground(Color.WHITE);
		RandomAvatar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RandomAvatar.setBackground(new Color(255, 0, 255));
		RandomAvatar.setBounds(453, 383, 215, 57);
		frame.getContentPane().add(RandomAvatar);
		
		//Titel "Wähle deinen Avatar"
		JLabel lblWhleDeinenAvatar = new JLabel("W\u00E4hle deinen Avatar:");
		lblWhleDeinenAvatar.setForeground(new Color(230, 230, 250));
		lblWhleDeinenAvatar.setFont(new Font("Tahoma", Font.PLAIN, 75));
		lblWhleDeinenAvatar.setBounds(197, 170, 721, 91);
		frame.getContentPane().add(lblWhleDeinenAvatar);
		
		//helpbox
		JButton help = new JButton("?");
		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Wähle den Avatar aus mit dem du dich ins Gefecht stürzen möchtest!");
			}
		});
		help.setFont(new Font("Tahoma", Font.BOLD, 19));
		help.setBounds(21, 11, 48, 43);
		frame.getContentPane().add(help);
		
				
		
	}
}
