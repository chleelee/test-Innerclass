package test3;

public class StringHandlerDemo {
    public static void main(String[] args) {
        useString((msg)->{System.out.println(msg);});

    }
    public static void useString(StringHandler stringHandler){
        stringHandler.printMessage("Lambda有参无返回值");
    }
}
