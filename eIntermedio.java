import java.util.Scanner;
public class eIntermedio{
    public static double cm(double costo, double precio){
        return((precio - precio)/ precio) *100;

    }
        public static void main (String[]args) {
            Scanner teclado = new Scanner (System.in);
            System.out.println("Simulador Financiore");
            System.out.println("Ingresa el costo de produccion");
            double costo = teclado.nextDouble();
            
            System.out.print("Ingresa el precio de venta sugerido");
            double precio = teclado.nextDouble();
            
            System.out.println("\n>> Procesando viabilidad\");");
            double mc = cm(costo, precio);
            System.out.printf("Margen de ganancia calculado: %.2f%%\n", mc);
            if (mc < 30.0){
                System.out.println("ADVERTENCIA: El margen es demasiado bajo (menor al 30%). Riesgo de quiebra.");  
            } else {
                System.out.println("PRECIO VIABLE: El margen de ganancia es saludable para el negocio");
            }
            teclado.close();
        }

}

