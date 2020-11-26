package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import database.Conexao;
import main.Perfil;
import service.PCookDAO;
import service.pCookDAO;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class UsuarioAdm {

	private JFrame frmPraticalCook;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	private PCookDAO dao;
	private Perfil p;
	private Conexao bd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioAdm window = new UsuarioAdm();
					window.frmPraticalCook.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UsuarioAdm() {
		dao = new PCookDAO();
		p = new Perfil();
		bd = new Conexao();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setTitle("Pratical Cook - Meu Perfil");
		frmPraticalCook.setBounds(100, 100, 800, 600);
		frmPraticalCook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPraticalCook.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 28);
		frmPraticalCook.getContentPane().add(menuBar);
		
		JMenuItem mntmMenu = new JMenuItem("Menu");
		mntmMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMenu);
		
		JMenuItem mntmRelatrioFeedback = new JMenuItem("Relat\u00F3rio - Feedback");
		mntmRelatrioFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmRelatrioFeedback);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Edi\u00E7\u00E3o de usu\u00E1rios");
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		menuBar.add(mntmCadastro);
		
		JLabel lblInfoPerfil = new JLabel("Informa\u00E7\u00F5es do perfil:");
		lblInfoPerfil.setBounds(33, 51, 135, 14);
		frmPraticalCook.getContentPane().add(lblInfoPerfil);
		
		JLabel lblPerfil_Nome = new JLabel("Nome");
		lblPerfil_Nome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPerfil_Nome.setBounds(30, 91, 46, 14);
		frmPraticalCook.getContentPane().add(lblPerfil_Nome);
		
		JLabel lblPerfil_Email = new JLabel("E-mail");
		lblPerfil_Email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPerfil_Email.setBounds(30, 207, 46, 14);
		frmPraticalCook.getContentPane().add(lblPerfil_Email);
		
		JLabel lblPerfil_Senha = new JLabel("Senha");
		lblPerfil_Senha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPerfil_Senha.setBounds(30, 247, 46, 14);
		frmPraticalCook.getContentPane().add(lblPerfil_Senha);
		
		JLabel lblPerfil_Confirmacao = new JLabel("Confirme \r\nsua senha");
		lblPerfil_Confirmacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPerfil_Confirmacao.setBounds(30, 287, 106, 14);
		frmPraticalCook.getContentPane().add(lblPerfil_Confirmacao);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(30, 335, 81, 23);
		frmPraticalCook.getContentPane().add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			@Override
			public void actionPerfomed(ActionEvent arg0) {
				p.setNome(textField.getText());
				p.setSobrenome(textField_1.getText());
				p.setCpf(textField_2.getText());
				JOptionPane.ShowMessageDialog(btnEditar, dao.Editar(p);
			}
		});
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(150, 89, 202, 20);
		frmPraticalCook.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(150, 205, 202, 20);
		frmPraticalCook.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(150, 127, 202, 20);
		frmPraticalCook.getContentPane().add(textField_2);
		
		JLabel lblCadastro_Sobrenome = new JLabel("Sobrenome");
		lblCadastro_Sobrenome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Sobrenome.setBounds(30, 127, 69, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Sobrenome);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(150, 245, 202, 20);
		frmPraticalCook.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setEditable(false);
		passwordField_1.setBounds(146, 285, 206, 20);
		frmPraticalCook.getContentPane().add(passwordField_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(121, 335, 89, 23);
		frmPraticalCook.getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(220, 335, 89, 23);
		frmPraticalCook.getContentPane().add(btnSalvar);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(30, 170, 46, 14);
		frmPraticalCook.getContentPane().add(lblCPF);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(150, 167, 202, 20);
		frmPraticalCook.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}

}
