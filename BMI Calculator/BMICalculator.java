package bmicalculator;
/*
This program is a body mass index (BMI). It will categorize a person's weight as
underweight, normal weight, overweight, or obese.
The user will have to put their names, weight in pounds and their height in inches.
The program will follow this equation BMI = wieght(lb) / (height(in) * height(in)) * 703
The output will be shown on the console screen with the appropriate category 
that the user fall under.
*/
import java.util.Scanner;  //call on the scanner
public class BMICalculator {
  public static void main(String[] args) {
        
  Scanner input = new Scanner(System.in); // assign the scanner to input
    
  String username; // I'm going to assign variables to the username, height, weight and BMI.
  int height;      
  double weight;
  double BMI;
 
  
System.out.println("Enter your name"); // ask the user for their username first
username = input.nextLine();           // immediately assign whatever they typed to username.

System.out.println("Enter your height"); // ask them for their height
height = input.nextInt();               // store it in height

System.out.println("Enter your weight"); // ask them for weight
weight = input.nextDouble();            // assign it to weight

 int heightFeet = height/12;            // do the inch-feet conversion first and store them
 int heightInches = height % 12;        // in new variables
 
 
// print to the console what's between qoutes and whatever they typed.
System.out.println("Name:" + username); 
System.out.println("Height:" + heightFeet+"ft," + heightInches + "in"); 
System.out.println("Weight:" + weight + " lb");


BMI = weight*703  / (height * height); // BMI formula


//nesting if statments showing only one of the following
if (BMI >= 30) 
  {   System.out.println("BMI : Obese");   }

 else if (BMI >= 25){
    System.out.println("BMI : Overweight "); 
} else if (BMI >=18.5){
    System.out.println("BMI :Normal weight ");    
} else if (BMI <= 18.5){
    System.out.println("BMI : Underweight");        }


    }
    
}
