package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private JPanel panelUsuario;
	private JPanel panelSenha;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JPanel panelBtnLogin;
	private JPanel panelBtnCadastrar;
	private JLabel lblCadastrar;
	private JLabel lbBtnFechar;
	private JLabel lbLogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelUsuario = new JPanel();
		panelUsuario.setBounds(144, 200, 187, 33);
		panelUsuario.setBackground(Color.WHITE);
		contentPane.add(panelUsuario);
		panelUsuario.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsuario.getText().equals("Usuario")) {
					txtUsuario.setText("");
				}
				else {
					txtUsuario.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsuario.getText().equals("")) {
					txtUsuario.setText("Usuario");
				}
			}
		});
		txtUsuario.setBorder(null);
		txtUsuario.setText("Usu\u00E1rio");
		txtUsuario.setBounds(10, 11, 141, 20);
		panelUsuario.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		panelSenha = new JPanel();
		panelSenha.setBounds(144, 244, 187, 33);
		panelSenha.setBackground(Color.WHITE);
		contentPane.add(panelSenha);
		panelSenha.setLayout(null);
		
		txtSenha = new JPasswordField();
		txtSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtSenha.getText().equals("Senha")) {
					txtSenha.setEchoChar('â—?');
					txtSenha.setText("");	
				}
				else {
					txtSenha.selectAll();
				}
						
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSenha.getText().equals("")) {
					txtSenha.setText("Senha");
					txtSenha.setEchoChar((char)0);
				}
			}
		});
		txtSenha.setBorder(null);
		txtSenha.setEchoChar((char)0);
		txtSenha.setText("Senha");
		txtSenha.setBounds(10, 11, 140, 22);
		panelSenha.add(txtSenha);
		
		panelBtnLogin = new JPanel();
		panelBtnLogin.setBounds(183, 299, 122, 27);
		panelBtnLogin.setBackground(SystemColor.activeCaption);
		contentPane.add(panelBtnLogin);
		panelBtnLogin.setLayout(null);
		
		JLabel lbLogin = new JLabel("Entrar");
		lbLogin.setBackground(new Color(0, 206, 209));
		lbLogin.setFont(new Font("Impact", Font.PLAIN, 19));
		lbLogin.setBounds(35, 0, 63, 25);
		panelBtnLogin.add(lbLogin);
		
		panelBtnCadastrar = new JPanel();
		panelBtnCadastrar.setBounds(183, 345, 122, 27);
		panelBtnCadastrar.setLayout(null);
		panelBtnCadastrar.setBackground(SystemColor.activeCaption);
		contentPane.add(panelBtnCadastrar);
		
		lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setFont(new Font("Impact", Font.PLAIN, 19));
		lblCadastrar.setBackground(SystemColor.activeCaption);
		lblCadastrar.setBounds(24, 0, 88, 25);
		panelBtnCadastrar.add(lblCadastrar);
		
		lbBtnFechar = new JLabel("X");
		lbBtnFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbBtnFechar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar?","Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
							FrameLogin.this.dispose();
						}
					}
				});
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lbBtnFechar.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				lbBtnFechar.setForeground(Color.WHITE);
			}
			
		});
		
		lbBtnFechar.setBounds(480, 0, 20, 24);
		lbBtnFechar.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		contentPane.add(lbBtnFechar);
		
		lbLogo = new JLabel("");
		lbLogo.setBounds(144, 0, 200, 200);
		lbLogo.setHorizontalTextPosition(SwingConstants.CENTER);
		lbLogo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbLogo);
		lbLogo.setIcon(new ImageIcon(FrameLogin.class.getResource("/res/logo.png")));
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
