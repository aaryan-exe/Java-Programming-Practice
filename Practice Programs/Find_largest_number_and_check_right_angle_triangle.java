import java.util.Scanner;

public class Find_largest_number_and_check_right_angle_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3");
        int num3 = sc.nextInt();
        sc.close();

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println(num1 + " is max");
                if ((num1 * num1) > (num2 * num2) + (num3 * num3)) {
                    System.out.println("It is a right angled triangle");
                } else {
                    System.out.println("It is not right angled triangle");
                }

            } else {
                System.out.println(num3 + " is max");
                if ((num3 * num3) > (num2 * num2) + (num1 * num1)) {
                    System.out.println("It is a right angled triangle");
                } else {
                    System.out.println("It is not right angled triangle");
                }
            }
        } else {
            if (num2 >= num3) {
                System.out.println(num2 + " is max");
                if ((num2 * num2) > (num3 * num3) + (num1 * num1)) {
                    System.out.println("It is a right angled triangle");
                } else {
                    System.out.println("It is not right angled triangle");
                }
            } else {
                System.out.println(num3 + " is max");
                if ((num3 * num3) > (num2 * num2) + (num1 * num1)) {
                    System.out.println("It is a right angled triangle");
                } else {
                    System.out.println("It is not right angled triangle");
                }
            }
        }
    }
}
