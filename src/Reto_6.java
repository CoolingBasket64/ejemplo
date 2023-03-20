import java.util.Random;
import java.util.Scanner;

public class Reto_6 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        int ap, din, res, res2, nue, i=0;
        double gan=0;
        String nombre;
        Random random = new Random();
    
        int op = random.nextInt(2) + 1;
    
        System.out.println("digite su nombre: ");
        nombre = lectura.nextLine();
        System.out.println("\ncuanto dinero va a apostar: ");
        din = lectura.nextInt();

        if (din>=10000){

            System.out.println("\nDigite su opcion\n1: Sello\n2:Cara ");
            ap = lectura.nextInt();

        if (op==1 && ap==1){
            gan = din*2;
            System.out.println("\n"+nombre+" gano la apuesta ya que la maquina eligio SELLO, y se lleva un monto de "+gan+" pesos");
             }else if (op==1 && ap==2){
                System.out.println("\n"+nombre+" perdio la apuesta ya que la maquina eligio SELLO, y pierde un monto de "+din);
             }else if (op==2 && ap==2){
                gan = din*2;
                System.out.println("\n"+nombre+" gano la apuesta ya que la maquina eligio CARA, y se lleva un monto de "+gan+" pesos");
                 }else if (op==2 && ap==1){
                    System.out.println("\n"+nombre+" perdio la apuesta ya que la maquina eligio CARA, y pierde un monto de "+din);
                 }else{
                    System.out.println("Digito un valor diferente, vuleva a intentar");
                 }

            System.out.println("\nDesea volver a hacer la apuesta\n1: Si \n2: No ");
            res = lectura.nextInt();

            if (res==1){

            do{

                System.out.print("\nCuanto desea apostar: ");
                nue = lectura.nextInt();
                i++;

                if (nue>gan){

                    System.out.println("\nDigite su opcion\n1: Sello\n2:Cara ");
                    ap = lectura.nextInt();
                    if (op==1 && ap==1){
                        gan = din*2;
                        System.out.println("\n"+nombre+" gano la apuesta ya que la maquina eligio SELLO, y se lleva un monto de "+gan+" pesos");
                         }else if (op==1 && ap==2){
                            System.out.println("\n"+nombre+" perdio la apuesta ya que la maquina eligio SELLO, y pierde un monto de "+din);
                         }else if (op==2 && ap==2){
                            gan = din*2;
                            System.out.println("\n"+nombre+" gano la apuesta ya que la maquina eligio CARA, y se lleva un monto de "+gan+" pesos");
                             }else if (op==2 && ap==1){
                                System.out.println("\n"+nombre+" perdio la apuesta ya que la maquina eligio CARA, y pierde un monto de "+din);
                             }else{
                                System.out.println("Digito un valor diferente, vuleva a intentar");
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



