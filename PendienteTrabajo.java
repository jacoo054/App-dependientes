public class PendienteTrabajo extends Pendiente {

    public PendienteTrabajo(String descripcion,String año, String mes, String dia, String hora) {
        super(descripcion, año,mes,  dia, hora);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("[Trabajo] " + getDescripcion() + " | Año: " + getAño() + "  | Mes: " + getMes() + "| Día: " + getDia() + " | Hora: " + getHora());
    }
}