package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MainGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui window = new MainGui();
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
	public MainGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 833, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 31, 402, 155, 252, 0};
		gridBagLayout.rowHeights = new int[]{114, 14, 35, 184, 14, 0, 0, 0, 0, 85, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 4;
		gbc_panel_3.gridy = 1;
		frame.getContentPane().add(panel_3, gbc_panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("100");
		lblNewLabel_2.setIcon(new ImageIcon(MainGui.class.getResource("/resources/hearth_2.png")));
		lblNewLabel_2.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(MainGui.class.getResource("/resources/Avatar_2.png")));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(121, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel_2)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel_3)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel lblAvatar = new JLabel("Avatar 2");
		GridBagConstraints gbc_lblAvatar = new GridBagConstraints();
		gbc_lblAvatar.insets = new Insets(0, 0, 5, 0);
		gbc_lblAvatar.gridx = 4;
		gbc_lblAvatar.gridy = 2;
		frame.getContentPane().add(lblAvatar, gbc_lblAvatar);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.VERTICAL;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 3;
		frame.getContentPane().add(panel_2, gbc_panel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainGui.class.getResource("/resources/Avatar_1.png")));
		
		JLabel lblNewLabel_1 = new JLabel("100");
		lblNewLabel_1.setHorizontalTextPosition(JLabel.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(MainGui.class.getResource("/resources/hearth_1.png")));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(34)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Avatar 1");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 4;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 5;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{39, 89, 0};
		gbl_panel_1.rowHeights = new int[]{23, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblAngriffe = new JLabel("Angriffe");
		GridBagConstraints gbc_lblAngriffe = new GridBagConstraints();
		gbc_lblAngriffe.anchor = GridBagConstraints.WEST;
		gbc_lblAngriffe.insets = new Insets(0, 0, 5, 5);
		gbc_lblAngriffe.gridx = 0;
		gbc_lblAngriffe.gridy = 0;
		panel_1.add(lblAngriffe, gbc_lblAngriffe);
		
		JButton btnNewButton = new JButton("Schlag");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		panel_1.add(btnNewButton, gbc_btnNewButton);
	}
}
