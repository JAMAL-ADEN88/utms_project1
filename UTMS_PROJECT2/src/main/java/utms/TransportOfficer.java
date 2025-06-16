/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utms;

public class TransportOfficer extends User {

    public TransportOfficer(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer: " + name + " | ID: " + userId + " is coordinating transport assignments.");
    }
}
