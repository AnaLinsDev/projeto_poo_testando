package modelo;

import java.util.ArrayList;

public class Cliente {
	private String telefone;
	private String nome;
	private String endereco;
	private ArrayList<Pedido> pedidos;

	public Cliente(String telefone, String nome, String endereco) {
		this.telefone = telefone;
		this.nome = nome;
		this.endereco = endereco;

	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Cliente cadastrarCliente(String telefone, String nome, String endereco) {
		return new Cliente(telefone,nome,endereco);
	}
}
