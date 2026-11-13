public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);{

System.out.println("Ingresa el subtotal de la cuenta:");
double subtotal = scanner.nextDouble();

 double iva = subtotal * 0.16;
 double propina = subtotal * 0.15;
double total = subtotal + iva + propina;
System.out.println("IVA (16%): $" + iva);
System.out.println("Propina (15%): $" + propina);
System.out.println("Gran total a pagar: $" + total);
scanner.close();
    }
}