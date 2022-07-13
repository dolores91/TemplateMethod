package menu;

public class Infantil extends Menu{

    private int cantidadJuguetes;

    public Infantil(double precioBase, int cantidadJuguetes) {
        super(precioBase);
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    protected String armarMenu() {
        return null;
    }

    @Override
    protected double calcularPrecio() {
        return 0;
    }

    public int getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public void setCantidadJuguetes(int cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }
}
