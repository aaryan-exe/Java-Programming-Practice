import java.util.Scanner;
public class methodOverloading {
    static void tellJoke(){
        System.out.println("I got rid of my vacuum cleaner. It was just gathering dust.");
    }
    static void tellJoke(int x){
        System.out.println(x+" joke");
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        sc.close();
        tellJoke(a);
        tellJoke();
    }
}
