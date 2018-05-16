package tienda;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class Principal {
    
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        Tienda[] local = new Tienda[1];
        System.out.println("\tIngrese los datos de la Tienda\n");
        
        System.out.println("Nombre: ");
        String nombre = lector.nextLine();
        System.out.println("Direccion: ");
        String direccion = lector.nextLine();
        System.out.println("RUC: ");
        String ruc = lector.nextLine();
        
        String[] producto = new String[3];
        for(int i = 0; i < producto.length;i++){
            producto[0]= lector.nextLine();
        }
        
        local[0]= new Tienda(nombre, direccion, ruc);
        String op;
        do{
            System.out.println("\tIngrese una opción\n");
            
            System.out.println("i. Ingresar nuevo producto");
            System.out.println("ii. Viasualizar lista de productos");
            System.out.println("iii. Salir");
            op=lector.nextLine();
            switch(op){
                case "i": case "I":
                    System.out.println("Ingresar nuevo producto");
                    break;
                case "ii": case "II":
                    System.out.println("Visualizar lista de productos");
                    break;
                case "iii": case "III":
                    System.out.println("Salir");
                    op= "b";
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(op!="b");
        
    }
}
