package ObjetosB;



/**
 *
 * @author Fernando Garcia
 */
public class Texto {
    private String CodBiblio;
    private String Nombre;
    private String Autor;

    public Texto(String CodBiblio, String Nombre, String Autor) {
        this.CodBiblio = CodBiblio;
        this.Nombre = Nombre;
        this.Autor = Autor;
    }
    
    public Texto(){
    
    }
    
    public Texto(Texto t){
        this.Autor = t.Autor;
        this.Nombre = t.Nombre;
        this.CodBiblio = t.CodBiblio;
    }

    public String getCodBiblio() {
        return CodBiblio;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setCodBiblio(String CodBiblio) {
        this.CodBiblio = CodBiblio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "{" + "CodBiblio=" + CodBiblio + ", Nombre=" + Nombre + ", Autor=" + Autor ;
    }

}
