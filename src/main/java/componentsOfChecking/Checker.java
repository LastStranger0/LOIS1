package componentsOfChecking;

import componentsOfExeptions.BracketsException;
import componentsOfExeptions.EmptyExpressionException;

public class Checker {

    public static boolean startCheck(String expression) {
        try {
            if (expression.isEmpty()) {
                throw new EmptyExpressionException("Empty expression!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        try {
            if (!BracketChecker.isBracketsNumberCorrect(expression)) {
                throw new BracketsException("Brackets number is invalid!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (!LiteralChecker.isLitCorrect(expression)) {
            return false;
        }
        if (!SymbolChecker.isSymbolsCorrect(expression)) {
            return false;
        }
        return OperatorChecker.isOpCorrect(expression);
    }
}
