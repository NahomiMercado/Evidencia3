import java.util.Scanner;

public class Evi3 {

    // Definir la función a integrar
    public static double funcion(double x) {
        // Ejemplo: f(x) = x^2 + 1
        return Math.pow(x, 2) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Método del Punto Medio para aproximar integrales definidas");

        System.out.print("Ingrese el límite inferior (a): ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el límite superior (b): ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el número de subintervalos (n): ");
        int n = scanner.nextInt();

        if (n <= 0 || a >= b) {
            System.out.println("Error: revisa los valores de 'n', 'a' y 'b'.");
            return;
        }

        double h = (b - a) / n;
        double suma = 0;

        System.out.printf("\n%-10s %-15s %-15s\n", "i", "Punto medio", "f(punto)");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < n; i++) {
            double xi = a + i * h;
            double puntoMedio = xi + h / 2;
            double fpm = funcion(puntoMedio);
            suma += fpm;

            System.out.printf("%-10d %-15f %-15f\n", i + 1, puntoMedio, fpm);
        }

        double resultado = h * suma;

        System.out.println("\n---------------------------------------------");
        System.out.println("Resultado final:");
        System.out.printf("Aproximación de la integral: %.6f\n", resultado);
        System.out.println("---------------------------------------------");
    }
}
