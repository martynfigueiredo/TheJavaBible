/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thejavabible.easycodingchallenges;

/**
 *
 * @author martynfigueiredo
 */
public class PrimeOrNot {

    public static void main(String[] args) {
        int number = 68;
        int temp = 0;
        for (int i = 2; i <= number / 2; ++i) {
            // if number is divisible by any value of i, increment temp value
            if (number % i == 0) {
                temp = temp + 1;
                // if any i value found to be divisible simply come out of the loop
                break;
            }
        }
        // if temp is 0, then the number is prime number
        if (temp == 0) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
