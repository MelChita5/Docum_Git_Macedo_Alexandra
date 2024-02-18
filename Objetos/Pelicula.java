package Objetos;

public class Pelicula {
    private String titulo;
    private int duracion;
    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    // SETTERS  (establece un valor)
    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    // SETTERS  (establece un valor)

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
