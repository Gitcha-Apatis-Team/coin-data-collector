package apatis.gitcha.collector.model;

import java.io.Serializable;

import apatis.gitcha.collector.entity.Ticker;
import lombok.Data;

@Data
public class TickerForCoinone implements Serializable{
	
	private String errorCode;
	private String result;
	
	private Long high;
	private Long low;
	private Long last;
	private Long first;
	private String volume;
	
	private Long yesterday_high;
	private Long yesterday_low;
	private Long yesterday_first;
	private Long yesterday_last;
	private Double yesterday_volume;
	private Long timestamp;
	private String currency;
	
	public Ticker getTicker() {
		Ticker ticker = new Ticker();
		ticker.setErrorCode(this.errorCode);
		ticker.setResult(this.result);

		ticker.setHigh(this.high);
		ticker.setLow(this.low);
		ticker.setLast(this.last);
		ticker.setFirst(this.first);
		ticker.setVolume(this.volume);
		
		ticker.setYesterday_high(this.yesterday_high);
		ticker.setYesterday_low(this.yesterday_low);
		ticker.setYesterday_first(this.yesterday_first);
		ticker.setYesterday_last(this.yesterday_last);
		ticker.setYesterday_volume(this.yesterday_volume);
		
		ticker.setTimestamp(this.timestamp);
		ticker.setCurrency(this.currency);
		return ticker;
	}
	
}