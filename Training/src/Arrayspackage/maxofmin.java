package Arrayspackage;

public class maxofmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int min = abc[0][0];
		int mincol=0;
		
		
		for( int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++)
			{
			
				if (abc[i][j]< min)
				{
					min = abc[i][j];
					mincol = j;
				  
				}
			}
		}
				
				int maxnumber1 = abc[0][mincol];
				int k = 0;
				while(k<3)
				{
					if(abc[k][mincol] > maxnumber1)
					{
						maxnumber1 = abc[k][mincol];
					}
					k++;
								}
				System.out.println(maxnumber1);
			
			
	}

}