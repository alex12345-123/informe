package es.etg.dam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejecutarComando {
    public static final String MENSAJE = "Error al ejecutar el comando";

    public String ejecutar (String comando) {
        StringBuilder resultado = new StringBuilder();
            try {
                Process proceso = Runtime.getRuntime().exec(comando);

                BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
                String linea;
                while ((linea = reader.readLine()) !=null) { 
                    resultado.append(linea).append("\n");
                    
                }
                proceso.waitFor();
            } catch (IOException | InterruptedException  e) {
                resultado.append(MENSAJE).append(comando).append("\n");

            }
            return resultado.toString();

    }
}
