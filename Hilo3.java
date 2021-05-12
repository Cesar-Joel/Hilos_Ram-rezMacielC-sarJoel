public class Hilo3 implements Runnable{
   
   public double x[];
   
   public Hilo3(double[] vector){
      x = new double[vector.length];
      x = vector;
   }
   
   public void run(){
      
      double suma = 0;
      double media;
      
      for(int i = 0; i < x.length; i++){
         suma = suma + x[i];
      }
      media = suma/x.length;
      System.out.printf("El resultado de la media es: %.2f\n", media);
   }
}