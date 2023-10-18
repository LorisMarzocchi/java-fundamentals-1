package org.learning.java;

import java.util.Objects;
import java.util.Scanner;

public class Ferragnez {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");
        String nomeUtente = scan.nextLine();

        boolean nomeTrovato = false;

        String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        for (int i = 0; i < invitati.length; i++) {
            if (nomeUtente.equals(invitati[i])){
                nomeTrovato = true;
                break;
            }
        }
        if (nomeTrovato) {
            System.out.println("Puoi entrare");
        }else {
            System.out.println("Non sei stato invitato");
        }
        scan.close();
    }
}
