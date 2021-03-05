package Arrayspackage;

public class noofoccurrences {

	public static void main(String[] args) {
		int a[][]= {{2,4,5},{3,2,2},{1,2,0}};
		//int a[][]= {{9,8,7},{6,5,4},{3,2,1}};
		//int min = a[0][0];
		//int max = a[0][0];
		//int min = 0 , max = 0;
		int count =0;
		
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
			
			if(a[i][j]==9)
			{
				
				 count++;
			}

	}

		}
		
	System.out.println(count);
	}}