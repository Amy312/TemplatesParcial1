package PrimerParcial.AbstractFactory3;

public class Television implements IArtefacto{
    private int precio;
    @Override
    public void cambiarPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("La Television cuesta Bs " + this.precio);
    }
}
