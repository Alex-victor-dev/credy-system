package br.com.credysystem.clientecartoes.cliente.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.credysystem.clientecartoes.cliente.application.repository.ClienteRepository;
import br.com.credysystem.clientecartoes.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJpaRepository clienteSpringDataJpaRepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSpringDataJpaRepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
		List<Cliente> cliente = clienteSpringDataJpaRepository.findAll();
		log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
		return cliente;
	}

}
