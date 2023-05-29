package main.java.Day6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface HybridEngine { }

@HybridEngine
public class Car {
    private String brand;
    private int year;

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setYear(2012);

        System.out.println(car1);

        if (car1.getClass().isAnnotationPresent(HybridEngine.class)){
            System.out.println("This car has hybrid engine");
        }else {
            System.out.println("This car is faulty as it has no engine");
        }
    }
}

