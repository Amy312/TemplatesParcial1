package PrimerParcial.Builder4;


public abstract class ComboBuilder {
    protected Combo combo;
    public Combo getCombo(){
        return combo;
    }
    public void createCombo(){
        combo = new Combo();
    }

    public abstract void buildPipocas();
    public abstract void buildGaseosas();
    public abstract void buildCohocolates();


}
