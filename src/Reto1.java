import java.util.Scanner;
public class Reto1{
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int cantidad, suma=0;
        System.out.println("por favor digite cuantas notas quiere calcular");
        cantidad=lectura.nextInt();
        int[] nota=new int[cantidad];

        for(int i=0;i<cantidad; i++){
            System.out.println("por favor digite la nota que desea digitar");
            nota[i]=lectura.nextInt();   
        }
        for(int i=0;i<cantidad; i++){
        System.out.print(nota[i]);
        suma=suma+nota[i];
    }
        float promedio =suma/nota.length;
        System.out.println(" la suma es: "+suma+"y el promedio es "+promedio);
        if(promedio<=3){
            System.out.println("usted reprobo la materia");
        }else if(promedio<4){
            System.out.println("usted paso rapando");
        }else if(promedio>=4){
            System.out.println("usted ha aprobado");
        }
        lectura.close();
    }
}