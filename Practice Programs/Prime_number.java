import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();
        int i, count = 0;

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Is a prime  number");
        } else {
            System.out.println("Is not a prime number");
        }
    }
}