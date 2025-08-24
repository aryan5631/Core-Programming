import java.util.Scanner;
public class NumberDiv{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		if(num%5==0){
			System.out.print("Is the number "+num+" divisible by 5? yes");
		}
		else{
			System.out.print("Is the number "+num+" divisible by 5? no");	
		}
	}
}
	