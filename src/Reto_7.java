import java.util.Random;
import java.util.Scanner;

public class Reto_7 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        int din, ap, nue, i=0, res, res2;
        double gan=0;
        String nombre;
        Random random = new Random();
    
        int op = random.nextInt(3) + 1;
    
        System.out.println("digite su nombre: ");
        nombre = lectura.nextLine();
        System.out.println("\ncuanto dinero va a apostar: ");
        din = lectura.nextInt();

        if (din>=10000){
            System.out.println("\nEscoja en concordancia las opciones\n1: piedra\n2: papel\n3: tijera ");
            ap = lectura.nextInt();

          if (op==1 && ap==1){
            System.out.println("\nEs un empate no gana nada");
             }else if (op==1 && ap==2){
                gan = din*2;
                System.out.println("\n"+nombre+" gano la apuesta frente a la maquina la cual eligio PIEDRA y se lleva un monto de "+gan+" pesos");
             }else if (op==1 && ap==3){
                System.out.println("\n"+nombre+" perdio la apuesta frente a la maquina la cual eligio PIEDRA y pierde un monto de "+din);

                 }else if (op==2 && ap==1){
                    System.out.println("\n"+nombre+" perdio la apuesta frente a la maquina la cual eligio PAPEL y pierde un monto de "+din);
                     }else if (op==2 && ap==2){
                        System.out.println("\nEs un empate no gana nada");
                     }else if (op==2 && ap==3){
                        gan = din*2;
                        System.out.println("\n"+nombre+" gano la apuesta frente a la maquina la cual eligio PAPEL y se lleva un monto de "+gan+" pesos");

                    }else if (op==3 && ap==1){
                        gan = din*2;
                        System.out.println("\n"+nombre+" gano la apuesta frente a la maquina la cual eligio TIJERA y se lleva un monto de "+gan+" pesos");
                         }else if (op==3 && ap==2){
                            System.out.println("\n"+nombre+" perdio la apuesta frente a la maquina la cual eligio TIJERA y pierde un monto de "+din);
                         }else if (op==3 && ap==3){
                            gan = din*2;
                            System.out.println("\nEs un empate no gana nada");
                             }else{
                                System.out.println("\nDigito un dato invalido, vuelva a intentar");
                             }

            System.out.println("\nDesea volver a hacer la apuesta\n1: Si \n2: No ");
            res = lectura.nextInt();

            if (res==1){

            do{

                System.out.print("\nCuanto desea apostar: ");
                nue = lectura.nextInt();
                i++;

                if (nue>gan){
                    System.out.println("\nEscoja en concordancia las opciones\n1: piedra\n2: papel\n3: tijera ");
                    ap = lectura.nextInt();

          if (op==1 && ap==1){
            System.out.println("\nEs un empate no gana nada");
             }else if (op==1 && ap==2){
                gan = din*2;
                System.out.println("\n"+nombre+" gano la apuesta frente a la maquina la cual eligio PIEDRA y se lleva un monto de "+gan+" pesos");
             }else if (op==1 && ap==3){
                System.out.println("\n"+nombre+" perdio la apuesta frente a la maquina la cual eligio PIEDRA y pierde un monto de "+din);

                 }else if (op==2 && ap==1){
                    System.out.println("\n"+nombre+" perdio la apuesta frente a la maquina la cual eligio PAPEL y pierde un monto de "+din);
                     }else if (op==2 && ap==2){
                        System.out.println("\nEs un empate no gana nada");
                     }else if (op==2 && ap==3){
                        gan = din*2;
                        System.out.println("\n"+nombre+" gano la apuesta frente a la maquina la cual eligio PAPEL y se lleva un monto de "+gan+" pesos");

                    }else if (op==3 && ap==1){
                        gan = din*2;
                        System.out.println("\n"+nombre+" gano la apuesta frente a la maquina la cual eligio TIJERA y se lleva un monto de "+gan+" pesos");
                         }else if (op==3 && ap==2){
                            System.out.println("\n"+nombre+" perdio la apuesta frente a la maquina la cual eligio TIJERA y pierde un monto de "+din);
                         }else if (op==3 && ap==3){
                            gan = din*2;
                            System.out.println("\nEs un empate no gana nada");
                             }else{
                                System.out.println("\nDigito un dato invalido, vuelva a intentar");
                             }

            }else{
            System.out.println("\nDEBE APOSTAR MAS DE "+gan);
            }

            System.out.println("\nDesea volver a hacer la apuesta\n1: Si \n2: No ");
            res2 = lectura.nextInt();

        }while (res2==1);

        }else{
            System.out.print("\nOk gracias por participar ");
        }
   

        }else{
            System.out.println("\nDebe apostar mas de 10000");
        }


        lectura.close();
        
    }
}
