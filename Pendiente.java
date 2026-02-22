public abstract class Pendiente {

    private String descripcion;
    private String año;
    private String mes;
    private String dia;
    private String hora;
    

    public Pendiente(String descripcion,String año, String mes, String dia, String hora) {
        this.descripcion = descripcion;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }
}