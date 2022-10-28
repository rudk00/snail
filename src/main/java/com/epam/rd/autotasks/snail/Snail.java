package com.epam.rd.autotasks.snail;
import java.util.Scanner;
public class Snail
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (a >= h) {
            System.out.println(1);
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            int count = 0;
            int pass = 0;
            while (pass < h) {
                count++;
                pass +=  a;
                if (pass >= h) {
                    break;
                } else {
                    pass -= b;
                }
            }
            System.out.println(count);
        }
    }
}
