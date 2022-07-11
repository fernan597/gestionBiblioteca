package ObjetosB;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
/**
 *
 * @author Fernando Garcia
 */
public class Practico extends Apunte{
    private int[] fecha = new int[3];
    
    public Practico(){
    }

    public Practico(String Catedra, String Tema, String CodBiblio, String Nombre, String Autor, int cant, int []fecha) {
        super(Catedra, Tema, CodBiblio, Nombre, Autor, cant);
        this.fecha = fecha;
    }

    public Practico(Apunte a) {
        super(a);
    }

    public int[] getFecha() {
        return fecha;
    }

    public void setFecha(int[] fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString()  + "fecha=" + Arrays.toString(fecha) + '}';
    }
}



   
