import java.util.Scanner;

public class EJERCICIO {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
System.out.println("Ingresa la distancia en kilómetros:");
double km = scanner.nextDouble();

 double millas = km * 0.621371;
 double pies = km * 3280.84;

System.out.println(km + " km equivalen a " + millas + " millas");
System.out.println(km + " km equivalen a " + pies + " pies");
scanner.close();
    }
}