package ObjetosB;

/**
 *
 * @author Fernando Garcia
 */
public class Libro extends Texto{
    private String Editorial;
    private String ISBN;

    public Libro() {
    }
    
    public Libro(String Editorial, String ISBN, String CodBiblio, String Nombre, String Autor) {
        super(CodBiblio, Nombre, Autor);
        this.Editorial = Editorial;
        this.ISBN = ISBN;
    }

    public Libro(Libro l) {
        super(l);
        this.Editorial = l.Editorial;
        this.ISBN = l.ISBN;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + "Editorial=" + Editorial + ", ISBN=" + ISBN + '}';
    }
    
    
}
