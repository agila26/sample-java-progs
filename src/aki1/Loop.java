package aki1;

public class Loop {
	public static void main(String[]args)
	{
		int i;
	
		lp1: for(i=50;i<=60;i++)
		{
			if(i%2!=0)
			{
				
				System.out.println(i);
				
				System.out.println("odd");
				
				

				i++;
				continue lp1;
	
				}
			else{
			

				System.out.println("even"+i);
			}
				
				
			
				
				
			
				
			
				}
		}
	}

