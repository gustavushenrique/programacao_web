package br.com.gustavohenrique.teladecadastro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaCadastroApplication {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroApplication window = new TelaCadastroApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCadastroApplication() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setFont(new Font("Arial", Font.PLAIN, 12));
		frame.setBounds(100, 100, 420, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		JLabel titulo = new JLabel("<html><<h1>Cadastro de Produtos:</h1></html>");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(titulo, BorderLayout.NORTH);

		TelaEntrada telaEntrada = new TelaEntrada();
		frame.getContentPane().add(telaEntrada, BorderLayout.CENTER);
	}

}
