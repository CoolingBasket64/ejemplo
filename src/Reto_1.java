import java.util.Scanner;

public class Reto_1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        double C, K;
    
        System.out.println("Ingrese la cantidad de grados Kelvin a convertir: ");
        K = lectura.nextDouble();
    
        C = K - 273.15;
    
        System.out.println(K+" grados kelvin equivalen a "+C+" grados Celsius");

        lectura.close();
        
    }
    }
