public class EJERCICIO8{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa un número entero:");
int n = scanner.nextInt();

boolean esMultiplo = n % 7 == 0;
System.out.println("¿Es múltiplo de 7? " + esMultiplo);
scanner.close();
    }
}