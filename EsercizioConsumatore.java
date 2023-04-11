/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.esercizioconsumatore;

/**
 *
 * @author User
 */
public class EsercizioConsumatore {

    public static void main(String[] args) {
        Risorsa r = new Risorsa();
        Produttore p1 = new Produttore("Produttore 1", r);
        Produttore p2 = new Produttore("Produttore 2", r);
        Consumatore c1 = new Consumatore("Consumatore 1", r);
        Consumatore c2 = new Consumatore("Consumatore 2", r);
        Consumatore c3 = new Consumatore("Consumatore 3", r);
        Consumatore c4 = new Consumatore("Consumatore 4", r);

        p1.start();
        p2.start();

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        try {
            Thread.sleep(3000);
        } catch (Exception ignored) {
        }

        p1.arresta();
        p2.arresta();

        c1.arresta();
        c2.arresta();
        c3.arresta();
        c4.arresta();

        System.out.println("THREAD MAIN FINE");
    
    }
}
