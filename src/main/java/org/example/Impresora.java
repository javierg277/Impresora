package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Impresora {
    public void imprimirDocumento(Documento documento) {
        System.out.println("Imprimiendo documento: " + documento.getNombre() + " - Importancia: " + documento.getImportancia());

        // Simular tiempo de impresión
        try {
            Thread.sleep(1000); // Simula un segundo de impresión
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Documento impreso: " + documento.getNombre());
    }
}
