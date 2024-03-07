package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimuladorImpresion {
    public static void main(String[] args) {
        Impresora impresora = new Impresora();

        // Crear un ExecutorService con un número de hilos igual al número de documentos
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Ejecutar continuamente el envío de documentos para impresión
        while (true) {
            // Crear documentos con diferentes prioridades
            Documento documento1 = new Documento("Documento1", "Contenido del Documento1", 1);
            Documento documento2 = new Documento("Documento2", "Contenido del Documento2", 2);
            Documento documento3 = new Documento("Documento3", "Contenido del Documento3", 3);

            // Ejecutar los documentos con sus respectivas prioridades
            executor.execute(() -> impresora.imprimirDocumento(documento3));
            executor.execute(() -> impresora.imprimirDocumento(documento1));
            executor.execute(() -> impresora.imprimirDocumento(documento2));

            // Esperar un tiempo antes de enviar nuevos documentos
            try {
                Thread.sleep(3000); // Espera 3 segundos antes de enviar nuevos documentos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}