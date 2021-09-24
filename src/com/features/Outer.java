package com.features;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Outer {
	
   private void show() {
	   System.out.println("This is a private method");
   }
   public static class A{
	   private void method() {
	   System.out.println("This is a real method");
	   }
   }
   public static class Inner{
	   
	   public void caller() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		   A obj=new A();
		   final Method m= A.class.getDeclaredMethod("method");
		   m.invoke(obj);
	   }
	 
   }
   
   public static void main(String n[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	   Inner i=new Inner();
	   i.caller();
   }
   
   
}
