package br.com.andy.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import br.com.andy.models.Cliente;

public class TesteStream {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("andrey", true, "123", 5);
		Cliente cliente2 = new Cliente("micheli", true, "456", 10);
		Cliente cliente3 = new Cliente("ruiz", true, "888", 20);
		
		List<Cliente> clientes = List.of(cliente, cliente2, cliente3);
		
		clientes.stream()
                .filter(c -> c.getPontos() > 5)  
                .collect(Collectors.toList())
                .forEach(Cliente::toString);
		
		IntStream stream1 = clientes.stream().mapToInt(Cliente::getPontos);
	}
}
