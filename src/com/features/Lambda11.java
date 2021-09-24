package com.features;

import javax.annotation.Nonnull;

interface Task {
	public void execute(String a,String b);
}
public class Lambda11 {
	
	
    public static void main(String n[]) {
     // var x="Rahul";
    	Task t= (@Nonnull var x,@Nonnull var y)->{
    		System.out.println(x+" is executed");
    		System.out.println(y+" is executed");
    	};
    	
    
    	String x= null;
    	String y="Fun";
    	
    	t.execute(x, y);
    }
}
