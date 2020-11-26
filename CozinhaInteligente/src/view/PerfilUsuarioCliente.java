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

public class PerfilUsuarioCliente {

	private JFrame frmPraticalCook;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtNomeEmpresa;
	private JTextField txtNomeMarca;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtPais;
	private JPasswordField passwordField;
	private JPasswordField passwordField_Confirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilUsuarioCliente window = new PerfilUsuarioCliente();
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
	public PerfilUsuarioCliente() {
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
		
		JMenuItem mntmMeuProduto = new JMenuItem("Meu produto");
		menuBar.add(mntmMeuProduto);
		
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
		lblInfoPerfil.setBounds(32, 52, 135, 14);
		frmPraticalCook.getContentPane().add(lblInfoPerfil);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(238, 282, 81, 23);
		frmPraticalCook.getContentPane().add(btnEditar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(329, 282, 89, 23);
		frmPraticalCook.getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(428, 282, 89, 23);
		frmPraticalCook.getContentPane().add(btnSalvar);
		
		JButton btnExcluirConta = new JButton("Excluir minha conta");
		btnExcluirConta.setBounds(299, 322, 146, 23);
		frmPraticalCook.getContentPane().add(btnExcluirConta);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setColumns(10);
		txtNome.setBounds(185, 96, 95, 20);
		frmPraticalCook.getContentPane().add(txtNome);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNome.setBounds(32, 96, 46, 14);
		frmPraticalCook.getContentPane().add(lblNome);
		
		JLabel lblNomeEmpresa = new JLabel("Nome da empresa");
		lblNomeEmpresa.setBounds(32, 123, 135, 14);
		frmPraticalCook.getContentPane().add(lblNomeEmpresa);
		
		JLabel lblNomeMarca = new JLabel("Nome da sua marca");
		lblNomeMarca.setBounds(32, 153, 135, 14);
		frmPraticalCook.getContentPane().add(lblNomeMarca);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(32, 184, 46, 14);
		frmPraticalCook.getContentPane().add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(32, 213, 46, 14);
		frmPraticalCook.getContentPane().add(lblSenha);
		
		JLabel lblConfirmeSenha = new JLabel("Confirme sua senha");
		lblConfirmeSenha.setBounds(32, 243, 135, 14);
		frmPraticalCook.getContentPane().add(lblConfirmeSenha);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(290, 99, 73, 14);
		frmPraticalCook.getContentPane().add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setEditable(false);
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(373, 96, 95, 20);
		frmPraticalCook.getContentPane().add(txtSobrenome);
		
		txtNomeEmpresa = new JTextField();
		txtNomeEmpresa.setEditable(false);
		txtNomeEmpresa.setColumns(10);
		txtNomeEmpresa.setBounds(185, 123, 283, 20);
		frmPraticalCook.getContentPane().add(txtNomeEmpresa);
		
		txtNomeMarca = new JTextField();
		txtNomeMarca.setEditable(false);
		txtNomeMarca.setColumns(10);
		txtNomeMarca.setBounds(185, 153, 283, 20);
		frmPraticalCook.getContentPane().add(txtNomeMarca);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBounds(185, 184, 283, 20);
		frmPraticalCook.getContentPane().add(txtEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(489, 99, 80, 14);
		frmPraticalCook.getContentPane().add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(489, 126, 80, 14);
		frmPraticalCook.getContentPane().add(lblEndereco);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(489, 156, 46, 14);
		frmPraticalCook.getContentPane().add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(489, 187, 46, 14);
		frmPraticalCook.getContentPane().add(lblCidade);
		
		JLabel lblPais = new JLabel("Pa\u00EDs");
		lblPais.setBounds(489, 216, 46, 14);
		frmPraticalCook.getContentPane().add(lblPais);
		
		txtTelefone = new JTextField();
		txtTelefone.setEditable(false);
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(579, 93, 155, 20);
		frmPraticalCook.getContentPane().add(txtTelefone);
		
		txtEndereco = new JTextField();
		txtEndereco.setEditable(false);
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(579, 120, 155, 20);
		frmPraticalCook.getContentPane().add(txtEndereco);
		
		txtBairro = new JTextField();
		txtBairro.setEditable(false);
		txtBairro.setColumns(10);
		txtBairro.setBounds(579, 150, 155, 20);
		frmPraticalCook.getContentPane().add(txtBairro);
		
		txtCidade = new JTextField();
		txtCidade.setEditable(false);
		txtCidade.setColumns(10);
		txtCidade.setBounds(579, 181, 155, 20);
		frmPraticalCook.getContentPane().add(txtCidade);
		
		txtPais = new JTextField();
		txtPais.setEditable(false);
		txtPais.setColumns(10);
		txtPais.setBounds(579, 213, 155, 20);
		frmPraticalCook.getContentPane().add(txtPais);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(185, 213, 283, 20);
		frmPraticalCook.getContentPane().add(passwordField);
		
		passwordField_Confirm = new JPasswordField();
		passwordField_Confirm.setEditable(false);
		passwordField_Confirm.setBounds(185, 243, 283, 20);
		frmPraticalCook.getContentPane().add(passwordField_Confirm);
	}

}
