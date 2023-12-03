package dominio;

public class VehiculoTurismo extends Vehiculo{
   
    public VehiculoTurismo(String marca, String modelo, double precioBase, int numeroPlazas){

        super(marca, modelo, precioBase, numeroPlazas);



    }



    public double calcularPrecioFinal() {
        if (numeroPlazas <= 5) {
            return precioBase;
        } else {
           
            double aumentoPorPlaza = 0.10;
            int plazasAdicionales = numeroPlazas - 5;
            double precioFinal = precioBase + (aumentoPorPlaza * plazasAdicionales * precioBase);
            return precioFinal;
        }
    }



}

