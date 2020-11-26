package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class RelatorioFeedback {

	private JFrame frame;
	private JTextField txtUsuarioAutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelatorioFeedback window = new RelatorioFeedback();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RelatorioFeedback() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPraticidade = new JLabel("Praticidade");
		lblPraticidade.setBounds(139, 118, 94, 14);
		frame.getContentPane().add(lblPraticidade);
		
		JLabel lblTitulo = new JLabel("Relat\u00F3rio de Feedback");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(295, 39, 188, 14);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblQualidadeReceitas = new JLabel("Qualidade das receitas");
		lblQualidadeReceitas.setBounds(139, 160, 151, 14);
		frame.getContentPane().add(lblQualidadeReceitas);
		
		JComboBox Praticidade = new JComboBox();
		Praticidade.setBounds(330, 114, 30, 22);
		frame.getContentPane().add(Praticidade);
		
		JComboBox QualidadeReceitas = new JComboBox();
		QualidadeReceitas.setBounds(330, 156, 30, 22);
		frame.getContentPane().add(QualidadeReceitas);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setBounds(139, 254, 75, 14);
		frame.getContentPane().add(lblDescricao);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(224, 205, 399, 120);
		frame.getContentPane().add(textPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 28);
		frame.getContentPane().add(menuBar);
		
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
		
		JLabel lblUsuarioAutor = new JLabel("Usu\u00E1rio-autor");
		lblUsuarioAutor.setBounds(139, 362, 94, 14);
		frame.getContentPane().add(lblUsuarioAutor);
		
		txtUsuarioAutor = new JTextField();
		txtUsuarioAutor.setEditable(false);
		txtUsuarioAutor.setBounds(243, 359, 180, 20);
		frame.getContentPane().add(txtUsuarioAutor);
		txtUsuarioAutor.setColumns(10);
	}
}
