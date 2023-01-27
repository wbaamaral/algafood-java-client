package br.com.wbaamaral.algafood.client.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class RestauranteModel {
   private Long id;
   private String nome;
   private BigDecimal taxaFrete;
   private Boolean ativo;
   private Boolean aberto;

   private CozinhaResumoModel cozinha;
   private EnderecoModel endereco;
}
