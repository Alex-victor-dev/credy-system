package br.com.credysystem.clientecartoes.cartao.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.credysystem.clientecartoes.cartao.application.service.CartaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
public class CartaoController implements CartaoAPI {

	private final CartaoService cartaoService;

	@Override
	public CartaoResponse criaCartao(UUID idCliente, @Valid CartaoRequest cartaoRequest) {
		log.info("[inicia] CartaoController - criaCartao");
		CartaoResponse cartaoCriado = cartaoService.criaCartao(idCliente, cartaoRequest);
		log.info("[finaliza] CartaoController - criaCartao");
		return cartaoCriado;
	}

}
