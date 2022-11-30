package com.day8.linecomp;
/*imports scanner class of the java.util package*/
import java.util.Scanner;

public class LineComparision {
    int x1,y1,x2,y2;
    double lengthOfFirstLine;
    private void lineLengthValues() {
        Scanner scanner = new Scanner(System.in);        /* Taking input using scanner class */

        System.out.println("Enter co-ordinates of x1 and y1");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Enter co-ordinates of x2 and y2");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        /* Computing the length of first line */
        double lengthOfFirstLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of first line is " + lengthOfFirstLine);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparision computational program");
        /*creating object to access class methods and variables*/
        LineComparision lineComparision = new LineComparision();
        lineComparision.lineLengthValues();
    }
}
