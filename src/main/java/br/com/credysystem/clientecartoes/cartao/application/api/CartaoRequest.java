package br.com.credysystem.clientecartoes.cartao.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Value;

@Value
public class CartaoRequest {

	private double limiteDoCartao;
	@CPF
	@NotBlank
	private String cpf;
	@NotNull
	private String nomeCompleto;
	@NotNull
	private LocalDate dataNascimento;

}
