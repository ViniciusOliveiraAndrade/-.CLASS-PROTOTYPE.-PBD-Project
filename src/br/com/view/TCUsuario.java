package br.com.view;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class TCUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private boolean professor;
	private JTextField codigoField;
	private JTextField matriculaField;



	private JSpinner departamentosFields;
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField emailField;
	private JTextField telefoneField;
	private JTextField txtRegularizado;
	
	public TCUsuario(boolean professor) {
		getContentPane().setBackground(Color.WHITE);
		setSize(584,190);
		this.professor = professor;
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Cadastro ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 2;
		gbc_lblNome.gridy = 1;
		panel.add(lblNome, gbc_lblNome);

		nomeField = new JTextField();
		nomeField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_nomeField = new GridBagConstraints();
		gbc_nomeField.gridwidth = 14;
		gbc_nomeField.insets = new Insets(0, 0, 5, 5);
		gbc_nomeField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nomeField.gridx = 3;
		gbc_nomeField.gridy = 1;
		panel.add(nomeField, gbc_nomeField);
		nomeField.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.anchor = GridBagConstraints.EAST;
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridx = 2;
		gbc_lblCpf.gridy = 2;
		panel.add(lblCpf, gbc_lblCpf);

		cpfField = new JTextField();
		cpfField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_cpfField = new GridBagConstraints();
		gbc_cpfField.gridwidth = 6;
		gbc_cpfField.insets = new Insets(0, 0, 5, 5);
		gbc_cpfField.fill = GridBagConstraints.HORIZONTAL;
		gbc_cpfField.gridx = 3;
		gbc_cpfField.gridy = 2;
		panel.add(cpfField, gbc_cpfField);
		cpfField.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 9;
		gbc_lblEmail.gridy = 2;
		panel.add(lblEmail, gbc_lblEmail);

		emailField = new JTextField();
		emailField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_emailField = new GridBagConstraints();
		gbc_emailField.gridwidth = 7;
		gbc_emailField.insets = new Insets(0, 0, 5, 5);
		gbc_emailField.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailField.gridx = 10;
		gbc_emailField.gridy = 2;
		panel.add(emailField, gbc_emailField);
		emailField.setColumns(10);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblMatricula = new GridBagConstraints();
		gbc_lblMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula.gridx = 2;
		gbc_lblMatricula.gridy = 3;
		panel.add(lblMatricula, gbc_lblMatricula);

		matriculaField = new JTextField();
		matriculaField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_matriculaField = new GridBagConstraints();
		gbc_matriculaField.gridwidth = 6;
		gbc_matriculaField.insets = new Insets(0, 0, 5, 5);
		gbc_matriculaField.fill = GridBagConstraints.HORIZONTAL;
		gbc_matriculaField.gridx = 3;
		gbc_matriculaField.gridy = 3;
		panel.add(matriculaField, gbc_matriculaField);
		matriculaField.setColumns(10);

		if(!this.professor) {	
			JLabel codigoJLabel = new JLabel("C\u00F3digo:");
			codigoJLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			GridBagConstraints gbc_codigoJLabel = new GridBagConstraints();
			gbc_codigoJLabel.anchor = GridBagConstraints.EAST;
			gbc_codigoJLabel.insets = new Insets(0, 0, 5, 5);
			gbc_codigoJLabel.gridx = 9;
			gbc_codigoJLabel.gridy = 3;
			panel.add(codigoJLabel, gbc_codigoJLabel);

			codigoField = new JTextField();
			codigoField.setToolTipText("Digite o c\u00F3digo do Aluno");
			codigoField.setFont(new Font("Tahoma", Font.PLAIN, 13));
			GridBagConstraints gbc_codigoField = new GridBagConstraints();
			gbc_codigoField.gridwidth = 7;
			gbc_codigoField.insets = new Insets(0, 0, 5, 5);
			gbc_codigoField.fill = GridBagConstraints.HORIZONTAL;
			gbc_codigoField.gridx = 10;
			gbc_codigoField.gridy = 3;
			panel.add(codigoField, gbc_codigoField);
			codigoField.setColumns(10);
		}
		else {
			JLabel lblDepartamento = new JLabel("Departamento:");
			lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 13));
			GridBagConstraints gbc_lblDepartamento = new GridBagConstraints();
			gbc_lblDepartamento.insets = new Insets(0, 0, 5, 5);
			gbc_lblDepartamento.gridx = 9;
			gbc_lblDepartamento.gridy = 3;
			panel.add(lblDepartamento, gbc_lblDepartamento);

			departamentosFields = new JSpinner();
			departamentosFields.setFont(new Font("Tahoma", Font.PLAIN, 13));
			GridBagConstraints gbc_departamentosFields = new GridBagConstraints();
			gbc_departamentosFields.gridwidth = 8;
			gbc_departamentosFields.insets = new Insets(0, 0, 5, 5);
			gbc_departamentosFields.gridx = 10;
			gbc_departamentosFields.gridy = 3;
			panel.add(departamentosFields, gbc_departamentosFields);

		}

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 2;
		gbc_lblTelefone.gridy = 4;
		panel.add(lblTelefone, gbc_lblTelefone);

		telefoneField = new JTextField();
		telefoneField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_telefoneField = new GridBagConstraints();
		gbc_telefoneField.gridwidth = 7;
		gbc_telefoneField.insets = new Insets(0, 0, 5, 5);
		gbc_telefoneField.fill = GridBagConstraints.HORIZONTAL;
		gbc_telefoneField.gridx = 3;
		gbc_telefoneField.gridy = 4;
		panel.add(telefoneField, gbc_telefoneField);
		telefoneField.setColumns(10);

		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		lblSituao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblSituao = new GridBagConstraints();
		gbc_lblSituao.anchor = GridBagConstraints.EAST;
		gbc_lblSituao.insets = new Insets(0, 0, 5, 5);
		gbc_lblSituao.gridx = 10;
		gbc_lblSituao.gridy = 4;
		panel.add(lblSituao, gbc_lblSituao);

		txtRegularizado = new JTextField();
		txtRegularizado.setEditable(false);
		txtRegularizado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtRegularizado.setText("Regularizado");
		GridBagConstraints gbc_txtRegularizado = new GridBagConstraints();
		gbc_txtRegularizado.gridwidth = 6;
		gbc_txtRegularizado.insets = new Insets(0, 0, 5, 5);
		gbc_txtRegularizado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRegularizado.gridx = 11;
		gbc_txtRegularizado.gridy = 4;
		panel.add(txtRegularizado, gbc_txtRegularizado);
		txtRegularizado.setColumns(10);

		JButton cancelarButton = new JButton("Cancelar");
		GridBagConstraints gbc_cancelarButton = new GridBagConstraints();
		gbc_cancelarButton.insets = new Insets(0, 0, 5, 5);
		gbc_cancelarButton.gridx = 6;
		gbc_cancelarButton.gridy = 6;
		panel.add(cancelarButton, gbc_cancelarButton);

		JButton limparButton = new JButton("Limpar");
		limparButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_limparButton = new GridBagConstraints();
		gbc_limparButton.insets = new Insets(0, 0, 5, 5);
		gbc_limparButton.gridx = 9;
		gbc_limparButton.gridy = 6;
		panel.add(limparButton, gbc_limparButton);
		
		JButton cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_cadastrarButton = new GridBagConstraints();
		gbc_cadastrarButton.insets = new Insets(0, 0, 5, 5);
		gbc_cadastrarButton.gridx = 10;
		gbc_cadastrarButton.gridy = 6;
		panel.add(cadastrarButton, gbc_cadastrarButton);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TCUsuario(false);

	}
}
