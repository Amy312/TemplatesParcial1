package PrimerParcial.Builder4;

public class MedianoPaquete extends ComboBuilder {
    @Override
    public void buildPipocas() {
        combo.setPipocas("pipocas grandes");
    }

    @Override
    public void buildGaseosas() {
        combo.setGaseosas("2 vasos de refrescos");

    }

    @Override
    public void buildCohocolates() {
        combo.setChocolates("1 chocolate");

    }
}
