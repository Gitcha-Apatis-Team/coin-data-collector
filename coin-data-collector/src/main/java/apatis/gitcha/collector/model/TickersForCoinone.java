package apatis.gitcha.collector.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import apatis.gitcha.collector.entity.TickerCoinOne;
import lombok.Data;

@Data
public class TickersForCoinone implements Serializable {

	private String errorCode;
	private String result;
	private Long timestamp;

	private TickerForCoinone bch;
	private TickerForCoinone eth;
	private TickerForCoinone etc;
	private TickerForCoinone xrp;
	private TickerForCoinone qtum;
	private TickerForCoinone ltc;
	private TickerForCoinone iota;
	private TickerForCoinone btg;

	public List<TickerCoinOne> getTickers() {
		List<TickerCoinOne> tickers = new ArrayList<TickerCoinOne>();

		TickerCoinOne bch = this.bch.getTicker();
		TickerCoinOne eth = this.eth.getTicker();
		TickerCoinOne etc = this.etc.getTicker();
		TickerCoinOne xrp = this.xrp.getTicker();
		TickerCoinOne qtum = this.qtum.getTicker();
		TickerCoinOne ltc = this.ltc.getTicker();
		TickerCoinOne iota = this.iota.getTicker();
		TickerCoinOne btg = this.btg.getTicker();

		bch.setErrorCode(this.errorCode);
		eth.setErrorCode(this.errorCode);
		etc.setErrorCode(this.errorCode);
		xrp.setErrorCode(this.errorCode);
		qtum.setErrorCode(this.errorCode);
		ltc.setErrorCode(this.errorCode);
		iota.setErrorCode(this.errorCode);
		btg.setErrorCode(this.errorCode);

		bch.setResult(this.result);
		eth.setResult(this.result);
		etc.setResult(this.result);
		xrp.setResult(this.result);
		qtum.setResult(this.result);
		ltc.setResult(this.result);
		iota.setResult(this.result);
		btg.setResult(this.result);

		bch.setTimestamp(this.timestamp);
		eth.setTimestamp(this.timestamp);
		etc.setTimestamp(this.timestamp);
		xrp.setTimestamp(this.timestamp);
		qtum.setTimestamp(this.timestamp);
		ltc.setTimestamp(this.timestamp);
		iota.setTimestamp(this.timestamp);
		btg.setTimestamp(this.timestamp);

		tickers.add(bch);
		tickers.add(eth);
		tickers.add(etc);
		tickers.add(xrp);
		tickers.add(qtum);
		tickers.add(ltc);
		tickers.add(iota);
		tickers.add(btg);

		return tickers;
	}
}
