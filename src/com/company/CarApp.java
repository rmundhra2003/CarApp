package com.company;
import com.company.Car;

public class CarApp {

    public static void main (String[] args) {
        Car car = new Car();
        String c = "blue";
        Car car1 = new Car(c, "Jetta", "20 mph", "stopped", "parked", "stopped");

        String retString = car.setColour("red");
        System.out.println("" + retString);
        retString = car.setMake("Porsche");
        System.out.println("" + retString);
        car1.setSpeed("70 mph");
        retString = car.setSpeed("50 mph");
        System.out.println("" + retString);
        retString = car.setStatus("gone for emission testing");
        System.out.println("" + retString);
        car.operateCar("starting");
        car1.operateCar("zipping to 120 mph");
        car.operateCar("accelerating");

        car.operateCar("stopped");


    }


}
