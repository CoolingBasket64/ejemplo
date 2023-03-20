import java.util.Random;
import java.util.Scanner;

public class Reto_3 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        int ap, din;
        double gan=0;
        String nombre;
        Random random = new Random();
    
        int op = random.nextInt(2) + 1;
    
        System.out.println("digite su nombre: ");
        nombre = lectura.nextLine();
        System.out.println("cuanto dinero va a apostar: ");
        din = lectura.nextInt();

        if (din>=10000){
            System.out.println("Digite su opcion\n1: Sello\n2:Cara ");
            ap = lectura.nextInt();
        if (op==1 && ap==1){
            gan = din*2;
            System.out.println(nombre+" gano la apuesta ya que la maquina eligio SELLO, y se lleva un monto de "+gan+" pesos");
             }else if (op==1 && ap==2){
                System.out.println(nombre+" perdio la apuesta ya que la maquina eligio SELLO, y pierde un monto de "+din);
             }else if (op==2 && ap==2){
                gan = din*2;
                System.out.println(nombre+" gano la apuesta ya que la maquina eligio CARA, y se lleva un monto de "+gan+" pesos");
                 }else if (op==2 && ap==1){
                    System.out.println(nombre+" perdio la apuesta ya que la maquina eligio CARA, y pierde un monto de "+din);
                 }else{
                    System.out.println("Digito un valor diferente, vuleva a intentar");
                 }
        }else{
            System.out.println("Debe apostar mas de 10000");
        }

        lectura.close();
        
    }
}
