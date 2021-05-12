import java.util.Scanner;
public class Hilos{
   public static void main(String args[]){
      
      Scanner leer = new Scanner(System.in);
      int tamaño;
      
      System.out.print("Ingrese el tamaño del vector: ");
      tamaño = leer.nextInt();
      double vector[] = new double[tamaño];
      for(int x = 0; x < vector.length; x++){
         vector[x] = Math.random()*10;
      }
      Thread hilo1 = new Thread(new Hilo1(vector));
      Thread hilo2 = new Thread(new Hilo2(vector));
      Thread hilo3 = new Thread(new Hilo3(vector));
      hilo1.start();
      hilo2.start();
      hilo3.start();
   }
}