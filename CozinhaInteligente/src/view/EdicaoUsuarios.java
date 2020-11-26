package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class EdicaoUsuarios {

	private JFrame frmPraticalCook;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtSobrenome;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField txtCPF;
	private JTextField txtEmailIdentificador;
	private JTextField txtAlteracao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdicaoUsuarios window = new EdicaoUsuarios();
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
	public EdicaoUsuarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setTitle("Pratical Cook - Edi\u00E7\u00E3o e adi\u00E7\u00E3o de usu\u00E1rios");
		frmPraticalCook.setBounds(100, 100, 800, 600);
		frmPraticalCook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPraticalCook.getContentPane().setLayout(null);
		
		JLabel lblCadastroUser = new JLabel("Cadastre um usu\u00E1rio administrador:");
		lblCadastroUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroUser.setBounds(39, 72, 277, 14);
		frmPraticalCook.getContentPane().add(lblCadastroUser);
		
		JLabel lblCadastro_Nome = new JLabel("Nome");
		lblCadastro_Nome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Nome.setBounds(39, 120, 46, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Nome);
		
		JLabel lblCadastro_Email = new JLabel("E-mail");
		lblCadastro_Email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Email.setBounds(39, 235, 46, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Email);
		
		JLabel lblCadastro_Senha = new JLabel("Senha");
		lblCadastro_Senha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Senha.setBounds(39, 275, 46, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Senha);
		
		JLabel lblCadastro_Confirmacao = new JLabel("Confirme \r\nsua senha");
		lblCadastro_Confirmacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Confirmacao.setBounds(39, 315, 106, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Confirmacao);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(159, 359, 106, 23);
		frmPraticalCook.getContentPane().add(btnNewButton);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(159, 118, 202, 20);
		frmPraticalCook.getContentPane().add(txtNome);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(159, 233, 202, 20);
		frmPraticalCook.getContentPane().add(txtEmail);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(159, 156, 202, 20);
		frmPraticalCook.getContentPane().add(txtSobrenome);
		
		JLabel lblCadastro_Sobrenome = new JLabel("Sobrenome");
		lblCadastro_Sobrenome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastro_Sobrenome.setBounds(39, 156, 89, 14);
		frmPraticalCook.getContentPane().add(lblCadastro_Sobrenome);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 273, 202, 20);
		frmPraticalCook.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(155, 313, 206, 20);
		frmPraticalCook.getContentPane().add(passwordField_1);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(39, 198, 46, 14);
		frmPraticalCook.getContentPane().add(lblCPF);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(159, 195, 202, 20);
		frmPraticalCook.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(39, 359, 89, 23);
		frmPraticalCook.getContentPane().add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("Edite as informa\u00E7\u00F5es de acesso de um usu\u00E1rio:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(417, 72, 323, 14);
		frmPraticalCook.getContentPane().add(lblNewLabel);
		
		JLabel lblSelecao = new JLabel("Selecione o campo que voc\u00EA quer alterar");
		lblSelecao.setBounds(397, 157, 237, 14);
		frmPraticalCook.getContentPane().add(lblSelecao);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(654, 155, 30, 22);
		frmPraticalCook.getContentPane().add(comboBox);
		
		JLabel lblEmail = new JLabel("E-mail identificador");
		lblEmail.setBounds(397, 119, 123, 14);
		frmPraticalCook.getContentPane().add(lblEmail);
		
		txtEmailIdentificador = new JTextField();
		txtEmailIdentificador.setBounds(519, 116, 237, 20);
		frmPraticalCook.getContentPane().add(txtEmailIdentificador);
		txtEmailIdentificador.setColumns(10);
		
		JLabel lblAlteracao = new JLabel("Altera\u00E7\u00E3o de campo");
		lblAlteracao.setBounds(397, 196, 116, 14);
		frmPraticalCook.getContentPane().add(lblAlteracao);
		
		txtAlteracao = new JTextField();
		txtAlteracao.setBounds(519, 193, 237, 20);
		frmPraticalCook.getContentPane().add(txtAlteracao);
		txtAlteracao.setColumns(10);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(597, 233, 106, 23);
		frmPraticalCook.getContentPane().add(btnAlterar);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.setBounds(477, 233, 89, 23);
		frmPraticalCook.getContentPane().add(btnCancelar_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 28);
		frmPraticalCook.getContentPane().add(menuBar);
		
		JMenuItem mntmMenu = new JMenuItem("Menu");
		mntmMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMenu);
		
		JMenuItem mntmPerfil = new JMenuItem("Meu Perfil");
		mntmPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmPerfil);
		
		JMenuItem mntmRelatrioFeedback = new JMenuItem("Relat\u00F3rio - Feedback");
		menuBar.add(mntmRelatrioFeedback);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		menuBar.add(mntmCadastro);
	}
}
