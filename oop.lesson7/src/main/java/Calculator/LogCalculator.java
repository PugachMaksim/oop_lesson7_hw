package Calculator;

public class LogCalculator implements Calculable{

    private Calculable decorated;
    private Loggable logger;


    public LogCalculator(Calculable decorated, Loggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }
    @Override
    public Calculable sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение %d. Сложение с %d", firstArg, arg));
        Calculable result = decorated.sum(arg);
        logger.log(String.format("Сложили"));
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение %d. Умножение на %d", firstArg, arg));
        Calculable result = decorated.multi(arg);
        logger.log(String.format("Умножили"));
        return result;
    }

    @Override
    public Calculable division(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение %d. Деление на %d", firstArg, arg));
        Calculable result = decorated.division(arg);
        logger.log(String.format("Разделили"));
        return result;
    }

    @Override
    public int getResult() {
        int result = decorated.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }
}
