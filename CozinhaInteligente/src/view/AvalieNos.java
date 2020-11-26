package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class AvalieNos {

	private JFrame frmAvalienos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvalieNos window = new AvalieNos();
					window.frmAvalienos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AvalieNos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAvalienos = new JFrame();
		frmAvalienos.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LFK\\Documents\\Lipe\\Faculdade\\3\u00B0 semestre\\P.I\\chap\u00E9u-do-cozinheiro-chefe-com-mercadorias-da-cozinha-39692536.jpg"));
		frmAvalienos.setTitle("Pratical Cook - Avalie-nos");
		frmAvalienos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAvalienos.setBounds(100, 100, 800, 600);
		frmAvalienos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Praticidade");
		lblNewLabel.setBounds(123, 119, 76, 14);
		frmAvalienos.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Avalie-nos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(338, 40, 97, 14);
		frmAvalienos.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qualidade das receitas");
		lblNewLabel_2.setBounds(123, 161, 133, 14);
		frmAvalienos.getContentPane().add(lblNewLabel_2);
		
		JComboBox Praticidade = new JComboBox();
		Praticidade.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		Praticidade.setBounds(295, 115, 30, 22);
		frmAvalienos.getContentPane().add(Praticidade);
		
		JComboBox QualidadeReceitas = new JComboBox();
		QualidadeReceitas.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		QualidadeReceitas.setBounds(295, 157, 30, 22);
		frmAvalienos.getContentPane().add(QualidadeReceitas);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setBounds(123, 256, 46, 14);
		frmAvalienos.getContentPane().add(lblDescricao);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(211, 206, 399, 120);
		frmAvalienos.getContentPane().add(textPane);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(277, 353, 89, 23);
		frmAvalienos.getContentPane().add(btnCancelar);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(394, 353, 89, 23);
		frmAvalienos.getContentPane().add(btnEnviar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 1, 784, 28);
		frmAvalienos.getContentPane().add(menuBar);
		
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
	}
}
