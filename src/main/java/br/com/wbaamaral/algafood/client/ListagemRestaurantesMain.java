package br.com.wbaamaral.algafood.client;

import org.springframework.web.client.RestTemplate;

import br.com.wbaamaral.algafood.client.api.RestauranteClient;

public class ListagemRestaurantesMain {

   private static final String URL_BASE = "http://api.algafood.local:8080";

   public static void main(String[] args) {

      RestTemplate restTemplate = new RestTemplate();

      RestauranteClient restauranteClient = new RestauranteClient(URL_BASE, restTemplate);

      restauranteClient.listar().stream().forEach(restaurante -> System.out.println(restaurante));

   }
}
