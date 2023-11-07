package org.example;

public class Main {
    public static void main(String[] args) {
         F1 mercedes = new F1("mercedes",false);
          mercedes.move(48,8);
         mercedes.accelerate(20);
         mercedes.accelerate(-60);

         WaterVehicle boat = new Boat("boat1",20);
        System.out.println(boat.getVehicleCapacity());
        System.out.println(boat.getVehicleName());
    }
}