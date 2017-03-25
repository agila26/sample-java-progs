package patterns;
import java.io.*;
import java.io.BufferedReader;

public class RevStrng {
	public static void main(String[]args)throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str=br.readLine();
		int i = str.length();
		StringBuffer strb = new StringBuffer();
		for( int j=i-1; j>=0; j--){
		strb = strb.append(str.charAt(j));
		}
		System.out.println(strb);
		}

}
