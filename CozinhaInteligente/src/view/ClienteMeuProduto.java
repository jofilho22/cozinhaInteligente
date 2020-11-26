package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

public class ClienteMeuProduto {

	private JFrame frmPraticalCook;
	private JTextField txtNomeProduto;
	private JTextField txtQtdReceitas;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteMeuProduto window = new ClienteMeuProduto();
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
	public ClienteMeuProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setTitle("Pratical Cook - Meu produto");
		frmPraticalCook.setBounds(100, 100, 800, 600);
		frmPraticalCook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPraticalCook.getContentPane().setLayout(null);
		
		JLabel lblMeuProduto = new JLabel("Meu Produto");
		lblMeuProduto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMeuProduto.setBounds(332, 61, 112, 14);
		frmPraticalCook.getContentPane().add(lblMeuProduto);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 28);
		frmPraticalCook.getContentPane().add(menuBar);
		
		JMenuItem mntmMenu = new JMenuItem("Menu");
		mntmMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMenu);
		
		JMenuItem mntmFavoritos = new JMenuItem("Favoritos");
		mntmFavoritos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmFavoritos);
		
		JMenuItem mntmMeuPerfil = new JMenuItem("Meu Perfil");
		mntmMeuPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMeuPerfil);
		
		JMenuItem mntmAvalieNos = new JMenuItem("Avalie-nos");
		mntmAvalieNos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmAvalieNos);
		
		JLabel lblNomeProduto = new JLabel("Nome");
		lblNomeProduto.setBounds(42, 103, 46, 14);
		frmPraticalCook.getContentPane().add(lblNomeProduto);
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setEditable(false);
		txtNomeProduto.setBounds(110, 100, 180, 20);
		frmPraticalCook.getContentPane().add(txtNomeProduto);
		txtNomeProduto.setColumns(10);
		
		JLabel lblQtdReceitas = new JLabel("Quantidade de receitas com o meu produto");
		lblQtdReceitas.setBounds(305, 103, 246, 14);
		frmPraticalCook.getContentPane().add(lblQtdReceitas);
		
		txtQtdReceitas = new JTextField();
		txtQtdReceitas.setEditable(false);
		txtQtdReceitas.setBounds(576, 100, 100, 20);
		frmPraticalCook.getContentPane().add(txtQtdReceitas);
		txtQtdReceitas.setColumns(10);
		
		JLabel lblReceitasProduto = new JLabel("Receitas com o meu produto:");
		lblReceitasProduto.setBounds(39, 187, 180, 14);
		frmPraticalCook.getContentPane().add(lblReceitasProduto);
		
		JLabel lblNewLabel = new JLabel("Altera\u00E7\u00E3o de produto");
		lblNewLabel.setBounds(42, 145, 140, 14);
		frmPraticalCook.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(192, 137, 126, 20);
		frmPraticalCook.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.setBounds(333, 136, 89, 23);
		frmPraticalCook.getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(42, 229, 491, 309);
		frmPraticalCook.getContentPane().add(list);
	}

}
