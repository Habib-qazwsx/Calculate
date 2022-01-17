package PowerOf;

import CalculateBase.CalculateBase;
import MathProcessable.MathProcessable;

public class Powerof extends  CalculateBase implements MathProcessable {
    @Override
    public void calculate(){
        double pow = Math.pow(getLeftVal(), getRightVal());
        setResult(pow);
    }
    @Override
    public String getKeyword(){
        return "power";
    }
    @Override
    public char getSymbol(){
        return '^';
    }
    @Override
    public double doCalculation(double leftVal, double rightVal){
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
