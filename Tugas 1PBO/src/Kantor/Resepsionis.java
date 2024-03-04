/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kantor;

/**
 *
 * @author Lenovo
 */
class Resepsionis extends Karyawan {
    private String shift;

    public Resepsionis(String name, int age, String shift) {
        super(name, age);
        this.shift = shift;
    }

    @Override
    public void work() {
        System.out.println(name + " Sedang Bekerja " + shift);
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " Makan di kantin");
    }

    @Override
    public void getPaid() {
        System.out.println(name + " Terima Gaji Resepsionis");
    }
}
