package desafio_1;

import java.util.Scanner;

public class calendario {

	public static void main(String[] args) {
		
		
		short anio = 0;
		byte dia = 0; 
		byte mes = 0; 
		
		short[] fecha = {dia,mes,anio};
		
		Scanner teclado = new Scanner(System.in);
		
		
	//año
		
		do {
			System.out.println("ingrese año");
			anio = teclado.nextShort();
			fecha[0] = 	anio;		
		} while (fecha[0] < 1900 || fecha[0] > 2099);
		
	//mes
		
		do {
		System.out.println("ingrese mes");
			mes = teclado.nextByte();
			fecha[1] = mes;
		}while(fecha[1] < 1 || fecha[1] > 12);
		
	//dia
		
		if (Bisiesto(fecha[0] ) && fecha[1]==2) {
			
			do {
				System.out.println("ingrese dia");
				dia = teclado.nextByte();
				fecha[2] = dia;
				}
				while(fecha[2]< 0 || fecha[2]> 29);
		}else {
			
			do {
				System.out.println("ingrese dia");
				dia = teclado.nextByte();
				fecha[2] = dia;
				}
				while(fecha[2] < 0 || fecha[2] > 28);
			}					
		teclado.close();
	//imprimir fecha
		
		System.out.println("la fecha ingresada es "+fecha[2]+"/"+fecha[1]+"/"+fecha[0]);
				
	}
	
	//bisiesto
	private static boolean Bisiesto(short anio) {	    
	     return ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0));	      
	}
						
		
}


