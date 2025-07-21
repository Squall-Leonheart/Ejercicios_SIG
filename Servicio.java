public class Servicio {
    // Atributos
    private String nombre;
    private double tarifaBase;
    private double tarifaFinal;
    private int consumo;
    private String unidad;
    private boolean aplicaDescuento;
    private boolean aplicaSobrecosto;

    // Constructor
    public Servicio(String nombre, double tarifaBase, int consumo, String unidad) {
        this.nombre = nombre;
        this.tarifaBase = tarifaBase;
        this.consumo = consumo;
        this.unidad = unidad;
        this.aplicaDescuento = false;
        this.aplicaSobrecosto = false;
        this.tarifaFinal = tarifaBase;
    }

    // Método 1
    public void calcularTarifa(Persona p) {
        double total = tarifaBase * consumo;

        if (p.tieneSubsidio()) {
            aplicaDescuento = true;
            total *= 0.5;
        } else if (p.getEstrato() >= 5) {
            aplicaSobrecosto = true;
            total *= 1.25;
        }

        tarifaFinal = total;
    }

    // Método 2
    public void mostrarInfo() {
        System.out.println("Servicio: " + nombre);
        System.out.println("Consumo: " + consumo + " " + unidad);
        System.out.println("Tarifa base: $" + tarifaBase);
        System.out.println("Tarifa final: $" + tarifaFinal);
    }

    // Método 3
    public void aumentarConsumo(int extra) {
        int i = 0;
        while (i < extra) {
            consumo++;
            i++;
        }
    }

    // Método 4 (sobrecarga)
    public void aplicarTarifaFija(double nuevaTarifa) {
        this.tarifaBase = nuevaTarifa;
    }

    public void aplicarTarifaFija() {
        this.tarifaBase = 1000;
    }

    // Método 5
    public boolean unidadValida() {
        return unidad.equals("m³") || unidad.equals("kWh") || unidad.equals("litros");
    }

    // Método 6
    public void reiniciarConsumo() {
        for (int i = consumo; i >= 0; i--) {
            consumo = 0;
        }
    }

    // Método 7
    public double getTarifaFinal() {
        return tarifaFinal;
    }
}