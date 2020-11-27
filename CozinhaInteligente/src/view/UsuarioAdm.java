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
	private JTextField txtNome;
	private JTextField txtEndereco;
	private PCookDAO dao;
	private Perfil p;
	private Conexao bd;
	private JTextField txtEmail;
	private JTextField txtSenha;
	private JTextField txtId;
	private JTextField txtConsultar;

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
		
		JMenuItem mntmMenu = new JMenuItem("Consultar receitas");
		mntmMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMenu);
		
		JMenuItem mntmRelatrioFeedback = new JMenuItem("Relat\u00F3rio - Feedback");
		mntmRelatrioFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmRelatrioFeedback);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Edi\u00E7\u00E3o de usu\u00E1rios");
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		menuBar.add(mntmCadastro);
		
		JLabel lbID = new JLabel("ID:");
		lbID.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbID.setBounds(33, 165, 135, 14);
		frmPraticalCook.getContentPane().add(lbID);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbNome.setBounds(33, 210, 46, 14);
		frmPraticalCook.getContentPane().add(lbNome);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				p.setidPerfil(Integer.parseInt(txtId.getText()));
				p.setNome(txtNome.getText());
				p.setEmail(txtEmail.getText());
				p.setEndereco(txtEndereco.getText());
				p.setSenha(txtSenha.getText());
				dao.editarPerfilComum(p);			
			}
		});
		
		btnEditar.setBounds(147, 421, 81, 23);
		frmPraticalCook.getContentPane().add(btnEditar);
				
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(150, 207, 202, 20);
		frmPraticalCook.getContentPane().add(txtNome);
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				p.setidPerfil(Integer.parseInt(txtId.getText()));
				p.setNome(txtNome.getText());
				p.setSenha(txtSenha.getText());
				p.setEndereco(txtEndereco.getText());
				p.setEmail(txtEmail.getText());
				dao.cadastrarPerfil(p);
				limpar();
			}
		});

		btnSalvar.setBounds(33, 421, 89, 23);
		frmPraticalCook.getContentPane().add(btnSalvar);
		
		JLabel lbEmail = new JLabel("E-mail");
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbEmail.setBounds(33, 256, 46, 14);
		frmPraticalCook.getContentPane().add(lbEmail);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(150, 341, 202, 20);
		frmPraticalCook.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(150, 253, 202, 20);
		frmPraticalCook.getContentPane().add(txtEmail);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEndereo.setBounds(33, 344, 77, 14);
		frmPraticalCook.getContentPane().add(lblEndereo);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(150, 294, 202, 20);
		frmPraticalCook.getContentPane().add(txtSenha);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSenha.setBounds(33, 296, 46, 17);
		frmPraticalCook.getContentPane().add(lblSenha);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(150, 162, 202, 20);
		frmPraticalCook.getContentPane().add(txtId);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				p = dao.consultarPerfilComun(Integer.parseInt(txtConsultar.getText()));
				if(p != null) {
					txtId.setText(" "+p.getidPerfil());
					txtNome.setText(p.getNome());
					txtSenha.setText(p.getSenha());
					txtEmail.setText(p.getEmail());
					txtEndereco.setText(p.getEndereco());
				}
				else {
					JOptionPane.showMessageDialog(null, "ID incorreto digite novamente!!");
				}
			}
		});

		btnBuscar.setBounds(409, 421, 89, 23);
		frmPraticalCook.getContentPane().add(btnBuscar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dao.excluirPerfil(Integer.parseInt(txtId.getText()));
			}
		});
		btnExcluir.setBounds(247, 421, 89, 23);
		frmPraticalCook.getContentPane().add(btnExcluir);
		
		JLabel Consultar = new JLabel("Consultar :");
		Consultar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Consultar.setBounds(33, 111, 135, 14);
		frmPraticalCook.getContentPane().add(Consultar);
		
		txtConsultar = new JTextField();
		txtConsultar.setColumns(10);
		txtConsultar.setBounds(150, 108, 202, 20);
		frmPraticalCook.getContentPane().add(txtConsultar);
		
		JLabel lblNewLabel = new JLabel("Cadastro de usu\u00E1rio");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 24));
		lblNewLabel.setBounds(274, 39, 279, 28);
		frmPraticalCook.getContentPane().add(lblNewLabel);
	}
	
	public void limpar() {
		txtNome.setText("");
		txtEmail.setText("");
		txtEndereco.setText("");
		txtSenha.setText("");
		txtId.setText("");
	}
}
