package com.mine.test1;

public class TestSwimming {


    public static void main(String[] args) {

        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("我们一起游泳吧");

            }
        });
        goSwimming(()->{System.out.println("我们一起游泳吧");});
    }


    public static void goSwimming(Swimming swimming){
        swimming.swim();
    }
}
