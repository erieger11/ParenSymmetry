package src.main.java;

public class ParenSymmetry {


    private Boolean isBalanced(String s) {
        // implement this method
    boolean valid;
    char[] newArray = s.toCharArray();
    char[] newArray2 = new char[newArray.length];
    int count = 0;
        for(int i = 0, j = 0; i < newArray.length; i ++){
                if(newArray[i] == '(' || newArray[i] == ')'){
                    newArray2[j] = newArray[i];
                    j++;
                }
        }
        for(int i = 0 ; i < newArray2.length; i ++){
            if(newArray2[i] == '(' || newArray2[i] == ')'){
                count++;
            }
        }
        return null;
    }







    private void checkFile(String filename) {
        // open file named filename

        // for each line in the file
            // read the line
            // print whether or not the line's parenthesis are balanced

        // CLOSE the file
    }

    public static void main(String[] args) {
        ParenSymmetry ps = new ParenSymmetry();

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
