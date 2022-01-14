package Divider;

import CalculateBase.CalculateBase;
import Exceptions.UnableToPerformCalculationException;
import MathProcessable.MathProcessable;

public class Divider extends CalculateBase implements MathProcessable {
    @Override
    public void calculate(){
        double value = getLeftVal()/getRightVal();
        setResult(value);
    }
    @Override
    public String getKeyword(){
        return "divide";
    }
    @Override
    public char getSymbol(){
        return '/';
    }
    @Override
    public double doCalculation(double leftVal, double rightVal) throws UnableToPerformCalculationException {
        if(rightVal==0){
            throw  new UnableToPerformCalculationException("Argument 'divisor' is 0");
        }
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
