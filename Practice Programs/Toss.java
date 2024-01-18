import java.util.Random;
import java.util.Scanner;

/**
 * Toss
 */
public class Toss {

    public static void main(String[] args) {
        Random ran = new Random();
        int n = ran.nextInt(1, 3);
        if (n == 1) {
            System.out.println("Heads");
        }
        if (n == 2) {
            System.out.println("Tails");
        }
    }
}