package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
	       
		 Scanner datos=new Scanner(System.in);
	        
		 String nombre, apellido, respuesta;
		 int edad, telefono;
		 
		 
	
		 System.out.println("Ingrese su nombre");
	       nombre = datos.nextLine();
	        
	       System.out.println("Ingrese su apellido");
	       apellido = datos.nextLine();
	        
	        System.out.println("Ingrese su edad");
            edad= datos.nextInt();
		
            if (edad > 18) { 
            
            	datos.nextLine();
             System.out.println("¿Cual es el motivo de visita? 1-Compra de producto, 2- Consulta de precio, 3- Devoluciones");
            respuesta= datos.nextLine();
            
            if (respuesta.equals("1")) {
        		System.out.println("Favor indique el producto que desea:\n1- Perifar Flex 8 comprimidos $80\n2-Venda semi elastica 7x10m $69\n3-Analgesico en spray 500ml $150\n4-Alcohol 1lt $100 ");
        		respuesta= datos.nextLine();
        		
        		if ( respuesta.equals("1") || ( respuesta.equals("2") || (respuesta.equals("3") || (respuesta.equals("4") )))) { 
        			System.out.println("Ingrese numero de contacto" );
            		telefono= datos.nextInt();
            		
            		System.out.println("Nos comunicaremos con usted a la brevedad, para los detalles del pago y envio del pedido. Muchas gracias" );
            		
            		}
            }

                    else if (respuesta.equals("2")) {
        			System.out.println("Favor indique el producto que le interesa");
            		respuesta= datos.nextLine();
            		
            		System.out.println("Ingrese numero de contacto" );
            		telefono= datos.nextInt();
            		
            		System.out.println("Nos comunicaremos con usted a la brevedad para responder a su consulta" );
            		
            	}
            		
        		else if (respuesta.equals("3")) {
        			System.out.println("Favor indique el producto que quiere devolver");
            		respuesta= datos.nextLine();
            		
            		System.out.println("Ingrese el motivo de la devolucion" );
            		respuesta= datos.nextLine();
            		
            		System.out.println("Ingrese numero de contacto" );
            		telefono= datos.nextInt();
            		
            		System.out.println("Nos comunicaremos con usted a la brevedad para resolver los detalles" );
        		}
	
	
	}
            else System.out.println("Lo sentimos, por motivos reglamentarios no podemos ofrecerle nuestros servicios, dado que usted es menor de edad.");
	}
}

