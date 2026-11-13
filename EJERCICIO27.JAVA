public class EJERCICIO27{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa la calificación 1:");
double c1 = scanner.nextDouble();
System.out.println("Ingresa la calificación 2:");
double c2 = scanner.nextDouble();
System.out.println("Ingresa la calificación 3:");
double c3 = scanner.nextDouble();

double promedio = (c1 + c2 + c3) / 3;

boolean aprobado = promedio >= 8.0 && c1 >= 7.0 && c2 >= 7.0 && c3 >= 7.0;
System.out.println("Promedio: " + promedio);
System.out.println("¿Desempeño satisfactorio? " + aprobado);
scanner.close();
    }
}