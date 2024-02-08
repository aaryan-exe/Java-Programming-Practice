import java.util.*;
public class find_number_in_array {

    public static void main(String[] args) {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter number");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number to find");
        int n=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if (n==a[i]) {
                count++;
            }
        }
        System.out.println(n+" is present"+count+"times ");
    }
}