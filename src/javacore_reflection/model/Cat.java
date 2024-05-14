package javacore_reflection.model;


public class Cat extends Animal {
    public Cat(int age) {
        super("aboba",age);
    }

    @Override
    public void doVoice() {
        System.out.println("meow");
    }
}
