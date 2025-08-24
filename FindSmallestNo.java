import java.util.Scanner;
public class FindSmallestNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        int no3 = scanner.nextInt();
        if (no1 < no2 && no1 < no3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}