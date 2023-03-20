import java.util.Scanner;

public class Reto_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cant, prod, pag, res;
        double tot=0, vuel=0; 
        String nom, reg;

        System.out.print("Nombre del cliente: ");
        nom = leer.next();

        if (nom.equalsIgnoreCase("Santiago")){

            System.out.print("Cuantos productos desea comprar: ");
            cant = leer.nextInt();

            for (int i=1; i <= cant; i++) { 
                System.out.print("Precio del producto "+i+": ");
                prod = leer.nextInt();
                tot += prod;
            }
    
            System.out.println("El total a pagar es de "+tot+" pesos");
            System.out.print("Con cuanto va a pagar: ");
            pag = leer.nextInt();
            if (pag>=tot){
                vuel = pag-tot;
                System.out.print("Su cambio es de "+vuel+" pesos");
            }else{
                System.out.print("No le alcanza para pagar");
            }


        }else{
            System.out.println("Usted no puede realizar el proceso ya que no esta registrado, registrese para poder realizar el proceso");
            System.out.println("Desea registrarse \n1: Si\n2: No");
            res = leer.nextInt();
            if (res==1){
                System.out.print("Nombre con el que se desea registrar: ");
                reg = leer.next();
                System.out.println("Bienvenido al sistema "+reg);
                System.out.print("Cuantos productos desea comprar: ");
                cant = leer.nextInt();

            for (int i=1; i <= cant; i++) { 
                System.out.print("Precio del producto "+i+": ");
                prod = leer.nextInt();
                tot += prod;
            }
    
            System.out.println("El total a pagar es de "+tot+" pesos");
            System.out.print("Con cuanto va a pagar: ");
            pag = leer.nextInt();
            if (pag>=tot){
                vuel = pag-tot;
                System.out.print("Su cambio es de "+vuel+" pesos");
            }else{
                System.out.print("No le alcanza para pagar");
            }

            }
            
        }



        leer.close();
    }
}