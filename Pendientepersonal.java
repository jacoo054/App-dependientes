public class Pendientepersonal extends Pendiente {

    public Pendientepersonal(String descripcion,String año,String mes, String dia, String hora) {
        super(descripcion, año,mes, dia, hora);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("[Personal] " + getDescripcion() + " | Año: " + getAño() + " | Mes: " + getMes() + " | Día: " + getDia() + " | Hora: " + getHora());
    }
}