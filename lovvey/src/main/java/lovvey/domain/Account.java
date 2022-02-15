package lovvey.domain;

import lombok.Data;
import lombok.Getter;



public class Account {

	private String busiNum;
	private String factory;
	private String tradeBank;
	private String accountNum;
	
	public Account() {}
	
	public Account(String busiNum, String factory, String tradeBank, String accountNum) {
		this.busiNum = busiNum;
		this.factory = factory;
		this.tradeBank = tradeBank;
		this.accountNum = accountNum;
	}

	
	public String getBusiNum() {
		return busiNum;
	}

	public String getFactory() {
		return factory;
	}

	public String getTradeBank() {
		return tradeBank;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void deleteBusiNum(String busiNum) {
		this.busiNum=busiNum;
	}
	@Override
	public String toString() {
		return "Account [busiNum=" + busiNum + ", factory=" + factory + ", tradeBank=" + tradeBank + ", accountNum="
				+ accountNum + "]";
	}
	
	
	
	
	
	
	
	
}
