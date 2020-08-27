package br.com.andy.models;

import br.com.andy.auth.Autentica;

public class Cliente implements Autentica {
	
	private String nome;
	private Boolean status;
	private String senha;
	private Integer pontos;
	
	
	public Cliente(String nome, Boolean status, String senha, Integer pontos) {
		this.nome = nome;
		this.status = status;
		this.senha = senha;
		this.pontos = pontos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSenha() {
		return senha;
	}

	public Boolean getStatus() {
		return status;
	}

	public Integer getPontos() {
		return pontos;
	}

	@Override
	public String toString() {
		System.out.println("Cliente [nome=" + nome + ", status=" + status + ", senha=" + senha + ", pontos=" + pontos + "]");
		return "Cliente [nome=" + nome + ", status=" + status + ", senha=" + senha + ", pontos=" + pontos + "]";
	}

	@Override
	public Boolean autenticaSenha(String senha) {
		
		if(this.senha != senha) {
			System.out.println("Não autenticado");
			return false;
		} 
		
		System.out.println("autenticado");
		return true;
	}
}
