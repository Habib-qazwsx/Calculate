package Multipler;

import CalculateBase.CalculateBase;
import MathProcessable.MathProcessable;

public class Multiplier extends  CalculateBase implements MathProcessable {
    @Override
    public void calculate(){
        double value = getLeftVal()*getRightVal();
        setResult(value);
    }
    @Override
    public String getKeyword(){
        return "multiply";
    }
    @Override
    public char getSymbol(){
        return '*';
    }
    @Override
    public double doCalculation(double leftVal, double rightVal){
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
