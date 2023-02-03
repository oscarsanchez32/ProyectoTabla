package programacion.tema6;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author oscar
 */
public class BilleteOculto {
    public static void main (String [] args){
       String dineroEscondido = "€";
       String [][] tablaClase = new String [8][4];
       
       for (int i=0; i<8; i++) {
           for(int j=0; j<4; j++){
               j=0;
           }        
       }
       
       Random random = new Random();
       int x = random.nextInt();
       int y = random.nextInt();
       
       tablaClase [x][y] = dineroEscondido;
       
       System.out.println("El dinero escondido se halla en la posición (" + x +","+ y +")");
       System.out.println(Arrays.toString(tablaClase));
       
       
    }    
}
