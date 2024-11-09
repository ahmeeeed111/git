package revision;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

	public static void main(String[] args) {

	 BufferedReader reader=null;
	 String FilePath = "C:\\Users\\ahmed\\Desktop\\vergleich\\00.txt";

     try
     {
    	 reader=new BufferedReader(new FileReader(FilePath));
    	 String next;
    	 while((next=reader.readLine())!=null)
    	 {
    		 System.out.println(next);
			 System.out.println("Version3"); 
    	 }
    	 
     }
     catch(IOException e)
     {
    	 System.out.println("File import error");
     }
     finally
     {
    	 if(reader!=null)
    	 {
    		 try
    		 {
    			 reader.close();
    		 }
    		 catch(Exception e)
    		 {
    			 System.out.println("Error");
    		 }
    	 }
     }
	}
	

}
