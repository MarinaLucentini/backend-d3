package es2;

import java.util.Arrays;

public class Sim {
    Chiamata chiamata1 = new Chiamata(329444555, 20);
    Chiamata chiamata2 = new Chiamata(33345555, 5);
    Chiamata chiamata3 = new Chiamata(33345555, 10);
    Chiamata chiamata4 = new Chiamata(33345755, 2);
    Chiamata chiamata5 = new Chiamata(333457556, 1);
    private int numero;
    private int credito;
    private Chiamata[] chiamate;

    public Sim(int numero) {
        this.numero = numero;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }


    @Override
    public String toString() {
        return "Sim{" +
                "numero=" + numero +
                ", credito=" + credito +
                ", chiamate=" + Arrays.toString(chiamate) +
                '}';
    }


}
