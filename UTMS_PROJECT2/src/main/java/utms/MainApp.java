/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utms;

public class MainApp {
    public static void main(String[] args) {

        // === Demonstrating Users and Overriding ===
        User student = new Students("JAMAL", "U1001", "VU-BIT-2407-2225-DAY");
        User lecturer = new Lecturer("Mr alex Bazigu", "L101");
        User officer = new TransportOfficer("Mr. Denis", "T005");

        System.out.println("\n--- User Transport Requests ---");
        student.requestTransport();
        lecturer.requestTransport();
        officer.requestTransport();

        // === Demonstrating Encapsulation ===
        System.out.println("\n--- Driver Information (Encapsulation) ---");
        Driver driver = new Driver("James", "DL-9987-UG");
        System.out.println("Driver Name: " + driver.getName());
        System.out.println("License No: " + driver.getLicenseNumber());

        // === Demonstrating Interfaces ===
        System.out.println("\n--- Vehicle Behaviors (Interfaces) ---");
        Bus bus = new Bus();
        bus.trackLocation();
        bus.performService();

        Van van = new Van();
        van.trackLocation();

        // === Demonstrating Method Overloading ===
        System.out.println("\n--- Driver Assignment (Method Overloading) ---");
        TransportService service = new TransportService();
        service.assignDriver("Bus");
        service.assignDriver("Van", "Morning");
    }
}

