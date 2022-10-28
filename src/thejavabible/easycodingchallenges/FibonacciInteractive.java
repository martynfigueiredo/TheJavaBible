/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thejavabible.easycodingchallenges;

/**
 *
 * @author martynfigueiredo
 */
public class FibonacciInteractive {

    public static long fibonacci(int n) {
        int a = 1;
        int b = 0;
        int t;
        for (int k = 1; k <= n; k++) {
            t = a + b;
            a = b;
            b = t;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.printf("%d", fibonacci(10));
    }
}
