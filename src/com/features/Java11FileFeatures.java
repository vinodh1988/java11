package com.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java11FileFeatures {
    public static void main(String n[]) {
    Path p=Paths.get("e:/created.txt");
    	try {
			//Files.writeString(p,"Write it Write it Write it Write it....");
			String s= Files.readString(p);
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
