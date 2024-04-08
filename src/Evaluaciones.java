import java.util.Scanner;

import static java.lang.System.out;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones =0;
        double totalEvaluaciones=0;
        while (nota != -1){
            System.out.println("Escribe la nota que le darias a la peliculas");
            nota = teclado.nextDouble();

            if(nota != -1){
                mediaEvaluaciones = mediaEvaluaciones + nota;
                totalEvaluaciones++;
            }
        }
        out.println("Media de evaluaciones de la pelicula : "+mediaEvaluaciones/totalEvaluaciones);

    }
}
