package PrimerParcial.Interpreter5;


public class AppMain {
    public static void main(String[] args) {
        String msg = "2 * 3 + 5 + 5 + 5";
        String msg2 = "20 * 3 + 5";

        Evaluador evaluador = new Evaluador(msg);
        Evaluador evaluador2 = new Evaluador(msg2);

        System.out.println("El resultado final de " + msg + " es " + evaluador.resultado());
        System.out.println("El resultado final de " + msg2 + " es " + evaluador2.resultado());

    }
}
