import java.util.Random;

public class PromedioVecinosPrincipal{
    public static void main(String args[]){
        Random aleatorio = new Random();
        
        int fil=0;
        int col=0;
        double promedio=0;
        //Arreglo Principal 2D
        int y[][] = new int[3][3];
        //Arreglo de promedios Vecinos
        double z[][] = new double[3][3];
        //Asignar valores aleatorios a y[][]
        for (int i=0; i<y.length; i++){
            for (int j=0; j<y[i].length; j++){
                y[i][j]=aleatorio.nextInt(10);
            }
        }
        //Para poder moverse entre las posiciones del arreglo
        for (int i=0; i<y.length; i++){
            for (int j=0; j<y[i].length; j++){
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0; i<y.length; i++){
            for (int j=0; j<y[i].length; j++){
                fil=i;
                col=j;
                System.out.println("fil "+fil+" col "+col);
                if (i==0){
                    if (j==0){
                        promedio=(y[i+1][j]+y[i][j+1])/2;
                        System.out.println("Valor 1 "+promedio);
                    }                    
                }
                if (i==0){
                    if (j==y[i].length-1){
                        promedio=(y[i+1][j]+y[i][j-1])/2;
                        System.out.println("Valor 2 "+promedio);
                    }
                }
            }
        }
    }
}