//function overloading

import java.util.Arrays;

public class Arrayv {
    public static void main(String[] args){
        System.out.println("variables ");
        stoo(2,4,6,7,90,60,17,92);
        stoo("hafi","imthi","sunu","shiri","finu");
    }

    static void stoo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void stoo(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
