import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        if(n == 0) return 1;
        return (fact(n-1) * n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + ": " + fact(num));
    }
}