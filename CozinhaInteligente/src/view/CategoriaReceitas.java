package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

public class CategoriaReceitas {

	private JFrame frmPraticalCook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CategoriaReceitas window = new CategoriaReceitas();
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
	public CategoriaReceitas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setTitle("Pratical Cook - Categoria de Receitas");
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
		
		JMenuItem mntmMeuPerfil = new JMenuItem("Meu Perfil");
		mntmMeuPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMeuPerfil);
		
		JMenuItem mntmAvalieNos = new JMenuItem("Avalie-nos");
		mntmAvalieNos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmAvalieNos);
		
		JLabel lblTitulo = new JLabel("Cole o nome da Categoria aqui");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(275, 51, 281, 14);
		frmPraticalCook.getContentPane().add(lblTitulo);
		
		JLabel lblReceitas = new JLabel("Receitas:");
		lblReceitas.setBounds(45, 96, 46, 14);
		frmPraticalCook.getContentPane().add(lblReceitas);
		
		JList list = new JList();
		list.setBounds(76, 144, 616, 393);
		frmPraticalCook.getContentPane().add(list);
	}
}
