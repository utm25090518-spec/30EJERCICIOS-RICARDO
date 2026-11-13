public class EJERCICIO6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa el total de caramelos:");
int caramelos = scanner.nextInt();
System.out.println("Ingresa la capacidad de cada bolsa:");
int capacidad = scanner.nextInt();

int bolsasLlenas = caramelos / capacidad;
int sobrantes = caramelos % capacidad;
System.out.println("Bolsas llenas: " + bolsasLlenas);
System.out.println("Caramelos sin empaquetar: " + sobrantes);
scanner.close();
    }
}