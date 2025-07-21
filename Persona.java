public class Persona {
    // Atributos
    private String nombre;
    private String cedula;
    private int edad;
    private String barrio;
    private int estrato;
    private double ingresoMensual;
    private boolean subsidioActivo;

    // Constructor
    Persona(String nombre, String cedula, int edad, String barrio, int estrato, double ingresoMensual, boolean subsidioActivo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.barrio = barrio;
        this.estrato = estrato;
        this.ingresoMensual = ingresoMensual;
        this.subsidioActivo = subsidioActivo;
    }

    // Método 1
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Barrio: " + barrio);
        System.out.println("Estrato: " + estrato);
        System.out.println("Ingreso mensual: $" + ingresoMensual);
        System.out.println("Subsidio activo: " + (subsidioActivo ? "Sí" : "No"));
    }

    // Método 2
    public void estratoValido() {
        if (estrato >= 1 && estrato <= 6) {
            System.out.println("El estrato " + estrato + " es valido");
        } else {
            System.out.println("El estrato " + estrato + " no es valido");
        }
    }

    // Método 3
    public void activarSubsidio() {
        if (estrato <= 2 && ingresoMensual < 2000000) {
            subsidioActivo = true;
        } else {
            subsidioActivo = false;
        }
    }

    // Método 4 (sobrecarga)
    public void cambiarEstrato(int nuevoEstrato) {
        if (nuevoEstrato >= 1 && nuevoEstrato <= 6) {
            this.estrato = nuevoEstrato;
        }
    }

    public void cambiarEstrato() {
        this.estrato = 1;
    }

    // Método 5 (while)
    public void aumentarIngreso(double cantidad) {
        int i = 0;
        while (i < 1) {
            ingresoMensual += cantidad;
            i++;
        }
    }

    // Método 6 (if)
    public String grupoSocial() {
        if (estrato <= 2) return "Bajo";
        else if (estrato <= 4) return "Medio";
        else return "Alto";
    }

    // Método 7 (for)
    public void imprimirSubsidio() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Tiene subsidio: " + (subsidioActivo ? "Sí" : "No"));
        }
    }

    public int getEstrato() { return estrato; }
    public boolean tieneSubsidio() { return subsidioActivo; }
}