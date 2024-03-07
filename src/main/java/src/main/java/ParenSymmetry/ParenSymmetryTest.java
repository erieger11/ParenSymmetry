package src.main.java.ParenSymmetry;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.TheParenSymmetry;

public class ParenSymmetryTest {

    @Test
    public void isBalanced1() {
        String inputTest = "()";
        Boolean expected = true;
        Boolean actual;

        actual = new TheParenSymmetry().isBalanced(inputTest);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isBalanced2() {
        String inputTest = "())";
        Boolean expected = false;
        Boolean actual;

        actual = new TheParenSymmetry().isBalanced(inputTest);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isBalanced3() {
        String inputTest = "((";
        Boolean expected = false;
        Boolean actual;

        actual = new TheParenSymmetry().isBalanced(inputTest);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isBalanced4() {
        String inputTest = "()grand()illusion";
        Boolean expected = true;
        Boolean actual;

        actual = new TheParenSymmetry().isBalanced(inputTest);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isBalancedFalses() {
        String[] falseStrings = {"(", "((", ")", "(()())((())))"};
        Boolean expected = false;
        Boolean actual;
        for (String testString : falseStrings) {
            actual = new TheParenSymmetry().isBalanced(testString);
            Assert.assertEquals(expected, actual);
        }
    }
    @Test
    public void isBalancedTrues() {
        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean expected = false;
        Boolean actual;
        for (String testString : trueStrings) {
            actual = new TheParenSymmetry().isBalanced(testString);
            Assert.assertEquals(expected, actual);
        }
    }

}