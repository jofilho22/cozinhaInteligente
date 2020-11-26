package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Receita {

	private JFrame frmPraticalCook;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receita window = new Receita();
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
	public Receita() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setTitle("Pratical Cook - Receita");
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setBounds(100, 100, 800, 600);
		frmPraticalCook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPraticalCook.getContentPane().setLayout(null);
		
		JLabel lblNomeReceita = new JLabel("Nome da Receita aqui");
		lblNomeReceita.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNomeReceita.setBounds(304, 51, 191, 14);
		frmPraticalCook.getContentPane().add(lblNomeReceita);
		
		JLabel lblIngredientes = new JLabel("Ingredientes necess\u00E1rios");
		lblIngredientes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIngredientes.setBounds(44, 103, 180, 14);
		frmPraticalCook.getContentPane().add(lblIngredientes);
		
		JLabel lblModoPreparo = new JLabel("Modo de preparo");
		lblModoPreparo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblModoPreparo.setBounds(395, 103, 180, 14);
		frmPraticalCook.getContentPane().add(lblModoPreparo);
		
		JLabel lblNewLabel = new JLabel("Valor cal\u00F3rico (em Kcal)");
		lblNewLabel.setBounds(32, 501, 140, 14);
		frmPraticalCook.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(183, 498, 86, 20);
		frmPraticalCook.getContentPane().add(textField);
		textField.setColumns(10);
		
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
		
		JList listIngredientes = new JList();
		listIngredientes.setBounds(29, 148, 307, 317);
		frmPraticalCook.getContentPane().add(listIngredientes);
		
		JList listModoPreparo = new JList();
		listModoPreparo.setBounds(355, 145, 359, 320);
		frmPraticalCook.getContentPane().add(listModoPreparo);
	}
}
