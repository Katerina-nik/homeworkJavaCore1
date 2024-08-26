public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); //делить на 0 нельзя, сделать проверку в переменной devide

        calc.println.accept(c);

    }
}




