package Calculator.adapter;

import Calculator.Calculator;
import Calculator.Loggable;
import Calculator.Calculable;

public class Calculator2 implements NewCalculable{
    private NewCalculable dec;
    private Loggable logger;

    public Calculator2(NewCalculable dec,Loggable logger) {
        this.dec = dec;
        this.logger = logger;
    }

    @Override
    public NewCalculable sum(double arg) {
                double firstArg = dec.getResult();
                logger.log(String.format("Первое значение %d. Сложение с %d", firstArg, arg));
                NewCalculable result = dec.division(arg);
                logger.log(String.format("Сложили"));
                return result;
    }

    @Override
    public NewCalculable multi(double arg) {
        double firstArg = dec.getResult();
        logger.log(String.format("Первое значение %d. Умножение с %d", firstArg, arg));
        NewCalculable result = dec.division(arg);
        logger.log(String.format("Умножили"));
        return result;
    }

    @Override
    public NewCalculable division(double arg) {
                double firstArg = dec.getResult();
                logger.log(String.format("Первое значение %d. Деление на %d", firstArg, arg));
                NewCalculable result = dec.division(arg);
                logger.log(String.format("Разделили"));
                return result;
    }

    @Override
    public double getResult() {
        return 0;
    }

}


