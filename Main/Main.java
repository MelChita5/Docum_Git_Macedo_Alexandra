package Main;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cine cine = new Cine("Cine Cinesa", 500);
        cine.inicializarSalas();

        System.out.println(
                "Bienvenidos a " + cine.getNombreCine() + "\n" +
                        "1.- Ver Películas en Cartelera\n" +
                        "2.- Comprar Entrada\n" +
                        "3.- Salir"
        );

        int opcion1 = scanner.nextInt();

        switch (opcion1){
            case 1:
                cine.mostrarCartelera();
                break;
            case 2:
                System.out.print("Ingrese el número de sala (1 - 5): ");
                int numeroSala = scanner.nextInt();

                if (numeroSala >= 1 && numeroSala <= cine.getSalas().length){

                    Sala salaSeleccionada = cine.getSalas()[numeroSala - 1];


                    salaSeleccionada.mostrarInfo();


                    System.out.print("Ingrese la fila (1-5): ");
                    int fila = scanner.nextInt();

                    System.out.print("Ingrese la columna (1-10): ");
                    int columna = scanner.nextInt();
                }
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Saliendo...");
                break;

        }
    }
}
