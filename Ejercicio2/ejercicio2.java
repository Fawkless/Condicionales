package Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	
		 public static void main(String[] args) {
		       
			 Scanner datos=new Scanner(System.in);
		        
			 String nombre, apellido, respuesta1;
			 
			 
			 
		        
			 
			 System.out.println("Ingrese su nombre");
		       nombre = datos.nextLine();
		        
		       System.out.println("Ingrese su apellido");
		       apellido = datos.nextLine();
		        
		        System.out.println("¿Desea alquilar una pelicula? Responder: SI o NO");
                respuesta1= datos.nextLine();
                
                if ( respuesta1.equals("SI")) {
                	System.out.println("¿Desea ver la lista de peliculas disponibles? Responder: SI o NO");
                	respuesta1= datos.nextLine();
                
                	
                     if( respuesta1.equals("SI")) {
                		System.out.println("1-Rapido y Furioso , 2-Harry Potter, 3- Piratas del caribe, 4- No quiero esas" );
                		System.out.println( "Responder con el numero correspondiente");
                		respuesta1= datos.nextLine();
                		
                		if( respuesta1.equals("1") || ( respuesta1.equals("2") || (respuesta1.equals("3") ))) {
                    		System.out.println("Desea retirar su pelicula en la tienda Responder: SI o NO" );
                    		respuesta1= datos.nextLine();
                    		
                    		if ( respuesta1.equals("SI")) {
                            	System.out.println("!Exelente, lo esperamos!. NOTA: Se podrian presentar cargos si la pelicula no regresa en las condiciones adecuadas");}
                    		
                    	if( respuesta1.equals("NO")) System.out.println("Favor indique direccion de envio" );
               	         respuesta1= datos.nextLine();
                		  
                		System.out.println("Recibira su pelicula a la brevedad. Muchas gracias. NOTA: Se podrian presentar cargos si la pelicula no regresa en las condiciones adecuadas" );
                		}
               	         
               	         else if( respuesta1.equals("4")) System.out.println("Favor indique que pelicula desea" );
                		      respuesta1= datos.nextLine();
                		      
                		      
                		      
                		     if ( respuesta1.equals("Piratas del caribe") || ( respuesta1.equals("Harry Potter") || (respuesta1.equals("Rapidos y furiosos") ))) {
                     	         System.out.println("Desea retirar su pelicula en la tienda Responder: SI o NO" );
                     	         respuesta1= datos.nextLine();}
                     	         
                     	        else System.out.println("Lo sentimos, no disponemos de ese titulo" );
                     	        
                     	        if ( respuesta1.equals("SI")) {
                                	System.out.println("!Exelente, lo esperamos! NOTA: Se podrian presentar cargos si la pelicula no regresa en las condiciones adecuadas");}
                     	        
                     	        else if (respuesta1.equals("NO")) System.out.println("Favor indique direccion de envio");
                     	          respuesta1= datos.nextLine();
                     	          
               	         System.out.println("Recibira su pelicula a la brevedad. Muchas gracias. NOTA: Se podrian presentar cargos si la pelicula no regresa en las condiciones adecuadas" );
               	         
               	         
                		
                     
                     }
                
                		else if( respuesta1.equals("NO")) System.out.println("Favor indique que pelicula desea" );
                             respuesta1= datos.nextLine();
                     
                          if ( respuesta1.equals("Piratas del caribe") || ( respuesta1.equals("Harry Potter") || (respuesta1.equals("Rapidos y furiosos") ))) {
                	         System.out.println("Desea retirar su pelicula en la tienda Responder: SI o NO" );
                	         respuesta1= datos.nextLine();}
                	         
                	         else System.out.println("Lo sentimos, no disponemos de ese titulo" );
                          
                          if ( respuesta1.equals("SI")) {
                          	System.out.println("!Exelente, lo esperamos! NOTA: Se podrian presentar cargos si la pelicula no regresa en las condiciones adecuadas");}
                	         
                	         if( respuesta1.equals("NO")) System.out.println("Favor indique direccion de envio" );
                	         respuesta1= datos.nextLine();
                	         
                	         System.out.println("Recibira su pelicula a la brevedad. Muchas gracias. NOTA: Se podrian presentar cargos si la pelicula no regresa en las condiciones adecuadas" );
                	        
                     }
                 
                
                	  
                if ( respuesta1.equals("SI")) {
                	System.out.println("!Exelente, lo esperamos! NOTA: Se podrian presentar cargos si la pelicula no regresa en las condiciones adecuadas");}
                	
                	
                
               else System.out.println("Gracias! Vuelva pronto");
                	
}
		 }
		 

		 
		 
		
		 
