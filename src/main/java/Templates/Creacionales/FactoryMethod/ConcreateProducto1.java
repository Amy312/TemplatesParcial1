package Templates.Creacionales.FactoryMethod;

public class ConcreateProducto1 implements IProduct{
    @Override
    public void create() {
        System.out.println("Creando ConcreteProduct1");
    }
}