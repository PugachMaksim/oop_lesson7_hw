package Calculator;

import Calculator.adapter.Calculator2;

public class CalculableFactory implements ICalculableFactory{

    @Override
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
