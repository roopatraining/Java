package general;

public class sumofdigits {

	    public static void main(String[] args) {
		//Given an integer, find sum of digits of that number until sum becomes single digit
		int d = 111123;
		int i=0;
		if(d==0){i= d;}
		else if (d % 9==0){i = 9;}
		else {i = d % 9;}
		System.out.println(i);
	}}


