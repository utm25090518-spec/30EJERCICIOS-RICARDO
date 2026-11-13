public class EJERCICIO18{

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingresa un entero positivo:");
int n = scanner.nextInt();

boolean terminaEn5 = n % 10 == 5;
System.out.println("¿Termina en 5? " + terminaEn5);
scanner.close();
    }
}