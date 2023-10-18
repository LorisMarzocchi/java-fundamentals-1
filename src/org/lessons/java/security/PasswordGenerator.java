package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        String nome = scan.nextLine();

        System.out.println("Inserisci il tuo cognome: ");
        String cognome = scan.nextLine();

        System.out.println("Inserisci il tuo colore: ");
        String colore = scan.nextLine();

        System.out.println("Inserisci la tua data di nascita gg/mm/aa: ");
        String dataDiNascita = scan.nextLine();
        String[] arrData = dataDiNascita.split("/");
        int giorno = Integer.parseInt(arrData[0]);
        int mese = Integer.parseInt(arrData[1]);
        int anno = Integer.parseInt(arrData[2]);

        int sommaData = giorno + mese + anno;

        String newPassword = nome + "-" + cognome + "-" + colore + "-" + sommaData;
        System.out.println("la tua password è: " + newPassword);

    }

}
