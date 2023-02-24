package PrimerParcial.Builder4;

public class Combo {
    private String pipocas;
    private String gaseosas;
    private String chocolates;

    public String getPipocas() {
        return pipocas;
    }

    public Combo setPipocas(String pipocas) {
        this.pipocas = pipocas;
        return this;
    }

    public String getGaseosas() {
        return gaseosas;
    }

    public Combo setGaseosas(String gaseosas) {
        this.gaseosas = gaseosas;
        return this;

    }

    public String getChocolates() {
        return chocolates;
    }

    public Combo setChocolates(String chocolates) {
        this.chocolates = chocolates;
        return this;

    }

    public void showInfo() {
        System.out.println("Pipocas: "+pipocas);
        System.out.println("Gaseosas : "+gaseosas);
        System.out.println("Chocolates: "+chocolates +"\n");


    }
}
