package menu;

public class Vegetariano extends Menu{
    private int cantidadEspecias;
    private int cantidadSalsas;


    public Vegetariano(double precioBase, int cantidadEspecias, int cantidadSalsas) {
        super(precioBase);
        this.cantidadEspecias = cantidadEspecias;
        this.cantidadSalsas = cantidadSalsas;
    }

    @Override
    protected String armarMenu() {
        return "Un menu vegetariano con " + getCantidadEspecias() + " especias y " + getCantidadSalsas() + " salsas" ;
    }

    @Override
    protected double calcularPrecio() {

        return (this.getPrecioBase() * (1 + (0.01 * this.cantidadEspecias))) + (this.cantidadSalsas * 2);
    }

    public int getCantidadEspecias() {
        return cantidadEspecias;
    }

    public void setCantidadEspecias(int cantidadEspecias) {
        this.cantidadEspecias = cantidadEspecias;
    }

    public int getCantidadSalsas() {
        return cantidadSalsas;
    }

    public void setCantidadSalsas(int cantidadSalsas) {
        this.cantidadSalsas = cantidadSalsas;
    }
}
