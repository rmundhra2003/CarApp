package com.company;

public class Car {
    private String colour;
    private String make;
    private String speed;
    private String status;
    private String stoppedReason;
    private String op;

    //Default constructor
    public Car() {

    }
    //Overloaded constructor
    public Car(String c, String m)
    {
            this.colour = c;
            this.make = m; this.speed = "";
            this.status = "";
            this.stoppedReason = "";
            this.op = "";
    }

    //Getters and setters for class variables
    public String setColour(String c) {
        this.colour = c;
        return("The car is " + c);
    }
    public String getColour() {
        return this.colour;
    }
    public String setMake(String m) {
        this.make = m;
        return("This car is a " + m);
    }
    public String getMake() {
        return this.make;
    }
    public String setSpeed(String s) {
        this.speed = s;
        return ("The speed is " +s);
    }
    public String getSpeed() {
        return this.speed;
    }
    public String setStatus(String s) {
        this.status = s;
        return ("The car is " +s);

    }
    public String getStatus() {
        return this.status;
    }
    public String setStoppedReason(String r) {
        this.stoppedReason = r;
        return ("The car is stopped for " +r);
    }
    public String getStoppedReason() {
        return this.stoppedReason;
    }
    public void operateCar(String opCode) {

        System.out.println("The " +this.colour +" " + this.make +" " +"is " + opCode);
    }
    public String getDescription() {
        String s = "The car is " +this.getColour() +" " +this.getMake();
        return s;
    }


}
