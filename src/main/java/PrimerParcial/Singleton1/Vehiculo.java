package PrimerParcial.Singleton1;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String color;

    public Vehiculo(String placa, String modelo, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String showinfo() {
        return  "Placa: " + getPlaca() + ", modelo: " + getModelo() + " y color: " + getColor();
    }

    public void pagarPeaje(){
        int tipo = 0;
        if(this.modelo.equals("A")){
            tipo = 10;
        } else if(this.modelo.equals("B")){
            tipo = 20;
        } else {
            tipo = 15;
        }
        Cabina.getInstance().pagarPeaje(tipo, this);
    }
}
