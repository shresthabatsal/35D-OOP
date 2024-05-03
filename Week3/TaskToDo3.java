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
    }
}