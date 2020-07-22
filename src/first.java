//Testing git

public class first {
    public static void main(String[] args) {
        System.out.println("hello world");
        Second s = new Second();
        System.out.println("value of a is " + s.a);
    }
}

class Second{
    int a = 10;
    int b = 20;
    int c = a +b;


}