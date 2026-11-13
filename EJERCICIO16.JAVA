public class EJERCICIO16{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa el entero a:");
int a = scanner.nextInt();
System.out.println("Ingresa el entero b:");
int b = scanner.nextInt();

 boolean esCuadrado = a * a == b;
System.out.println("¿El cuadrado de a es igual a b? " + esCuadrado);
scanner.close();
    }
}