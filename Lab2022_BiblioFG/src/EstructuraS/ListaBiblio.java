package EstructuraS;
import ObjetosB.*;
/*
* Laboratorio Java
* Programacion II */
/**
* @author Fernando Garcia
*/

public class ListaBiblio implements FuncEstr {
 //lista estatica de 20 elementos
 static int VACIA = -1;
 static int LLENA = 10;
 private Texto[] elementos;
 private int ult=VACIA;
 private int cursor=VACIA;
 
    public ListaBiblio() {
        elementos = new Texto[LLENA];
        ult=VACIA; cursor=VACIA;
    }
 
    public ListaBiblio(ListaBiblio l) {
        elementos = new Texto[LLENA];
        ult=VACIA; 
        cursor=VACIA;
        l.reset(); reset();
        while(!l.oos()){
            insert(l.copy());
            forward(); l.forward();
        } 
    }
    
    public void reset() {
        if (oos()) cursor=VACIA;
            else cursor=0;}

    public void forward() {
        if (oos())
        System.out.println("Error-No puede avanzar(oos)");
        else
            if (cursor==ult) cursor=VACIA;
                else cursor++;
    }
    
    public void insert(Texto x) {
        if (cursor==-1){ ult=ult+1; cursor=ult;}
            else shiftD();
        elementos[cursor]=x;}
    
    public void supress() {
        if (ult==0) {cursor=VACIA; ult=VACIA;}
            else shiftI();
    }
    
    public Texto copy() {
        if (oos()){
            System.out.println("Operacion Invalida");
            return null;
        }
        else return elementos[cursor];
    }
    
    public Boolean isempty() {return ult==VACIA;}
    
    public Boolean isfull() {return ult==(LLENA -1);}
    
    public Boolean oos() {return cursor==VACIA;}
    
    private void shiftI(){
        for (int i=cursor+1; i<=ult; i++)
            elementos[i-1]=elementos[i];
            ult--; 
    }
    
    private void shiftD(){
        for (int i=ult; i>=cursor; i--)
            elementos[i+1]=elementos[i];
            ult++; 
    }
    
    public void muestroL(){
        int aux=cursor;
        System.out.println("El contenido de la lista es:");
        reset();
        while (!oos()){
            System.out.print(copy() + " - ");
            forward();
        }
        System.out.println();
        cursor=aux; 
    }

    @Override
    public int cardinalidad() {
      int acc = 0;
      while(!oos()) {
	acc++;
	forward();
	}
	reset();
        return acc;
    }

    @Override
    public Boolean inStruc(Texto p) {
        reset();
        for(int i=0;i<ult;i++){
            if(elementos[cursor]==p){
                return true;
            }
            forward();
        }
        return false;
    }

    @Override
    public void muestroEstruc() {
        muestroL();
    }

    @Override
    public Lista drop(int x) {
        reset();
        for(int i=0;i<x;i++){
            supress();
        }
        return null;
    }
}
