package apatis.gitcha.collector.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import apatis.gitcha.collector.entity.Ticker;
import lombok.Data;

@Data
public class TickersForCoinone implements Serializable{

	String errorCode;
	String result;
	
	TickerForCoinone bch;
	TickerForCoinone eth;
	TickerForCoinone etc;
	TickerForCoinone xrp;
	TickerForCoinone qtum;
	TickerForCoinone ltc;
	TickerForCoinone iota;
	TickerForCoinone btg;
	
	public List<Ticker> getTickers() {
		List<Ticker> tickers = new ArrayList<Ticker>();
		tickers.add(bch.getTicker()); 
		tickers.add(eth.getTicker()); 
		tickers.add(etc.getTicker()); 
		tickers.add(xrp.getTicker()); 
		tickers.add(qtum.getTicker());
		tickers.add(ltc.getTicker()); 
		tickers.add(iota.getTicker());
		tickers.add(btg.getTicker()); 
		return tickers;
	}
}
