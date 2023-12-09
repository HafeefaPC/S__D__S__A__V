package array;

import java.util.Scanner;
import java.util.ArrayList;

public class Array3 {
    public static void main(String[] args) {
        ArrayList<Integer> hello = new ArrayList<>(5);

        hello.add(50);
        hello.add(30);
        hello.add(70);
        hello.add(20);
        hello.add(15);

        System.out.println(hello);

        hello.set(3,100);

        System.out.println(hello);

        hello.remove(1);
         System.out.println(hello);

    }
}