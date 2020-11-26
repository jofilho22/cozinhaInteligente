package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frmPraticalCook;
	private JTextField Cadastro_Nome;
	private JTextField Cadastro_Email;
	private JTextField Cadastro_Sobrenome;
	private JTextField Login_Email;
	private JPasswordField LoginSenha;
	private JPasswordField CadastroSenha;
	private JPasswordField ConfirmarSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setBackground(Color.BLUE);
		frmPraticalCook.getContentPane().setBackground(new Color(245, 245, 245));
		frmPraticalCook.getContentPane().setLayout(null);
		
		JLabel lblCadastreSe = new JLabel("Cadastre-se");
		lblCadastreSe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastreSe.setBounds(10, 25, 106, 20);
		frmPraticalCook.getContentPane().add(lblCadastreSe);
		
		JLabel lblCadastro_Nome = new JLabel("Nome");
		lblCadastro_Nome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Nome.setBounds(10, 80, 46, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Nome);
		
		JLabel lblCadastro_Email = new JLabel("E-mail");
		lblCadastro_Email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Email.setBounds(10, 152, 46, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Email);
		
		JLabel lblCadastro_Senha = new JLabel("Senha");
		lblCadastro_Senha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Senha.setBounds(10, 192, 46, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Senha);
		
		JLabel lblCadastro_Confirmacao = new JLabel("Confirme \r\nsua senha");
		lblCadastro_Confirmacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Confirmacao.setBounds(10, 232, 106, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Confirmacao);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(135, 280, 106, 23);
		frmPraticalCook.getContentPane().add(btnNewButton);
		
		Cadastro_Nome = new JTextField();
		Cadastro_Nome.setBounds(130, 78, 202, 20);
		frmPraticalCook.getContentPane().add(Cadastro_Nome);
		Cadastro_Nome.setColumns(10);
		
		Cadastro_Email = new JTextField();
		Cadastro_Email.setBounds(130, 150, 202, 20);
		frmPraticalCook.getContentPane().add(Cadastro_Email);
		Cadastro_Email.setColumns(10);
		
		Cadastro_Sobrenome = new JTextField();
		Cadastro_Sobrenome.setBounds(130, 116, 202, 20);
		frmPraticalCook.getContentPane().add(Cadastro_Sobrenome);
		Cadastro_Sobrenome.setColumns(10);
		
		JLabel lblCadastro_Sobrenome = new JLabel("Sobrenome");
		lblCadastro_Sobrenome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Sobrenome.setBounds(10, 116, 89, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Sobrenome);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLogin.setBounds(400, 25, 106, 20);
		frmPraticalCook.getContentPane().add(lblLogin);
		
		JLabel lblLogin_Email = new JLabel("E-mail");
		lblLogin_Email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogin_Email.setBounds(400, 80, 46, 14);
		frmPraticalCook.getContentPane().add(lblLogin_Email);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(400, 162, 106, 23);
		frmPraticalCook.getContentPane().add(btnEntrar);
		
		Login_Email = new JTextField();
		Login_Email.setColumns(10);
		Login_Email.setBounds(520, 78, 202, 20);
		frmPraticalCook.getContentPane().add(Login_Email);
		
		JLabel lblSenha_Login = new JLabel("Senha");
		lblSenha_Login.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha_Login.setBounds(400, 116, 46, 14);
		frmPraticalCook.getContentPane().add(lblSenha_Login);
		
		JButton btnAnuncie = new JButton("Anuncie seu produto");
		btnAnuncie.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAnuncie.setBounds(300, 360, 184, 30);
		frmPraticalCook.getContentPane().add(btnAnuncie);
		
		LoginSenha = new JPasswordField();
		LoginSenha.setBounds(520, 116, 202, 20);
		frmPraticalCook.getContentPane().add(LoginSenha);
		
		CadastroSenha = new JPasswordField();
		CadastroSenha.setBounds(130, 190, 202, 20);
		frmPraticalCook.getContentPane().add(CadastroSenha);
		
		ConfirmarSenha = new JPasswordField();
		ConfirmarSenha.setBounds(126, 230, 206, 20);
		frmPraticalCook.getContentPane().add(ConfirmarSenha);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(27, 280, 89, 23);
		frmPraticalCook.getContentPane().add(btnCancelar);
		frmPraticalCook.setTitle("Pratical Cook");
		frmPraticalCook.setBounds(100, 100, 800, 600);
		frmPraticalCook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
