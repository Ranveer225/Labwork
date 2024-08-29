
import com.mycompany.labwork1.Car;
import com.mycompany.labwork1.Vehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ranveersingh
 */
public class Main {
    public static void main(String[] args) {
       
        Vehicle myVehicle = new Vehicle(4, "Purple", 6.0f, "Petrol");
        // Instantiate Vehicle Object
        
        // Instantiate Car object
        
        Car myCar = new Car(4, "Grey", 5.0f, "Diesal", "Mercedes");
        
        System.out.println("Testing Vehicle:");
        System.out.println("Number of Wheels: " + myVehicle.getNumberOfWheels());
        System.out.println("Color: " + myVehicle.getColor());
        System.out.println("Engine Size: " + myVehicle.getEngineSize() + "L");
        System.out.println("Fuel Type: " + myVehicle.getFuelType());
     
        System.out.println("\nTesting Car:");
        myCar.honk();
        myCar.displayInfo();
    }
}
