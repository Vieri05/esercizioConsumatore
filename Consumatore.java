/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercizioconsumatore;

/**
 *
 * @author User
 */
public class Consumatore extends Thread{
     private Risorsa r;
    private int val = 0;
    private boolean running = true;

    Consumatore(String nome, Risorsa r) {
        super(nome);
        this.r = r;
    }

    public void arresta() {
        this.running = false;
    }

    public void run() {
        while (running) {
            val = r.consuma();
            System.out.println(super.getName() + " ha consumato " + val);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("Thread " + super.getName() + " terminato");
    }
}
