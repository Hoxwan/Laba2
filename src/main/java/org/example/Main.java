package org.example;

public class Main {
    public static boolean triangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double powerLoop(double a, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }

    public static int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1: Triangle");
        System.out.println(triangle(3, 4, 5)); // true
        System.out.println(triangle(1, 2, 5)); // false
        System.out.println(triangle(0, 0, 0)); // false
        System.out.println(triangle(-1, -2, -3)); // false

        System.out.println("\nTask 2: Distance");
        System.out.println(distance(1, 2, 4, 6)); // 5.0
        System.out.println(distance(0, 0, 3, 4)); // 5.0
        System.out.println(distance(-1, -2, 1, 2)); // 4.472135954999579

        System.out.println("\nTask 3: Power Loop");
        System.out.println(powerLoop(2, 3)); // 8.0
        System.out.println(powerLoop(3, 4)); // 81.0
        System.out.println(powerLoop(0, 5)); // 0.0
        System.out.println(powerLoop(-2, 3)); // -8.0

        System.out.println("\nTask 4: Power Recursive");
        System.out.println(power(2, 3)); // 8.0
        System.out.println(power(3, 4)); // 81.0
        System.out.println(power(0, 5)); // 0.0
        System.out.println(power(-2, 3)); // -8.0

        System.out.println("\nTask 5: Tribonacci");
        System.out.println(tribonacci(0)); // 0
        System.out.println(tribonacci(1)); // 0
        System.out.println(tribonacci(2)); // 1
        System.out.println(tribonacci(3)); // 1
        System.out.println(tribonacci(4)); // 2
        System.out.println(tribonacci(5)); // 4
    }
}
