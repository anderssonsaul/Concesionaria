package concesionaria;

public class ColorPinturaExterior {
    String nombre;
    Double precio;
    Boolean seleccionado;

    public ColorPinturaExterior() {
        this.nombre = "";
        this.precio = 0.00;
        this.seleccionado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Boolean seleccionado) {
        this.seleccionado = seleccionado;
    }
}
