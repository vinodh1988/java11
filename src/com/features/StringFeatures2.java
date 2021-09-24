package com.features;

import java.util.List;
import java.util.stream.Collectors;

public class StringFeatures2 {
	
	public static void main(String n[]) {
		String story="Once upon a time       "
				+"\n  String       test "+
				"\n\t\t\tStory is\t\t\t running\t\t "+
				"\n\t\tMore String more String     "
				+"We are coming to an end       ";
		
		List<String> list=story.lines().collect(Collectors.toList());
		list.forEach(x->System.out.println(x.strip()+ "/"));
		
		//stripLeading and stripTrailing
		String pattern="-*-";
		for(int x=1;x<=10;x++)
		    System.out.println( pattern.repeat(x));
	}

}
