/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercizioconsumatore;

/**
 *
 * @author User
 */
public class Risorsa {
    private int val;
    private boolean disponibile = false;

    public synchronized int consuma() {
        while (!disponibile) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        disponibile = false;
        notify();
        return val;
    }

    public synchronized void produci(int val) {
        while (disponibile) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        this.val = val;
        disponibile = false;
        notify();
    }
}
