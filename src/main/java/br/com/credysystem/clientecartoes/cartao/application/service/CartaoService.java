package br.com.credysystem.clientecartoes.cartao.application.service;

import java.util.List;
import java.util.UUID;

import br.com.credysystem.clientecartoes.cartao.application.api.CartaoClienteListResponse;
import br.com.credysystem.clientecartoes.cartao.application.api.CartaoRequest;
import br.com.credysystem.clientecartoes.cartao.application.api.CartaoResponse;

public interface CartaoService {

	CartaoResponse criaCartao(UUID idCliente, CartaoRequest cartaoRequest);

	List<CartaoClienteListResponse> buscaCartaoDosClientes(UUID idCliente);

}
