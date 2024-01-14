import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor_game {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int a = ran.nextInt(1, 4);
            System.out.println("Enter \n 1 for rock \n 2 for paper \n 3 for scissor");
            int n = sc.nextInt();

            // User command
            if (n == 1) {
                System.out.println("You have choosen rock");
            }
            if (n == 2) {
                System.out.println("You have choosen paper");
            }
            if (n == 3) {
                System.out.println("You have choosen scissor");
            }

            if (n > 3) {
                System.out.println("Wrong inpput");
            }

            // Pc command
            if (a == 1) {
                System.out.println("System have choosen rock");
            }
            if (a == 2) {
                System.out.println("System have choosen paper");
            }
            if (a == 3) {
                System.out.println("System have choosen scissor");
            }

            // Win/Loose message (Optional)

            // Rock
            if (a == 1 && n == 3) {
                System.out.println("You loose!");
            }

            if (a == 1 && n == 2) {
                System.out.println("You win!");
            }

            if (a == 1 && n == 1) {
                System.out.println("Tie!");
            }

            // paper

            if (a == 2 && n == 3) {
                System.out.println("You win!");
            }

            if (a == 2 && n == 1) {
                System.out.println("You loose!");
            }

            if (a == 2 && n == 2) {
                System.out.println("Tie!");
            }

            // paper

            if (a == 3 && n == 2) {
                System.out.println("You loose!");
            }

            if (a == 3 && n == 1) {
                System.out.println("You win!");
            }

            if (a == 3 && n == 3) {
                System.out.println("Tie!");
            }
    }
}
