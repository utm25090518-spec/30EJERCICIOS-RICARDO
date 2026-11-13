public class EJERCICIO8{
    public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);

System.out.println("Ingresa un número entero:");
int n = scanner.nextInt();

boolean esImpar = n % 2 != 0;
UTMA · Fundamentos de Programación · Página 14 System.out.println("¿Es impar? " + esImpar);
scanner.close();
    }
}