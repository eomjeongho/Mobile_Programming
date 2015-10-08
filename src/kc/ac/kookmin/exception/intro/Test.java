package kc.ac.kookmin.exception.intro;

import java.io.*;

class Trade{
	
	public void readFile(){
		String path = Trade.class.getResource("").getPath();
		
		FileReader fr = null;
		
		try{
			fr = new FileReader(path + "a.txt");
			
			while(true){
				int ch = fr.read();
				if(ch == -1)
					break;
				System.out.print((char)ch);
			}
		}
		catch(IOException e){
			System.err.println("Input Error");
		}
		finally{
			try{
				fr.close();
			}
			catch(Exception e){
				System.err.println("Close Error");
			}
		}
	}
}

public class Test {
	public static void main(String args[]) {
    	Trade a = new Trade();
    	a.readFile();
    }
}
