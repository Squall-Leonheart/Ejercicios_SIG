public class Estratos {
    public static void main(String[] args) {
        // Crear personas
        Persona p1 = new Persona("Laura Martínez", "1098765432", 32, "La Paz", 2, 1423500, false);
        Persona p2 = new Persona("Carlos Pérez", "1234567890", 45, "Chico", 5, 3500000, false);
        Persona p3 = new Persona("Ana Torres", "1122334455", 29, "El Sol", 3, 2000000, false);

        // Crear servicios
        Servicio s1 = new Servicio("Agua Potable", 2000, 15, "m³");
        Servicio s2 = new Servicio("Energía Eléctrica", 500, 100, "kWh");
        Servicio s3 = new Servicio("Gas Natural", 1200, 30, "m³");

        System.out.println("=== Validar Estrato ===");
        p1.estratoValido();
        p2.estratoValido();
        p3.estratoValido();
        
        // Activar subsidios
        p1.activarSubsidio();
        p2.activarSubsidio();
        p3.activarSubsidio();

        System.out.println("=== INFORMACIÓN DE LAS PERSONAS ===");
        p1.mostrarInformacion();
        p1.imprimirSubsidio();
        System.out.println();

        p2.mostrarInformacion();
        p2.imprimirSubsidio();
        System.out.println();

        p3.mostrarInformacion();
        p3.imprimirSubsidio();
        System.out.println();

        System.out.println("=== CÁLCULO DE TARIFAS ===");

        System.out.println("\n>> Persona: " + p1.grupoSocial());
        s1.calcularTarifa(p1);
        s1.mostrarInfo();

        System.out.println("\n>> Persona: " + p2.grupoSocial());
        s2.calcularTarifa(p2);
        s2.mostrarInfo();

        System.out.println("\n>> Persona: " + p3.grupoSocial());
        s3.calcularTarifa(p3);
        s3.mostrarInfo();
    }
}