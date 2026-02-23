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