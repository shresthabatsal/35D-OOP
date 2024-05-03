package Week3;
import java.util.Scanner;

public class TaskToDo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* 1. Write a JAVA program to find the maximum between three numbers. */
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter third number:");
        int num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("The maximum number is " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("The maximum number is " + num2);
        }else{
            System.out.println("The maximum number is " + num3);
        }

        /* 2. Write a JAVA program to check whether a number is negative, positive, or zero. */
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        if(num >= 0){
            System.out.println(num + " is positive.");
        }else if(num == 0){
            System.out.println(num + " is a zero.");
        }else{
            System.out.println(num + " is negative.");
        }

        /* 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        if(number % 5 == 0 && number % 11 == 0){
            System.out.println(number + " is divisible by 5 and 11.");
        }else{
            System.out.println(number + " is not divisible by 5 and 11.");
        }

        /* 4. Write a JAVA program to check whether a number is even or odd. */
        System.out.println("Enter a number:");
        int numb = scan.nextInt();

        if(numb % 2 == 0){
            System.out.println(numb + " is even.");
        }else{
            System.out.println(numb + " is odd.");
        }

        /* 5. Write a JAVA program to check whether a year is a leap year or not. 

        Hint: if year%4==0; if year%100!==0 ; year%400==0;  */
        System.out.println("Enter a year:");
        int year = scan.nextInt();

        if(year % 4 == 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }

        /* 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        System.out.println("Enter any alphabet:");
        char alpha = scan.next().charAt(0);
        alpha = Character.toLowerCase(alpha);

        if(alpha == 'a' | alpha == 'e' | alpha == 'i' | alpha == 'o' | alpha == 'u'){
            System.out.println(alpha + " is a vowel.");
        }else{
            System.out.println(alpha + " is not a vowel.");
        }

        //Some Switch case Statements Questions:

        /* 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */
        System.out.println("Enter your grade:");
        char grade = scan.next().charAt(0);
        grade = Character.toUpperCase(grade);

        switch (grade) {
            case 'A':
                System.out.println("4.0");
                break;
            case 'B':
                System.out.println("3.0");
                break;
            case 'C':
                System.out.println("2.0");
                break;
            case 'D':
                System.out.println("1.0");
                break;
            case 'E':
                System.out.println("0.0");
                break;
            default:
                System.out.println("Invalid grade.");
                break;
        }

        /* 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement. */
        System.out.println("Enter first number:");
        int number1 = scan.nextInt();
        System.out.println("Enter second number:");
        int number2 = scan.nextInt();
        System.out.println("Enter a arithmetic operator:");
        char op = scan.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Sum: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Difference: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Product: " + (number1 * number2));
                break;
            case '/':
                if(number2 != 0){
                    System.out.println("Division: " + (number1 / number2));
                }else{
                    System.out.println("Division by zero,");
                }
            default:
                System.out.println("Invalid operator.");
                break;
        }

        /* 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
        System.out.println("Enter a month:");
        int month = scan.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");  
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }

        /* 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case. */
        System.out.println("Select a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        
        int choice = scan.nextInt();
        float area;

        switch (choice) {
            case 1:
                System.out.println("Enter radius:");
                float radius = scan.nextFloat();
                area = 3.14f * radius * radius;
                System.out.println("Area: " + area);
                break;
            case 2:
                System.out.println("Enter length:");
                float length = scan.nextFloat();
                System.out.println("Enter breadth:");
                float breadth = scan.nextFloat();
                area = length * breadth;
                System.out.println("Area: " + area);
                break;
            case 3:
                System.out.println("Enter a side:");
                float side = scan.nextFloat();
                area = side * side;
                System.out.println("Area: " + area);
                break;
            case 4:
                System.out.println("Enter height:");
                float height = scan.nextFloat();
                System.out.println("Enter base:");
                float base = scan.nextFloat();
                area = 1f / 2f * base * height;
                System.out.println("Area: " + area);
                break;
            default:
                System.out.println("Invald choice.");
                break;
        }
        scan.close();
    }
}