public class EJERCICIO4 {
    public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa el ancho de la pared (m):");
double ancho = scanner.nextDouble();
System.out.println("Ingresa el alto de la pared (m):");
double alto = scanner.nextDouble();
System.out.println("Ingresa el precio por metro cuadrado:");
double precio = scanner.nextDouble();
 double area = ancho * alto;
 double costoTotal = area * precio;
System.out.println("Área de la pared: " + area + " m2");
System.out.println("Costo total de la pintura: $" + costoTotal);
scanner.close();

    }
}