package PrimerParcial.Builder4;

public class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void comprar(Combo c1) {
        System.out.println("El cliente compro un combo: ");
        c1.showInfo();
    }
}
