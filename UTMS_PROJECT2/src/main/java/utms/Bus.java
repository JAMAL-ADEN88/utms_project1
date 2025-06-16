/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utms;

public class Bus implements Trackable, Serviceable {

    @Override
    public void trackLocation() {
        System.out.println("Bus: GPS location tracked.");
    }

    public void performService() {
        System.out.println("Bus: Maintenance service performed.");
    }
}

