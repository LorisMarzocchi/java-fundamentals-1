package org.learning.java;

import java.util.Scanner;

public class BigliettoTreno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci i chilometri:");
        int chilometri = scan.nextInt();
        System.out.println("Inserisci l'età:");
        int eta = scan.nextInt();

        double prezzoBase = chilometri * 0.21;
        double scontoGiovani = (prezzoBase * 20) / 100;
        double scontoAnziani = (prezzoBase * 40) / 100;

        double prezzoFinale;

        if (eta < 18) {
            prezzoFinale = prezzoBase - scontoGiovani;
        } else if (eta > 65) {
            prezzoFinale = prezzoBase - scontoAnziani;
        } else {
            prezzoFinale = prezzoBase;
        }

        System.out.println("Il prezzo totale del biglietto è: " + prezzoFinale + " €");

        scan.close();

    }
}
