import java.util.Scanner;
public class Metodos{
	public static int multiplicar(int x, int p){
		if(p>1){
			return x+multiplicar(x,p-1);
		}else{
			return x;
		}
	}
	public static int factorial(int x){
		if(x>1){
			return multiplicar(x,factorial(x-1));
		}else{
			return 1;
		}
	}
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Ingrese el primer número: ");
	int a = scanner.nextInt();
	System.out.print("Ingrese el segundo número: ");
	int b = scanner.nextInt();
		System.out.println("El resultado de " + a + " * " + b + " es: " + multiplicar(a,b));
		System.out.println("El resultado de " + a + "! es: " + factorial(a));
		System.out.println("El resultado de " + b + "! es: " + factorial(b));
		scanner.close();
	}
}