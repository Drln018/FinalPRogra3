/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaInicio;

import Clases.AlgoritmoDijkstra;
import Clases.DatosGraficos;
import Clases.PintarDibujos;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author 50232
 */
public class Inicio extends javax.swing.JFrame {

    private int Numerotope =0; 
    DatosGraficos arboles = new DatosGraficos();
    
    public static void PintarFiguras(int tope, DatosGraficos arboles){
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if(arboles.getmAdyacencia(j, k)==1){
                    PintarDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(k, j));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintarDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
            
        }
    }
    //inicializamos la interfaz
    public Inicio() {
        initComponents();
        EleccionInicio.setEnabled(false);
        EleccionFinal.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSalir = new javax.swing.JButton();
        txtorigen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EleccionInicio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        EleccionFinal = new javax.swing.JComboBox<>();
        BuscarCamino = new javax.swing.JButton();
        MostrarCaminos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        kmRecorridos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKmAcumulados = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        txtorigen.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel1.setText("Inidio:");

        EleccionInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Final:");

        EleccionFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BuscarCamino.setText("Buscar Camino mas corto");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });

        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });

        jLabel3.setText("Km recorridos:");

        kmRecorridos.setText("jLabel4");

        txtKmAcumulados.setColumns(20);
        txtKmAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKmAcumulados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(MostrarCaminos)
                        .addGap(0, 672, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarCamino)
                            .addComponent(EleccionFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(EleccionInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(kmRecorridos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addComponent(MostrarCaminos))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(EleccionInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EleccionFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarCamino)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kmRecorridos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtorigen)
                            .addComponent(jLabel5))
                        .addGap(99, 99, 99)
                        .addComponent(BotonSalir))
                    .addComponent(jLabel6))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(BotonSalir))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtorigen)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addGap(5, 5, 5)
                            .addComponent(jLabel6))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        // TODO add your handling code here:
        
        EleccionInicio.setEnabled(true);
        EleccionFinal.setEnabled(false);
        MostrarCaminos.setEnabled(false);
        txtKmAcumulados.setEnabled(false);
        
        jPanel1.paint(jPanel1.getGraphics());
        
        int Matriz[][]={
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        
        double coe[][] ={
            {0, 57.4,0, 0, 147, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {57.4, 0, 0, 0, 0, 69.1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 55.6, 0, 0, 0, 0, 0, 0, 26.4, 0, 0, 85.1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 71.8, 0, 0, 0, 0, 0, 0, 0, 0, 26},
            {147, 0, 0, 0, 0, 0, 0, 0, 0, 0, 327.4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 69.1, 0, 0, 0, 0, 0, 0, 93.3, 0, 0, 86.5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 71.3},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 158, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 61.7, 0, 0, 0, 0, 0, 0, 42.7, 0, 85.5, 0, 95.3, 0, 0},
            {0, 0, 55.6, 0, 0, 93.3, 0, 61.7, 0, 0, 0, 0, 0, 0, 0, 45.7, 0, 82.3, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 109, 0, 0, 0, 86, 0},
            {0, 0, 0, 0, 327.4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 116.7},
            {0, 0, 0, 0, 0, 86.5, 0, 0, 0, 0, 0, 0, 56.1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 71.8, 0, 0, 0, 0, 0, 0, 0, 56.1, 0, 0, 0, 0, 0, 70.5, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 86.9, 0, 50.6, 0, 76.3, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 86.9, 0, 0, 0, 0, 0, 54.9, 0, 0},
            {0, 0, 26, 0, 0, 0, 0, 42.7, 45.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 109, 0, 0, 0, 50.6, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 85.5, 82.3, 0, 0, 0, 70.5, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 85.1, 0, 0, 0, 158, 0, 0, 0, 0, 0, 0, 76.3, 0, 0, 0, 0, 0, 0, 53.7, 0},
            {0, 0, 0, 0, 0, 0, 0, 95.3, 0, 0, 0, 0, 0, 0, 54.9, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 86, 0, 0, 0, 0, 0, 0, 0, 0, 53.7, 0, 0, 0},
            {0, 0, 0, 26, 0, 71.3, 0, 0, 0, 0, 116.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        
        int xx1[]={425, 375, 280, 540, 440, 425, 275, 260, 350, 170, 600, 450, 470, 160, 140, 315, 
            110, 375, 220, 190, 200, 5};
        int yy1[] = {405, 485, 540, 550, 185, 530, 430, 630, 550};
        String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "140",
            "15", "16", "17", "18", "19", "20", "21"};
        
        for (int j = 0; j <22; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, xx1[j]);
            arboles.setNombre(j, nom[j]);           
        }
        for (int j = 0; j < 22; j++) {
            for (int k = 0; k < 22; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
                
            }            
        }
        Numerotope=22;
        PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        // TODO add your handling code here:
        
        int origen =0, destino=0;
        String nombreOrigen, nombreFinal;
        nombreOrigen = (String) EleccionInicio.getSelectedItem();
        nombreFinal = (String) EleccionFinal.getSelectedItem();
        
        if("Alta Verapaz".equals(nombreOrigen)){
            origen =0;
        }
        if("Baja Verapaz".equals(nombreOrigen)){
            origen =1;
        }
        if("Chimaltenango".equals(nombreOrigen)){
            origen =2;
        }
        if("Chiquimula".equals(nombreOrigen)){
            origen =3;
        }
        if("Petén".equals(nombreOrigen)){
            origen =4;
        }
        if("El Progreso".equals(nombreOrigen)){
            origen =5;
        }
        if("Quiché".equals(nombreOrigen)){
            origen =6;
        }
        if("Escuintla".equals(nombreOrigen)){
            origen =7;
        }
        if("Guatemala".equals(nombreOrigen)){
            origen =8;
        }
        if("Huehuetenango".equals(nombreOrigen)){
            origen =9;
        }
        if("Izabal".equals(nombreOrigen)){
            origen =10;
        }
        if("Jalapa".equals(nombreOrigen)){
            origen =11;
        }
        if("Jutiapa".equals(nombreOrigen)){
            origen =12;
        }
        if("Quetzaltenango".equals(nombreOrigen)){
            origen =13;
        }
        if("Retauleu".equals(nombreOrigen)){
            origen =14;
        }
        if("Sacatepequez".equals(nombreOrigen)){
            origen =15;
        }
        if("San Marcos".equals(nombreOrigen)){
            origen =16;
        }
        if("Santa Rosa".equals(nombreOrigen)){
            origen =17;
        }
        if("Sololá".equals(nombreOrigen)){
            origen =18;
        }
        if("Suchitepequez".equals(nombreOrigen)){
            origen =19;
        }
        if("Totonicapán".equals(nombreOrigen)){
            origen =20;
        }
        if("Zacapa".equals(nombreOrigen)){
            origen =21;
        }
        if("Alta Verapaz".equals(nombreFinal)){
            origen =0;
        }
        if("Baja Verapaz".equals(nombreFinal)){
            origen =1;
        }
        if("Chimaltenango".equals(nombreFinal)){
            origen =2;
        }
        if("Chiquimula".equals(nombreFinal)){
            origen =3;
        }
        if("Petén".equals(nombreFinal)){
            origen =4;
        }
        if("El Progreso".equals(nombreFinal)){
            origen =5;
        }
        if("Quiché".equals(nombreFinal)){
            origen =6;
        }
        if("Escuintla".equals(nombreFinal)){
            origen =7;
        }
        if("Guatemala".equals(nombreFinal)){
            origen =8;
        }
        if("Huehuetenango".equals(nombreFinal)){
            origen =9;
        }
        if("Izabal".equals(nombreFinal)){
            origen =10;
        }
        if("Jalapa".equals(nombreFinal)){
            origen =11;
        }
        if("Jutiapa".equals(nombreFinal)){
            origen =12;
        }
        if("Quetzaltenango".equals(nombreFinal)){
            origen =13;
        }
        if("Retauleu".equals(nombreFinal)){
            origen =14;
        }
        if("Sacatepequez".equals(nombreFinal)){
            origen =15;
        }
        if("San Marcos".equals(nombreFinal)){
            origen =16;
        }
        if("Santa Rosa".equals(nombreFinal)){
            origen =17;
        }
        if("Sololá".equals(nombreFinal)){
            origen =18;
        }
        if("Suchitepequez".equals(nombreFinal)){
            origen =19;
        }
        if("Totonicapán".equals(nombreFinal)){
            origen =20;
        }
        if("Zacapa".equals(nombreFinal)){
            origen =21;
        }
        if(origen==destino){
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKmAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:"+nombreOrigen);
            kmRecorridos.setText("Intenga de nuevo");
            kmRecorridos.setEnabled(false);
            kmRecorridos.setForeground(Color.red);
        }else{
            AlgoritmoDijkstra Drikjstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();
            
            Font fuente = new Font("Arial", Font.BOLD, 18);
            kmRecorridos.setFont(fuente);
        
    }//GEN-LAST:event_BuscarCaminoActionPerformed

    /**
     * @param args the command line arguments
     *
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionFinal;
    private javax.swing.JComboBox<String> EleccionInicio;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea txtKmAcumulados;
    private javax.swing.JLabel txtorigen;
    // End of variables declaration//GEN-END:variables
}

