package aki1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RonAddtn {
	public static void main(String[]args) throws NumberFormatException, IOException
	{
		System.out.println("Enter the number");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(br.readLine());
	    for(int i=1;i<n;i++)
	    {
	        int k=n-i;
	        
	        System.out.println(i+"+"+k);
	       // System.out.println(length(k));
	    }}   }