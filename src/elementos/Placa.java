package elementos;

/**
 *
 * @author COOP
 */
public class Placa {

    private String placa;
    private int digito;

    public Placa(String placa) {
        this.placa = placa;
        this.digito = digito;
    }

    public Placa() {
        this.placa = placa;
        this.digito = digito;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
        String ultimo = placa.substring(placa.length() - 1);
        setDigito(Integer.parseInt(ultimo));
    }

    /**
     * @return the digito
     */
    public int getDigito() {
        return digito;
    }

    /**
     * @param digito the digito to set
     */
    public void setDigito(int digito) {
        this.digito = digito;
    }
}
