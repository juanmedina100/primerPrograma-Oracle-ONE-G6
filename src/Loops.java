import java.util.Scanner;

import static java.lang.System.out;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la peliculas");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;

        }
        out.println("Media de evaluaciones de la pelicula");
        System.out.println(mediaEvaluaciones/3);
    }
}
