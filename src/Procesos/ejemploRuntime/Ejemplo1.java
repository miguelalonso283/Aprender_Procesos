package Procesos.ejemploRuntime;

import java.io.IOException;

public class Ejemplo1 {
    static void main(String[] args) {
        Runtime run = Runtime.getRuntime();

        try {
            String[] parametros = new String[2];
            parametros[0]="notepad.exe";
            parametros[1]="hola2.txt";
            run.exec(parametros);
        } catch (IOException e) {
            System.out.println("Error al lanzar el proceso");
        }
    }
}
