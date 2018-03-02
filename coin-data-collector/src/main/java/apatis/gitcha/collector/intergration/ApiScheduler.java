package apatis.gitcha.collector.intergration;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import apatis.gitcha.collector.client.BithumbApiClient;
import apatis.gitcha.collector.client.CoinoneApiClient;
import apatis.gitcha.collector.repository.BithumbRepository;
import apatis.gitcha.collector.repository.CoinOneRepository;
import lombok.extern.slf4j.Slf4j;
/**
 * 
 *  거래소 별로 API를 호출하여 데이터를 DB 적재하는 스케줄러 구현
 * @author ByeongGiKim
 *
 */
@Component
@Slf4j
public class ApiScheduler {

	@Autowired
	private CoinoneApiClient coinoneApiClient;
	@Autowired 
	private BithumbApiClient  bithumbApiClient;
	
   @Autowired
	private CoinOneRepository coinOneRepository;
	@Autowired
   private BithumbRepository bithumbRepository;
   
	@Autowired
	OutboundWebsoket outboundWebsoket;

	@Scheduled(fixedDelay = 2000)
	public void getTickersAboutCoinOne() throws InterruptedException, ExecutionException {

		coinoneApiClient.getTickers()
		.doOnError((ex) -> {
			log.error("API 통신 중 에러가 발생했습니다.", ex);
		}).doOnSuccess((tickers) -> {
				
			if(log.isInfoEnabled()) log.info(tickers.getTickers().toString());
			
			coinOneRepository.saveAll(tickers.getTickers());
				
		}).subscribe();

	}
	
	@Scheduled(fixedDelay = 2000) 
	public void getTickersAboutBithumb() throws InterruptedException, ExecutionException { 
		bithumbApiClient.getTickers()
		.doOnError((ex) -> {
			log.error("API 통신 중 에러가 발생했습니다.", ex);
		}).doOnSuccess((tickers) -> {
			if(log.isInfoEnabled()) log.info(tickers.toString());
			
			bithumbRepository.saveAll(tickers.getData().getTickers());
			
		}).subscribe();
	}
	
}
