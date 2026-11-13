public class EJERCICIO30{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa la edad en años:");
int edad = scanner.nextInt();
System.out.println("Ingresa el peso en kg:");
double peso = scanner.nextDouble();

boolean puedeDonar = edad >= 18 && edad <= 65 && peso > 50.0;
System.out.println("¿Puede donar sangre? " + puedeDonar);
scanner.close();
    }
}