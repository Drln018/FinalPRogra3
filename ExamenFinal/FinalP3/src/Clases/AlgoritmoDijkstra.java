/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static VentanaInicio.Inicio.PintarFiguras;
import static VentanaInicio.Inicio.jPanel1;
import java.awt.Color;

/**
 *
 * @author 50232
 */
public class AlgoritmoDijkstra {
    
    private final DatosGraficos arboles;
    private int subTope;
    private Nodo Nodoauxiliar = null;
    private double auxiliarAcumulado;
    private double subtotalAcumulado;
    private final Nodo nodo[];
    private final int tope;
    private int Origen;
    private final int nodoFinal;
    //inicializar el constructor
    public AlgoritmoDijkstra(DatosGraficos arboles, int tope, int permanente, int nodoFin){
        this.arboles=arboles;
        this.tope=tope;
        this.nodo= new Nodo[tope];
        this.Origen=permanente;
        this.nodoFinal=nodoFin;
    }
    
    public double getAcumulado(){
        return nodo[nodoFinal].getAcumulado();
    }
    
    public int getNombre(){
        return nodo[nodoFinal].getNombre();
    }
    
    public void dijkstra(){
        for (int i = 0; i < tope; i++) {
            nodo[i] = new Nodo();       
        }
        jPanel1.paint(jPanel1.getGraphics());
        PintarFiguras(tope, arboles);
        PintarDibujos.seleccionNodo(jPanel1.getGraphics(),
                arboles.getCordeX(Origen),
                arboles.getCordeY(Origen), null, Color.GREEN);
        
        nodo[Origen].setVisitado(true);
        nodo[Origen].setNombre(Origen);
        
        do{
            subtotalAcumulado=0;
            auxiliarAcumulado=2000000000;
            nodo[Origen].setEtiqueta(true);
            for (int j = 0; j < tope; j++) {
            
                if(arboles.getmAdyacencia(j, Origen)==1){
                    subtotalAcumulado=nodo[Origen].getAcumulado() + arboles.getmCoeficiente(j, Origen);
                
                    if(subtotalAcumulado<=nodo[j].getAcumulado() && nodo[j].isVisitado()==true && nodo[j].isEtiqueta())
                    {
                        nodo[j].setAcumulado(subtotalAcumulado);
                        nodo[j].setVisitado(true);
                        nodo[j].setNombre(j);
                        nodo[j].setPredecesor(nodo[Origen]);
                    }else if(nodo[j].isVisitado()==false){
                        nodo[j].setAcumulado(subtotalAcumulado);
                        nodo[j].setVisitado(true);
                        nodo[j].setNombre(j);
                        nodo[j].setPredecesor(nodo[Origen]);
                    }
                }
            }
            //encontrar camino más corto
            for(int i=0; i<tope; i++){
                if(nodo[i].isVisitado()==true && nodo[i].isEtiqueta()==false){
                    if(nodo[i].getAcumulado() <=auxiliarAcumulado){
                        Origen= nodo[i].getNombre();
                        auxiliarAcumulado=nodo[i].getAcumulado();
                    }
                }
            }
            subTope++;
        }while(subTope <tope+1);
        Nodoauxiliar= nodo[nodoFinal];
        
        //pintar los caminos recorrdos
        while(Nodoauxiliar.getPredecesor()!= null){
            PintarDibujos.pinta_Camino(jPanel1.getGraphics(),
                    arboles.getCordeX(Nodoauxiliar.getNombre),
                    arboles.getCordeY(Nodoauxiliar.getNombre),
                    arboles.getCordeX(Nodoauxiliar.getPredecesor().getNombre()),
                    arboles.getCordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.blue);
                    
            PintarDibujos.seleccionNodo(jPanel1.getGraphics(),
                    arboles.getCordeX(Nodoauxiliar.getNombre()),
                    arboles.getCordeY(Nodoauxiliar.getNombre()),
            Nodoauxiliar = Nodoauxiliar.getPredecesor()); 
        }//fin while
        
        PintarDibujos.seleccionNodo(jPanel1.getGraphics(),
                arboles.getCordeX(nodoFinal),
                arboles.getCordeY(nodoFinal), null, Color.red);       
    }
}

