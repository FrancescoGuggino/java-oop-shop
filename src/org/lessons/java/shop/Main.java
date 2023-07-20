package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // chiedo i dati
        System.out.print("Inserisci il nome del prodotto: ");
        String nomeProdotto= scan.nextLine();
        System.out.print("Inserisci la descrizione del prodotto: ");
        String descrizioneProdotto= scan.nextLine();
        System.out.print("Inserisci il prezzo del prodotto: ");
        double prezzoProdotto = Double.parseDouble(scan.nextLine());
        System.out.print("Inserisci l'iva del prodotto: ");
        double prezzoProdottoIva = Double.parseDouble(scan.nextLine());

        Prodotto prodotto = new Prodotto(nomeProdotto,descrizioneProdotto,prezzoProdotto,prezzoProdottoIva);

        System.out.println(prodotto);

        System.out.println(prodotto.getPrezzoBase());
    }
}
