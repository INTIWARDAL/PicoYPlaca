package elementos;

/**
 *
 * @author COOP
 */
public class Carro {

    private String placa;
    private String fecha;
    private String hora;

    Fecha objFecha = new Fecha();
    Hora objHora = new Hora();
    Placa objPlaca = new Placa();

    public Carro(String placa, String fecha, String hora) {
        this.placa = placa;
        this.fecha = fecha;
        this.hora = hora;
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
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHorario() {
        return hora;
    }

    /**
     * @param horario the hora to set
     */
    public void setHorario(String horario) {
        this.hora = horario;
    }

    public void salida() {        
        objPlaca.setPlaca(placa);        
        objHora.setRevisaTiempo(hora);        
        objFecha.setFecha(fecha);

        System.out.println(" Placa: " + placa
                + "\n Fecha: " + fecha + "\n Día: " + objFecha.getDia()
                + "\n Hora: " + hora);

        System.out.println("\n Información del movimiento del CARRO \n"
                + "\n Placa: " + placa
                + "\n Fecha: " + fecha + "\n Día: " + objFecha.getDia()
                + "\n Hora: " + hora);
        
        // Revisión de parámetros de Pico y Placa

        if (700 <= objHora.getHora() && objHora.getHora() <= 900 || 1600 <= objHora.getHora() && objHora.getHora() <= 1930) {

            switch (objFecha.getDia()) {
                case "Lunes":
                    if (objPlaca.getDigito() == 1 || objPlaca.getDigito() == 2) {
                        System.out.println("\nHora restringida de Pico y Placa para su carro ");
                    } else {
                        System.out.println("\nHora permitida de Pico y Placa para su carro ");
                    }
                    break;
                case "Martes":
                    if (objPlaca.getDigito() == 3 || objPlaca.getDigito() == 4) {
                        System.out.println("\nHora restringida de Pico y Placa para su carro ");
                    } else {
                        System.out.println("\nHora permitida de Pico y Placa para su carro ");
                    }
                    break;
                case "Miércoles":
                    if (objPlaca.getDigito() == 5 || objPlaca.getDigito() == 6) {
                        System.out.println("\nHora restringida de Pico y Placa para su carro ");
                    } else {
                        System.out.println("\nHora permitida de Pico y Placa para su carro ");
                    }
                    break;
                case "Jueves":
                    if (objPlaca.getDigito() == 7 || objPlaca.getDigito() == 8) {
                        System.out.println("\nHora restringida de Pico y Placa para su carro ");
                    } else {
                        System.out.println("\nHora permitida de Pico y Placa para su carro ");
                    }
                    break;
                case "Viernes":
                    if (objPlaca.getDigito() == 9 || objPlaca.getDigito() == 0) {
                        System.out.println("\nHora restringida de Pico y Placa para su carro ");
                    } else {
                        System.out.println("\nHora permitida de Pico y Placa para su carro ");
                    }
                    break;
                case "Sábado":
                    System.out.println("\n¡Puede transitar libremente! en este día Sábado");
                    break;
                case "Domingo":
                    System.out.println("\n¡Puede transitar libremente! en este día Domingo");
                    break;
            }
        } else {
            System.out.println("\n¡Puede transitar libremente! está por fuera de la hora de Pico y Placa");
        }
    }
}
