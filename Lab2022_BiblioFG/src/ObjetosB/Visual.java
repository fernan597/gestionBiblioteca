package ObjetosB;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Fernando Garcia
 */
public class Visual extends Apunte{
    private ArrayList<String> linksOnLine = new ArrayList<>();

    public Visual() {
    }

    public Visual(String Catedra, String Tema, String CodBiblio, String Nombre, String Autor, int cant, ArrayList<String> linksOnLine) {
        super(Catedra, Tema, CodBiblio, Nombre, Autor, cant);
        this.linksOnLine = linksOnLine;
    }

    public Visual(Visual v) {
        super(v);
        this.linksOnLine = v.linksOnLine;
    }

    public ArrayList<String> getLinks() {
        return linksOnLine;
    }

    public void setLinks(ArrayList<String> linksOnLine) {
        this.linksOnLine = linksOnLine;
    }
    
    /*El método showLinks() debe mostrar por pantalla todos los links almacenados
    (correspondientes a la dirección en la web donde se puede acceder al apunte visual).*/
    public void showLinks(){
        Iterator it = linksOnLine.iterator(); 
        while(it.hasNext()) {
            System.out.println(it.next()+"\n");
        }
    }

    @Override
    public String toString() {
        return  super.toString() + "linksOnLine=" + linksOnLine + '}';
    }
    
 

    
}
