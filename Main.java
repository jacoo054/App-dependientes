import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        boolean salir = false;

        while (!salir) {

            System.out.println("\n AGENDA DIARIA \n");
            System.out.println("1. Agregar pendiente personal");
            System.out.println("2. Agregar pendiente de trabajo");
            System.out.println("3. Ver pendientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            if (opcion == 1) {

                System.out.print("Descripción: ");
                String descripcion = sc.nextLine();

                System.out.print("Año: ");
                String año = sc.nextLine();

                System.out.print("Mes: ");
                String mes = sc.nextLine();

                System.out.print("Día: ");
                String dia = sc.nextLine();

                System.out.print("Hora: ");
                String hora = sc.nextLine();

                Pendiente p = new PendientePersonal(descripcion, año,mes,  dia, hora);
                agenda.agregarPendiente(p);

                } else if (opcion == 2) {

                System.out.print("Descripción: ");
                String descripcion = sc.nextLine();

                System.out.print("Año: ");
                String año = sc.nextLine();

                System.out.print("Mes: ");
                String mes = sc.nextLine();

                System.out.print("Día: ");
                String dia = sc.nextLine();

                System.out.print("Hora: ");
                String hora = sc.nextLine();

                Pendiente p = new PendienteTrabajo(descripcion, año, mes, dia, hora);
                agenda.agregarPendiente(p);

            } else if (opcion == 3) {

                agenda.mostrarPendientes();

            } else if (opcion == 4) {

                salir = true;
                System.out.println("Programa finalizado.");

            } else {

                System.out.println("Opción inválida, intente de nuevo.");
            }
        }

        sc.close();
    }
}



