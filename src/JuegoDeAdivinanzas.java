import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanzas {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al juego de adivinanzas");
        System.out.println("Tienes 5 intentos para adivinar el numero generado de 1  a 100");
        int numeroDeIntentos =0;
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        while (numeroDeIntentos < 5){
            System.out.println("Introduce un número");
            int numeroIngresado = teclado.nextInt();
            numeroDeIntentos++;
            if (numeroAleatorio == numeroIngresado){
                System.out.println("Felicidades haz encontrado el número secreto.");
                break;
            }else if(numeroAleatorio > numeroIngresado){
                System.out.println("El numero ingresado es menor ");
            }else if(numeroAleatorio < numeroIngresado){
                System.out.println("El numero ingresado es mayor ");
            }
        }
//        System.out.println("Haz terminado tus 5 intentos sin encontrar el numero secreto");
    }
}
