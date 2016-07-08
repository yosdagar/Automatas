
package proyectoconjuntos;

import java.util.Scanner;

public class Menu {
    Scanner Tam = new Scanner (System.in);
        Scanner Tam1 = new Scanner (System.in);

    Scanner leer = new Scanner (System.in);
	
    int numTam;
    int numTam1;
    String A[];
	String B[];
	String C[];
	String D[];
	String E[];
	String a[];
	
	String con1;
	String con2;
	String con3;
	String con4;
	String con5;
	public void metodos (int x) {
                 System.out.println("Introduzca el tamaño A");
            numTam1=Tam1.nextInt();
            
                        System.out.println("Introduzca el tamaño b");
                        numTam=Tam.nextInt();
                        
                                 
            
            for(int r=0; r< numTam; r++){
		 A = new String [numTam1];
		 B = new String [numTam];
                }
//		 C = new String [5];
//		 D = new String [5];
//		 E = new String [5];
           
                            
                        

        while(x < 6){
			
			switch(x)
			   {
			       case 1:System.out.println("No se puede con un solo conjunto");
			        System.out.println("Minimo 2 maximo 5");
					x= leer.nextInt();
			        break;
			    	   
			       case 2: System.out.println("Introduzca los elementos del conjunto A");
					 for(int i = 0; i < numTam ; i++){
						 A[i] = leer.nextLine();
					 } 
					 
					 System.out.println("");
					 
					 System.out.println("Introduzca los elementos del conjunto B");
					 for(int d = 0; d < numTam1 ; d++){
						 B[d] = leer.nextLine ();
					 } 
					 x = 6;
					 break;
			    	   
			       case 3:System.out.println("Introduzca los elementos del conjunto A");
					 for(int i = 0; i< numTam ; i++){
						 A[i] = leer.nextLine ();
					 }
					 System.out.println("Introduzca los elementos del conjunto B");
					 for(int i = 0; i< numTam1 ; i++){
						 B[i] = leer.nextLine ();
					 }
					 System.out.println("");
					 System.out.println("Introduzca los elementos del conjunto C");
					 for(int i = 0; i< 5 ; i++){
						 C[i] = leer.nextLine ();
					 }
					 x = 6;
					 break;
					 
			       case 4:System.out.println("Introduzca los elementos del conjunto A");
					 for(int i = 0; i< 5 ; i++){
						 A[i] = leer.nextLine ();
					 }
					 System.out.println("");
					 System.out.println("Introduzca los elementos del conjunto B");
					 for(int i = 0; i< 5 ; i++){
						 B[i] = leer.nextLine ();
					 }
					 System.out.println("");
					 System.out.println("Introduzca los elementos del conjunto C");
					 for(int i = 0; i< 5 ; i++){
						 C[i] = leer.nextLine ();
					 }
					 System.out.println("");
					 System.out.println("Introduzca los elementos del conjunto D");
					 for(int i = 0; i< 5 ; i++){
						 D[i] = leer.nextLine ();
					 }
					 x = 6;
					 break;
                        
                                case 5:System.out.println("Introduzca los elementos del conjunto A");
					 for(int i = 0; i< 5 ; i++){
						 A[i] = leer.nextLine ();
					 }
					 System.out.println("");
					 System.out.println("Introduzca los elementos del conjunto B");
					 for(int i = 0; i< 5 ; i++){
						 B[i] = leer.nextLine ();
					 }
					 System.out.println("");
					 System.out.println("Introduzca los elementos del conjunto C");
					 for(int i = 0; i< 5 ; i++){
						 C[i] = leer.nextLine ();
					 }
					 System.out.println("");
					 System.out.println("Introduzca los elementos del conjunto D");
					 for(int i = 0; i< 5 ; i++){
						 D[i] = leer.nextLine ();
					 }
					 System.out.println("");
					 System.out.println("Introduzca los elementos del conjunto E");
					 for(int i = 0; i< 5 ; i++){
						 E[i] = leer.nextLine ();
					 }
					 x = 6;
					 break; 
			   		}
				}
			}
public void Union(String U ){
                        int tam2 = numTam*2;
			a = new String[10];
			int i = 0;
			System.out.println("Unión es");
			System.out.print("R = {");
			
			if(U.equals("AUB") || U.equals("BUA")){
				for(int j = 0; j < tam2; j++){
					a[j] = A[j];
				}
				for(int j = numTam; j < tam2; j++){
					a[j] = B[i];
				 i++;
				}
				for(int j = 0; j < tam2; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			
			if(U.equals("AUC")  || U.equals("CUA")){
				for(int j = 0; j < A.length; j++){
					a[j] = A[j];
				}
				for(int j = 5; j < 10; j++){
					a[j] = C[i];
				 i++;
				}
				for(int j = 0; j < 10; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			if(U.equals("AUD")  || U.equals("DUA")){
				for(int j = 0; j < A.length; j++){
					a[j] = A[j];
				}
				for(int j = 5; j < 10; j++){
					a[j] = D[i];
				 i++;
				}
				for(int j = 0; j < 10; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			
			if(U.equals("AUE")  || U.equals("EUA")){
				for(int j = 0; j < A.length; j++){
					a[j] = A[j];
				}
				for(int j = 5; j < 10; j++){
					a[j] = E[i];
				 i++;
				}
				for(int j = 0; j < 10; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			
			if(U.equals("BUC")  || U.equals("CUB")){
				for(int j = 0; j < A.length; j++){
					a[j] = B[j];
				}
				for(int j = 5; j < 10; j++){
					a[j] = C[i];
				 i++;
				}
				for(int j = 0; j < 10; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			
			if(U.equals("BUD")  || U.equals("DUB")){
				for(int j = 0; j < A.length; j++){
					a[j] = B[j];
				}
				for(int j = 5; j < 10; j++){
					a[j] = D[i];
				 i++;
				}
				for(int j = 0; j < 10; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			
			if(U.equals("BUE")  || U.equals("EUB")){
				for(int j = 0; j < A.length; j++){
					a[j] = B[j];
				}
				for(int j = 5; j < 10; j++){
					a[j] = E[i];
				 i++;
				}
				for(int j = 0; j < 10; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			
			if(U.equals("CUD")  || U.equals("DUC")){
				for(int j = 0; j < A.length; j++){
					a[j] = C[j];
				}
				for(int j = 5; j < 10; j++){
					a[j] = D[i];
				 i++;
				}
				for(int j = 0; j < 10; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			
			if(U.equals("CUE")  || U.equals("EUC")){
				for(int j = 0; j < A.length; j++){
					a[j] = C[j];
				}
				for(int j = 5; j < 10; j++){
					a[j] = E[i];
				 i++;
				}
				for(int j = 0; j < 10; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			
			if(U.equals("DUE")  || U.equals("EUD")){
				for(int j = 0; j < A.length; j++){
					a[j] = D[j];
				}
				for(int j = 5; j < 10; j++){
					a[j] = E[i];
				 i++;
				}
				for(int j = 0; j < 10; j++){
					 System.out.print(a[j]+" "); 
				}	
			}
			System.out.print("}");
			 System.out.println("\n");
	}
	
	
	public void Interseccion (String U){
		
		a = new String[5];
		System.out.println("Intersección es");
		System.out.print("R = {");
		String b="1";
		
		if(U.equals("AnB")  || U.equals("BnA")){
			for(int i = 0; i < A.length; i++){
				  if(A[0].equals(B[i]) || A[1].equals(B[i]) || A[2].equals(B[i]) || A[3].equals(B[i]) || A[4].equals(B[i]) ){  
					a[i] = B[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}
		}
		
		if(U.equals("AnC")  || U.equals("CnA")){
			for(int i = 0; i < A.length; i++){
				  if(A[0].equals(C[i]) || A[1].equals(C[i]) || A[2].equals(C[i]) || A[3].equals(C[i]) || A[4].equals(C[i]) ){  
					a[i] = C[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}
		}
	
		if(U.equals("AnD")  || U.equals("DnA")){
			for(int i = 0; i < A.length; i++){
				  if(A[0].equals(D[i]) || A[1].equals(D[i]) || A[2].equals(D[i]) || A[3].equals(D[i]) || A[4].equals(D[i]) ){  
					a[i] = D[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}
		}
		
		if(U.equals("AnE")  || U.equals("EnA")){
			for(int i = 0; i < A.length; i++){
				  if(A[0].equals(E[i]) || A[1].equals(E[i]) || A[2].equals(E[i]) || A[3].equals(E[i]) || A[4].equals(E[i]) ){  
					a[i] = E[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}
		}
		
		if(U.equals("BnC")  || U.equals("CnB")){
			for(int i = 0; i < A.length; i++){
				  if(B[0].equals(C[i]) || B[1].equals(C[i]) || B[2].equals(C[i]) || B[3].equals(C[i]) || B[4].equals(C[i]) ){  
					a[i] = C[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}
		}
		
		if(U.equals("BnD")  || U.equals("DnB")){
			for(int i = 0; i < A.length; i++){
				  if(B[0].equals(D[i]) || B[1].equals(D[i]) || B[2].equals(D[i]) || B[3].equals(D[i]) || B[4].equals(D[i]) ){  
					a[i] = D[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}
		}
		
		if(U.equals("BnE")  || U.equals("EnB")){
			for(int i = 0; i < A.length; i++){
				  if(B[0].equals(E[i]) || B[1].equals(E[i]) || B[2].equals(E[i]) || B[3].equals(E[i]) || B[4].equals(E[i]) ){  
					a[i] = E[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}
		}
		
		if(U.equals("CnD")  || U.equals("DnC")){
			for(int i = 0; i < A.length; i++){
				  if(C[0].equals(D[i]) || C[1].equals(D[i]) || C[2].equals(D[i]) || C[3].equals(D[i]) || C[4].equals(D[i]) ){  
					a[i] = D[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}
		}
		
		if(U.equals("CnE")  || U.equals("EnC")){
			for(int i = 0; i < A.length; i++){
				  if(C[0].equals(E[i]) || C[1].equals(E[i]) || C[2].equals(E[i]) || C[3].equals(E[i]) || C[4].equals(E[i]) ){  
					a[i] = E[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}
		}
		
		if(U.equals("DnE")  || U.equals("EnD")){
			for(int i = 0; i < A.length; i++){
				  if(D[0].equals(E[i]) || D[1].equals(E[i]) || D[2].equals(E[i]) || D[3].equals(E[i]) || D[4].equals(E[i]) ){  
					a[i] = E[i];
				  }
				  if(a[i] != null)
				  System.out.print(a[i]+" ");
			}	
		}
		System.out.print("}");
		System.out.println("\n");
	}


public void Resta(String U){
	
	a = new String[5];
	System.out.println("La resta es");
	System.out.print("R = {");
	
	if(U.equals("A-B")){
		for(int i = 0 ; i<A.length ; i++){
			if(A[i].equals(B[0]) || A[i].equals(B[1]) || A[i].equals(B[2]) || A[i].equals(B[3]) || A[i].equals(B[4])){
			}else{
				a[i] = A[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	
	if(U.equals("A-C")){
		for(int i = 0 ; i<A.length ; i++){
			if(A[i].equals(C[0]) || A[i].equals(C[1]) || A[i].equals(C[2]) || A[i].equals(C[3]) || A[i].equals(C[4])){
			}else{
				a[i] = A[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("A-D")){
		for(int i = 0 ; i<A.length ; i++){
			if(A[i].equals(D[0]) || A[i].equals(D[1]) || A[i].equals(D[2]) || A[i].equals(D[3]) || A[i].equals(D[4])){
			}else{
				a[i] = A[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("A-E")){
		for(int i = 0 ; i<A.length ; i++){
			if(A[i].equals(E[0]) || A[i].equals(E[1]) || A[i].equals(E[2]) || A[i].equals(E[3]) || A[i].equals(E[4])){
			}else{
				a[i] = A[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	
	if(U.equals("B-A")){
		for(int i = 0 ; i<A.length ; i++){
			if(B[i].equals(A[0]) || B[i].equals(A[1]) || B[i].equals(A[2]) || B[i].equals(A[3]) || B[i].equals(A[4])){
			}else{
				a[i] = B[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("B-C")){
		for(int i = 0 ; i<A.length ; i++){
			if(B[i].equals(C[0]) || B[i].equals(C[1]) || B[i].equals(C[2]) || B[i].equals(C[3]) || B[i].equals(C[4])){
			}else{
				a[i] = B[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("B-D")){
		for(int i = 0 ; i<A.length ; i++){
			if(B[i].equals(D[0]) || B[i].equals(D[1]) || B[i].equals(D[2]) || B[i].equals(D[3]) || B[i].equals(D[4])){
			}else{
				a[i] = B[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("B-E")){
		for(int i = 0 ; i<A.length ; i++){
			if(B[i].equals(E[0]) || B[i].equals(E[1]) || B[i].equals(E[2]) || B[i].equals(E[3]) || B[i].equals(E[4])){
			}else{
				a[i] = B[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("C-A")){
		for(int i = 0 ; i<A.length ; i++){
			if(C[i].equals(A[0]) || C[i].equals(A[1]) || C[i].equals(A[2]) || C[i].equals(A[3]) || C[i].equals(A[4])){
			}else{
				a[i] = C[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("C-B")){
		for(int i = 0 ; i<A.length ; i++){
			if(C[i].equals(B[0]) || C[i].equals(B[1]) || C[i].equals(B[2]) || C[i].equals(B[3]) || C[i].equals(B[4])){
			}else{
				a[i] = C[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("C-D")){
		for(int i = 0 ; i<A.length ; i++){
			if(C[i].equals(D[0]) || C[i].equals(D[1]) || C[i].equals(D[2]) || C[i].equals(D[3]) || C[i].equals(D[4])){
			}else{
				a[i] = C[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("C-E")){
		for(int i = 0 ; i<A.length ; i++){
			if(C[i].equals(E[0]) || C[i].equals(E[1]) || C[i].equals(E[2]) || C[i].equals(E[3]) || C[i].equals(E[4])){
			}else{
				a[i] = C[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("D-A")){
		for(int i = 0 ; i<A.length ; i++){
			if(D[i].equals(A[0]) || D[i].equals(A[1]) || D[i].equals(A[2]) || D[i].equals(A[3]) || D[i].equals(A[4])){
			}else{
				a[i] = D[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	
	if(U.equals("D-B")){
		for(int i = 0 ; i<A.length ; i++){
			if(D[i].equals(B[0]) || D[i].equals(B[1]) || D[i].equals(B[2]) || D[i].equals(B[3]) || D[i].equals(B[4])){
			}else{
				a[i] = D[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("D-C")){
		for(int i = 0 ; i<A.length ; i++){
			if(D[i].equals(C[0]) || D[i].equals(C[1]) || D[i].equals(C[2]) || D[i].equals(C[3]) || D[i].equals(C[4])){
			}else{
				a[i] = D[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	
	if(U.equals("D-E")){
		for(int i = 0 ; i<A.length ; i++){
			if(D[i].equals(E[0]) || D[i].equals(E[1]) || D[i].equals(E[2]) || D[i].equals(E[3]) || D[i].equals(E[4])){
			}else{
				a[i] = D[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("E-A")){
		for(int i = 0 ; i<A.length ; i++){
			if(E[i].equals(A[0]) || E[i].equals(A[1]) || E[i].equals(A[2]) || E[i].equals(A[3]) || E[i].equals(A[4])){
			}else{
				a[i] = E[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	if(U.equals("E-B")){
		for(int i = 0 ; i<A.length ; i++){
			if(E[i].equals(B[0]) || E[i].equals(B[1]) || E[i].equals(B[2]) || E[i].equals(B[3]) || E[i].equals(B[4])){
			}else{
				a[i] = E[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	
	if(U.equals("E-C")){
		for(int i = 0 ; i<A.length ; i++){
			if(E[i].equals(C[0]) || E[i].equals(C[1]) || E[i].equals(C[2]) || E[i].equals(C[3]) || E[i].equals(C[4])){
			}else{
				a[i] = E[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	
	if(U.equals("E-D")){
		for(int i = 0 ; i<A.length ; i++){
			if(E[i].equals(D[0]) || E[i].equals(D[1]) || E[i].equals(D[2]) || E[i].equals(D[3]) || E[i].equals(D[4])){
			}else{
				a[i] = E[i];
			}
			 if(a[i] != null)
				System.out.print(a[i]+" ");
			} 
	}
	System.out.print("}");
	System.out.println("\n");
	
  }


public void complemento ( String U) {
	a = new String [20];
	
	System.out.print("El univeso es\n");
	System.out.print("R = {");

	if(U.equals("Ac")){
		for(int i=0; i<A.length; i++){
			a[i]=B[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+5]=C[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+10]=D[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+15]=E[i];
		}
		for(int i=0; i<20; i++){
			 if(a[i] != null)
					System.out.print(a[i]+" ");
				} 
		}
		
	if(U.equals("Bc")){
		for(int i=0; i<A.length; i++){
			a[i]=A[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+5]=C[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+10]=D[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+15]=E[i];
		}
		for(int i=0; i<20; i++){
			 if(a[i] != null)
					System.out.print(a[i]+" ");
				} 
		}
	
	if(U.equals("Cc")){
		for(int i=0; i<A.length; i++){
			a[i]=A[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+5]=B[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+10]=D[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+15]=E[i];
		}
		for(int i=0; i<20; i++){
			 if(a[i] != null)
					System.out.print(a[i]+" ");
				} 
		}
	
	if(U.equals("Dc")){
		for(int i=0; i<A.length; i++){
			a[i]=A[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+5]=B[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+10]=C[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+15]=E[i];
		}
		for(int i=0; i<20; i++){
			 if(a[i] != null)
					System.out.print(a[i]+" ");
				} 
		}
	
	if(U.equals("Ec")){
		for(int i=0; i<A.length; i++){
			a[i]=A[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+5]=B[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+10]=C[i];
		}
		for(int i=0; i<A.length; i++){
			a[i+15]=D[i];
		}
		for(int i=0; i<20; i++){
			 if(a[i] != null)
					System.out.print(a[i]+" ");
				} 
		}
	System.out.print("}");
	System.out.println("\n");		
}
}

   

