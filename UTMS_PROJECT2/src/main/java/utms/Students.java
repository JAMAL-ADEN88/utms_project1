/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utms;


public class Students extends User {
    private String studentId;

    public Students(String name, String userId, String studentId) {
        super(name, userId);
        this.studentId = studentId;
    }

    @Override
    public void requestTransport() {
        System.out.println("Student: " + name + " | Reg No: " + studentId + " is requesting transport to the hostel.");
    }
}
