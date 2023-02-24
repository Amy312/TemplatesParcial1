package PrimerParcial.Builder4;

public class MegaPaquete extends ComboBuilder {
    @Override
    public void buildPipocas() {
        combo.setPipocas("pipocas extragrandes");
    }

    @Override
    public void buildGaseosas() {
        combo.setGaseosas("3 vasos de gaseosas extragrandes con recarga ilimitada");

    }

    @Override
    public void buildCohocolates() {
        combo.setChocolates("2 chocolates grandes");

    }
}
