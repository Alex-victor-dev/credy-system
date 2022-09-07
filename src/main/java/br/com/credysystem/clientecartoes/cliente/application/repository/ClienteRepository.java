package br.com.credysystem.clientecartoes.cliente.application.repository;

import java.util.List;

import br.com.credysystem.clientecartoes.cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente salva(Cliente cliente);

	List<Cliente> buscaTodosClientes();

}
