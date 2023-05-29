package main.java.Day6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface PirelliTyres{


}

@PirelliTyres
public class Car {
    private String brand;
    private int year;
    private String engineType;

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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setYear(2012);
        car1.setEngineType("Flat V6");

        System.out.println(car1);
    }
}

