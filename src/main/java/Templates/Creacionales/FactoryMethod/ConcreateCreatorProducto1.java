package Templates.Creacionales.FactoryMethod;

public class ConcreateCreatorProducto1 extends Creator {
    @Override
    public ConcreateProducto1 factoryMethod() {
        ConcreateProducto1 p1 = new ConcreateProducto1();
        /*
         *
         * toda la logica de creacion del concrete product1
         *
         * */
        return p1;
    }
}