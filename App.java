package com.Abcd;
import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class App {
public static void main(String[] args) {
	/* 0. our own functionl interface;
	 * 1. Predicate -> <T> T = .test() arguement type boolen return karunga;
	 * 2. Function -><A,V> A = apply(T t); arguement ka data type . V reuturn type;
	 * 3. Consumer -><A>  accept(T t); "end" . Argument ka data type.
	 * 4. Supplier -> <X> X -> .get() return type.  
	 * 5. BiPredicate -><T,U> T = .test() arguement type boolen return karunga;
	 * 6. BiFunction -><A,B,V> A = apply(T t); arguement ka data type . V reuturn type;
	 * 7. BiConsumer -><A,B>  accept(T t); "end" . Argument ka data type.
	 */


	
	
	
	
	
//1. Lambda expression to sort a string array in alphabetical order
	
	ArrayList<String> strList = new ArrayList<>();
	
	
	strList.add("Dhanajay");
	strList.add("Aman");
	strList.add("lakshay");
	strList.add("Deepshat");
	
	System.out.println(strList);

	
	strList.sort((str1,str2)-> str1.compareTo(str2));
	
	System.out.println(strList);
//	__________________________________________________________________________________	
// 2. Lambda expression to find the largest number in an integer array.
	
	ArrayList<Integer> intList = new ArrayList<>();
	intList.add(12);
	intList.add(5);
	intList.add(55);
	intList.add(34);
	intList.add(10);
	System.out.println(intList);


Integer maxi =Collections.max(intList,(int1,int2)-> int1.compareTo(int2));
System.out.println(maxi);

//	__________________________________________________________________________________
//3. Lambda expression to find the smallest number in an integer array.
	Integer mini =Collections.min(intList,(int1,int2)-> int1.compareTo(int2));
   System.out.println(mini);

//	__________________________________________________________________________________
// 4. Lambda expression to generate a 3 digit random number
//    
   Supplier<Integer> three = () -> (int)(Math.random()*1000);
   System.out.println(three.get());
	
//	__________________________________________________________________________________
	// 5. Lambda expression that takes an integer array and returns the reverse integer array
	   System.out.println(intList);
	   Function< ArrayList<Integer>,List<Integer> > reverse1 = (ar1) ->{
   	return ar1.reversed();
}; 

List<Integer> newList = reverse1.apply(intList);
System.out.println(newList);
//	__________________________________________________________________________________    
//6. Lambda expression to print the current date

Supplier<LocalDate> datewala = ()-> {
	Clock clock = Clock.systemDefaultZone(); 
	LocalDate currentDate = LocalDate.now(clock);
	return currentDate;
};
//	__________________________________________________________________________________
//7. Lambda expression to evaluate if a number entered is a Prime number

System.out.println(datewala.get());
	Predicate<Integer> isPrime= (num) -> {
		
		for(int i =2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	};
	System.out.println(isPrime.test(100));
	

//	__________________________________________________________________________________
//8. Lambda expression to accept 2 strings and return the concatenated value of the same	
	

	BiFunction<String,String,String> KonKat =(str1,str2) -> str1+str2 ;
	
	System.out.println("Aman "+"Ribole");
	
	
	
}



}
