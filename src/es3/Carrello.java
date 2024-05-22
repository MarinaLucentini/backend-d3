package es3;


import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private int totale;


    /*public static int totaleArticoli (Articolo[] articoli){

        for (int i = 0; i<articoli.length; i++){

        }
        return somma;
    };*/
    public Carrello(Cliente user) {

        this.cliente = user;
        this.articoli = new Articolo[5];

    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

   
    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", articoli=" + Arrays.toString(articoli) +
                ", totale=" + totale +
                '}';
    }
}
