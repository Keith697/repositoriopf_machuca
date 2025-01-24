
package javaapplication6;
import java.util.Scanner;
public class JavaApplication6 {
    //método de la clase  
  public static void main(String[] args){
     //declarar variables
     int vent1,vent2,vent3;
     double sueldom,pagom,comis,descuento;
     String vendedor;
     //crear un objeto de lectura de datos
     Scanner lectura = new Scanner(System.in);
     //entrada de datos
     System.out.print("Ingresar nombre de vendedor:");
     vendedor=lectura.next();
     System.out.print("Sueldo Mensual: ");
     sueldom=lectura.nextDouble();
     System.out.print("Descuento: ");
     descuento=lectura.nextDouble();
     System.out.print("Venta 1: ");
     vent1=lectura.nextInt();
     System.out.print("Venta 2: ");
     vent2=lectura.nextInt();
     System.out.print("Venta 3: ");
     vent3=lectura.nextInt();
     // proceso de datos
     comis=(vent1+vent2+vent3)*0.10;
     pagom=sueldom+comis-descuento;
     //Salida de Datos     
     System.out.println("La comision de la venta es: " + comis);
     System.out.println(" El sueldo mensual del Vendedor es: " + pagom);
            
  }  
}
