package br.com.andy.test;

import java.util.List;
import java.util.function.Consumer;

import br.com.andy.models.Cliente;

public class Teste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("andrey", true, "123", 1);
		Cliente cliente2 = new Cliente("micheli", true, "456", 1);
		
		cliente.autenticaSenha("123");
		
		List<Cliente> clientes = List.of(cliente, cliente2);
		clientes.forEach(Cliente::getNome); //Method Reference
		
		Cliente cliente3 = new Cliente("ana", false, "333", 1);
		
		Consumer<Cliente> consumer = Cliente::getNome;
		consumer.accept(cliente3);
		
		Runnable r1 = cliente3::getNome;
		r1.run();
		
		Runnable r = () -> System.out.println("Olá piazedo"); //Lambda Expression
		new Thread(r).start();
	}
}
