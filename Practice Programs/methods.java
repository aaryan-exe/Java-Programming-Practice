//table method
public class methods {
    // method
    int multi(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 3;
        methods Obj = new methods();
        Obj.multi(n);

    }
}
