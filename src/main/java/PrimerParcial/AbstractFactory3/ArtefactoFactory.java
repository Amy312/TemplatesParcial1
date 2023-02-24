package PrimerParcial.AbstractFactory3;


public class ArtefactoFactory {
    public static IArtefacto make(String objectType){
        IArtefacto product;
        switch (objectType.toLowerCase()){
            case "television":
                product = new Television();
                break;
            case "radio":
                product = new Radio();
                break;
            case "batidora":
                product = new Batidora();
                break;
            case "refrigerador":
                product = new Refrigerador();
                break;
            default:
                product = new Microondas();
                break;
        }
        return product;
    }
}
