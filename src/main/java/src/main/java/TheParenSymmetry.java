package src.main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheParenSymmetry {


    public Boolean isBalanced(String s) {
        // implement this method
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char parenCheck = s.charAt(i);
            if (parenCheck == '(') {
                counter--;
            } else if (parenCheck == ')') {
                counter++;
            }
        }
        return counter == 0;
    }

    private void checkFile(String filename) {
        try {
            Scanner scan = new Scanner(new File(filename));
            while(scan.hasNext())
                System.out.println(isBalanced(scan.nextLine()));

         } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }

        // open file named filename
        // for each line in the file
            // read the line
            // print whether or not the line's parenthesis are balanced
        // CLOSE the file
    }


    public static void main(String[] args) {
        TheParenSymmetry ps = new TheParenSymmetry();

        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);
        ps.checkFile("testStrings0.txt");
    }

    private static void printResult(Boolean b0, boolean b) {
        if (b0 == null) {
            System.out.println("Null Failure");
            return;
        }
        if (b0 == b) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
