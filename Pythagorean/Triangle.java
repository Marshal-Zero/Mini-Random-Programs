package triangle;

import java.util.Scanner;
/*
 This program will determine the type of
 a triangle when you give it the dimensions.
 */

public class Triangle {

    private int sideA, sideB, sideC;

    //This is the default constructor
    Triangle() {
    }

    //This is the constructor for all three side A,B,C
    Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
//Getter for side A

    public int getSideA() {
        return sideA;
    }
//Setter for side A

    public void setSideA(int a) {
        sideA = a;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int b) {
        sideB = b;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int c) {
        sideC = c;
    }

    /*
     The next 5 methods will have the calculations using the laws of triangles and 
     the pythagorean theorm to determine the type of the triangle and whether it's valid or not.
     */
    public boolean isScalene() {
        return (sideA != sideB) && (sideA != sideC) && (sideB != sideC);
    }

    public boolean isRight() {
        int squareA = sideA * sideA;
        int squareB = sideB * sideB;
        int squareC = sideC * sideC;

        return (squareA + squareB == squareC) || (squareB + squareC == squareA) || (squareC + squareA == squareB);
    }

    public boolean isIsosceles() {
        return (sideA == sideB && sideB != sideC) || (sideA == sideC && sideB != sideC) || (sideB == sideC && sideA != sideC);
    }

    public boolean isEquilateral() {
        return (sideA == sideB) && (sideB == sideC);
    }

    public boolean isValid() {
        return (sideB + sideC > sideA) && (sideA + sideC > sideB) && (sideA + sideB > sideC);
    }

    /*
     Main method as given with a scanner and print statements asking the user for dimensions then
     giving feedback by displaying a few print statements followed by invoking methods and returning
     back whether the statements are true or false.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        while (true) {
            System.out.println("Enter the length of side A: ");
            a = input.nextInt();
            System.out.println("Enter the length of side B: ");
            b = input.nextInt();
            System.out.println("Enter the length of side C: ");
            c = input.nextInt();

            Triangle tri = new Triangle(a, b, c);

            System.out.println("Valid Triangle       :" + tri.isValid());
            System.out.println("Right Triangle       :" + tri.isRight());
            System.out.println("Scalene Triangle      :" + tri.isScalene());
            System.out.println("Isosceles Triangle    :" + tri.isIsosceles());
            System.out.println("Equilateral Triangle  :" + tri.isEquilateral());

            System.out.print("Read in a new triangle?(-1 for no, 1 for yes): ");
            if (input.nextInt() < 0) {
                break;
            }
        }
    }

}
