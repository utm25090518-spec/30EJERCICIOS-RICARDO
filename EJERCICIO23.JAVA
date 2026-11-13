public class EJERCICIO23{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa la edad del pasajero:");
int edad = sc.nextInt();
System.out.println("¿Tiene credencial de estudiante? (1 = sí, 0 = no):");
int credencial = sc.nextInt();

boolean viajaGratis = edad < 6 || credencial == 1;
System.out.println("¿Viaja gratis? " + viajaGratis);
scanner.close();
    }
}