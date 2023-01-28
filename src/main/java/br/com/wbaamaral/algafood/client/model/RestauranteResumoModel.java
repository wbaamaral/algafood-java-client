package br.com.wbaamaral.algafood.client.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class RestauranteResumoModel {

   private Long id;
   private String nome;
   private CozinhaResumoModel cozinha;
   private BigDecimal taxaFrete;
   
}
