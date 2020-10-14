
import java.util.Scanner;

public class Prueba {
    
 public static void main(String[] args) {
		// TODO Auto-generated method stub

//creación de las variables int centigrados y fahrenheit
	int centigrados;
	int fahrenheit;
//creación del objeto scanner llamado grados	
	Scanner grados;
	grados=new Scanner(System.in);
//creamos un comentario para que el usuario introduzca un valor y hacemos una apertura a teclado 
	System.out.println("Introduce un valor: ");
	centigrados=grados.nextInt();
//creación de la fórmula de conversión de ºC a Fº 	
	fahrenheit=(centigrados*9/5)+32;
//creamos un comentario en el cual dará al usuario la conversion de ºC a Fº
	System.out.println("la conversion a Farenheit es: " +fahrenheit +"Fº");

//cerramos la entrada de teclado
	grados.close();
	}

}

