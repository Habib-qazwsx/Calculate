package CalculatorEngine;

import Exceptions.InvalidStatementException;
import Exceptions.UnableToPerformCalculationException;
import MathProcessable.MathProcessable;

public class CalculatorEngine {
    private MathProcessable[] handlers;

    public CalculatorEngine(MathProcessable[] handlers){
        this.handlers = handlers;
    }


    public String process(String statement) throws InvalidStatementException {
        String[] parts = statement.split(MathProcessable.SEPARATOR);
        if(parts.length != 3){
            throw new InvalidStatementException("Incorrect number of fields", statement);
        }
        String keyword = parts[0];
        MathProcessable theHandler = null;
        for(MathProcessable handler : handlers){
            if(keyword.equalsIgnoreCase(handler.getKeyword())){
                theHandler = handler;
                break;
            }
        }
        if(theHandler == null){
            return "command not found";
        }
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        double result;
        try {
            result = theHandler.doCalculation(leftVal, rightVal);
        }catch (UnableToPerformCalculationException e){
            throw new InvalidStatementException(e.getMessage(), statement);
        }
        return String.valueOf(leftVal)+' '+theHandler.getSymbol()+' '+rightVal+" = "+result;
    }
}
