package apatis.gitcha.collector.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import apatis.gitcha.collector.model.TickerForCoinone;
import apatis.gitcha.collector.model.TickersForCoinone;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j 
public class CoinoneApiClient {

	private final String API_URL = "https://api.coinone.co.kr/ticker";

	public Mono<TickerForCoinone> getTicker(String currency) {
		 
		log.info("getTicker [ "  + currency);
		
		return WebClient
				.create(API_URL)
				.get() 
				.uri("?currency={currency}", currency) 
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.retrieve()
				.bodyToMono(TickerForCoinone.class);

	}
		
	public Mono<TickersForCoinone> getTickers() {
			
			return WebClient
					.create(API_URL)
					.get()
					.uri("?currency={currency}", "all") 
					.accept(MediaType.APPLICATION_JSON_UTF8)
					.retrieve()
					.bodyToMono(TickersForCoinone.class);
	
	}
}
