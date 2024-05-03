package Week2;
import java.util.Scanner;

public class TaskToDo2 {
    public static void main(String[] args) {
        /* 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }

        /* 2. Write a program to calculate SI. 

        Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */
        System.out.println("Enter principle amount:");
        float principle = scan.nextFloat();

        System.out.println("Enter time:");
        float time = scan.nextFloat();

        System.out.println("Enter rate:");
        float rate = scan.nextFloat();

        float SimpleIneterst = (principle * time * rate) / 100;
        System.out.println("Simple Interest: " + SimpleIneterst);

        /* 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

        Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
        // Triangle
        System.out.println("Enter base:");
        float base = scan.nextFloat();
        System.out.println("Enter height:");
        float height = scan.nextFloat();
        float triangleArea = 1f / 2f * base * height;
        System.out.println("Area of the triangle: " + triangleArea);

        //Cuboid
        System.out.println("Enter length:");
        float length = scan.nextFloat();
        System.out.println("Enter width:");
        float width = scan.nextFloat();
        System.out.println("Enter height:");
        float heightCuboid = scan.nextFloat();
        float cuboidVolume = length * width * heightCuboid;
        System.out.println("Volume of the cuboid: " + cuboidVolume);

        //Cube
        System.out.println("Enter side:");
        float side = scan.nextFloat();
        float cubeVolume = side * side * side;
        System.out.println("Volume of the cube: " + cubeVolume);

        /* 4. Write the ternary operator for question no. 1 */
        System.out.println("Enter your age:");
        int age1 = scan.nextInt();
        System.out.println((age1 >= 18)? "You are eligible to vote." : "You are not eligible to vote.");

        /* 5. Write a program to take two integer inputs from the user and print the sum and product of them. */
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Product: " + (num1 * num2));

        /* 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result. */
        System.out.println("Enter first number:");
        int firstNum = scan.nextInt();
        System.out.println("Enter second number:");
        int secondNum = scan.nextInt();
        int sum = firstNum + secondNum;
        int product = firstNum * secondNum;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        float division = (float) sum / product;
        System.out.println("Division: " + division);

        /* 7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        System.out.println("Enter name:");
        String name = scan.nextLine();
        System.out.println("Enter roll number:");
        String roll_number = scan.nextLine();
        System.out.println("Enter interest:");
        String interest = scan.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + roll_number + ". My field of interest are " + interest + ".");

        /* 8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
        //Square
        System.out.println("Enter side:");
        float sideSquare = scan.nextFloat();
        float areaSquare = sideSquare * sideSquare;
        float perimeter = 4 * sideSquare;
        System.out.println("Area: " + areaSquare);
        System.out.println("Perimeter: " + perimeter);

        //Simple Interest
        System.out.println("Enter principle amount:");
        float principle1 = scan.nextFloat();

        System.out.println("Enter time:");
        float time1 = scan.nextFloat();

        System.out.println("Enter rate:");
        float rate1 = scan.nextFloat();

        float SimpleIneterst1 = (principle1 * time1 * rate1) / 100;
        System.out.println("Simple Interest: " + SimpleIneterst1);   
        
        // Triangle
        System.out.println("Enter base:");
        float base1 = scan.nextFloat();
        System.out.println("Enter height:");
        float height1 = scan.nextFloat();
        float triangleArea1 = 1f / 2f * base1 * height1;
        System.out.println("Area of the triangle: " + triangleArea1);

        //Cube
        System.out.println("Enter side:");
        float side1 = scan.nextFloat();
        float cubeVolume1 = side1 * side1 * side1;
        System.out.println("Volume of the cube: " + cubeVolume1);

        //Cuboid
        System.out.println("Enter length:");
        float length1 = scan.nextFloat();
        System.out.println("Enter width:");
        float width1 = scan.nextFloat();
        System.out.println("Enter height:");
        float heightCuboid1 = scan.nextFloat();
        float cuboidVolume1 = length1 * width1 * heightCuboid1;
        System.out.println("Volume of the cuboid: " + cuboidVolume1);

        /* 9. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
        System.out.println("Enter length:");
        double length2 = scan.nextDouble();
        System.out.println("Enter breadth:");
        double breadth2 = scan.nextDouble();

        double areaRectangle = length2 * breadth2;
        int areaInt = (int) areaRectangle;

        System.out.println("Area of rectangle type casted to int: " +areaInt);
    
        /* 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

        a. If equal to or more than 70 -> First Class

        b. If more than 59 -> Upper Second Class

        c. If more than 49 -> Second class

        d. If more than 39 -> Third class and if below than 40 the result is fail. 

        Hint: Use ternary operator */
        System.out.println("Enter marks for subject 1:");
        float sub1 = scan.nextFloat();

        System.out.println("Enter marks for subject 2:");
        float sub2 = scan.nextFloat();

        System.out.println("Enter marks for subject 3:");
        float sub3 = scan.nextFloat();

        System.out.println("Enter marks for subject 4:");
        float sub4 = scan.nextFloat();

        float totalMarks = sub1 + sub2 + sub3 + sub4;

        float percentage = totalMarks / 4;

        String result = (percentage >= 70)? "First Class":
                        (percentage > 59)? "Upper Second Class":
                        (percentage >49)? "Second Class":
                        (percentage > 39)? "Third Class":
                        "Fail";
        
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);

        scan.close();

    }
}