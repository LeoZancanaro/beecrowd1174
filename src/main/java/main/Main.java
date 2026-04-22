package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] n = new double[100];
        
        for(int i = 0; i < 100; i++) {
            n[i] = sc.nextDouble();
            if(n[i] <= 10) {
                System.out.println("A[" + i + "] = " + n[i]);
            }
        }
    }
}
