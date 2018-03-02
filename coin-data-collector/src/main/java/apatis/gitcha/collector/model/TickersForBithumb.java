package apatis.gitcha.collector.model;

import lombok.Data;
import lombok.ToString;

@Data
public class TickersForBithumb {
	private TickerNestForBithumb data;
	private String status;
	
	@Override
	public String toString() {
		return "TickersForBithumb [data=" + data + ", status=" + status + "]";
	}
	
	
}
