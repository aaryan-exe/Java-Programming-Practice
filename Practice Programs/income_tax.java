
/*
  Income Slab	  | Tax
  0     - 250000  |   0%
250000  – 500000  |   5%
500000  – 750000  |	  10%
750000  - 1000000 |   15%
1000000 - 1250000 |   20%
1250000 - 1500000 |   25%
  Above 1500000   |   30%
 */
import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income");
        float n = sc.nextFloat();
        sc.close();

        if (n > 250000f && n <= 500000f) {
            System.out.println("Income tax=" + 0.05 * n);
        }
        if (n > 500000f && n <= 750000f) {
            System.out.println("Income tax=" + 0.10 * n);
        }
        if (n > 750000f && n <= 1000000f) {
            System.out.println("Income tax=" + 0.15 * n);
        }
        if (n > 1000000 && n <= 1250000) {
            System.out.println("Income tax=" + 0.20 * n);
        }
        if (n > 1250000 && n <= 1500000) {
            System.out.println("Income tax=" + 0.25 * n);
        }
        if (n > 1500000) {
            System.out.println("Income tax=" + 0.30 * n);
        }
        if (n < 250000) {
            System.out.println("Income tax=0");
        }
    }
}
