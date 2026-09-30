package Procesos.crearProcesosProccessBuilder;

import java.io.IOException;

public class Ejemplo1ConProceso {
    static void main(String[] args) {
        Runtime run = Runtime.getRuntime();

        try {
            String[] parametros = new String[2];
            parametros[0]="notepad.exe";
            parametros[1]="hola.txt";
            Process p = run.exec(parametros);
            System.out.println(p.pid());
        } catch (IOException e) {
            System.out.println("Error al lanzar el proceso");
        }
    }
}
