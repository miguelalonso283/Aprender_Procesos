package Procesos.ejemploRuntime;

import java.io.IOException;

public class Ejemplo1SinObjeto {
    static void main(String[] args) {

        try {
            String[] parametros = new String[2];
            parametros[0]="notepad.exe";
            parametros[1]="hola.txt";
            Runtime.getRuntime().exec(parametros);
        } catch (IOException e) {
            System.out.println("Error al lanzar el proceso");
        }
    }
}
