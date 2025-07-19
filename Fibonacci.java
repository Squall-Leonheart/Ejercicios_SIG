import java.util.Scanner;
public class Fibonacci{
	public static int fibo(int n){
		if(n>2){
			return fibo(n-2)+fibo(n-1);
		}else{
			if(n>2){
				return 2;
			}else{
			return 1;
			}
		}
	}
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Ingrese un número:");
	int a = scanner.nextInt();
		System.out.println("El resultado de la serie de Fibonacci de " + a + " es: " + fibo(a));
		scanner.close();
	}
}