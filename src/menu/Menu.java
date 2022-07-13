package menu;

public abstract class Menu {
    private double precioBase;

    public Menu(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String prepararMenu(){

        String resultado;

        resultado = "El menu consiste de: " + armarMenu();
        resultado += " y el precio es: $" + calcularPrecio();
        return resultado;

    }

    protected abstract String armarMenu();
    protected abstract double calcularPrecio();
}
