import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicula : ");
        String pelicula = teclado.nextLine();
        System.out.println("Escribe el añoñ de lanzamiento :");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Escribe tu puntuación :");
        double nota = teclado.nextDouble();
        System.out.println("Información escrita");

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
