import java.util.Arrays;

public class eAvanzado {

    public static void main(String[] args) {
        double[] lote = {105.2, 110.5, 100.4, 120.1, 108.0, 115.3};

        System.out.println("CONTROL DE CALIDAD - LÍNEA 1");
        System.out.println("Lote actual capturado: " + Arrays.toString(lote));
        System.out.println("\n>> Evaluando métricas de exportación...");

        boolean esAprobado = evaluarControlCalidad(lote);

        if (esAprobado) {
            System.out.println("LOTE APROBADO.");
            System.out.println("Motivo: Todas las unidades cumplen con el calibre mínimo");
            System.out.println("Preparando lote para exportación.");
        } else {
            System.out.println("LOTE RECHAZADO.");
            System.out.println("Motivo: Se detectaron unidades por debajo del calibre mínimo (100g).");
            System.out.println("Desviando lote a mercado nacional.");
        }
    }

    public static boolean evaluarControlCalidad(double[] pesos) {
        for (double peso : pesos) {
            if (peso < 100.0) {
                return false;
            }
        }
        return true;
    }
}
    // Método agregado para evaluar control de calidad