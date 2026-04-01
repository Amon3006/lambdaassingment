package com.lambda;

import java.time.LocalDate;
import java.util.Iterator;

public class Transactions{

	int txId;
	LocalDate Date;
	float txAmount ;
	boolean txStatus; 
	boolean txArrears;
	public Transactions(int txId, LocalDate date, float txAmount, boolean txStatus, boolean txArrears) {
		super();
		this.txId = txId;
		Date = date;
		this.txAmount = txAmount;
		this.txStatus = txStatus;
		this.txArrears = txArrears;
	}
	public float getAmount(){
		return txAmount;
	}
	
	public boolean getArrears() {
		return txArrears;
	}
	public boolean getStaus() {
		return txStatus;
	}
	
	public String display() {
		StringBuffer str = new StringBuffer();
		str.append("txId :");
		str.append(txId);
		str.append('\n');
		str.append("Date : ");
		str.append(Date.toString());
		str.append('\n');
		str.append("Amount :");
		str.append(txAmount);
		str.append('\n');
		str.append("Status :");
		str.append(txStatus);
		str.append('\n');
		str.append("Arrers :");
		str.append(txArrears);
		
		return str.toString();
	}


	
	
	
	
}
