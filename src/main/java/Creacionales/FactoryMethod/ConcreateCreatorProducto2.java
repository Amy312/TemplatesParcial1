package Creacionales.FactoryMethod;

public class ConcreateCreatorProducto2 extends Creator {
    @Override
    public ConcreateProducto2 factoryMethod() {
        ConcreateProducto2 p2 = new ConcreateProducto2();
        /*
         *
         * toda la logica de creacion del concrete product2
         *
         * */
        return p2;
    }
}