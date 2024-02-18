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
    public void inicializarSalas() {

        //creacion de datos de las peliculas
        Pelicula pelicula1 = new Pelicula("El Padrino", 175);
        Pelicula pelicula2 = new Pelicula("La Lista de Schindler", 195);
        Pelicula pelicula3 = new Pelicula("El libro de la vida", 125);
        Pelicula pelicula4 = new Pelicula("La Casablanca", 102);
        Pelicula pelicula5 = new Pelicula("El viaje de Chihiro", 125);

        // con la creacion de 5 arrays salas, cada una tiene su numero de sala, la cantidad de filas y columnas de las butacas y la pelicula la cual transmitira
        salas[0] = new Sala(1, 5, 10, pelicula1);
        salas[1] = new Sala(2, 5, 10, pelicula2);
        salas[2] = new Sala(3, 5, 10, pelicula3);
        salas[3] = new Sala(4, 5, 10, pelicula4);
        salas[4] = new Sala(5, 5, 10, pelicula5);
    }

    public void mostrarCartelera() {


        System.out.println("<< Cartelera >>");

        for (Sala sala : salas) {


            sala.mostrarInfo();
        }
    }
}
