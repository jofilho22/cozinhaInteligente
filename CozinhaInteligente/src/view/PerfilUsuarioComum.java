package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class PerfilUsuarioComum {

	private JFrame frmPraticalCook;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtSobrenome;
	private JPasswordField passwordField;
	private JPasswordField passwordField_Confirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilUsuarioComum window = new PerfilUsuarioComum();
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
	public PerfilUsuarioComum() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setTitle("Pratical Cook - Meu Perfil");
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setBounds(100, 100, 800, 600);
		frmPraticalCook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPraticalCook.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 28);
		frmPraticalCook.getContentPane().add(menuBar);
		
		JMenuItem mntmMenu = new JMenuItem("Menu");
		mntmMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMenu);
		
		JMenuItem mntmFavoritos = new JMenuItem("Favoritos");
		mntmFavoritos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmFavoritos);
		
		JMenuItem mntmAvalieNos = new JMenuItem("Avalie-nos");
		mntmAvalieNos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmAvalieNos);
		
		JLabel lblInfoPerfil = new JLabel("Informa\u00E7\u00F5es do perfil:");
		lblInfoPerfil.setBounds(40, 50, 135, 14);
		frmPraticalCook.getContentPane().add(lblInfoPerfil);
		
		JLabel lblPerfil_Nome = new JLabel("Nome");
		lblPerfil_Nome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPerfil_Nome.setBounds(37, 90, 46, 14);
		frmPraticalCook.getContentPane().add(lblPerfil_Nome);
		
		JLabel lblPerfil_Email = new JLabel("E-mail");
		lblPerfil_Email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPerfil_Email.setBounds(37, 162, 46, 14);
		frmPraticalCook.getContentPane().add(lblPerfil_Email);
		
		JLabel lblPerfil_Senha = new JLabel("Senha");
		lblPerfil_Senha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPerfil_Senha.setBounds(37, 202, 46, 14);
		frmPraticalCook.getContentPane().add(lblPerfil_Senha);
		
		JLabel lblPerfil_Confirmacao = new JLabel("Confirme \r\nsua senha");
		lblPerfil_Confirmacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPerfil_Confirmacao.setBounds(37, 242, 106, 14);
		frmPraticalCook.getContentPane().add(lblPerfil_Confirmacao);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(37, 290, 81, 23);
		frmPraticalCook.getContentPane().add(btnEditar);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setColumns(10);
		txtNome.setBounds(157, 88, 202, 20);
		frmPraticalCook.getContentPane().add(txtNome);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBounds(157, 160, 202, 20);
		frmPraticalCook.getContentPane().add(txtEmail);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setEditable(false);
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(157, 126, 202, 20);
		frmPraticalCook.getContentPane().add(txtSobrenome);
		
		JLabel lblCadastro_Sobrenome = new JLabel("Sobrenome");
		lblCadastro_Sobrenome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Sobrenome.setBounds(37, 126, 69, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Sobrenome);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(157, 200, 202, 20);
		frmPraticalCook.getContentPane().add(passwordField);
		
		passwordField_Confirm = new JPasswordField();
		passwordField_Confirm.setEditable(false);
		passwordField_Confirm.setBounds(153, 240, 206, 20);
		frmPraticalCook.getContentPane().add(passwordField_Confirm);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(128, 290, 89, 23);
		frmPraticalCook.getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(227, 290, 89, 23);
		frmPraticalCook.getContentPane().add(btnSalvar);
		
		JButton btnExcluirConta = new JButton("Excluir minha conta");
		btnExcluirConta.setBounds(98, 330, 146, 23);
		frmPraticalCook.getContentPane().add(btnExcluirConta);
	}
}
