package aki1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RonStrng {
public static void main(String[]args) throws IOException
{
	// pgm to sort array of string and print strings matching to a given letter.
	
	System.out.println("Enter the String");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String[] stArray = new String[5];
	
	for(int i=0;i<5;i++)
	{ 
		stArray[i]=br.readLine();
	}
	
		Arrays.sort(stArray);
	
	System.out.println(Arrays.toString(stArray));
	
	System.out.println("Enter the letter ");
	String letter=br.readLine();
	
	 for(String str:stArray)
	    {
	        if(str.substring(0,1).equals(letter))
	     {
	    System.out.println("The names are"+ " : " + str);
	    
	}}
	 {
	// System.out.println("The names are" + stArray);
	

}}}

