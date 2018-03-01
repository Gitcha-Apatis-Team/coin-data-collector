package apatis.gitcha.collector.intergration;

import java.net.URI;
import java.net.URISyntaxException;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.client.ReactorNettyWebSocketClient;
import org.springframework.web.reactive.socket.client.WebSocketClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import apatis.gitcha.collector.model.TickersForCoinone;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Component
@Slf4j
public class OutboundWebsoket {
	public void sendTikers(TickersForCoinone tickers) throws URISyntaxException {
		WebSocketClient webSocketClient = new ReactorNettyWebSocketClient();
		
		 URI url = new URI("ws://localhost:8080/ws");
			webSocketClient.execute(url, (session) -> {
				Publisher<WebSocketMessage> messages =  Flux.create((sink)->{
//					log.info("\n");
//					log.info(tickers.toString());
//					log.info("\n");
					ObjectMapper mapper = new ObjectMapper();
				
					try {
						sink.next(session.textMessage(	mapper.writeValueAsString(tickers) ));
					} catch (JsonProcessingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				return session.send(messages);
			}).subscribe();
			
	

	}
}
