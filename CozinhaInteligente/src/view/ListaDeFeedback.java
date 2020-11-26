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

public class ListaDeFeedback {

	private JFrame frmPraticalCook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDeFeedback window = new ListaDeFeedback();
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
	public ListaDeFeedback() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPraticalCook = new JFrame();
		frmPraticalCook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmPraticalCook.setTitle("Pratical Cook - Lista de avalia\u00E7\u00F5es");
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
		mntmMeuPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMeuPerfil);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Edi\u00E7\u00E3o de usu\u00E1rios");
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		menuBar.add(mntmCadastro);
		
		JLabel lblTitulo = new JLabel("Lista de avalia\u00E7\u00F5es");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(315, 51, 187, 14);
		frmPraticalCook.getContentPane().add(lblTitulo);
		
		JList list = new JList();
		list.setBounds(40, 92, 693, 439);
		frmPraticalCook.getContentPane().add(list);
	}

}
