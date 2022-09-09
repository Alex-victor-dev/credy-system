package br.com.credysystem.clientecartoes.cartao.application.service;

import java.util.UUID;

import br.com.credysystem.clientecartoes.cartao.application.api.CartaoRequest;
import br.com.credysystem.clientecartoes.cartao.application.api.CartaoResponse;

public interface CartaoService {

	CartaoResponse criaCartao(UUID idCliente, CartaoRequest cartaoRequest);

}
