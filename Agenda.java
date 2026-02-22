import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pendiente> pendientes;

    public Agenda() {
        pendientes = new ArrayList<>();
    }

    public void agregarPendiente(Pendiente p) {
        pendientes.add(p);
    }

    public void mostrarPendientes() {
        if (pendientes.isEmpty()) {
            System.out.println("No hay pendientes registrados.");
        } else {
            for (Pendiente p : pendientes) {
                p.mostrarDetalle(); 
            }
        }
    }
}