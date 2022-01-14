package Exceptions;

public class UnableToPerformCalculationException extends Throwable {
    public UnableToPerformCalculationException(String reason){
        super(reason);
    }
}
