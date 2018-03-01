package apatis.gitcha.collector.intergration;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import apatis.gitcha.collector.client.BithumbApiClient;
import apatis.gitcha.collector.client.CoinoneApiClient;
import apatis.gitcha.collector.repository.CoinRepository;
import lombok.extern.slf4j.Slf4j;
/**
 * 
 *  거래소 별로 API를 호출하여 데이터를 적재하는 스케줄러 구현
 * @author kira
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
	private CoinRepository coinRepository;
	
	@Autowired
	OutboundWebsoket outboundWebsoket;

	@Scheduled(fixedDelay = 2000)
	public void getTickersAboutCoinOne() throws InterruptedException, ExecutionException {

		coinoneApiClient.getTickers()
		.doOnError((ex) -> {
			log.error("API 통신 중 에러가 발생했습니다.", ex);
		}).doOnSuccess((tickers) -> {
				log.info(tickers.toString());
				 
				coinRepository.saveAll(tickers.getTickers());
				
		}).doFinally((sianlType) -> {
			// log.info(sianlType.toString());
		})
		
		.subscribe();

	}
	
	// @Scheduled(fixedDelay = 2000)
	public void getTickersAboutBithumb() throws InterruptedException, ExecutionException { 
		bithumbApiClient.getTickers()
		.doOnError((ex) -> {
			log.error("API 통신 중 에러가 발생했습니다.", ex);
		}).doOnSuccess((tickers) -> {
			// try {
				//log.info(tickers.toString());
				// outboundWebsoket.sendTikers(tickers);
			//} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
		   //		e.printStackTrace();
			// }
		}).doFinally((sianlType) -> {
			// log.info(sianlType.toString());
		}).subscribe();
	}
	
}
