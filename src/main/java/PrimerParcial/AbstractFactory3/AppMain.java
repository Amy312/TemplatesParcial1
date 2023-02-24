package PrimerParcial.AbstractFactory3;



public class AppMain {
    public static void main(String[] argss) {
        String dato = "television";
        Television television = (Television) ArtefactoFactory.make(dato);
        television.cambiarPrecio(10000);

        dato = "radio";
        Radio radio = (Radio) ArtefactoFactory.make(dato);
        radio.cambiarPrecio(140);

        dato = "batidora";
        Batidora batidora = (Batidora) ArtefactoFactory.make(dato);
        batidora.cambiarPrecio(1000);

        dato = "refrigerador";
        Refrigerador refrigerador = (Refrigerador) ArtefactoFactory.make(dato);
        refrigerador.cambiarPrecio(6000);

        dato = "microondas";
        Microondas microondas = (Microondas) ArtefactoFactory.make(dato);
        microondas.cambiarPrecio(12000);

        radio.showInfo();
        batidora.showInfo();
        refrigerador.showInfo();
        microondas.showInfo();
        television.showInfo();

    }
}
