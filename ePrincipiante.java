import java.util.Scanner;

public class ePrincipiante {

    public static void imprimirEncabezado() {
        System.out.println("=================================");
        System.out.println(" CAFETERÍA \"EL BUEN GRANO");
        System.out.println(" Portal Principal, Centro");
        System.out.println("=================================");
    }



    public static void imprimirPiePagina() {
        System.out.println("---------------------------------");
        System.out.println("¡Gracias por apoyar el comercio local!");
        System.out.println("Vuelva pronto.");
        System.out.println("---------------------------------");


    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando sistema de cobro...\n");

        for (int cliente = 1; cliente <= 3; cliente++) {
            System.out.println("Atendiendo al Cliente " + cliente);
            System.out.print("Ingrese el total a cobrar: $");
            
            double total = scanner.nextDouble();

            System.out.println("\n Imprimiendo ticket...\n");

            imprimirEncabezado();
            
            System.out.printf("Total a pagar: $%.2f\n", total);
            
            imprimirPiePagina();

        }

        scanner.close();
    }
}


//CoinD