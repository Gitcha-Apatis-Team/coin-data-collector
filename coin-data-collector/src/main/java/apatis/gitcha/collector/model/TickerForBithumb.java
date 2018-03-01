package apatis.gitcha.collector.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;
@Entity
@Table(name = "coinInfo")
@Data
@ToString
public class TickerForBithumb {
	@Id
	@GeneratedValue
	Long id;
	String opening_price;
	String average_price;
	String buy_price;
	String closing_price;
	String max_price;
	String min_price;
	String sell_price;
	String units_traded;
	String volume_1day;
	String volume_7day;
	
	
	
	
	
}
