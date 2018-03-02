package apatis.gitcha.collector.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TickerBithumb {
	@Id
	@GeneratedValue
	private Long id;
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
	private String date;
	private String currency;
	
}
