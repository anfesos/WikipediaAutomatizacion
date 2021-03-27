package co.com.automatizacion.wikipedia.models;

public class PalabrasWikipedia {

    private String palabra;
    private int cantidad;

    public PalabrasWikipedia(String palabra, int cantidad) {
        this.palabra = palabra;
        this.cantidad = cantidad;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int numeroRegistros) {
        this.cantidad = numeroRegistros;
    }
}
