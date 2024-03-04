/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kantor;

/**
 *
 * @author Lenovo
 */
class Manager extends Karyawan {
    private String department;

    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " Sedang mengurus data penjualan di kantor " + department);
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " Makan di kantin");
    }

    @Override
    public void getPaid() {
        System.out.println(name + " Terima Gaji Manager");
    }
}
