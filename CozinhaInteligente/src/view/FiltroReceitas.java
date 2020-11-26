package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;

public class FiltroReceitas {

	private JFrame frmFiltroDeReceitas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FiltroReceitas window = new FiltroReceitas();
					window.frmFiltroDeReceitas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FiltroReceitas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFiltroDeReceitas = new JFrame();
		frmFiltroDeReceitas.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmFiltroDeReceitas.setTitle("Pratical Cook - Filtro de receitas");
		frmFiltroDeReceitas.setBounds(100, 100, 800, 600);
		frmFiltroDeReceitas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFiltroDeReceitas.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 28);
		frmFiltroDeReceitas.getContentPane().add(menuBar);
		
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
		
		JLabel lbl1 = new JLabel("De acordo com as tags:");
		lbl1.setBounds(31, 51, 146, 14);
		frmFiltroDeReceitas.getContentPane().add(lbl1);
		
		JLabel lblTags = new JLabel("Cole as tags aqui");
		lblTags.setBounds(209, 51, 170, 14);
		frmFiltroDeReceitas.getContentPane().add(lblTags);
		
		JLabel lblReceitasEncontradas = new JLabel("As receitas encontradas foram:");
		lblReceitasEncontradas.setBounds(31, 90, 200, 14);
		frmFiltroDeReceitas.getContentPane().add(lblReceitasEncontradas);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(70, 510, 89, 23);
		frmFiltroDeReceitas.getContentPane().add(btnVoltar);
		
		JList listReceitas = new JList();
		listReceitas.setBounds(41, 128, 407, 369);
		frmFiltroDeReceitas.getContentPane().add(listReceitas);
	}
}
