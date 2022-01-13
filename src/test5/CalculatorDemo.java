package test5;

public class CalculatorDemo {
    public static void main(String[] args) {
        useCalculator(new Calculator() {
            @Override
            public int calc(final int a, final int b) {
                return a + b;
            }
        });
        useCalculator((a, b) -> {
            return a + b; });

    }
    public static void useCalculator(Calculator calculator){
        int result = calculator.calc(10, 20);
        System.out.println(result);

    }
}


interface Calculator{
    int calc(int a, int b);
}