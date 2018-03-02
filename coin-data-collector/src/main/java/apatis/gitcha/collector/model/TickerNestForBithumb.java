package apatis.gitcha.collector.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import apatis.gitcha.collector.entity.Currency;
import apatis.gitcha.collector.entity.TickerBithumb;
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
	private TickerForBithumb btc;

	@JsonProperty("BCH")
	private TickerForBithumb bch;
	@JsonProperty("BTG")
	private TickerForBithumb btg;

	@JsonProperty("DASH")
	private TickerForBithumb dash;

	@JsonProperty("EOS")
	private TickerForBithumb eos;

	@JsonProperty("ETC")
	private TickerForBithumb etc;

	@JsonProperty("ETH")
	private TickerForBithumb eth;

	@JsonProperty("LTC")
	private TickerForBithumb ltc;

	@JsonProperty("QTUM")
	private TickerForBithumb qtum;

	@JsonProperty("XMR")
	private TickerForBithumb xmr;

	@JsonProperty("XRP")
	private TickerForBithumb xrp;

	@JsonProperty("ZEC")
	private TickerForBithumb zec;

	private String date;

	public List<TickerBithumb> getTickers() {
		ArrayList<TickerBithumb> tickerBithumbs = new ArrayList<>();
		TickerBithumb btc = this.btc.getTicker();
		TickerBithumb btg = this.btg.getTicker();
		TickerBithumb bch = this.bch.getTicker();
		TickerBithumb dash = this.dash.getTicker();
		TickerBithumb eos = this.eos.getTicker();
		TickerBithumb etc = this.etc.getTicker();
		TickerBithumb eth = this.eth.getTicker();
		TickerBithumb ltc = this.ltc.getTicker();
		TickerBithumb qtum = this.qtum.getTicker();
		TickerBithumb xmr = this.xmr.getTicker();
		TickerBithumb xrp = this.xrp.getTicker();
		TickerBithumb zec = this.zec.getTicker();

		btc.setDate(this.date);
		btg.setDate(this.date);
		bch.setDate(this.date);
		dash.setDate(this.date);
		eos.setDate(this.date);
		etc.setDate(this.date);
		eth.setDate(this.date);
		ltc.setDate(this.date);
		qtum.setDate(this.date);
		xmr.setDate(this.date);
		xrp.setDate(this.date);
		zec.setDate(this.date);

		btc.setCurrency(Currency.BCH.getName());
		btg.setCurrency(Currency.BTG.getName());
		btc.setCurrency(Currency.BTC.getName());
		btg.setCurrency(Currency.BTG.getName());
		bch.setCurrency(Currency.BCH.getName());
		dash.setCurrency(Currency.DASH.getName());
		eos.setCurrency(Currency.EOS.getName());
		etc.setCurrency(Currency.ETC.getName());
		eth.setCurrency(Currency.ETH.getName());
		ltc.setCurrency(Currency.LTC.getName());
		qtum.setCurrency(Currency.QTUM.getName());
		xmr.setCurrency(Currency.XMR.getName());
		xrp.setCurrency(Currency.XRP.getName());
		zec.setCurrency(Currency.ZEC.getName());

		tickerBithumbs.add(btc);
		tickerBithumbs.add(btg);
		tickerBithumbs.add(bch);
		tickerBithumbs.add(dash);
		tickerBithumbs.add(eos);
		tickerBithumbs.add(etc);
		tickerBithumbs.add(eth);
		tickerBithumbs.add(ltc);
		tickerBithumbs.add(qtum);
		tickerBithumbs.add(xmr);
		tickerBithumbs.add(xrp);
		tickerBithumbs.add(zec);
		return tickerBithumbs;
	}

}
