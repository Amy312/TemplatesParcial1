package Templates.Creacionales.AbstractFactory;

public class AppMain {
    public static void main(String[] argss) {
        String dato = "ProductD";

        AbstractFactory.make(dato).methodA();
        AbstractFactory.make(dato).methodB();
        AbstractFactory.make(dato).methodC();

        ConcreteProductA concreteProductA = (ConcreteProductA) AbstractFactory.make(dato);
        //save object

    }
}
