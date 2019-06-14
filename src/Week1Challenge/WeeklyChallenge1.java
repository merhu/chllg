package Week1Challenge;

import java.util.Scanner;
public class WeeklyChallenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        String anotherNumber;
        int number;
        System.out.println("Welcome to prime number checking!!");
        System.out.println("Please enter a number:");
        answer = input.nextLine();
        number = input.nextInt();
        //Declare varibles

        // int number = 0;
        //String answer;
        while (!answer.equalsIgnoreCase("Yes")) ;
        answer = input.nextLine();

        //number = sc.nextInt();
        //while (number != 1) ;
        //answer = sc.next();
        //      if (number % 2 == 0) {
        //        number = number / 2;
        //        System.out.println("" + number + "");
        //  } else {
        //    number = 3 +1;
        //  System.out.println("" + number + "");


    }

    //heckPrimeNumber(number);
    private static void CheckPrimeNumbers(int number) {


        int i;
        for (i = 1; i <= number; i++) {
            int j = 2; //count
            boolean isPrime = true;
            System.out.println();
        }

        if (i == 1) { // one is not a prime number
            boolean isPrime = false;
            System.out.println();

        } else if (i == 2) { // the number 2 a prime number
            boolean isPrime = true;
        } else {

            System.out.println("Thank you for playing the game!!");


        }
    }
}
