package general;

public class sumofint {

	public static void main(String[] args) {
		
			int n = 55555;
			
			int sum =0;
			
			while(n != 0)
			{
				sum = sum + n % 10; 
	            n = n/10; 
	          
			}
			
			  System.out.println(sum);
			
			int fsum = 0;
			while(sum != 0)
			{ 
				fsum = fsum+sum%10;
			    sum = sum/10;
			
			}
			System.out.println(fsum);
		}

	
	}


