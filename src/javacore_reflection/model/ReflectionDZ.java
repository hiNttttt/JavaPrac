package javacore_reflection.model;

import java.lang.reflect.Field;

public class ReflectionDZ {
    public static void main (String[] args) throws NoSuchFieldException, IllegalAccessException {
        final Cat cat = new Cat(0);

        Field age = cat.getClass().getSuperclass().getDeclaredFields()[1];
        Field feet = cat.getClass().getSuperclass().getDeclaredFields()[0];
        Field name = cat.getClass().getSuperclass().getDeclaredFields()[2];

        age.setAccessible(true);
        feet.setAccessible(true);

        age.set(cat, 25);
        feet.set(cat, 8);
        name.set(cat, "Amogus");

        System.out.println(cat.getAge());
        System.out.println(cat.getFeet());
        System.out.println(cat.getName());
        System.out.println("Я теперь машина нахуй");

    }
}
