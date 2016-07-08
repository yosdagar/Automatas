
package proyectoconjuntos;

import java.util.Scanner;


public class ProyectoConjuntos {

   
    public static void main(String[] args) {
        
        Scanner palabra = new Scanner (System.in);
        Scanner stri = new Scanner (System.in);
		
        Menu m;
      m= new Menu ();
    int x = 0;
    int O=0;
    String U = " ";
     
     
    System.out.println("¿Cuantos conjuntos desea?\n(Minimo 2 )");
		x= palabra.nextInt();
		if(x>5){
			System.out.println("Solo se pueden introducir minimo 2 conjuntos\nVuelva a escribir el número de conjuntos");
			x= palabra.nextInt();
		}
		System.out.println("");
		
		m.metodos(x);
		System.out.println("");
	
		 while(O!=5)
		    {
			 System.out.println("¿Qué operación decea hacer?");
			 System.out.println("1.Unión\n2.Intersección\n3.Resta\n4.Complemento\n5.Cerrar programa");//Nos muestra un pequeño menu de opciones
			 System.out.println("Escriba el número de la opción que desea");
		    O=palabra.nextInt();//La variable O vatomar el numero que le de el usuario
		    
		      
		   switch(O)
		   {
		       case 1:System.out.println("Los conjuntos los debe escribir en mayuscula");
		    	   System.out.println("Unio se pone una U mayuscula entre los conjuntos.\nEjemplo: AUB, EUA.");
		       U= stri.nextLine();
				m.Union(U);
		       ;break;
		    	   
		       case 2:System.out.println("Los conjuntos los debe escribir en mayuscula");
		    	   System.out.println("Intersección se pone una n minuscula entre los conjuntos.\nEjemplo: An, DnB");
		       U= stri.nextLine();
		       m.Interseccion(U);
		       ;break;
		    	   
		       case 3:System.out.println("Los conjuntos los debe escribir en mayuscula");
		    	   System.out.println("Resta se pone el signo - entre los conjuntos.\nEjemplo: A-B .");
		       U= stri.nextLine();
		       m.Resta(U);
		       ;break;
		    	   
		       case 4:System.out.println("Los conjuntos los debe escribir en mayuscula");
		    	   System.out.println("Complemento se pone una c minuscula despues del conjunto.\nEjemplo Ac, Bc.");
		       U= stri.nextLine();  
		       m.complemento(U);
		       ;break;
		     
		   }
		

		}
	
	 
     
    }
    
}
