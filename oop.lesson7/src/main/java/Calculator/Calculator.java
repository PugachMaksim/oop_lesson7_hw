package Calculator;

public final class Calculator implements Calculable{
    private int primaryArg;

    /**
     * конструктор калькулятора
     * @param primaryArg последний результат вычесления
     */

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    /**
     * метод сложения
     * @param arg слогаемое
     * @return
     */
    @Override
    public Calculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    /**
     * метод умножения
     * @param arg множитель
     * @return
     */
    @Override
    public Calculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    /**
     * метод деления
     * @param arg делитель
     * @return
     */
    @Override
    public Calculable division(int arg) {
        primaryArg /= arg;
        return this;
    }

    /**
     * метод вычетания
     * @param arg делитель
     * @return
     */
    @Override
    public Calculable minus(int arg) {
        primaryArg -= arg;
        return this;
    }

    /**+
     * метод получения последнего результата вычесления
     * @return вычетаемое
     */
    @Override
    public int getResult() {
        return primaryArg;
    }
}

