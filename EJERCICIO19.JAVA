public class EJERCICIO19{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa la temperatura ambiente (°C):");
double temperatura = scanner.nextDouble();

boolean confortable = temperatura >= 18.0 && temperatura <= 25.0;
System.out.println("¿Es una temperatura confortable? " + confortable);
scanner.close();
    }
}