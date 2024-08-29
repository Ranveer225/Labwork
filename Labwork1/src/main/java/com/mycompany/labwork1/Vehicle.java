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

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
