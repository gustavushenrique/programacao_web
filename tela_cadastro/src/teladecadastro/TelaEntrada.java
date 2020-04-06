package teladecadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import teladecadastro.model.Pessoa;

public class TelaEntrada extends JPanel {

	private static final long serialVersionUID = 1L;

	public TelaEntrada() {

		JLabel nome = new JLabel("Nome:");
		nome.setBounds(10, 10, 50, 25);
		this.add(nome);

		JTextField nomeField = new JTextField();
		nomeField.setBounds(75, 10, 300, 25);
		this.add(nomeField);

		JLabel rua = new JLabel("Rua:");
		rua.setBounds(10, 50, 50, 25);
		this.add(rua);

		JTextField ruaField = new JTextField();
		ruaField.setBounds(75, 50, 300, 25);
		this.add(rua);

		JLabel numero = new JLabel("Numero:");
		numero.setBounds(10, 90, 50, 25);
		this.add(numero);

		JTextField numeroField = new JTextField();
		numeroField.setBounds(75, 90, 100, 25);
		this.add(numeroField);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(110, 150, 100, 30);

		this.add(btnAdicionar);
		btnAdicionar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String nome = nomeField.getText();
				String rua = ruaField.getText();
				String numero = numeroField.getText();

				System.out.println(nome);
				System.out.println(rua);
				System.out.println(numero);

				Pessoa pessoa = new Pessoa(nome, rua, numero);

				nomeField.setText("");
				ruaField.setText("");
				numeroField.setText("");

				System.out.println("Cadastrado com sucesso!" + "\n" + pessoa);

			}

		});

	}

}
