import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int i, temp, r, sum = 0;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is a Armstrong number");
        } else {
            System.out.println(temp + " is not a Armstrong number");
        }
    }
}
