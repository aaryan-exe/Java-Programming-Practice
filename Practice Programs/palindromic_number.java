import java.util.Scanner;
public class palindromic_number {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while (n>0) {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (sum==temp) {
            System.out.println("It is a palindromic number");
        }
        else{
            System.out.println("It is not palindromic nuber");
        }
    }
}
