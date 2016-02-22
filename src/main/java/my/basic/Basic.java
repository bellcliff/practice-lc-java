package my.basic;
import java.lang.*;
public class Basic {

    public static void main(String[] args) {
        Integer x = 127, y = 127;
        System.out.println(x == y);
        System.out.println(x >= y);
        x = 1000;
        y = 1000;
        System.out.println(x == y);
        System.out.println(x >= y);
    }
}
