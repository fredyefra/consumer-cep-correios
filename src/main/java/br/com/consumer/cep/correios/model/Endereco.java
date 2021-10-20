package br.com.consumer.cep.correios.model;

import java.io.Serializable;

/**@author fredyefra
 * Class representation Endereco from WS EnderecoERP correios  
 * */
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	// private Long identificador;
	private String cep;
	private String endereco;
	private String complemento;
	private String cidade;

	public Endereco() {
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "**** CEP ENDERECO **** " + cep;
	}
}