package dominio;
import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private List<VehiculoTurismo> vehiculos;

  
    public Concesionario() {
        this.vehiculos = new ArrayList<>();
    }

    
    public void agregarVehiculo(VehiculoTurismo vehiculo) {
        vehiculos.add(vehiculo);
    }

    
    public void mostrarVehiculosYCalcularSuma() {
        double sumaTotal = 0;

        System.out.println("Vehículos en el concesionario:");
        System.out.println("-------------------------------------");

        for (VehiculoTurismo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Precio Base: " + vehiculo.getPrecioBase());
            System.out.println("Número de Plazas: " + vehiculo.getNumeroPlazas());
            double precioFinal = vehiculo.calcularPrecioFinal();
            System.out.println("Precio Final: " + precioFinal);
            System.out.println("-------------------------------------");

            sumaTotal += precioFinal;
        }

        System.out.println("Suma total de precios: " + sumaTotal);
    }

    }
