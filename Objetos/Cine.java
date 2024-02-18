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

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
}
