package com.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
	
	//Transactions(int txId, LocalDate date, float txAmount, boolean txStatus, boolean txArrears)
public static void main(String[] args) {
	ArrayList<Transactions> txnList = new ArrayList<>();
	txnList.add(new Transactions(1,LocalDate.parse("2024-10-12"),5000.43f,true,true));
	txnList.add(new Transactions(2,LocalDate.parse("2025-08-12"),4030.43f,true,true));
	txnList.add(new Transactions(3,LocalDate.parse("2026-05-12"),6000.33f,false,true));
	txnList.add(new Transactions(4,LocalDate.parse("2027-12-12"),5500.43f,true,false));
	txnList.add(new Transactions(5,LocalDate.parse("2023-11-12"),210.43f,true,true));
	
	System.out.println("Getting all the Transactions from the Collection where the txAmount is > 5000");
	Predicate<Transactions> above5000 = Transaction -> ((Transactions)Transaction).getAmount() > 5000 ;
	filter(txnList,above5000);
	
	System.out.println("Getting all the Transactions where the txStatus is false");
	
	Predicate<Transactions> FalseTransaction = Transaction -> Transaction.getStaus()==false ;
	filter(txnList,FalseTransaction);
	
	

	
	
	Amount<Transactions> dueAmm = (transaction) -> { 
		if (transaction.getArrears()) 
		 return transaction.getAmount()*1.18f+500.00f;
		else 
			return transaction.getAmount(); } ;	
	
	System.out.println("Write a Lambda Function to generate the amount due."
					+ " The amount due is calculated as the txAmount + Rs. 500/- + 18% "
					+ "of txAmount if the txArrears is true else if txArrears if false "
					+ "then only the txAmount will be returned\r\n");
	
	
	filterAmount(txnList,dueAmm);
			

}



public static void filter(ArrayList<Transactions> list, Predicate<Transactions> criteria) {
	for(Transactions T : list) {
		if(criteria.test(T)) {
		System.out.println(T.display());
		System.out.println();
		}
	}
}	
	public static void filterAmount(ArrayList<Transactions> list, Amount<Transactions> dueAmm) {
		for(Transactions T : list) { 
			System.out.println(T.display());
			System.out.println("Due Ammount: ");
			System.out.println(dueAmm.Amountdue(T));
			}
		}	
		
}

