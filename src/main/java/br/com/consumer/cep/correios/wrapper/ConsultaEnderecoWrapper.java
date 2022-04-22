package br.com.consumer.cep.correios.wrapper;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Iterator;

import javax.swing.JOptionPane;

import br.com.consumer.cep.correios.model.Endereco;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP;

/**
 * @author fredyefra Classe responsavel por receber o endereco via WS dos
 *         correios e tratar para o objeto local Endereco
 */
public class ConsultaEnderecoWrapper implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Endereco endereco = new Endereco();
	private EnderecoERP enderecoERP;

	public ConsultaEnderecoWrapper() {
	}

	public Endereco cepCorreios(String cep) {

		try {
			enderecoERP = new AtendeClienteProxy().consultaCEP(cep);
			endereco.setCep(enderecoERP.getCep());
			endereco.setEndereco(enderecoERP.getEnd());
			endereco.setCidade(enderecoERP.getBairro() + " - " + enderecoERP.getCidade());

		}

		catch (SigepClienteException e) {
			endereco = new Endereco();
			JOptionPane.showMessageDialog(null, "CEP NÃO LOCALIZADO, REFAÇA A BUSCA!");
			e.printStackTrace();
		}

		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "BASE DE DADOS INDISPONÍVEL, TENTE MAIS TARDE!");
			e.printStackTrace();
		}

		catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "WEB SERVICE INDISPONÍVEL, TENTE MAIS TARDE!");
			e.printStackTrace();
		}
		return endereco;
	}

	
	/*
	 * public static void main(String[] args) throws
	 * 
	 * br.com.correios.bsb.sigep.master.bean.cliente.SQLException,
	 * SigepClienteException, RemoteException {
	 * 
	 * System.out.println(new ConsultaEnderecoWrapper().cepCorreios("71720585"));
	 * 
	 * 
	 * 
	 * System.out.println(endereco.getCep()+ "--" +endereco.getEndereco()+ "--" +
	 * endereco.getCidade());
	 * 
	 * 
	 * }
	 */
	 

}
