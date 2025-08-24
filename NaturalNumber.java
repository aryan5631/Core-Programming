import java.util.Scanner;
public class NaturalNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		if(n>0){
		    int sum= n*(n+1)/2;
			System.out.print("The sum of"+n+ "natural numbers is"+sum);

		}
		else{
			System.out.print("he number "+n+" is not a natural number");
		}
	}
}