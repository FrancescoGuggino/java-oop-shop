package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // campi
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // costruttore

    public Prodotto( String nome, String descrizione, double prezzo, double iva) {
        Random random = new Random();
        int randomNumber = random.nextInt(99999999);
        this.codice = randomNumber ;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // getter e setter

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    // metodi


    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome +
                ", descrizione='" + descrizione +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }

    //metodo prezzo base

    public double getPrezzoBase(){
        return prezzo;
    }

    //metodo prezzo con iva

    public double getPrezzoIva() {
        return prezzo + (prezzo*iva/100);
    }

    public String getNomeCodice () {
        String nomeCodice = getPadCode()+ "-" + nome;
        return nomeCodice;
    }

    private String getPadCode() {
        String codice = String.valueOf(this.codice);
        while (codice.length() < 8) {
            codice = "0" + codice;

        }
        return codice;
    }
}
