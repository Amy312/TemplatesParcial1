package PrimerParcial.Builder4;

public class NormalPaquete extends ComboBuilder {
    @Override
    public void buildPipocas() {
        combo.setPipocas(" pipocas en envase normal");
    }

    @Override
    public void buildGaseosas() {
        combo.setGaseosas("1 refresco");

    }

    @Override
    public void buildCohocolates() {
        combo.setChocolates("no chocolates");

    }
}