/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labwork1;

/**
 *
 * @author ranveersingh
 */
public class Vehicle {
    
    //Attributes of class
    
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;
    
    // Constructors for vehicle
    
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }
    
    // Getters and setters 
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

// New class Car to extend Vehicle

public class Car extends Vehicle {
   
    private String brand;
    
    // Additional attribute

   
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

   
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    public void honk() {
        System.out.println("Honk, honk!");
    }
    
    // Method named honk to print honk, honk

    
    // Method to print all attributes
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize() + "L");
        System.out.println("Fuel Type: " + getFuelType());
    }
}

