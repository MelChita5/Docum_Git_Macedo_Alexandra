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

    private void inicializarButacas() {


        for (int i = 0; i < butacas.length; i++) {


            for (int j = 0; j < butacas[i].length; j++) {

                butacas[i][j] = "[ ]";
            }
        }
    }

    public void mostrarInfo() {


        System.out.println();
        System.out.println("Sala " + numSala + ": " );
        System.out.println("Pelicula: " + pelicula.getTitulo() + " - Duración: " + pelicula.getDuracion() + " minutos");
        System.out.println();

    }


}
