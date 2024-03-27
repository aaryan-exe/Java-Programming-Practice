import java.util.Scanner;

public class real_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();
        int i, sum = 0;

        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("It is real number");
        } else {
            System.out.println("It is not a real number");
        }

    }
}
