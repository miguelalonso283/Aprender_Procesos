package Repaso;

public class Ejercicio1 {
    static void main(String[] args) {
        int num;
        int suma=0;
        try {
            if (args != null) {
                for (int i = 0; i < args.length; i++) {
                    num = Integer.parseInt(args[i]);
                    suma += num;
                }
                System.out.println("El resultado es " + suma);
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("El parámetro no es válido");
        }
    }

    public static int suma(int num1, int num2) {
        return num1+num2;
    }
}
