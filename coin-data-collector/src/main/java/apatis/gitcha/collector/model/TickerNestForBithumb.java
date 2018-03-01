package apatis.gitcha.collector.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;

/**
 * @author kira
 *
 */
@Data
@ToString
public class TickerNestForBithumb {
	@JsonProperty("BTC")
	TickerForBithumb btc;
	
	@JsonProperty("BCH")
	TickerForBithumb bch;
	@JsonProperty("BTG")
	TickerForBithumb btg;
	
	@JsonProperty("DASH")
	TickerForBithumb dash;
	
	@JsonProperty("EOS")
	TickerForBithumb eos;
	
	@JsonProperty("ETC")
	TickerForBithumb etc;
	
	@JsonProperty("ETH")
	TickerForBithumb eth;
	
	@JsonProperty("LTC")
	TickerForBithumb ltc;
	
	@JsonProperty("QTUM")
	TickerForBithumb qtum;
	
	@JsonProperty("XMR")
	TickerForBithumb xmr;
	
	@JsonProperty("XRP")
	TickerForBithumb xrp;
	
	@JsonProperty("ZEC")
	TickerForBithumb zec;
	
	String date;
	
	
	
}
