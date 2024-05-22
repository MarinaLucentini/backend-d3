package es3;

public class Main {
    public static void main(String[] args) {

        Cliente client1 = new Cliente("Marco", "Rossi", "marcorossi@gmail.com", "10/05/2024");
        Articolo art1 = new Articolo("telefono", 50, 2);
        Articolo art2 = new Articolo("pc", 150, 2);
        Articolo art3 = new Articolo("tablet", 250, 2);
        Articolo art4 = new Articolo("tv", 500, 2);
        Articolo art5 = new Articolo("mouse", 250, 2);
        Articolo[] arrayarticoli = {art1, art2, art3, art4, art5};


        Carrello carrello = new Carrello(client1);
        carrello.setArticoli(arrayarticoli);
        System.out.println(carrello);
    }
}
