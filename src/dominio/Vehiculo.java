package dominio;

public class Vehiculo{

    protected String marca;
    protected String modelo;
    protected double precioBase;
    protected int numeroPlazas;

    public Vehiculo(String marca, String modelo, double precioBase, int numeroPlazas) {


        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.numeroPlazas = numeroPlazas;

}


public void setMarca(String marca){

    this.marca = marca;
}

public String getMarca(){

    return marca;
}

public void setModelo(String modelo){

    this.modelo = modelo;
}

public String getModelo(){

    return modelo;
}

public void setPrecioBase(double precioBase){

    this.precioBase = precioBase;
}

public double getPrecioBase(){

    return precioBase;
}

public void setNumeroPlazas(int numeroPlazas){

    this.numeroPlazas = numeroPlazas;
}

public int getNumeroPlazas(){

    return numeroPlazas;
}




}
