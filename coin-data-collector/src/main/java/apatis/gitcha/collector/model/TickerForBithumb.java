package apatis.gitcha.collector.model;

import apatis.gitcha.collector.entity.TickerBithumb;
import lombok.Data;
@Data
public class TickerForBithumb {

	private String opening_price;
	private String average_price;
	private String buy_price;
	private String closing_price;
	private String max_price;
	private String min_price;
	private String sell_price;
	private String units_traded;
	private String volume_1day;
	private String volume_7day;
	
	public TickerBithumb getTicker() {
		TickerBithumb tickerBithumb = new TickerBithumb();
		tickerBithumb.setOpening_price(this.opening_price);
		tickerBithumb.setAverage_price(this.average_price);
		tickerBithumb.setBuy_price(this.buy_price);
		tickerBithumb.setClosing_price(this.closing_price);
		tickerBithumb.setMax_price(this.max_price);
		tickerBithumb.setMin_price(this.min_price);
		tickerBithumb.setSell_price(this.sell_price);
		tickerBithumb.setUnits_traded(this.units_traded);
		tickerBithumb.setVolume_1day(this.volume_1day);
		tickerBithumb.setVolume_7day(this.volume_7day);
		return tickerBithumb;
	}
	
}
