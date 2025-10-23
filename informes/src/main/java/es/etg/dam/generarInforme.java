package es.etg.dam;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class generarInforme {
    public static final String INFORME = "informe.md";
    public void guardarInforme (String contenido) {
        try(PrintWriter pw = new PrintWriter(new FileWriter(INFORME, true))){
            pw.println(contenido);


        } catch (IOException e) {
            System.out.println("Error al guardar el informe");


        }
    }
}
