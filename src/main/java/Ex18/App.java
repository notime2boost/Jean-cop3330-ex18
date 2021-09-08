package Ex18;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);



        System.out.println("Press C to convert from Fahrenheit to Celsius or Press F to convert from Celsius to Fahrenheit");
        String Choice = input.next();

        if(Choice.equals("C")){
           System.out.println("Enter temperature in Fahrenheit: ");
           int f = input.nextInt();
            int C = ((f-32) * 5/9);
            System.out.println("The temperature in Celsius is "+ C);
        }
        if(Choice.equals("F")){
            System.out.println("Enter temperature in Celsius: ");
            int c = input.nextInt();
            int F = ((c*9/5)+32);
            System.out.println("The temperature in Fahrenheit is "+ F);
        }
    }
}
