package apatis.gitcha.collector.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TickersForBithumb {
	TickerNestForBithumb data;
	String status;
	
	
	@Override
	public String toString() {
		return "TickersForBithumb [data=" + data + ", status=" + status + "]";
	}
	
	
}
