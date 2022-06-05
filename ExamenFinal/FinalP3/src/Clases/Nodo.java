/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 50232
 */
public class Nodo {
    private int nombre;
    private boolean visitado;
    private boolean etiqueta;
    private double acumulado;
    private Nodo Predecesor;
    
    //constructor
    public Nodo(){
        this.nombre =-1;
        this.visitado = false;
        this.etiqueta=false;
        this.Predecesor= null;
        this.acumulado=0;
    }
    
    public int getNombre(){
        return nombre;
    }
    
    public int setNombre(){
        return nombre;
    }
    
    public boolean isVisitado(){
        return visitado;
    }
    
    public boolean setVisitado(){
        return visitado;
    }
    
    public boolean isEtiqueta(){
        return etiqueta;
    }
    
    public boolean setEtiqueta(){
        return etiqueta;
    }
    
    public Nodo getPredecesor(){
        return Predecesor;
    } 
    
    public Nodo setPredecesor(){
        return Predecesor;
    }
    
    public double getAcumulado(){
        return acumulado;
    }
    
    public double setAcumulado(){
        return acumulado;
    }
}
