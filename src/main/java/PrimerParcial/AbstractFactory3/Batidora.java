package PrimerParcial.AbstractFactory3;

public class Batidora implements IArtefacto{
    private int precio;
    @Override
    public void cambiarPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("La Batidora cuesta Bs " + this.precio);
    }

}
