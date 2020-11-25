package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FrameMenu extends JFrame {

	private JPanel panelMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMenu frame = new FrameMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 456);
		setUndecorated(true);
		panelMenu = new JPanel();
		panelMenu.setBackground(new Color(173, 216, 230));
		panelMenu.setBorder(new LineBorder(new Color(65, 105, 225), 3));
		setContentPane(panelMenu);
		panelMenu.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 178, 456);
		panelMenu.add(panel);
		panel.setLayout(null);
		
		JLabel lbLogo = new JLabel("HOME");
		lbLogo.setHorizontalAlignment(SwingConstants.LEFT);
		lbLogo.setIcon(new ImageIcon(FrameMenu.class.getResource("/res/logomenu.png")));
		lbLogo.setBounds(0, 0, 178, 57);
		panel.add(lbLogo);
		
		JPanel panelHome = new JPanel();
		panelHome.setBackground(new Color(135, 206, 235));
		panelHome.setBounds(0, 60, 178, 40);
		panel.add(panelHome);
		panelHome.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 16));
		lblNewLabel.setBounds(41, 11, 81, 14);
		panelHome.add(lblNewLabel);
		
		JPanel panelReceitas = new JPanel();
		panelReceitas.setBackground(new Color(135, 206, 235));
		panelReceitas.setBounds(0, 100, 178, 40);
		panel.add(panelReceitas);
		panelReceitas.setLayout(null);
		
		JPanel panelPerfil = new JPanel();
		panelPerfil.setBackground(new Color(135, 206, 235));
		panelPerfil.setBounds(0, 140, 178, 40);
		panel.add(panelPerfil);
		panelPerfil.setLayout(null);
	}

}
