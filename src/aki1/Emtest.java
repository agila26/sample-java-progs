package aki1;

import java.util.*;
import java.io.*;
 class Emm
{

	String name;
	int age;
	int sal;
	int amt;
	String desig;
	public void enter()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	name=sc.next();
	System.out.println("Enter age");
	age=sc.nextInt();
	}

	
	public void display()
	{
	System.out.println("Name:  "+name);
	System.out.println("age:  "+age);
	System.out.println("salary:  "+sal);
	System.out.println("Desig:  "+desig);
	}

	public void raiseSal()
	{
	System.out.println("-----------After Salary Appraisal------------");
	sal=sal+amt;
	display();
	}
}
	class Clerk extends Emm
	{

	Clerk(){
	  sal=8000;
	  desig= "clerk";
	 amt=2000;
}
	}


	  class Prog extends Emm
	{
	
	Prog()
	{
	
 	 sal=25000;
		
	 desig="Programmer";
	 amt=5000;
}
	}
        class Mgr extends Emm
	{

	Mgr()
	{
	sal=70000;
	
	 desig="Manager";
	amt=10000;
        }
	}


public class Emtest
{
	public static void main(String[]args)
	{
	Clerk c1=new Clerk();
	
	Prog p1=new Prog();
 	
	Mgr m1=new Mgr();
	
	c1.enter();
	p1.enter();
	m1.enter();
	c1.display();
	p1.display();
	m1.display();
	c1.raiseSal();
	
	
	}
}

	
	