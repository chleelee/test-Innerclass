package test6;

public class Test6 {
    public static void main(String[] args) {
        useInter(( a,  b) -> {
            return a + b;
        });
    }
    public static void useInter(Inter i){
        double result = i.method(12.3, 22.3);
        System.out.println(result);
    }
}


interface Inter{
    double method(double a, double b);
}
