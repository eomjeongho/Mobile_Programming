package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddLineNumber {
	 public static void main(String[] args)
	   {
	       String path = AddLineNumber.class.getResource("").getPath();
	       System.out.println(path);

	      try
	      {
	         BufferedReader inputStream = 
	               new BufferedReader(new FileReader(path+"original.txt"));
	         PrintWriter outputStream = 
	               new PrintWriter(new FileOutputStream(path+"numbered.txt"));
	         
	         int num = 1;
	         String s = null;
	         
	         while((s=inputStream.readLine()) != null){
	        	 System.out.println(num);
	        	 String data = num + " " + s;
	        	 outputStream.println(data);
	        	 num++;
	         }
	         
	         inputStream.close( );
	         outputStream.close( );
	      }
	      catch(IOException e){
	    	  System.err.println("Error");
	      }
	   }
}
