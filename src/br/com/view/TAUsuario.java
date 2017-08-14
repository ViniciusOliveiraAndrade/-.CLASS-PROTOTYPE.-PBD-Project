package br.com.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TAUsuario extends JFrame{
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
	
	private JButton cancelarButton;
	private JButton limparButton;
	private JButton cadastrarButton;
	private JTextField textField;
	private final JLabel label = new JLabel("");

	public TAUsuario(boolean professor) {
		
		
		getContentPane().setBackground(Color.WHITE);
		setSize(623,268);
		this.professor = professor;
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Dados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 17;
		gbc_label.gridy = 6;
		panel.add(label, gbc_label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Buscar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblId);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton buscarButton = new JButton("Buscar");
		panel_1.add(buscarButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		
				JButton cancelarButton_1 = new JButton("Cancelar");
				panel_2.add(cancelarButton_1);
				
						JButton limparButton_1 = new JButton("Limpar");
						panel_2.add(limparButton_1);
						limparButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
						
						JButton excluirButton = new JButton("Excluir");
						panel_2.add(excluirButton);
						excluirButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
						
						JButton alterarBuuton = new JButton("Alterar");
						panel_2.add(alterarBuuton);
						alterarBuuton.setFont(new Font("Tahoma", Font.PLAIN, 13));

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TAUsuario(false);
	}
	
	
	public boolean isProfessor() {
		return professor;
	}

	public void setProfessor(boolean professor) {
		this.professor = professor;
	}

	public JTextField getCodigoField() {
		return codigoField;
	}

	public void setCodigoField(JTextField codigoField) {
		this.codigoField = codigoField;
	}

	public JTextField getMatriculaField() {
		return matriculaField;
	}

	public void setMatriculaField(JTextField matriculaField) {
		this.matriculaField = matriculaField;
	}

	public JSpinner getDepartamentosFields() {
		return departamentosFields;
	}

	public void setDepartamentosFields(JSpinner departamentosFields) {
		this.departamentosFields = departamentosFields;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public void setNomeField(JTextField nomeField) {
		this.nomeField = nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public void setCpfField(JTextField cpfField) {
		this.cpfField = cpfField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public void setEmailField(JTextField emailField) {
		this.emailField = emailField;
	}

	public JTextField getTelefoneField() {
		return telefoneField;
	}

	public void setTelefoneField(JTextField telefoneField) {
		this.telefoneField = telefoneField;
	}

	public JTextField getTxtRegularizado() {
		return txtRegularizado;
	}

	public void setTxtRegularizado(JTextField txtRegularizado) {
		this.txtRegularizado = txtRegularizado;
	}

	public JButton getCancelarButton() {
		return cancelarButton;
	}

	public void setCancelarButton(JButton cancelarButton) {
		this.cancelarButton = cancelarButton;
	}

	public JButton getLimparButton() {
		return limparButton;
	}

	public void setLimparButton(JButton limparButton) {
		this.limparButton = limparButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public void setCadastrarButton(JButton cadastrarButton) {
		this.cadastrarButton = cadastrarButton;
	}

}
