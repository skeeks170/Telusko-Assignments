package main.java.Day6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SeatingCapacity {
    int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface AdditionalVariable {
    String name();
}

@AdditionalVariable(name="transmission")
@SeatingCapacity(7)
public class Car {

    private String brand;
    private int year;
    private String engineType;
    private String transmission;

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

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }



    public void printSeatingCapacity() {
        SeatingCapacity seatingCapacityAnnotation = this.getClass().getAnnotation(SeatingCapacity.class);
        if (seatingCapacityAnnotation != null) {
            int seatingCapacity = seatingCapacityAnnotation.value();
            System.out.println("Seating Capacity: " + seatingCapacity);
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
//        car.setBrand("Toyota");
//        car.setYear(2012);
//        car.setEngineType("Flat V6");
        car.printSeatingCapacity();
    }
}