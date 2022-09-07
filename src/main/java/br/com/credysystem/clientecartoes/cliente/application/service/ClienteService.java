package br.com.credysystem.clientecartoes.cliente.application.service;

import java.util.List;

import javax.validation.Valid;

import br.com.credysystem.clientecartoes.cliente.application.api.ClienteListResponse;
import br.com.credysystem.clientecartoes.cliente.application.api.ClienteRequest;
import br.com.credysystem.clientecartoes.cliente.application.api.ClienteResponse;

public interface ClienteService {

	List<ClienteListResponse> buscaListaDeClientes();

	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);

}
