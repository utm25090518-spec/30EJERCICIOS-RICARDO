public class EJERCICIO7 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa x:");
double x = scanner.nextDouble();
System.out.println("Ingresa y:");
double y = scanner.nextDouble();
System.out.println("Ingresa z:");
double z = scanner.nextDouble();

 double resultado = (x + 2 * y) / (z - x);
System.out.println("El resultado es: " + resultado);
scanner.close();
    }
}