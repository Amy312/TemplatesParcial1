package PrimerParcial.Prototype2;

public class AppMain {
    public static void main(String []args){
        Televisor t1 = new Televisor("1234567890");
        t1.setSO("Android");
        t1.setVersionSO("11.0");
        t1.setPulgadas(80);
        t1.setResolucion(50);
        t1.setPuertoHDMI(true);
        t1.setPuertosUSB(4);
        t1.setControlRemoto(true);
        t1.setBluetooth(true);

        t1.showInfo();

        Televisor t2 =  t1.clone();
        t2.setSerial("0987654321");
        t2.showInfo();

        Televisor t3 =  t1.clone();
        t3.setSerial("0987624321");
        t3.showInfo();

        Televisor t4 =  t1.clone();
        t4.setSerial("1987654321");
        t4.showInfo();

        Televisor t5 =  t1.clone();
        t5.setSerial("2287654321");
        t5.showInfo();

    }



}
