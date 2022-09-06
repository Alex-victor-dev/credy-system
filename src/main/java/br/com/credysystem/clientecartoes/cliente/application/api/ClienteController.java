package br.com.credysystem.clientecartoes.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - criaCliente");
		log.info("[finaliza] ClienteController - criaCliente");
		return null;
	}

}
