package teladecadastro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaDeCadastroApplication {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastroApplication window = new TelaDeCadastroApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaDeCadastroApplication() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Arial", Font.PLAIN, 12));
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		JLabel titulo = new JLabel("<html><<h1>Cadastro de Pessoas:</h1></html>");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(titulo, BorderLayout.NORTH);

		TelaEntrada telaDeEntrada = new TelaEntrada();
		frame.getContentPane().add(telaDeEntrada, BorderLayout.CENTER);
	}

}
