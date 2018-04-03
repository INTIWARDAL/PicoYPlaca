package elementos;

/**
 *
 * @author COOP
 */
public class Hora {

    private String revisaTiempo;
    private int hora;

    public Hora(String tiempoH) {
        this.revisaTiempo = tiempoH;
    }
    
    public Hora() {
        this.revisaTiempo = revisaTiempo;
        this.hora = hora;
    }

    /**
     * @return the revisaTiempo
     */
    public String getRevisaTiempo() {
        return revisaTiempo;
    }

    /**
     * @param tiempoH the revisaTiempo to set
     */
    public void setRevisaTiempo(String tiempoH) {
        this.revisaTiempo = tiempoH;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        String[] parts = revisaTiempo.split(":");
        String tiempo = parts[0] + parts[1];
        hora = Integer.parseInt(tiempo);
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

}
