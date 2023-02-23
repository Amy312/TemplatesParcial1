package PrimerParcial.Prototype2;

public class Televisor implements ITelevisor{

    private String SO;
    private String versionSO;
    private int pulgadas;
    private int resolucion;
    private boolean puertoHDMI;
    private int puertosUSB;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serial;

    public Televisor(String serial){
        this.serial = serial;

    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getVersionSO() {
        return versionSO;
    }

    public void setVersionSO(String versionSO) {
        this.versionSO = versionSO;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public Televisor clone() {
        Televisor clone = new Televisor(this.serial);
        clone.setSO(this.getSO());
        clone.setVersionSO(this.getVersionSO());
        clone.setPulgadas(this.getPulgadas());
        clone.setResolucion(this.getResolucion());
        clone.setPuertoHDMI(this.isPuertoHDMI());
        clone.setPuertosUSB(this.getPuertosUSB());
        clone.setControlRemoto(this.isControlRemoto());
        clone.setBluetooth(this.isBluetooth());
        return clone;
    }

    public void showInfo(){
        System.out.println("-- Televisor --");
        System.out.println("SO: " + getSO());
        System.out.println("Version SO: " + getVersionSO());
        System.out.println("Pulgadas: " +getPulgadas());
        System.out.println("Resolucion: " +getResolucion());
        System.out.println("PuertoHDMI: " +isPuertoHDMI());
        System.out.println("Puertos USB: " + getPuertosUSB());
        System.out.println("Control Remoto: " +isControlRemoto());
        System.out.println("Bluetooth: " + isBluetooth());
        System.out.println("Serial de telvisor: " + getSerial() + "\n");

    }
}
