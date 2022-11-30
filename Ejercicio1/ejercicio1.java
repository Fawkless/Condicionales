package Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos=new Scanner(System.in);
        String nombre, apellido;
        int edad;
       


        System.out.println("Ingrese su nombre");
        nombre = datos.nextLine();
        
        System.out.println("Ingrese su apellido");
        apellido = datos.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = datos.nextInt();

        if (edad >= 18) {
        	System.out.println(nombre+" " + apellido + " usted es mayor de edad, por lo tanto, puede entrar a la fiesta");
        	
        	
            
        }
        else  System.out.println (nombre+" " + apellido + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor, devuélvase a su casa");
           


	}

}
