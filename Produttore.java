/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercizioconsumatore;

/**
 *
 * @author User
 */
public class Produttore extends Thread{
     private Risorsa r;
    private int val = 0;
    private boolean running = true;

    Produttore(String nome, Risorsa r) {
        super(nome);
        this.r = r;
    }

    public void arresta() {
        this.running = false;
    }

    public void run() {
        while (running) {
            val++;
            r.produci(val);
            System.out.println(super.getName() + " ha prodotto " + val);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("Thread " + super.getName() + " terminato");
    }
}
