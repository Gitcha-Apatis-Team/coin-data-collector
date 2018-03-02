package apatis.gitcha.collector.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TickerCoinOne {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	
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
		
}
