package com.Abcd;
import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.BiFunction;
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


	
	
	
	
	

	
	ArrayList<String> strList = new ArrayList<>();
	
	
	strList.add("Dhanajay");
	strList.add("Aman");
	strList.add("lakshay");
	strList.add("Deepshat");
	
	System.out.println(strList);

	
	strList.sort((str1,str2)-> str1.compareTo(str2));
	
	System.out.println(strList);
	
	
	ArrayList<Integer> intList = new ArrayList<>();
	intList.add(12);
	intList.add(5);
	intList.add(55);
	intList.add(34);
	intList.add(10);
//	System.out.println(intList);

	
//	Integer maxi =Collections.max(intList,(int1,int2)-> int1.compareTo(int2));
//	Integer mini =Collections.min(intList,(int1,int2)-> int1.compareTo(int2));
//    System.out.println(maxi);
//    System.out.println(mini);

	
//	__________________________________________________________________________________
//    
//    Supplier<Integer> three = () -> (int)(Math.random()*1000);
//    
//    System.out.println(three.get());
	
//	__________________________________________________________________________________
	
//    System.out.println(intList);
//    Function< ArrayList<Integer>,List<Integer> > reverse1 = (ar1) ->{
//    	return ar1.reversed();
//    }; 
//    
//    
//    List<Integer> newList = reverse1.apply(intList);
//    System.out.println(newList);
//    
    
    
    
	Predicate<Integer> isPrime= (num) -> {
		
		for(int i =2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	};
	
	

	System.out.println(isPrime.test(100));
	

	
	Supplier<LocalDate> datewala = ()-> {
		Clock clock = Clock.systemDefaultZone(); 
		LocalDate currentDate = LocalDate.now(clock);
		return currentDate;
	};
	
	System.out.println(datewala.get());
	
	

	BiFunction<String,String,String> KonKat =(str1,str2) -> str1+str2 ;
	
	System.out.println("Aman "+"Ribole");
	
	
	
}



}
