
import java.util.*;

public class arraySort {

	public static void main(String[] args) {
		String makes[] = {"Honda", "Toyota", "Ford", "Chrysler"};
		System.out.println();
		for (int i=0; i<makes.length;i++)
		{
			System.out.println(makes[i]);
		}
		System.out.println();

		Arrays.sort(makes);
		for (int i=0;i<makes.length;i++)
		{
			System.out.println(makes[i]);
		}
	}

}
