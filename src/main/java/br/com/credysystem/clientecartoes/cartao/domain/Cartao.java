package br.com.credysystem.clientecartoes.cartao.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.credysystem.clientecartoes.cartao.application.api.CartaoRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCartao", updatable = false, unique = true, nullable = false)
	private UUID idCartao;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idClienteCartao", nullable = false)
	private UUID idClienteCartao;
	@Enumerated(EnumType.STRING)
	private Bandeira bandeiraCartao;
	private Double limiteTotal;

	public Cartao(UUID idCliente, CartaoRequest cartaoRequest) {
		this.idClienteCartao = idCliente;
		this.bandeiraCartao = cartaoRequest.getBandeiraCartao();
		this.limiteTotal = cartaoRequest.getLimiteTotal();

	}

}
