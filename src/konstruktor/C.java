/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konstruktor;

/**
 *
 * @author ASUS
 */
public class C extends B {
    C() { // super(); Tambahan kode secara otomatis oleh Java untuk memanggil
        // Konstruktor dari SuperClassnya
        super(); // Konstruktor default dari class B
        // Object dipanggil
        System.out.println("Konstruktor class C dieksekusi...");
    }
}