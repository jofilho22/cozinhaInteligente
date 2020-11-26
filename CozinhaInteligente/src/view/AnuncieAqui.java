package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class AnuncieAqui {

	private JFrame frmPraticalCook;
	private JTextField VerificarProduto;
	private JTextField Nome;
	private JTextField Sobrenome;
	private JTextField NomeEmpresa;
	private JTextField NomeMarca;
	private JTextField Email;
	private JTextField Telefone;
	private JTextField Endereco;
	private JTextField Bairro;
	private JTextField Cidade;
	private JTextField Pais;
	private JPasswordField CadastroSenha;
	private JPasswordField ConfirmeSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnuncieAqui window = new AnuncieAqui();
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
	public AnuncieAqui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setTitle("Pratical Cook - Anuncie Aqui");
		frmPraticalCook.setBounds(100, 100, 800, 600);
		frmPraticalCook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPraticalCook.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Anuncie o seu produto no nosso sistema");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(190, 11, 362, 14);
		frmPraticalCook.getContentPane().add(lblTitulo);
		
		JLabel lblDescricao1 = new JLabel("Assinando o plano, seu produto ser\u00E1 exibido em todas as receitas.");
		lblDescricao1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescricao1.setBounds(190, 47, 380, 14);
		frmPraticalCook.getContentPane().add(lblDescricao1);
		
		JLabel lblDescricao2 = new JLabel("A exposi\u00E7\u00E3o \u00E9 feita de forma dedicada! Ou seja, um produto \u00E9 dedicado a");
		lblDescricao2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescricao2.setBounds(169, 66, 430, 14);
		frmPraticalCook.getContentPane().add(lblDescricao2);
		
		JLabel lblDescricao3 = new JLabel("uma \u00FAnica marca");
		lblDescricao3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescricao3.setBounds(317, 83, 119, 14);
		frmPraticalCook.getContentPane().add(lblDescricao3);
		
		JLabel lblPlano = new JLabel("Temos planos de tr\u00EAs, seis e nove meses");
		lblPlano.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlano.setBounds(80, 142, 296, 14);
		frmPraticalCook.getContentPane().add(lblPlano);
		
		JLabel lblDescricao4 = new JLabel("Antes de assinar, verifique se o seu produto j\u00E1 dedicado a outra empresa");
		lblDescricao4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescricao4.setBounds(169, 204, 430, 14);
		frmPraticalCook.getContentPane().add(lblDescricao4);
		
		JLabel lblInsiraProduto = new JLabel("Insira o seu produto");
		lblInsiraProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInsiraProduto.setBounds(169, 246, 119, 14);
		frmPraticalCook.getContentPane().add(lblInsiraProduto);
		
		VerificarProduto = new JTextField();
		VerificarProduto.setBounds(317, 244, 253, 20);
		frmPraticalCook.getContentPane().add(VerificarProduto);
		VerificarProduto.setColumns(10);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(327, 283, 89, 23);
		frmPraticalCook.getContentPane().add(btnVerificar);
		
		JLabel lblCadastreSe = new JLabel("Cadastre-se aqui");
		lblCadastreSe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastreSe.setBounds(80, 322, 149, 14);
		frmPraticalCook.getContentPane().add(lblCadastreSe);
		
		Nome = new JTextField();
		Nome.setBounds(184, 370, 95, 20);
		frmPraticalCook.getContentPane().add(Nome);
		Nome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNome.setBounds(33, 373, 46, 14);
		frmPraticalCook.getContentPane().add(lblNome);
		
		JLabel lblNomeEmpresa = new JLabel("Nome da empresa");
		lblNomeEmpresa.setBounds(33, 398, 119, 14);
		frmPraticalCook.getContentPane().add(lblNomeEmpresa);
		
		JLabel lblNomeMarca = new JLabel("Nome da sua marca");
		lblNomeMarca.setBounds(33, 430, 119, 14);
		frmPraticalCook.getContentPane().add(lblNomeMarca);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(33, 465, 46, 14);
		frmPraticalCook.getContentPane().add(lblEmail);
		
		JLabel lblCadastroSenha = new JLabel("Senha");
		lblCadastroSenha.setBounds(33, 490, 46, 14);
		frmPraticalCook.getContentPane().add(lblCadastroSenha);
		
		JLabel lblConfirmeSenha = new JLabel("Confirme sua senha");
		lblConfirmeSenha.setBounds(33, 520, 119, 14);
		frmPraticalCook.getContentPane().add(lblConfirmeSenha);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(289, 373, 73, 14);
		frmPraticalCook.getContentPane().add(lblSobrenome);
		
		Sobrenome = new JTextField();
		Sobrenome.setBounds(372, 370, 95, 20);
		frmPraticalCook.getContentPane().add(Sobrenome);
		Sobrenome.setColumns(10);
		
		NomeEmpresa = new JTextField();
		NomeEmpresa.setBounds(184, 397, 283, 20);
		frmPraticalCook.getContentPane().add(NomeEmpresa);
		NomeEmpresa.setColumns(10);
		
		NomeMarca = new JTextField();
		NomeMarca.setColumns(10);
		NomeMarca.setBounds(184, 427, 283, 20);
		frmPraticalCook.getContentPane().add(NomeMarca);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(184, 458, 283, 20);
		frmPraticalCook.getContentPane().add(Email);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(488, 373, 64, 14);
		frmPraticalCook.getContentPane().add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(488, 400, 64, 14);
		frmPraticalCook.getContentPane().add(lblEndereco);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(488, 430, 46, 14);
		frmPraticalCook.getContentPane().add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(488, 461, 46, 14);
		frmPraticalCook.getContentPane().add(lblCidade);
		
		JLabel lblPais = new JLabel("Pa\u00EDs");
		lblPais.setBounds(488, 490, 46, 14);
		frmPraticalCook.getContentPane().add(lblPais);
		
		Telefone = new JTextField();
		Telefone.setBounds(569, 370, 155, 20);
		frmPraticalCook.getContentPane().add(Telefone);
		Telefone.setColumns(10);
		
		Endereco = new JTextField();
		Endereco.setColumns(10);
		Endereco.setBounds(569, 397, 155, 20);
		frmPraticalCook.getContentPane().add(Endereco);
		
		Bairro = new JTextField();
		Bairro.setColumns(10);
		Bairro.setBounds(569, 427, 155, 20);
		frmPraticalCook.getContentPane().add(Bairro);
		
		Cidade = new JTextField();
		Cidade.setColumns(10);
		Cidade.setBounds(569, 458, 155, 20);
		frmPraticalCook.getContentPane().add(Cidade);
		
		Pais = new JTextField();
		Pais.setColumns(10);
		Pais.setBounds(569, 490, 155, 20);
		frmPraticalCook.getContentPane().add(Pais);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(587, 516, 100, 23);
		frmPraticalCook.getContentPane().add(btnCadastrar);
		
		CadastroSenha = new JPasswordField();
		CadastroSenha.setBounds(184, 487, 283, 20);
		frmPraticalCook.getContentPane().add(CadastroSenha);
		
		ConfirmeSenha = new JPasswordField();
		ConfirmeSenha.setBounds(184, 517, 283, 20);
		frmPraticalCook.getContentPane().add(ConfirmeSenha);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(488, 516, 89, 23);
		frmPraticalCook.getContentPane().add(btnCancelar);
	}
}
