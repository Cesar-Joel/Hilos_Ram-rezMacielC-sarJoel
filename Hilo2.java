public class Hilo2 implements Runnable{
   
   public double x[];
   
   public Hilo2(double[] vector){
      x = new double[vector.length];
      for(int i = 0; i < x.length; i++){
         x[i] = vector[i]*vector[i];
      }
   }
   
   public void run(){
      
      double suma = 0;
      
      for(int i = 0; i < x.length; i++){
         suma = suma + x[i];
      }
      System.out.printf("El resultado de la suma de los cuadrados es: %.2f\n", suma);
   }
}