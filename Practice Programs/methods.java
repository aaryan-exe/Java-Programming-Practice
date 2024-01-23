public class methods {
    static int logic(int a, int b)
    {
        int c;
        if (a>b) {
            c=a+b;
        }
        else{
            c=(a+b)*5;
        }
        return c;
    }
    public static void main(String[] args) {
        int x=5;
        int y=9;
        int c=logic(x, y);
        System.out.println(c);

        int x1=60;
        int x2=45;
        int x3=logic(x1, x2);
        System.out.println(x3);
    }
    
}
