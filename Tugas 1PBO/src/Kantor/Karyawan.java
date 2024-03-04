/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kantor;

/**
 *
 * @author Lenovo
 */
abstract class Karyawan implements Interface {
    protected String name;
    protected int age;

    public Karyawan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}