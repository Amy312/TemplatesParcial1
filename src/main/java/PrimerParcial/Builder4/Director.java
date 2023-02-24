package PrimerParcial.Builder4;



public class Director {
    private ComboBuilder builder;

    public Combo getProduct(){
        return builder.getCombo();
    }

    public void setBuilder(ComboBuilder builder){
        this.builder = builder;
    }

    public void buildCombo(){
        this.builder.createCombo();
        this.builder.buildPipocas();
        this.builder.buildCohocolates();
        this.builder.buildGaseosas();
    }
}
