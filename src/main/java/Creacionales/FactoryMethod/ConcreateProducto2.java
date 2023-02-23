package Creacionales.FactoryMethod;

public class ConcreateProducto2 implements IProduct{
    @Override
    public void create() {
        System.out.println("Creando ConcreteProduct2");
    }
}