public class EJERCICIO8{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa un número entero positivo:");
int numero = scanner.nextInt();

int ultimoDigito = numero % 10;
System.out.println("El último dígito es: " + ultimoDigito);
scanner.close();
    }
}