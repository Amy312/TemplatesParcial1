package PrimerParcial.Singleton1;

public class AppMain {
    public static void main(String[] args) {

        Administrador administrador = new Administrador("Josue");

        Vehiculo v1 = new Vehiculo("0111ABC", "A", "verde");
        Vehiculo v2 = new Vehiculo("121CCC", "C", "rojo");
        Vehiculo v3 = new Vehiculo("2018ACD", "B", "rosa");
        Vehiculo v4 = new Vehiculo("3456MNP", "B", "negro");
        Vehiculo v5 = new Vehiculo("123CRF", "A", "celeste");
        Vehiculo v6 = new Vehiculo("1231ABC", "B", "blanco");

        administrador.revisarRegistro();

        v1.pagarPeaje();
        v2.pagarPeaje();
        v3.pagarPeaje();
        v4.pagarPeaje();
        v5.pagarPeaje();
        v6.pagarPeaje();

        administrador.revisarRegistro();
        administrador.revisarSaldo();



    }
}