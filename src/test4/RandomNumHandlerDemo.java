package test4;

import java.util.Random;

public class RandomNumHandlerDemo {
    public static void main(String[] args) {
        useRandomNumberHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                Random r = new Random();
                int num = r.nextInt(10) + 1;
                return num;
            }
        });
        useRandomNumberHandler(()->{
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            return num;
        });
    }
    public static void useRandomNumberHandler(RandomNumHandler randomNumHandler) {
        int result = randomNumHandler.getNumber();
        System.out.println(result);



}



interface RandomNumHandler{
    int getNumber();
}
}