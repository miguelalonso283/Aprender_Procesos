package Procesos.ejemploRuntime;

import java.io.IOException;

public class Ejemplo2 {
    static void main(String[] args) {
        Runtime run = Runtime.getRuntime();

        try {
            run.exec("notepad.exe");
            run.exec("notepad.exe");
            run.exec("notepad.exe");
        } catch (IOException e) {
            System.out.println("Error al lanzar el proceso");
        }
    }
}
