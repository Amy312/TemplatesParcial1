package PrimerParcial.Singleton1;

public class Administrador {
    public String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public void revisarRegistro(){
        Cabina.getInstance().mostrarReporte();
    }

    public void revisarSaldo(){
        Cabina.getInstance().mostrarSaldo();
    }
}
