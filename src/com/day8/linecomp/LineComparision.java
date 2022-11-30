package com.day8.linecomp;
/*imports scanner class of the java.util package*/
import java.util.Scanner;

public class LineComparision {
    int x1,y1,x2,y2,x3,y3,x4,y4;
    double lengthOfFirstLine,lengthOfSecondLine;
    private void lineLengthValues() {
        /* Taking input using scanner class */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter co-ordinates of x1 and y1");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Enter co-ordinates of x2 and y2");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        System.out.println("Enter co-ordinates of x3 and y3");
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();
        System.out.println("Enter co-ordinates of x4 and y4");
        x4 = scanner.nextInt();
        y4 = scanner.nextInt();
    }
    private void calculateLength() {
        /* Computing the length of first line */
        double lengthOfFirstLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of first line is " + lengthOfFirstLine);
        /* Computing the length of second line */
        double lengthOfSecondLine = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        System.out.println("Length of second line is " + lengthOfSecondLine);
    }
    /*checking the Equality of the lines*/
    private void isLineEqual() {
        if(lengthOfFirstLine == lengthOfSecondLine){
            System.out.println("Lines are Equal");
        }else {
            System.out.println("Lines are not Equal");
        }
    }

    /*checking which line is greater using compare method*/
    private void checkLineComparision() {
        String str1 = Double.toString(lengthOfFirstLine);
        String str2 = Double.toString(lengthOfSecondLine);
        int valueOfLine = str1.compareTo(str2);
        if(valueOfLine == lengthOfSecondLine){
            System.out.println("Both Lines Are Equal ");
        }else if(valueOfLine > lengthOfSecondLine){
            System.out.println("First Line is Greater than Second Line");
        }else {
            System.out.println("Second line is Greater than First Line");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparision computational program");
        /*creating object to access class methods and variables*/
        LineComparision lineComparision = new LineComparision();
        lineComparision.lineLengthValues();
        lineComparision.calculateLength();
        lineComparision.isLineEqual();
        lineComparision.checkLineComparision();
    }
}
