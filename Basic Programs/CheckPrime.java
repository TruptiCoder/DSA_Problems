import java.util.Scanner;

public class CheckPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to Check: ");
        int n = sc.nextInt();

        int flag = 0;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.println("Not a Prime number");
                flag = 1;
            }
        }

        if(flag == 0) {
            System.out.println("It is a Prime number");
        }
    }
}