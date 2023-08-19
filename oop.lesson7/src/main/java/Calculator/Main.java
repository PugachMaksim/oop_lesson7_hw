package Calculator;
//Фабричный петтерн


public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run(); //запуск программы
        //view.run(new NewCalculable(new Calculator2().getCalc()) {

        }



}