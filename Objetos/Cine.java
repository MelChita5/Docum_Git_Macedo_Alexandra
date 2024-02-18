package Objetos;

public class Cine {

    private String nombreCine;
    private int aforo;
    private Sala[] salas;

    public Cine(String nombreCine, int aforo) {
        this.nombreCine = nombreCine;
        this.aforo = aforo;
        this.salas = new Sala[5];
    }
}
