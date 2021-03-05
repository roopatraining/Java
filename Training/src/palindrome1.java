
public class palindrome1 {

	public static void main(String[] args) {
		String d = "stringcheck";
		String t = "";
				
		//for (int i = 0 ; i<=d.length()-1; i++)
		for (int i = d.length()-1; i>=0; i--)
		{
			//System.out.println(t);
			t= t +  d.charAt(i) ;
			//t=  t + d.charAt(i)  + "\t";

			//q= q + d.charAt(i);
			
			//System.out.println(t);

			
		}
		//System.out.println();
	
		System.out.println(t);
		//System.out.println(q);
		if(d==t)
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("not a Palindrome");
			
		}


	}

}