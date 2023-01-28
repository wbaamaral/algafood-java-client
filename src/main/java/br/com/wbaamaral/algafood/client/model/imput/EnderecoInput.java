package br.com.wbaamaral.algafood.client.model.imput;

import lombok.Data;

@Data
public class EnderecoInput {

   private String cep;
   private String logradouro;
   private String numero;
   private String bairro;
   private CidadeIdInput cidade;
}
