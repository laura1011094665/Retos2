import java.util.Scanner;
public class Reto4{
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int cantidad;
        System.out.println("Por favor digite de cuanto va ha ser el su Sudoku");
        cantidad=lectura.nextInt();

        int[][] numero= new int[cantidad][cantidad];
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<cantidad;j++){
            System.out.println("Por favor digite el numero que desea");
            numero[i][j]=lectura.nextInt();
        }
    }
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<cantidad;j++){
                System.out.print(numero[i][j]+"\t");
            }
            System.out.println(" ");
            int cantidad2;
            System.out.println("Por favor la cantidad de valores ha sumar");
            cantidad2=lectura.nextInt();
            int[] suma2=new int[cantidad2];
            int suma=0;

            for(int u=0;u<cantidad2;u++){
                System.out.println("ingrese un valor"+i);
                suma=lectura.nextInt();
                suma=suma+suma2[u];
            }
            System.out.println("su suma es: "+suma);

            }lectura.close();
    }
}