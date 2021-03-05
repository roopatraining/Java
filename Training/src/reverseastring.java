
public class reverseastring {

	public static void main(String[] args) {
		String d = "stringcheck is good";
		String t = "";
		
		for (int i = d.length()-1; i>=0; i--)
		{
			
			t= t + d.charAt(i);
			
		}
		System.out.println(t);

	}

}
