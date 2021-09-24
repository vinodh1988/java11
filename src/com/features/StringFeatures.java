package com.features;



public class StringFeatures {
   public static void StringValidator(String n) {
	   if(n==null || n.length()==0)
		   System.out.println("Invalid String");
	   else
		   System.out.println("Valid String");
   }
   
   public static void StringValidator2(String n) {
	   if(n==null || n.isBlank())  
		   System.out.println("Invalid String");
	   else
		   System.out.println("Valid String");
  
   }
   public static void main(String n[]) {
	   StringValidator("nano");
	   StringValidator("");
	   StringValidator("    ");
	   StringValidator("\t \t");
	   StringValidator("\n"); 
	   StringValidator(null);
	   System.out.println("---------------------------------------");
	   StringValidator2("nano");
	   StringValidator2("");
	   StringValidator2("    ");
	   StringValidator2("\t \t");
	   StringValidator2("\n"); 
	   StringValidator2(null);
   }
}
