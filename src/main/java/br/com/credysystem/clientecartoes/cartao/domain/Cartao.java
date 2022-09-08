package br.com.credysystem.clientecartoes.cartao.domain;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "UUID", name = "idCliente", updatable = false, unique = true, nullable = false)
	private UUID idCartao;
	private UUID idCliente;
	private Integer limiteDoCartao;
	@CPF
	@Column(unique = true)
	private String cpf;
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private Integer salario;
	private LocalDate dataNascimento;

}
