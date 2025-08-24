import java.util.Scanner;
public class LargestOfThree{
	public static void main(String [] args){
		Scanner sc=new Scanner (System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		if(num1>num2 && num1>num3){
			System.out.print("Is the first number the largest? yes");

		}
		else if(num2<num1 && num2>num3){
			System.out.print("Is the second number the largest? yes");
		}
		else{
			System.out.print("Is the third number the largest? yes");
		}
			
		
	}
		
}