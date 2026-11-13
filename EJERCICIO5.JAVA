public class EJERCICIO5{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa el número a:");
double a = scanner.nextDouble();
System.out.println("Ingresa el número b:");
double b = scanner.nextDouble();

 double mediaArmonica = (2 * a * b) / (a + b);
System.out.println("La media armónica es: " + mediaArmonica);
scanner.close();
    }
}