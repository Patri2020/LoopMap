package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        System.out.println("Let's enter five numbers");
        Scanner keyboard = new Scanner(System.in);
        int inputNumber1 = keyboard.nextInt();
        Scanner keyboard2 = new Scanner(System.in);
        int inputNumber2 = keyboard2.nextInt();
        Scanner keyboard3 = new Scanner(System.in);
        int inputNumber3 = keyboard3.nextInt();
        Scanner keyboard4 = new Scanner(System.in);
        int inputNumber4 = keyboard4.nextInt();
        Scanner keyboard5 = new Scanner(System.in);
        int inputNumber5 = keyboard5.nextInt();

        int [] userArray = {inputNumber1, inputNumber2, inputNumber3, inputNumber4, inputNumber5};

        int sum = 0;
        for(int i = 0; i < userArray.length; i++){
            sum += userArray[i];
        }
        System.out.println("The sum of the array list is: " + sum);

        int product = 1;
        for(int i = 0; i < userArray.length; i++){
            product *= userArray[i];
        }
        System.out.println("The product of the array list is: " + product);

        int smallest = userArray[0];
        int largest = userArray[0];

        for(int i=1; i< userArray.length; i++) {
            if (userArray[i] > largest)
                largest = userArray[i];
            else if (userArray[i] < smallest)
                smallest = userArray[i];
        }
            System.out.println("The largest number of the array list is: " + largest);

            System.out.println("The smallest number of the array list is: " + smallest);

        }
    }
