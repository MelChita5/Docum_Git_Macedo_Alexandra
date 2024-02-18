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
    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public String[][] getButacas() {
        return butacas;
    }

    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
