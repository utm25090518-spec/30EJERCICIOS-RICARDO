public class EJERCICIO22{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa la calificación:");
double calificacion = scanner.nextDouble();
boolean valida = calificacion >= 0.0 && calificacion <= 10.0;
System.out.println("¿La calificación es válida? " + valida);
scanner.close();
    }
}