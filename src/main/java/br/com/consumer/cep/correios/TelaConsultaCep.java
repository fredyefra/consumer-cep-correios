package br.com.consumer.cep.correios;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.ImageIcon;

public class TelaConsultaCep extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame = new JFrame();

	
	private JTextField txtNome;
	private JTextField txtDDD;
	private JTextField txtEmail;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtComplemento;
	private JTextField txtCidade;
	
	private JButton btnSalvar = new JButton();
	private JButton btnCancelar = new JButton();
	private JTextField txtTelefone;
	private JTextField textField;
	
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
		lblNewLabel.setIcon(new ImageIcon("/opt/eclipse/workspace/consumer.cep.correios/logo2.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 607, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(269, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		
		GroupLayout gl_header = new GroupLayout(body);
		gl_header.setHorizontalGroup(
			gl_header.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_header.createSequentialGroup()
					.addGap(32)
					.addComponent(lblCep)
					.addGap(34)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(546, Short.MAX_VALUE))
		);
		gl_header.setVerticalGroup(
			gl_header.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_header.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_header.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCep))
					.addContainerGap(287, Short.MAX_VALUE))
		);
		body.setLayout(gl_header);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
		
		
		//JPanel body = new JPanel();
		
				
		
		//this.frame.getContentPane().setLayout(groupLayout);
		this.frame.setVisible(true);
		this.frame.setLocationRelativeTo(null);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	public static void main(String[] args) {
		new TelaConsultaCep();
	}
}
