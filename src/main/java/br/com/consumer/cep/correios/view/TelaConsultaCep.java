package br.com.consumer.cep.correios.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import br.com.consumer.cep.correios.model.Endereco;
import br.com.consumer.cep.correios.wrapper.ConsultaEnderecoWrapper;

public class TelaConsultaCep extends JFrame {


	private static final long serialVersionUID = 1L;
	private JFrame frame = new JFrame();


	private JTextField txtNome;
	private JTextField txtDDD;
	private JTextField txtEmail;
	private JTextField txtCep;
	//private JTextField txtEndereco;
	//private JTextField txtComplemento;
	//private JTextField txtCidade;

	private JButton btnSalvar = new JButton();
	private JButton btnCancelar = new JButton("PESQUISAR");
	private JTextField txtTelefone;
	private JTextField textField;
	private JTextField txtEndereco;
	private JTextField txtComplemento;
	private JTextField txtCidade;
	private Endereco endereco = new Endereco();

	public TelaConsultaCep()  {


		this.frame.setSize(975, 678);


		JPanel body = new JPanel();

		JPanel panel = new JPanel();

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(47)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(body, GroupLayout.PREFERRED_SIZE, 887, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 888, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(30, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(22)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addGap(35)
						.addComponent(body, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(170, Short.MAX_VALUE))
				);

		JLabel lblNewLabel = new JLabel("Consulta Serviço de CEP Correios WSDL");
		//lblNewLabel.setIcon(new ImageIcon("/opt/eclipse/workspace/consumer.cep.correios/logo2.png"));
		lblNewLabel.setIcon(new ImageIcon("logo2.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
						.addContainerGap(211, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 607, GroupLayout.PREFERRED_SIZE)
						.addGap(70))
				);
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(25, Short.MAX_VALUE))
				);
		panel.setLayout(gl_panel);

		txtCep = new JTextField();
		txtCep.setColumns(10);

		JLabel lblCep = new JLabel("CEP:");

		JLabel lblEndereo = new JLabel("ENDEREÇO:");

		txtEndereco = new JTextField();
		txtEndereco.setEditable(false);
		txtEndereco.setColumns(10);

		JLabel lblComplemento = new JLabel("COMPLEMENTO:");

		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);

		JLabel lblCidade = new JLabel("CIDADE:");

		txtCidade = new JTextField();
		txtCidade.setEditable(false);
		txtCidade.setColumns(10);

		//btnCancelar = new JButton("Pesquisar");

		GroupLayout gl_header = new GroupLayout(body);
		gl_header.setHorizontalGroup(
				gl_header.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_header.createSequentialGroup()
						.addGroup(gl_header.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_header.createSequentialGroup()
										.addGap(32)
										.addComponent(lblCep)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_header.createSequentialGroup()
										.addGap(40)
										.addComponent(lblComplemento)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
						.addGap(42)
						.addGroup(gl_header.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEndereo)
								.addComponent(lblCidade, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGap(72)
						.addGroup(gl_header.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtCidade)
								.addComponent(txtEndereco, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
						.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_header.createSequentialGroup()
						.addContainerGap(387, Short.MAX_VALUE)
						.addComponent(btnCancelar)
						.addGap(383))
				);
		gl_header.setVerticalGroup(
				gl_header.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_header.createSequentialGroup()
						.addGap(51)
						.addGroup(gl_header.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCep)
								.addComponent(lblEndereo)
								.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_header.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_header.createSequentialGroup()
										.addGap(42)
										.addGroup(gl_header.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblComplemento)
												.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCidade)))
								.addGroup(gl_header.createSequentialGroup()
										.addGap(34)
										.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(83)
						.addComponent(btnCancelar)
						.addContainerGap(93, Short.MAX_VALUE))
				);
		body.setLayout(gl_header);
		frame.getContentPane().setLayout(groupLayout);

		this.frame.setVisible(true);
		this.frame.setLocationRelativeTo(null);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		consultar();
		//consultarCep();		

	}

	private void consultar() {
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoCancelar) {

				if (eventoCancelar.getSource() == btnCancelar) {
					
					if (txtCep.getText() != null || !txtCep.getText().isEmpty()) {
						ConsultaEnderecoWrapper consultaCorreios = new ConsultaEnderecoWrapper();
						endereco = consultaCorreios.cepCorreios(txtCep.getText());
						txtEndereco.setText(endereco.getEndereco());
						txtComplemento.setText(endereco.getComplemento());
						txtCidade.setText(endereco.getCidade()); 
					}
					
				}	
			}}); 
	}




	private void consultarCep() {
		txtCep.getDocument().addDocumentListener(new DocumentListener() {

			//@Override
			public void removeUpdate(DocumentEvent arg0) {
				//warn();
				if (txtCep.getText().equals(null) || txtCep.getText().length() > 8) {
					JOptionPane.showMessageDialog(null, "Inesperado");
				}
			}

			//@Override
			public void insertUpdate(DocumentEvent arg0) {
				warn();
			}

			//@Override
			public void changedUpdate(DocumentEvent arg0) {
				warn();
			}

			public void warn() {
				if (txtCep.getText().length() == 8) {
					ConsultaEnderecoWrapper consultaCorreios = new ConsultaEnderecoWrapper();
					endereco = consultaCorreios.cepCorreios(txtCep.getText());
					txtEndereco.setText(endereco.getEndereco());
					txtComplemento.setText(endereco.getComplemento());
					txtCidade.setText(endereco.getCidade());
				}

			}

		});
	}


	public static void main(String[] args) {
		new TelaConsultaCep();
	}
}