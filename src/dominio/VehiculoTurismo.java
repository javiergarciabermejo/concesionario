package dominio;

public class VehiculoTurismo {
    private String marca;
    private String modelo;
    private double preciobase;
    private int numeroPlazas;

    public VehiculoTurismo(String marca, String modelo, double preciobase, int numeroPlazas) {
        this.marca = marca;
        this.modelo = modelo;
        this.preciobase = preciobase;
        this.numeroPlazas = numeroPlazas;
    }

    public double calcularPrecioFinal() {
        if (numeroPlazas <= 5) {
            return preciobase;
        } else {
           
            double aumentoPorPlaza = 0.10;
            int plazasAdicionales = numeroPlazas - 5;
            double precioFinal = preciobase + (aumentoPorPlaza * plazasAdicionales * preciobase);
            return precioFinal;
        }
    }


    public static void main(String[] args) {
        VehiculoTurismo vehiculo1 = new VehiculoTurismo("Toyota", "Corolla", 10000, 5);
        System.out.println("Precio final del vehículo 1: " + vehiculo1.calcularPrecioFinal());

        VehiculoTurismo vehiculo2 = new VehiculoTurismo("Honda", "Civic", 10000, 7);
        System.out.println("Precio final del vehículo 2: " + vehiculo2.calcularPrecioFinal());
    }
}
