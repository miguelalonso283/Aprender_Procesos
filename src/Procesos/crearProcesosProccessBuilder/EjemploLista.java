package Procesos.crearProcesosProccessBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    static void main() {

        List<String> lista = new ArrayList<String>();
        lista.add("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        lista.add("https://www.roblox.com/");
        ProcessBuilder pb = new ProcessBuilder(lista);

        try {
            Process p = pb.start();
            System.out.println(p.info());
        } catch (IOException e) {
            System.out.println("Error al lanzar el proceso");
        }
    }
}
