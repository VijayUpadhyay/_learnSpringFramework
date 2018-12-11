package com.vijay.mkyong.springTest;

public class Transaction {
	
	private String txnId;
	private int fromId,toId,amount;
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	public int getFromId() {
		return fromId;
	}
	public void setFromId(int fromId) {
		this.fromId = fromId;
	}
	public int getToId() {
		return toId;
	}
	public void setToId(int toId) {
		this.toId = toId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [txnId=" + txnId + ", fromId=" + fromId + ", toId="
				+ toId + ", amount=" + amount + "]";
	}
	
	
	
	
	
	

}
