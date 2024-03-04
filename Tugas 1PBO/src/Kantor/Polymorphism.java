/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Kantor;

/**
 *
 * @author Lenovo
 */
public class Polymorphism {
    public static void main(String[] args) {
        try {
            // Create instances of different employees
            Manager manager = new Manager("Joko", 35, "Manager");
            Resepsionis receptionist = new Resepsionis("Yuki", 25, "Shift Pagi");
            Satpam security = new Satpam("Abdul", 40, "Disekitar Parkiran Kantor");

            // Simulate workday
            System.out.println("Mulai Bekerja:");
            manager.work();
            receptionist.work();
            security.work();

            // Simulate break time
            System.out.println("\nWaktu Istirahat:");
            manager.takeBreak();
            receptionist.takeBreak();
            security.takeBreak();

            // Simulate getting paid
            System.out.println("\nPemberian Gaji:");
            manager.getPaid();
            receptionist.getPaid();
            security.getPaid();

            // Attempt to create a security guard with invalid age
            Satpam invalidSecurity = new Satpam("Invalid", -10, "Area");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
