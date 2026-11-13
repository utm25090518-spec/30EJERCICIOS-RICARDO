public class EJERCICIO17{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa la existencia actual:");
int existencia = scanner.nextInt();
System.out.println("Ingresa la cantidad vendida hoy:");
int vendidas = scanner.nextInt();
int restantes = existencia - vendidas;

boolean bajoMinimo = restantes < 15;
System.out.println("Unidades restantes: " + restantes);
System.out.println("¿Está por debajo del stock mínimo? " + bajoMinimo);
scanner.close();
    }
}