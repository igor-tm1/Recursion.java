package com.company;
import java.util.Scanner;
public class Recursion {
    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }
    public static void main(String[] args) {
        System.out.print("Введите  число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(recursion(n));
    }
}