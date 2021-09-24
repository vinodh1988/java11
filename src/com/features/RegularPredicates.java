package com.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegularPredicates {
   public static void main(String n[]) {
	  Predicate<String> nameFilter= Pattern.compile("^[A-F][a-z]+[nekr]$").asPredicate();
	  
	  List<String> names= Arrays.asList("Akram","Arun","Shahul","Naveen","Roger","Christorpher",
			  "Joseph","Apple","Buy","Bun");
	  
	  List<String> filteredNames=  names.stream().filter(nameFilter).collect(Collectors.<String>toList());
	  
      filteredNames.forEach(System.out::println);
	  
	  System.out.println("-----------------------------");
	  String[] strings = filteredNames.toArray(String[]::new);
	  
	  
	  for(var x:strings) //java 10
		  System.out.println(x);
   }
}
