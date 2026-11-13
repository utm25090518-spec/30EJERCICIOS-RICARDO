public class EJERCICIO8{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Peso del pasajero 1 (kg):");
double p1 = scanner.nextDouble();
System.out.println("Peso del pasajero 2 (kg):");
double p2 = scanner.nextDouble();
System.out.println("Peso del pasajero 3 (kg):");
double p3 = scanner.nextDouble();
System.out.println("Peso del pasajero 4 (kg):");
double p4 = scanner.nextDouble();
double total = p1 + p2 + p3 + p4;

boolean cargaPermitida = total <= 320.0;
System.out.println("Carga total: " + total + " kg");
System.out.println("¿La carga es permitida? " + cargaPermitida);
scanner.close();
    }
}