import java.util.Scanner;

public class krishnamurthy_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();
        int temp, i, r, a = 0, fact;
        temp = n;
        while (n > 0) {
            r = n % 10;
            fact = 1;
            for (i = 1; i <= r; i++) {
                fact = fact * i;
            }
            a = fact + a;
            n = n / 10;
        }
        if (a == temp) {
            System.out.println(temp + " is a krishnamurthy number");
        } else {
            System.out.println(temp + " is not a krishnamurthy number");
        }
    }
}