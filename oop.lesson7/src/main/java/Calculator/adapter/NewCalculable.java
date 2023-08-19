package Calculator.adapter;

import Calculator.Calculable;

/**
 * интерфейс нового кальколятора
 */
interface NewCalculable {

    NewCalculable sum(double arg);
    NewCalculable multi (double arg);
    NewCalculable division(double arg);
    double getResult();
}
