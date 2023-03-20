import java.util.Scanner;
public class Reto2{
    public static void main(String[] args) {
    Scanner lectura=new Scanner(System.in);
    int cantidad;
    System.out.println("Por favor digite la cantidad de participantes");
    cantidad=lectura.nextInt();
    String[] nombre=new String[cantidad];
    double[] tiempo=new double[cantidad];
    for(int i=0;i<cantidad;i++) {
        System.out.println("por favor digite el nombre del participante");
        nombre[i]=lectura.next();
        System.out.println("por favor digite el tiempo queduro el participante");
        tiempo[i]=lectura.nextDouble();
    }
    for(int i=0;i<cantidad;i++){
        System.out.println("el participante de nombre "+nombre[i]+", tuvo un tiempo de "+tiempo[i]);
        
    
    if(tiempo[i]<1.30){
        System.out.println("felicidades usted ha ganado");
    }else if(tiempo[i]>10.0){
        System.out.println("lo siento usted a perdido");
    }lectura.close();
    }
    }
}