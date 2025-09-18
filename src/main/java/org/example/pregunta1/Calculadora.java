package Main;


public class Calculadora {



		//Metodo que acepta dos enteros
		
	     public   int sumar(int a, int b) {
			return a+b;
		}

	        
	    //Metodo que acepta tres enteros
	        
	      public  int sumar(int a, int b, int c) {
	        	return a+b+c;
	        }
	        
	    //Metodo que acepta dos números decimales
	        
	      public  double sumar(double a, double b) {
	        	return a+b;
	        }    
	        
	        
	        
		public static void main(String[] args) {
			
			Calculadora cal = new Calculadora();
			
			//Suma de dos números enteros
			 int resultado1 = cal.sumar(5, 3); //Lamando al metodo sumar
		     System.out.println("La suma de dos enteros (5 + 3): " + resultado1);
		     
		     //Suma de tres números enteros
		     int resultado2 = cal.sumar(5, 3, 2);//Lamando al metodo sumar
		     System.out.println("La suma de tres enteros (5 + 3 + 2): " + resultado2);
		     
		     //Suma de dos números decimales
		     double resultado3 = cal.sumar(5.5, 3.5);//Lamando al metodo sumar
		     System.out.println("La suma de dos decimales (5.5 + 3.5 ): " + resultado3);
		     
		     		
		
	}

}
