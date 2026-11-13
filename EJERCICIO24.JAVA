public class EJERCICIO24{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Ingresa el lado l1:");
double l1 = sc.nextDouble();
System.out.println("Ingresa el lado l2:");
double l2 = sc.nextDouble();
System.out.println("Ingresa el lado l3:");
double l3 = sc.nextDouble();

boolean esEquilatero = l1 == l2 && l2 == l3 && l1 > 0;
System.out.println("¿Es un triángulo equilátero? " + esEquilatero);
sc.close();
    }
}