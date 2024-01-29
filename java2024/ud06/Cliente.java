package ud06;

public class Cliente {
    private int id;
    private String nombre;
    private int descuento;

    public Cliente(int id, String nombre, int descuento) {
        this.id = id;
        this.nombre = nombre;
        this.descuento = descuento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDescuento() {
        return descuento;
    }
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    @Override
    public String toString() {
        return String.format("%s(%d)(%d%%)", nombre, id, descuento);
    }
}
