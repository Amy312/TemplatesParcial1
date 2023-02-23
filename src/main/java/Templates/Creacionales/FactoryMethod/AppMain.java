package Templates.Creacionales.FactoryMethod;

public class AppMain {
    public static void main (String[]ars){
        ConcreateProducto1 prod1 = new ConcreateCreatorProducto1().factoryMethod();
        prod1.create();
    }
}
