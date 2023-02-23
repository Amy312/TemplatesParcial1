package PrimerParcial.Interpreter5;

public class Context {
    protected String input = "";
    protected int output = 0;
    protected boolean signo = true; //true : suma
                                    //false : multiplicacion
    public Context(String input){
        this.input = input;
    }

}
