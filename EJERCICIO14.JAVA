public class EJERCICIO14{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa el lado del cuadrado:");
double ladoC = scanner.nextDouble(); System.out.println("Ingresa el lado del triángulo equilátero:");
double ladoT = scanner.nextDouble();
 double perimetroCuadrado = 4 * ladoC;
 double perimetroTriangulo = 3 * ladoT;
boolean cuadradoEsMenor = perimetroCuadrado < perimetroTriangulo;
System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);
System.out.println("Perímetro del triángulo: " + perimetroTriangulo);
System.out.println("¿El perímetro del cuadrado es menor? " + cuadradoEsMenor);
scanner.close();
}
}