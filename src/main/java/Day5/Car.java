package Day5;

import java.lang.reflect.*;

public class Car {
    private String brand;
    private int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Instance block
    {
        System.out.println("Instance block: This gets executed before the constructor.");
    }

    // Static block
    static {
        System.out.println("Static block: This gets executed only once when the class is loaded.");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method: This can be called without creating an object of the class.");
    }

    // Object method
    public void drive() {
        System.out.println("Driving the " + brand + " car.");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2023);

        System.out.println("Class Information ----------------------------------------------------------------");

        // Using reflection API to access class information
        Class<?> carClass = car.getClass();
        System.out.println("Class name: " + carClass.getName());
        System.out.println("Modifiers: " + Modifier.toString(carClass.getModifiers()));

        System.out.println("Constructor Information----------------------------------------------------------------");

        // Using reflection API to access constructor information
        Constructor<?>[] constructors = carClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor: " + constructor);
        }

        System.out.println("Methods Information----------------------------------------------------------------");

        // Using reflection API to access method information
        Method[] methods = carClass.getMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }
    }
}
