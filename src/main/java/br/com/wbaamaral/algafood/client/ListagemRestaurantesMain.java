package br.com.wbaamaral.algafood.client;

import org.springframework.web.client.RestTemplate;

import br.com.wbaamaral.algafood.client.api.ClientApiException;
import br.com.wbaamaral.algafood.client.api.RestauranteClient;

public class ListagemRestaurantesMain {

	private static final String URL_BASE = "http://api.algafood.local:8080";

	public static void main(String[] args) {

		try {

			RestTemplate restTemplate = new RestTemplate();

			RestauranteClient restauranteClient = new RestauranteClient(
					restTemplate, URL_BASE);

			restauranteClient.listar().stream()
				.forEach(restaurante -> System.out.println(restaurante));
			
		} catch (ClientApiException e) {
			
			if (e.getProblem() != null) {
				
				// System.out.println(e.getProblem());
				System.out.println(e.getProblem().getUserMessage());
				
			} else {
				
				System.out.println("Erro desconhecido");
				e.printStackTrace();
				
			}
		}

	}
}
