public class EJERCCICIO9{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa la temperatura del líquido (°C):");
double temperatura = sc.nextDouble();

boolean hierve = temperatura >= 100.0;
System.out.println("¿Alcanzó el punto de ebullición? " + hierve);
scanner.close();
    }
}