import java.util.Scanner;

public class Reto_2 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        int edad;
        double dosis, peso;
        String mama, bebe, vacuna;
    
        System.out.println("Ingrese nombre de la mamá: ");
        mama = lectura.nextLine();
        System.out.println("Ingrese nombre del bebe: ");
        bebe = lectura.nextLine();
        System.out.println("Ingrese peso del bebe: ");
        peso = lectura.nextDouble();
        System.out.println("Ingrese meses del bebe: ");
        edad = lectura.nextInt();
        System.out.println("Ingrese nombre de la vacuna: ");
        vacuna = lectura.nextLine();
    
        dosis = ((peso + 10) / (edad * 10)) * 8;
    
        System.out.println("El nombre de la mama es: "+mama);
        System.out.println("El nombre del bebe es: "+bebe);
        System.out.println("El nombre de la vacuna es: "+vacuna);
        System.out.println("La cantidad de dosis a aplicar es: "+dosis);

        lectura.close();
        
    }
}
