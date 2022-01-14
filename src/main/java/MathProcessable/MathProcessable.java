package MathProcessable;

import Exceptions.UnableToPerformCalculationException;

public interface MathProcessable {
    String SEPARATOR=" ";
    String getKeyword();
    char getSymbol();
    double doCalculation(double leftVal, double rightVal) throws UnableToPerformCalculationException;
}
