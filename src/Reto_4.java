import java.util.Random;
import java.util.Scanner;

public class Reto_4 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        int ap, din;
        double gan=0;
        String nombre;
        Random random = new Random();
    
        int op = random.nextInt(3) + 1;
    
        System.out.println("digite su nombre: ");
        nombre = lectura.nextLine();
        System.out.println("cuanto dinero va a apostar: ");
        din = lectura.nextInt();

        if (din>=10000){
            System.out.println("escoja en concordancia las opciones\n1: piedra\n2: papel\n3: tijera ");
            ap = lectura.nextInt();

          if (op==1 && ap==1){
            System.out.println("Es un empate no gana nada");
             }else if (op==1 && ap==2){
                gan = din*2;
                System.out.println(nombre+" gano la apuesta frente a la maquina la cual eligio PIEDRA y se lleva un monto de "+gan+" pesos");
             }else if (op==1 && ap==3){
                System.out.println(nombre+" perdio la apuesta frente a la maquina la cual eligio PIEDRA y pierde un monto de "+din);

                 }else if (op==2 && ap==1){
                    System.out.println(nombre+" perdio la apuesta frente a la maquina la cual eligio PAPEL y pierde un monto de "+din);
                     }else if (op==2 && ap==2){
                        System.out.println("Es un empate no gana nada");
                     }else if (op==2 && ap==3){
                        gan = din*2;
                        System.out.println(nombre+" gano la apuesta frente a la maquina la cual eligio PAPEL y se lleva un monto de "+gan+" pesos");

                    }else if (op==3 && ap==1){
                        gan = din*2;
                        System.out.println(nombre+" gano la apuesta frente a la maquina la cual eligio TIJERA y se lleva un monto de "+gan+" pesos");
                         }else if (op==3 && ap==2){
                            System.out.println(nombre+" perdio la apuesta frente a la maquina la cual eligio TIJERA y pierde un monto de "+din);
                         }else if (op==3 && ap==3){
                            gan = din*2;
                            System.out.println("Es un empate no gana nada");
                             }else{
                                System.out.println("Digito un dato invalido, vuelva a intentar");
                             }

        }else{
            System.out.println("Debe apostar mas de 10000");
        }

    

        lectura.close();
        
    }
}