package apatis.gitcha.collector.entity;

import lombok.Getter;

@Getter
public enum Currency {
   
	BTC("btc")
  ,	BCH("bch")
  ,	BTG("btg")
  ,	DASH("dash")
  , EOS("eos")
  ,	ETC("etc")
  ,	ETH("eth")
  ,	LTC("ltc")
  ,	QTUM("qtum")
  ,	XMR("xmr")
  ,	XRP("xrp")
  ,	ZEC("zec");
	
	private String name;
	
	Currency(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
