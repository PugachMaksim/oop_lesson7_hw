package Calculator.adapter;

import Calculator.Calculator;
import Calculator.ICalculableFactory;
import Calculator.Loggable;

public class CalculableFactory2 implements ICalculableFactory{
    private Loggable logger;
    public CalculableFactory2(Loggable logger){
        this.logger = logger;
    }
    @Override
    public NewCalculable create(int primaryArg) {
        return new Calculator2(new Calculator(primaryArg), logger);
    }
}