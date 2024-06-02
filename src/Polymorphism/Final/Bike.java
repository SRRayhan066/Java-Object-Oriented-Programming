package Polymorphism.Final;

public class Bike {

    final int speedLimit;

    Bike(){
        speedLimit=100;
    }
    final void run(){
        System.out.println("Speed Limit is "+speedLimit);
        System.out.println("Running...");
    }
}
