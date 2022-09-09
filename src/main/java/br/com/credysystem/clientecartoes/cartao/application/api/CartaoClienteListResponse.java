package br.com.credysystem.clientecartoes.cartao.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.credysystem.clientecartoes.cartao.domain.Cartao;
import lombok.Value;

@Value
public class CartaoClienteListResponse {

	private UUID idCartao;
	private UUID idClienteCartao;
	private double limiteDoCartao;
	private String nomeCompleto;
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraDoCadastro;

	public static List<CartaoClienteListResponse> converte(List<Cartao> cartao) {
		return cartao.stream()
				.map(CartaoClienteListResponse:: new)
				.collect(Collectors.toList());

	}

	public CartaoClienteListResponse(Cartao cartao) {
		this.idCartao = cartao.getIdCartao();
		this.idClienteCartao = cartao.getIdClienteCartao();
		this.limiteDoCartao = getLimiteDoCartao();
		this.nomeCompleto = cartao.getNomeCompleto();
		this.dataNascimento = cartao.getDataNascimento();
		this.dataHoraDoCadastro = cartao.getDataHoraDoCadastro();
	}

}