package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Home {

	private JFrame frmMenu;
	private JTextField Filtragem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmMenu.setTitle("Pratical Cook - Menu");
		frmMenu.setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		frmMenu.setJMenuBar(menuBar);
		
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
		frmMenu.getContentPane().setLayout(null);
		
		JLabel lblFiltragemReceitas = new JLabel("Filtragem de receitas");
		lblFiltragemReceitas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFiltragemReceitas.setBounds(297, 11, 148, 14);
		frmMenu.getContentPane().add(lblFiltragemReceitas);
		
		Filtragem = new JTextField();
		Filtragem.setBounds(272, 162, 198, 20);
		frmMenu.getContentPane().add(Filtragem);
		Filtragem.setColumns(10);
		
		JButton btnFiltrar = new JButton("Procurar");
		btnFiltrar.setBounds(326, 404, 89, 23);
		frmMenu.getContentPane().add(btnFiltrar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(272, 207, 198, 20);
		frmMenu.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(272, 254, 198, 20);
		frmMenu.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(272, 305, 198, 20);
		frmMenu.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(272, 124, 198, 20);
		frmMenu.getContentPane().add(textField_3);
		
		JLabel lbIngrediente1 = new JLabel(" Ingrediente :");
		lbIngrediente1.setBounds(144, 127, 89, 14);
		frmMenu.getContentPane().add(lbIngrediente1);
		
		JLabel lbIngrediente2 = new JLabel(" Ingrediente :");
		lbIngrediente2.setBounds(144, 168, 89, 14);
		frmMenu.getContentPane().add(lbIngrediente2);
		
		JLabel lbIngrediente3 = new JLabel(" Ingrediente :");
		lbIngrediente3.setBounds(144, 210, 89, 14);
		frmMenu.getContentPane().add(lbIngrediente3);
		
		JLabel lbIngrediente4 = new JLabel(" Ingrediente :");
		lbIngrediente4.setBounds(144, 257, 89, 14);
		frmMenu.getContentPane().add(lbIngrediente4);
		
		JLabel lbIngrediente6 = new JLabel(" Ingrediente :");
		lbIngrediente6.setBounds(144, 308, 89, 14);
		frmMenu.getContentPane().add(lbIngrediente6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(272, 354, 198, 20);
		frmMenu.getContentPane().add(textField_4);
		
		JLabel lbIngrediente6_1 = new JLabel(" Ingrediente :");
		lbIngrediente6_1.setBounds(144, 357, 89, 14);
		frmMenu.getContentPane().add(lbIngrediente6_1);
	}

}
