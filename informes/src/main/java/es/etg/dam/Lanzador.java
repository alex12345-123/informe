package es.etg.dam;

public class Lanzador {

    private static final String[] COMANDOS = {"ps", "df", "free"};

    public static void main(String[] args) {
        ejecutarComando ejecutar = new ejecutarComando();
        generarInforme generar = new generarInforme();
        for (String comando : COMANDOS) {
            System.out.println("Ejecutando comando" + comando);
            String salida = ejecutar.ejecutar(comando);

            System.out.println(salida);

            String contenidoParaGuardar = "Resultado del comando: " + comando + "\n\n" + salida;
            generar.guardarInforme(contenidoParaGuardar);
        }

        System.out.println("Informe guardado en " + generarInforme.INFORME);
    }
}
