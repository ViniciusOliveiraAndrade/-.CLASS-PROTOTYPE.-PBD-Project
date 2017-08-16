package br.com.view.usuario;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


import br.com.model.beans.Usuario;
import net.miginfocom.swing.MigLayout;

public class PainelUsuarioStatus extends JPanel{

	private static final long serialVersionUID = 1L;

	private JLabel lblNome;
	private JLabel lblEmail;
	private JLabel lblCpf;
	private JLabel lblMatricula;
	private JLabel lblTelefone;
	private JLabel lblSituao_1;
	private JLabel lblCdigo;
	private JLabel lblDepartamento;
	private JLabel nomeLabelS;
	private JLabel emailLabelS;
	private JLabel matriculaLabelS;
	private JLabel cpfLabelS;
	private JLabel telefoneLabelS;
	private JLabel situacaoLabelS;
	private JLabel codigoLabelStatus;
	private JLabel departamentoLabelS;

	public PainelUsuarioStatus(Usuario usuario) {
		setBackground(Color.WHITE);
		this.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Meus Status", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		setLayout(new MigLayout("", "[45px][78px][42px][78px][31px][71px][8px][67px][78px][67px][78px]", "[15px][][][][][][][]"));


		this.lblNome = new JLabel("Nome:");
		this.add(this.lblNome, "cell 0 0,alignx left,aligny center");

		this.nomeLabelS = new JLabel(usuario.getNome());
		this.add(this.nomeLabelS, "cell 1 0,alignx left,aligny center");

		this.lblEmail = new JLabel("Email:");
		this.add(this.lblEmail, "cell 0 1,alignx left,aligny center");

		this.emailLabelS = new JLabel(usuario.getEmail());
		this.add(this.emailLabelS, "cell 1 1,alignx left,aligny center");

		this.lblCpf = new JLabel("CPF:");
		this.add(this.lblCpf, "cell 0 2,alignx left,aligny center");

		this.cpfLabelS = new JLabel(usuario.getCpf());
		this.add(this.cpfLabelS, "cell 1 2");

		this.lblMatricula = new JLabel("Matricula:");
		this.add(this.lblMatricula, "cell 0 3,alignx left,aligny center");

		this.matriculaLabelS = new JLabel(String.valueOf(usuario.getMatricula()));
		this.add(this.matriculaLabelS, "cell 1 3,alignx left,aligny center");

		this.lblTelefone = new JLabel("Telefone:");
		this.add(this.lblTelefone, "cell 0 4,alignx left,aligny center");

		this.telefoneLabelS = new JLabel(usuario.getTelefone());
		this.add(this.telefoneLabelS, "cell 1 4,alignx left,aligny center");

		this.lblSituao_1 = new JLabel("Situação:");
		this.add(this.lblSituao_1, "cell 0 5,alignx left,aligny center");

		this.situacaoLabelS = new JLabel(usuario.getSituacao());
		this.add(this.situacaoLabelS, "cell 1 5,alignx left,aligny center");

		if(!usuario.isProfessor()) {
			this.lblCdigo = new JLabel("Código:");
			this.add(this.lblCdigo, "cell 0 6");

			this.codigoLabelStatus = new JLabel(String.valueOf(usuario.getCodigo()));
			this.add(this.codigoLabelStatus, "cell 1 6");
		}else {
			this.lblDepartamento = new JLabel("Departamento:");
			this.add(this.lblDepartamento, "cell 0 7");

			this.departamentoLabelS = new JLabel(usuario.getDepartamento().getNome());
			this.add(this.departamentoLabelS, "cell 1 7");
		}

	}

	public void ativar(){
		this.setVisible(true);
	}

	public void desativar(){
		this.setVisible(false);
	}
}
