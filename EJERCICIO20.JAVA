public class EJERCICIO20{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa el porcentaje de llenado (0 a 100):");
double porcentaje = sc.nextDouble();

boolean alerta = porcentaje < 10 || porcentaje > 95;
System.out.println("¿Hay alerta? " + alerta);
scanner.close();
    }
}