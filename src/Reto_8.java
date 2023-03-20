import java.util.Random;
import java.util.Scanner;

public class Reto_8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        Random rand = new Random();
        int numero = rand.nextInt(100) + 1;

        int num, intentos = 10, i = 0;
        boolean acierto = false;
        
        System.out.println("Tienes que adivinar un numero entre 1 y 100, y solo tienes 10 intentos para acertar");
        
        while (i < intentos && !acierto) {
            System.out.print("Introduce un número: ");
            num = lectura.nextInt();
            i++;
            
            if (num == numero) {
                acierto = true;
                System.out.println("¡Felicidades! Has adivinado el número en " + i + " intentos.");
            } else if (num < numero) {
                System.out.println("El número a adivinar es mayor que " + num + ".");
            } else if (num > numero){
                System.out.println("El número a adivinar es menor que " + num + ".");
            }
        }
        
        if (!acierto) {
            System.out.println("Lo siento, no lograste adivinar el número. El número era " + numero + ".");
        }
        
        lectura.close();
    }
}

