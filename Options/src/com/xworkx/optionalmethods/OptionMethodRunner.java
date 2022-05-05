package com.xworkx.optionalmethods;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionMethodRunner {

	public static void main(String[] args) {
		
		
		
		String[] names= {"Myname","Yourname","Hisname","Hername","Theirname","",null};
		
		System.out.println(names[5].isEmpty());
		System.out.println(Optional.of(names[5]).isPresent());
		
		Optional<String> name1=Optional.of(names[1]);
		
		Optional<String> filterReturn=name1.filter(check->check=="Yourname");
		System.out.println(filterReturn);
		
		System.out.println(Optional.empty());
		
		Optional<String> name2=Optional.ofNullable(names[6]);
		System.out.println(name2);
		
		System.out.println(name1.get());
		
		name1.ifPresent(name->System.out.println(name.toUpperCase()));
		
		String name3= name2.orElse("Anyone");
        System.out.println(name3);	
        
        String newName=name2.orElseGet(()->"Newname");
        System.out.println(newName);
		
		name2.orElseThrow(ArithmeticException:: new);
		
	
		
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
       
//         Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
          
//        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
//  
        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
//  
        System.out.println("The Structure before flattening is  " +
                                                  listOfListofInts);
//          
//        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                                    .flatMap(list -> list.stream())
                                    .collect(Collectors.toList());
//  
       System.out.println("The Structure after flattening is : " +
                                                        listofInts);
		
	}
}
