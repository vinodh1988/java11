package com.features;

import java.util.Arrays;
import java.util.List;

public class VarDemo {
   String n="John";
  // var x="John"; not allowed
	public static void run() {
      var a=Double.valueOf(9034.34);
     
      System.out.println(a.getClass().getName());
      var<Integer> x=Arrays.asList(1234,3534,534,566345,3434);
      var p=x;
      List<Integer> ref=x;
      //List<var> ref1=x;  //no var as a generic type
      p.forEach(System.out::println);
      System.out.println(x.getClass().getName());
   
	}
	/*
	public int add(var a,var b) {
		return a+b;
	}
	*/
	//method parameters cannot be var
	public static void main(String n[])
	{
		run();
		System.out.println();
	}
}

