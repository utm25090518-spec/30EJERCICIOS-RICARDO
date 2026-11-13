public class EJERCICIO4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {

System.out.println("Ingresa la velocidad inicial (v0):");
double v0 = scanner.nextDouble();
System.out.println("Ingresa la aceleración (a):");
double a = scanner.nextDouble();
System.out.println("Ingresa el tiempo (t):");
double t = scanner.nextDouble();

 double vf = v0 + (a * t);
System.out.println("La velocidad final es: " + vf);
scanner.close();
}
    }
}