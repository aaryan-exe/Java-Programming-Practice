import java.util.Scanner;

public class Prime_number_series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number");
        int n = sc.nextInt();
        System.out.println("Enter Last number");
        int l = sc.nextInt();
        sc.close();
        int count, i;
        while (n <= l) {
            count = 0;
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n);
            }
            n++;
        }
    }
}