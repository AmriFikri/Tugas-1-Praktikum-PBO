/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kantor;

/**
 *
 * @author Lenovo
 */
class Satpam extends Karyawan {
    private String area;

    public Satpam(String name, int age, String area) {
        super(name, age);
        this.area = area;
    }

    @Override
    public void work() {
        System.out.println(name + " Sedang Berjaga di " + area);
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " Sebat");
    }

    @Override
    public void getPaid() {
        System.out.println(name + " Terima Gaji Satpam");
    }
}
