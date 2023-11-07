package org.example;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private String  type;
    private int currentGear;
    private int seats;

    public Car(String name) {
        super(name);
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear =1;

        this.type = type;
        this.seats = seats;
    }

    public void changeGear(int newGear){
        //change current gear to new gear
        currentGear = newGear;
        System.out.println("changeGear Method  called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed,int newDirection) {
//    super.setCurrentSpeed(newSpeed);
//    super.setCurrentDirection(newDirection);
        super.move(newSpeed, newDirection);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
