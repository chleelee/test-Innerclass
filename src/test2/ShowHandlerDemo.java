package test2;

public class ShowHandlerDemo {
    public static void main(String[] args) {
        useShowHandler(()->{System.out.println("实施什么内容");});
    }
    public static void useShowHandler(ShowHandler handler){
        handler.show();
    }
}
