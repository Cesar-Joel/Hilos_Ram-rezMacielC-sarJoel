public class Hilo1 implements Runnable{   
   
   public double x[];
   
   public Hilo1(double[] vector){
      x = new double[vector.length];
      x = vector;
   }
   
   public void run(){
      
      double suma = 0;
      
      for(int i = 0; i < x.length; i++){
         suma = suma + x[i];
      }
      System.out.printf("El resultado de la suma es: %.2f\n", suma);
   }
}