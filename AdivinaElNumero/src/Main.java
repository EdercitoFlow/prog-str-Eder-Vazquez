import java.util.Random;
import java.util.Scanner;

public class Main {

    // Contadores globales para validaciones
    static int fueraDeRango = 0;
    static int noNumerico = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int secreto = random.nextInt(100) + 1; // 1 a 100
        int intentos = 0;
        int limiteIntentos = 7;
        boolean gano = false;

        System.out.println("Adivina el numero secreto (1-100)");

        while (intentos < limiteIntentos) {
            int numero = obtenerNumeroValido(sc, "Intento " + (intentos + 1) + ": ", min, max);
            intentos++;

            if (numero == secreto) {
                System.out.println("Eres un crack, ganaste en el intento "+intentos);
                gano = true;
                break;
            } else if (numero > secreto) {
                System.out.println("El numero que estas buscando es menor a "+numero);
            } else {
                System.out.println("El numero que estas buscando es mayor a "+numero);
            }
        }

        if (!gano) {
            System.out.println("Perdiste, el numero secreto es "+secreto);
        }

        System.out.println("Ingresos fuera de rango: " + fueraDeRango);
        System.out.println("Ingresos no numéricos: " + noNumerico);

        sc.close();
    }

    public static int obtenerNumeroValido(Scanner sc, String mensaje, int min, int max) {
        int valor;

        while (true) {
            System.out.print(mensaje);

            if (sc.hasNextInt()) {
                valor = sc.nextInt();

                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    fueraDeRango++;
                    System.out.println("El valor ingresado esta fuera de rango (1-100)");
                }
            } else {
                noNumerico++;
                System.out.println("El dato ingresado no es numerico");
                sc.next(); //Para limpiar el token de entrada (terminal)
            }
        }
    }
}
