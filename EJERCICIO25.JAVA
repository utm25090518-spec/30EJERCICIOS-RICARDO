public class EJERCICIO25{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa un entero positivo:");
int n = scanner.nextInt();

boolean noEsMultiplo = !(n % 3 == 0);
System.out.println("¿NO es múltiplo de 3? " + noEsMultiplo);
scanner.close();
    }
}