package Objetos;

public class Sala {

    private int numSala;
    private String[][] butacas;
    private Pelicula pelicula;

    public Sala(int numSala, int filas, int columnas, Pelicula pelicula) {
        this.numSala = numSala;
        this.butacas = new String[filas][columnas];
        this.pelicula = pelicula;

    }
}
