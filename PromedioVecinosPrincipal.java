import java.util.Random;
import java.util.Scanner;

public class PromedioVecinosPrincipal{
    public static void main(String args[]){
        Random aleatorio = new Random();
        Scanner ingreso = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de filas para el arreglo: ");
	    int n = ingreso.nextInt();
        while (n<1){
            System.out.print("Ingrese la cantidad de filas para el arreglo mayor a 0: ");
            n = ingreso.nextInt();
        }
	    System.out.print("Ingrese la cantidad de columnas para el arreglo: ");
	    int m = ingreso.nextInt();
        while (m<1){
            System.out.print("Ingrese la cantidad de columnas para el arreglo mayor a 0: ");
	        m = ingreso.nextInt();
        }
        double suma=0;
        //Arreglo Principal 2D
        double y[][] = new double[n][m];
        //Arreglo de promedios Vecinos 2D
        double z[][] = new double[n][m];
        //Asignar valores aleatorios a y[][]
        for (int i=0; i<y.length; i++){
            for (int j=0; j<y[i].length; j++){
                y[i][j]=aleatorio.nextInt(10);
            }
        }
        System.out.println();
        System.out.println("--- Matriz Y de "+y.length+"*"+y[0].length+" ---");
        System.out.println();        
        for (int i=0; i<y.length; i++){
            for (int j=0; j<y[i].length; j++){
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }
        if (y.length==1 && y[0].length==1){
            System.out.println();
            System.out.println("Es un Arreglo de un unico valor el cual es: "+y[n-1][m-1]);
        }else if (y.length==1){
            for (int j=0; j<y[0].length; j++){
                if (j==0){
                    z[0][j]=y[0][j+1];
                }else if (j==y[0].length-1){
                    z[0][j]=y[0][j-1];
                }else{
                    z[0][j]=(y[0][j-1]+y[0][j+1])/2;
                }
            }
        }else if (y[0].length==1){
            for (int i=0; i<y.length; i++){
                if (i==0){
                    z[i][0]=y[i+1][0];
                }else if (i==y.length-1){
                    z[i][0]=y[i-1][0];
                }else{
                    z[i][0]=(y[i-1][0]+y[i+1][0])/2;
                }
            }
        }else{
            for (int i=0; i<y.length; i++){
                for (int j=0; j<y[i].length; j++){
                    if (i==0){
                        if (j==0){
                            z[i][j]=(y[i+1][j]+y[i][j+1])/2;                        
                        }else if (j==y[i].length-1){
                            z[i][j]=(y[i+1][j]+y[i][j-1])/2;                        
                        }else{
                            z[i][j]=(y[i][j-1]+y[i+1][j]+y[i][j+1])/3;
                        }
                    }
                    if (i==y.length-1){
                        if (j==0){
                            z[i][j]=(y[i-1][j]+y[i][j+1])/2;                        
                        }else if (j==y[i].length-1){
                            z[i][j]=(y[i-1][j]+y[i][j-1])/2;                        
                        }else{
                            z[i][j]=(y[i][j-1]+y[i-1][j]+y[i][j+1])/3;                        
                        }
                    }
                    if (i>0 && i<y.length-1){
                        if (j==0){
                            z[i][j]=(y[i-1][j]+y[i][j+1]+y[i+1][j])/3;
                        }else if (j==y[i].length-1){
                            z[i][j]=(y[i-1][j]+y[i][j-1]+y[i+1][j])/3;
                        }else{
                            z[i][j]=(y[i][j-1]+y[i-1][j]+y[i][j+1]+y[i+1][j])/4;
                        }
                    }
                }
            }
        }
        System.out.println();
        if (y.length==1 && y[0].length==1){
            System.out.println("No se tiene matriz de promedio de vecinos");
        }else{
            System.out.println("--- Matriz de promedio de vecinos de "+z.length+"*"+z[0].length+" ---");
            System.out.println();        
            for (int i=0; i<z.length; i++){
                for (int j=0; j<z[i].length; j++){
                    System.out.print(z[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("--- Promedio de la matriz de promedio de vecinos ---");
            for (int i=0; i<z.length; i++){
                for (int j=0; j<z[i].length; j++){
                    suma=suma+z[i][j];
                }
            }
            System.out.println("El promedio es: "+suma/(z.length*z[0].length));
        }
    }
}