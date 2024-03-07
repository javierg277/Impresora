package org.example;

public class Documento {
    private String nombre;
    private String contenido;
    private int importancia;

    public Documento(String nombre, String contenido, int importancia) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.importancia = importancia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImportancia() {
        return importancia;
    }
}
