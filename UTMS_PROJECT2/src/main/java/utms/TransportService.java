/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utms;

public class TransportService {

    public void assignDriver(String vehicleType) {
        System.out.println("Assigning a driver for vehicle type: " + vehicleType);
    }

    public void assignDriver(String vehicleType, String shiftTime) {
        System.out.println("Assigning driver for " + vehicleType + " during " + shiftTime + " shift.");
    }
}

