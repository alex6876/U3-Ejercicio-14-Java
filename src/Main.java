public class Main {
    public static void main(String[] args) {

        Piloto piloto = new Piloto("LIC-1234", "Carlos");

        System.out.println("--- Registro de vuelos ---");

        piloto.registrarVuelo(5.5);
        piloto.registrarVuelo(8);
        piloto.registrarVuelo(3.5);

        // Intentos inválidos
        piloto.registrarVuelo(-2);
        piloto.registrarVuelo(0);

        System.out.println("\n--- Información del piloto ---");

        System.out.println("Nombre: " + piloto.getNombre());
        System.out.println("Licencia: " + piloto.getNumeroLicencia());

        System.out.println("Horas acumuladas: "
                + piloto.getHorasVueloAcumuladas());
    }
}
