package Objetos;

public class Sala {
    private int numSala;
    private String[][] butacas;
    private Pelicula pelicula;

    public Sala(int numSala, int filas, int columnas, Pelicula pelicula) {
        this.numSala = numSala;
        this.butacas = new String[filas][columnas];
        this.pelicula = pelicula;
        // Desde que se crea Sala se colocan, ya que se necesitan las butacas listas,
        inicializarButacas();
    }


    // Getter y Setters

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

        // Para inicializar las butacas las recorremos con su clasico for (primero las filas y despues las columas)
        // y todas las casillas seran el simbolo clasico de las butacas "[ ]"

        //filas
        for (int i = 0; i < butacas.length; i++) {

            //columnas
            for (int j = 0; j < butacas[i].length; j++) {

                //seran aquel simbolo que representan que estan libres
                butacas[i][j] = "[ ]";
            }
        }
    }


    public void mostrarInfo() {

        // Mostramos la informacion de la cartelera

        //sysos sin nada para estetica
        System.out.println();
        System.out.println("Sala " + numSala + ": " );
        System.out.println("Pelicula: " + pelicula.getTitulo() + " - Duración: " + pelicula.getDuracion() + " minutos");
        System.out.println();

    }


    public boolean reservarButaca(int fila, int columna) {
        // el usuario necesita ingresar la fila y la columna (inicializamos valores)de esta para poder reservarla

        //primero: el numero que ingresa el usuario debe ser mayor o igual que 1 Y que el numero no soprepase el numero total de filas

        //lo segundo es lo mismo pero con las columnas: el numero que ingresa el usuario debe ser mayor o igual que 1
        //Y que el numero no soprepase el numero total de columnas por tal razon hay un[0]

        //si la butaca de la fila - 1 y la columna - 1 no es igual al simbolo [X] se podra reservar una butaca
        if (	fila >= 1 && fila <= butacas.length &&
                columna >= 1 && columna <= butacas[0].length &&
                !butacas[fila - 1][columna - 1].equals("[X]")) {

            // dependiendo la fila y columna colocadas se pondra aquel simbolo el cual cambiara a ocupado
            butacas[fila - 1][columna - 1] = "[X]";

            // si todo lo anterir se cumple se retorna true, ya que fue exitoso
            return true;
        }
        //si lo anterior no se cumple se retornada false
        return false;
    }

    public void mostrarButacas() {

        System.out.println();
        System.out.println("Butacas actulizadas>>");

        // bucle for each, creamos fila, un array que sera cada fila de la MATRIS butacas
        for (String[] fila : butacas) {

            // se crea un string butacas que no es igual a la matris
            for (String butaca : fila) {
                // para que halla un espacio despues de cada asiento
                System.out.print(butaca + " ");
            }
            // syso muy importante el cual hara el salto de linea que le da forma a la matris
            System.out.println();
        }
    }
}

