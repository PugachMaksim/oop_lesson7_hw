package Calculator;

import Calculator.adapter.Calculator2;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
