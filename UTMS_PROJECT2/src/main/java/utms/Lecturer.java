/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utms;


public class Lecturer extends User {

    public Lecturer(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer: " + name + " | ID: " + userId + " is requesting transport to the seminar.");
    }
}

