package apatis.gitcha.collector.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import apatis.gitcha.collector.model.TickerForBithumb;
import apatis.gitcha.collector.model.TickersForBithumb;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j 
public class BithumbApiClient {
	private final String API_URL = "https://api.bithumb.com/public/ticker/";
	
	public Mono<TickerForBithumb> getTicker(String currency) {
		 
		log.info("getTicker [ "  + currency);
		
		return WebClient
				.create(API_URL)
				.get() 
				.uri("{currency}", currency) 
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.retrieve()
				.bodyToMono(TickerForBithumb.class);

	}
	
	public Mono<TickersForBithumb> getTickers() {
		
		return WebClient
				.create(API_URL)
				.get()
				.uri("{currency}", "all") 
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.retrieve()
				.bodyToMono(TickersForBithumb.class)
				;

	}

}
