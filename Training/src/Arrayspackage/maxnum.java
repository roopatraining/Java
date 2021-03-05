package Arrayspackage;

public class maxnum {

	public static void main(String[] args) {
		int b[][] = {{1,2,3}, {4,0,69999}, {7,8,10}};
		int max = b[0][0];
		
		for( int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++)
			{
			
				//System.out.println(b[i][j]);
				if (b[i][j]> max)
				{
					max = b[i][j];
				}
						
			}
		}
		
		System.out.println(max);
		
	}

}
