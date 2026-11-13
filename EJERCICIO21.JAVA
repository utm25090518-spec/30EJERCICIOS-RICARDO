public class EJERCICIO21{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa un número entero:");
int n = scanner.nextInt();

boolean divisible = n % 2 == 0 && n % 5 == 0;
System.out.println("¿Es divisible entre 2 y 5 a la vez? " + divisible);
scanner.close();
    }
}