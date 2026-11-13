public class EJERCICIO15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa el saldo actual:");
double saldo = scanner.nextDouble();
System.out.println("Ingresa el monto a retirar:");
double retiro = scanner.nextDouble();

boolean saldoSuficiente = saldo >= retiro;
System.out.println("¿El saldo es suficiente? " + saldoSuficiente);
scanner.close();
    }
}