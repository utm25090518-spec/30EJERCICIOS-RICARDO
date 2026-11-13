public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el radio de la esfera:");
        double r = scanner.nextDouble();
        double PI = 3.14159;

 double volumen = (4.0 / 3.0) * PI * r * r * r;
System.out.println("El volumen de la esfera es: " + volumen);
scanner.close();

        
    }
    
}
