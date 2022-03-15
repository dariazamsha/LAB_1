package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ii = 1;
        System.out.printf("arg\t   log2(arg)\tsum(arg)\n");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d\t       %.0f\t       %d\t\n", i, Math.log(i) / Math.log(2), ii += i);
        }
    }
}



