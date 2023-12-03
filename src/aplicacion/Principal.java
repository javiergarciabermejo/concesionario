package aplicacion;
import dominio.*;


public class Principal{
    public static void main(String[]args){
      
        
            Concesionario concesionario = new Concesionario();
            
    
                 VehiculoTurismo vehiculo1 = new VehiculoTurismo("Toyota", "Corolla", 10000, 5);
        System.out.println("Precio final del vehículo 1: " + vehiculo1.calcularPrecioFinal());

        VehiculoTurismo vehiculo2 = new VehiculoTurismo("Honda", "Civic", 10000, 7);
        System.out.println("Precio final del vehículo 2: " + vehiculo2.calcularPrecioFinal());
    
    
            concesionario.agregarVehiculo(vehiculo1);
            concesionario.agregarVehiculo(vehiculo2);
    
            
            concesionario.mostrarVehiculosYCalcularSuma();
        


        }
    }
}
