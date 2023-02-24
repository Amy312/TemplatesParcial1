package PrimerParcial.Builder4;


public class AppMain {
    public static void main(String[]args){
        Director director = new Director();
        MegaPaquete megaPaquete = new MegaPaquete();
        MedianoPaquete medianoPaquete= new MedianoPaquete();
        NormalPaquete normalPaquete = new NormalPaquete();

        Cliente cliente = new Cliente("Ambar");


        director.setBuilder(megaPaquete);
        director.buildCombo();

        Combo c1 = director.getProduct();
        cliente.comprar(c1);


        director.setBuilder(medianoPaquete);
        director.buildCombo();

        Combo c2 = director.getProduct();
        cliente.comprar(c2);


        director.setBuilder(normalPaquete);
        director.buildCombo();

        Combo c3 = director.getProduct();
        cliente.comprar(c3);



    }
}
