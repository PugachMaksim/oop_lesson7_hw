package Calculator;

/**
 * опрерации
 */
public interface Calculable {
    Calculable sum(int arg);
    Calculable multi (int arg);
    Calculable minus (int arg);
    Calculable division(int arg);


    //    Calculable division(int arg);
    int getResult();
}

