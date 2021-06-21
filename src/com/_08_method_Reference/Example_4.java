package com._08_method_Reference;

@FunctionalInterface
interface MyInterface{
    Hello display(String say);
}
class Hello{
    public Hello(String say){
        System.out.print(say);
    }
}
public class Example_4 {
    public static void main(String[] args) {
        //Method reference to a constructor
        MyInterface ref = Hello::new;
        ref.display("Hello World!");
    }
}
