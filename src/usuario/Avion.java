package usuario;

public class Avion {

    private int capacidadComb;
    private int costoKm;
    private int capacidadPasajeros;
    private int velocidadMax;
    private String propulsor;

    public Avion(int capacidadComb, int costoKm, int capacidadPasajeros, int velocidadMax, String propulsor) {
        this.capacidadComb = capacidadComb;
        this.costoKm = costoKm;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadMax = velocidadMax;
        this.propulsor = propulsor;
    }

    public int getCapacidadComb() {
        return capacidadComb;
    }

    public void setCapacidadComb(int capacidadComb) {
        this.capacidadComb = capacidadComb;
    }

    public int getCostoKm() {
        return costoKm;
    }

    public void setCostoKm(int costoKm) {
        this.costoKm = costoKm;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(String propulsor) {
        this.propulsor = propulsor;
    }
}
