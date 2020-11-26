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
		lblFiltragemReceitas.setBounds(310, 52, 148, 14);
		frmMenu.getContentPane().add(lblFiltragemReceitas);
		
		Filtragem = new JTextField();
		Filtragem.setBounds(180, 92, 391, 20);
		frmMenu.getContentPane().add(Filtragem);
		Filtragem.setColumns(10);
		
		JButton btnFiltrar = new JButton("Procurar");
		btnFiltrar.setBounds(331, 200, 89, 23);
		frmMenu.getContentPane().add(btnFiltrar);
		
		JLabel lb1 = new JLabel("Para filtrar por mais de um ingrediente separe-os com ponto e v\u00EDrgula");
		lb1.setBounds(157, 141, 428, 14);
		frmMenu.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Exemplo: Ingrediente01; Ingrediente02.");
		lb2.setBounds(201, 155, 257, 14);
		frmMenu.getContentPane().add(lb2);
		
		JLabel lbMenu = new JLabel("Menu");
		lbMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbMenu.setBounds(359, 280, 46, 14);
		frmMenu.getContentPane().add(lbMenu);
		
		JButton btComidaBrasileira = new JButton("Brasileira");
		btComidaBrasileira.setBounds(180, 320, 89, 40);
		frmMenu.getContentPane().add(btComidaBrasileira);
		
		JButton btnComidaItaliana = new JButton("Italiana");
		btnComidaItaliana.setBounds(331, 320, 89, 40);
		frmMenu.getContentPane().add(btnComidaItaliana);
		
		JButton btnComidaItalaiana = new JButton("\u00C1rabe");
		btnComidaItalaiana.setBounds(482, 320, 89, 40);
		frmMenu.getContentPane().add(btnComidaItalaiana);
		
		JButton btnSobremesa = new JButton("Sobremesa");
		btnSobremesa.setBounds(180, 359, 89, 40);
		frmMenu.getContentPane().add(btnSobremesa);
		
		JButton btnDieta = new JButton("Dieta");
		btnDieta.setBounds(331, 359, 89, 40);
		frmMenu.getContentPane().add(btnDieta);
		
		JButton btnComidaVegana = new JButton("Vegana");
		btnComidaVegana.setBounds(482, 359, 89, 40);
		frmMenu.getContentPane().add(btnComidaVegana);
	}

}
