public class EJERCICIO28 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 // Pedimos los datos del producto
 System.out.println("Ingresa la existencia actual:");
 int existencia = sc.nextInt();
 System.out.println("Ingresa la cantidad vendida hoy:");
 int vendidas = sc.nextInt();
 int restantes = existencia - vendidas;
 // true si quedan menos de 15 piezas
 boolean bajoMinimo = restantes < 15;
 System.out.println("Unidades restantes: " + restantes);
 System.out.println("¿Está por debajo del stock mínimo? " + bajoMinimo);
 sc.close();
    }
}