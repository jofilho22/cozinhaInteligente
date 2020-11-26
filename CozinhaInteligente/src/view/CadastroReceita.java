package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class CadastroReceita {

	private JFrame frmPraticalCook;
	private JTextField txtQtdIngredientes;
	private JTextField txtNomeIngrediente;
	private JTextField txtQtdPassos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroReceita window = new CadastroReceita();
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
	public CadastroReceita() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setTitle("Pratical Cook - Cadasto de Receitas");
		frmPraticalCook.setBounds(100, 100, 800, 600);
		frmPraticalCook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPraticalCook.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 28);
		frmPraticalCook.getContentPane().add(menuBar);
		
		JMenuItem mntmMenu = new JMenuItem("Menu");
		mntmMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMenu);
		
		JMenuItem mntmMeuPerfil = new JMenuItem("Meu Perfil");
		menuBar.add(mntmMeuPerfil);
		
		JMenuItem mntmRelatrioFeedback = new JMenuItem("Relat\u00F3rio - Feedback");
		mntmRelatrioFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmRelatrioFeedback);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Edi\u00E7\u00E3o de usu\u00E1rios");
		menuBar.add(mntmNewMenuItem);
		
		JLabel lblTitulo = new JLabel("Cadastro de Receita:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(41, 51, 153, 14);
		frmPraticalCook.getContentPane().add(lblTitulo);
		
		JLabel lblQuantidadeIngredientes = new JLabel("Selecione a quantidade de ingredientes necess\u00E1rios");
		lblQuantidadeIngredientes.setBounds(41, 93, 311, 14);
		frmPraticalCook.getContentPane().add(lblQuantidadeIngredientes);
		
		txtQtdIngredientes = new JTextField();
		txtQtdIngredientes.setBounds(126, 131, 86, 20);
		frmPraticalCook.getContentPane().add(txtQtdIngredientes);
		txtQtdIngredientes.setColumns(10);
		
		JLabel lblSelecao_Ingrediente = new JLabel("Sele\u00E7\u00E3o de ingrediente (por ordem)");
		lblSelecao_Ingrediente.setBounds(41, 174, 230, 14);
		frmPraticalCook.getContentPane().add(lblSelecao_Ingrediente);
		
		JComboBox comboBox_Ingrediente = new JComboBox();
		comboBox_Ingrediente.setBounds(299, 170, 30, 22);
		frmPraticalCook.getContentPane().add(comboBox_Ingrediente);
		
		JLabel lblNomeIngrediente = new JLabel("Nome do ingrediente:");
		lblNomeIngrediente.setBounds(41, 215, 130, 14);
		frmPraticalCook.getContentPane().add(lblNomeIngrediente);
		
		txtNomeIngrediente = new JTextField();
		txtNomeIngrediente.setBounds(181, 212, 171, 20);
		frmPraticalCook.getContentPane().add(txtNomeIngrediente);
		txtNomeIngrediente.setColumns(10);
		
		JLabel lblQtdPassos = new JLabel("Selecione a quantidade de passos necess\u00E1rios para a receita");
		lblQtdPassos.setBounds(400, 93, 351, 14);
		frmPraticalCook.getContentPane().add(lblQtdPassos);
		
		txtQtdPassos = new JTextField();
		txtQtdPassos.setColumns(10);
		txtQtdPassos.setBounds(485, 131, 86, 20);
		frmPraticalCook.getContentPane().add(txtQtdPassos);
		
		JLabel lblSelecaoPassos = new JLabel("Sele\u00E7\u00E3o dos passos (por ordem)");
		lblSelecaoPassos.setBounds(400, 174, 185, 14);
		frmPraticalCook.getContentPane().add(lblSelecaoPassos);
		
		JComboBox comboBox_Passos = new JComboBox();
		comboBox_Passos.setBounds(595, 170, 30, 22);
		frmPraticalCook.getContentPane().add(comboBox_Passos);
		
		JLabel lblNewLabel_3_1 = new JLabel("Descri\u00E7\u00E3o do passo:");
		lblNewLabel_3_1.setBounds(400, 215, 136, 14);
		frmPraticalCook.getContentPane().add(lblNewLabel_3_1);
		
		JTextPane textPane_DescricaoPassos = new JTextPane();
		textPane_DescricaoPassos.setBounds(400, 246, 301, 119);
		frmPraticalCook.getContentPane().add(textPane_DescricaoPassos);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(240, 287, 89, 23);
		frmPraticalCook.getContentPane().add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(41, 287, 89, 23);
		frmPraticalCook.getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(140, 287, 89, 23);
		frmPraticalCook.getContentPane().add(btnSalvar);
		
		JLabel lblNewLabel = new JLabel("Categoria:");
		lblNewLabel.setBounds(36, 246, 77, 14);
		frmPraticalCook.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Brasileira", "\u00C1rabe", "Italiana", "Sobremesa", "Dieta", "Vegana"}));
		comboBox.setBounds(126, 242, 86, 22);
		frmPraticalCook.getContentPane().add(comboBox);
	}
}
