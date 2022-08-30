package Cine;
import java.util.Scanner;
public class cineMain {

	public static void main(String[] args) {
		
		Cine cine = new Cine();
		
		cine.crearAsientos();
		cine.settearDibujo();
		
		byte botonMenu = 0;
		Integer ingreso = 0;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("///////////////////////////////");
            System.out.println("/////// CINE CIUDADELA ////////");
            System.out.println("///////////////////////////////");
            System.out.println("\n");
            System.out.println("**");
            System.out.println("OPCIONES");
            System.out.println("**");
            System.out.println("\n");
            System.out.println("1- VER MAPA ASIENTOS");
            System.out.println("2- REVESERVAR 1");
            System.out.println("3- RESERVAR VARIOS");
            System.out.println("\n");
            System.out.println("4- Salir");

            botonMenu = teclado.nextByte();

            switch (botonMenu) {
            case 1:
            	System.out.println(cine.dibujarCine());
            	System.out.println("La cantidad total de asientos ocupados es " + cine.getTotalButacasOcupadas()+ "\n");
                break;
            case 2:
            	if(cine.ReservarDeAUno()) {
            		
            		System.out.println("La reserva fue exitosa, dibujando mapa de asientos.");
            		System.out.println(cine.dibujarCine());
            		System.out.println("La cantidad total de asientos ocupados es " + cine.getTotalButacasOcupadas() + "\n");
            	}
            	else {
            		
            		System.out.println("La reserva no puedo ser completada, te cabieron los asientos.");
            		
            	}
            	
            	
                break;
            case 3:
            	System.out.println("Ingrese cuantos giles van a mirar la peli: ");
            	ingreso = teclado.nextInt();
            	if(cine.reservaDeAMuchos(ingreso)) {
            		
            		System.out.println("Transaccion completada");
            		System.out.println(cine.dibujarCine());
            		System.out.println("La cantidad total de asientos ocupados es " + cine.getTotalButacasOcupadas()+ "\n");
            	}
            	else {
            		
            		System.out.println("no hay");
            		System.out.println(cine.dibujarCine());
            		System.out.println("La cantidad total de asientos ocupados es " + cine.getTotalButacasOcupadas()+ "\n");
            	}
            	break;
            	
            case 4:
                System.out.println("Nos vemos!");
                break;
            default:
                System.out.println("OPCION INCORRECTA");
                break;
            }

        } while (botonMenu != 4);
    

	}

}
