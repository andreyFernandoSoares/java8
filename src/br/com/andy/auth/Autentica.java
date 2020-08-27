package br.com.andy.auth;

@FunctionalInterface
public interface Autentica {
	public abstract Boolean autenticaSenha(String senha);
}
