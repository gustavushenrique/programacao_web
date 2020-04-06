package br.com.telasworld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends javax.swing.JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lblNome;
	private JLabel lblRua;
	private JLabel lblNumero;
	private JTextField txtNome;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JButton btnSalvar;
	private JButton btnFechar;

	public void actionPerformed(ActionEvent e) {

		JButton btnClick = (JButton) e.getSource();

		if (btnClick.getText() == "Salvar") {

			Pessoa pessoa = new Pessoa();
			pessoa.nome = txtNome.getText();
			pessoa.rua = txtRua.getText();
			pessoa.numero = txtNumero.getText();

			System.out.println(pessoa.nome);
			System.out.println(pessoa.rua);
			System.out.println(pessoa.numero);

			txtNome.setText("");
			txtRua.setText("");
			txtNumero.setText("");

		} else {
			System.exit(0);

		}

	}

	public TelaCadastro() {
		lblNome = new JLabel("Nome:");
		lblRua = new JLabel("Rua:");
		lblNumero = new JLabel("Numero:");
		txtNome = new JTextField();
		txtRua = new JTextField();
		txtNumero = new JTextField();
		btnSalvar = new JButton("Salvar");
		btnFechar = new JButton("Cancelar");

		btnSalvar.addActionListener(this);
		btnFechar.addActionListener(this);

		setSize(400, 260);
		setResizable(false);
		setTitle("Tela de Cadastro!");
		setVisible(true);
		setLayout(null);

		lblNome.setBounds(10, 10, 50, 25);
		txtNome.setBounds(75, 10, 300, 25);

		lblRua.setBounds(10, 50, 50, 25);
		txtRua.setBounds(75, 50, 300, 25);

		lblNumero.setBounds(10, 90, 50, 25);
		txtNumero.setBounds(75, 90, 100, 25);

		btnSalvar.setBounds(110, 150, 100, 30);
		btnFechar.setBounds(215, 150, 100, 30);

		getContentPane().add(lblNome);
		getContentPane().add(lblRua);
		getContentPane().add(lblNumero);
		getContentPane().add(txtNome);
		getContentPane().add(txtRua);
		getContentPane().add(txtNumero);
		getContentPane().add(btnSalvar);
		getContentPane().add(btnFechar);
		getContentPane().repaint();

	}

	public static void main(String[] args) {
		new TelaCadastro();
	}

}
