package ObjetosB;

/**
 *
 * @author Fernando Garcia
 */
public class Apunte extends Texto{
    private String Catedra;
    private String Tema;
    private int cant;
    
    
    public Apunte(){
    }
    
    public Apunte(String Catedra, String Tema, String CodBiblio, String Nombre, String Autor, int cant) {
        super(CodBiblio, Nombre, Autor);
        this.Catedra = Catedra;
        this.Tema = Tema;
        this.cant = cant;
    }
    
    public Apunte(Apunte a) {
        super(a);
        this.Catedra = a.Catedra;
        this.Tema = a.Tema;
        this.cant = a.cant;
    }

    public String getCate() {
        return Catedra;
    }

    public void setCate(String Catedra) {
        this.Catedra = Catedra;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return  super.toString() + "Catedra=" + Catedra + ", Tema=" + Tema + ", cant=" + cant + '}';
    }
    
}
