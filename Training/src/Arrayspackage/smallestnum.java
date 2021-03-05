package Arrayspackage;

public class smallestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = {{1,2,3}, {4,0,6}, {7,8,-9}};
		int min = b[0][0];
		
		for( int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++)
			{
			
				//System.out.println(b[i][j]);
				if (b[i][j]< min)
				{
					min = b[i][j];
				}
						
			}
		}
		
		System.out.println(min);
		
	}

}
