
public class Piloto {
    private String numeroLicencia;
    private String nombre;
    private double horasVueloAcumuladas;

    public Piloto(String numeroLicencia, String nombre) {
        this.numeroLicencia = numeroLicencia;
        this.nombre = nombre;
        this.horasVueloAcumuladas = 0;
    }

    public void registrarVuelo(double horas) {
        if (horas > 0) {
            horasVueloAcumuladas += horas;
            System.out.println("Vuelo registrado correctamente.");
        } else {
            System.out.println("Las horas deben ser mayores que cero.");
        }
    }

    public double getHorasVueloAcumuladas() {
        return horasVueloAcumuladas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }
}
