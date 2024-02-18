package Main;

public class Main {
    public static void main(String[] args) {


        // nombre y aforo del cine
        Cine cine = new Cine("Cine Cinesa", 500);

        // inicializamos las salas
        cine.inicializarSalas();

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 3) {

            System.out.println(
                    "Bienvenidos a " + cine.getNombreCine() + "\n" +
                            "1.- Ver Películas en Cartelera\n" +
                            "2.- Comprar Entrada\n" +
                            "3.- Salir"
            );


            int opcion1 = scanner.nextInt();

            switch (opcion1) {

                case 1:

                    cine.mostrarCartelera();
                    break;

                case 2:

                    System.out.print("Ingrese el número de sala (1 - 5): ");
                    int numeroSala = scanner.nextInt();

                    // si el numero es mayor e igual a uno y no sobrepasa el numero de salas del cine...
                    if (numeroSala >= 1 && numeroSala <= cine.getSalas().length) {

                        // declaramos una variable el cual sera el numero de la sala del cine - 1, se resta porque los arrays inician en 0
                        Sala salaSeleccionada = cine.getSalas()[numeroSala - 1];

                        // y de la sala seleccionada con su numero correspondiente mostramos la informacion
                        salaSeleccionada.mostrarInfo();

                        // para reservar la butaca:
                        System.out.print("Ingrese la fila (1-5): ");
                        int fila = scanner.nextInt();

                        System.out.print("Ingrese la columna (1-10): ");
                        int columna = scanner.nextInt();

                        //de la sala seleccionada utilizamos reservarButaca utilizando los valores proporsionados por el usuario
                        // si se cumple la reserva sera un exito
                        if (salaSeleccionada.reservarButaca(fila, columna)) {
                            System.out.println("Reserva realizada :D");
                            salaSeleccionada.mostrarButacas();
                        } else {
                            System.out.println("La butaca no esta disponible.");
                        }
                    } else {
                        System.out.println("ERROR, numero de sala no valido.");
                    }
                    break;

                case 3:

                    System.out.println("Saliendo...");
                    break;

                default:

                    System.out.println("Saliendo...");
                    break;

            }


        }
    }
}
