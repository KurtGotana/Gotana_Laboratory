/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KurtLaurenceLGotana
 */

import java.util.Scanner;

class Vehicle {

    private String brand;
    private int speed;
    private String fuelType;

    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }

    public static void main(String[] args) {

    }
}

class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, int speed, String fuelType, int numberOfDoors) {
        super(brand, speed, fuelType);
        this.numberOfDoors = numberOfDoors;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

}

class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

public class TestVehicle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Car details:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String carFuelType = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int numberOfDoors = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter Motorcycle details:");
        System.out.print("Brand: ");
        String motorBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int motorSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String motorFuelType = scanner.nextLine();
        System.out.println("Has Sidecar (true/false): ");
        boolean motorSidecar = scanner.nextBoolean();
        
        Vehicle car = new Car(carBrand, carSpeed, carFuelType, numberOfDoors);
        Vehicle motor = new Motorcycle(motorBrand, motorSpeed, motorFuelType, motorSidecar);

        System.out.println();
        System.out.println("Car Details:");
        car.displayInfo();
        System.out.println();
        System.out.println("Motorcycle Details:");
        motor.displayInfo();

        scanner.close();
    }
}

