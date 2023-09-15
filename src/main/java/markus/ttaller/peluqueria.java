/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package markus.ttaller;

import javax.swing.JOptionPane;

/**
 *
 * @author johan
 */
public class peluqueria extends javax.swing.JFrame {

    private int Jhon1, Seraphina1, Arlo1, Isen1;
    TotalJ tot = new TotalJ();

    public peluqueria() {
        initComponents();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BJhon = new javax.swing.JButton();
        Caballero1 = new javax.swing.JLabel();
        RCaballero1 = new javax.swing.JTextField();
        TCaballero1 = new javax.swing.JLabel();
        Dama1 = new javax.swing.JLabel();
        RDama1 = new javax.swing.JTextField();
        TDama1 = new javax.swing.JLabel();
        Tintura1 = new javax.swing.JLabel();
        RTintura1 = new javax.swing.JTextField();
        TTintura1 = new javax.swing.JLabel();
        Peinado1 = new javax.swing.JLabel();
        RPeinado1 = new javax.swing.JTextField();
        TPeinado1 = new javax.swing.JLabel();
        Servicios1 = new javax.swing.JLabel();
        RServicios1 = new javax.swing.JTextField();
        Recaudado1 = new javax.swing.JLabel();
        TRecaudado1 = new javax.swing.JLabel();
        BSeraphina = new javax.swing.JButton();
        Caballero2 = new javax.swing.JLabel();
        RCaballero2 = new javax.swing.JTextField();
        TCaballero2 = new javax.swing.JLabel();
        Dama2 = new javax.swing.JLabel();
        RDama2 = new javax.swing.JTextField();
        TDama2 = new javax.swing.JLabel();
        Tintura2 = new javax.swing.JLabel();
        RTintura2 = new javax.swing.JTextField();
        TTintura2 = new javax.swing.JLabel();
        Peinado2 = new javax.swing.JLabel();
        RPeinado2 = new javax.swing.JTextField();
        TPeinado2 = new javax.swing.JLabel();
        Servicios2 = new javax.swing.JLabel();
        RServicios2 = new javax.swing.JTextField();
        Recaudado2 = new javax.swing.JLabel();
        TRecaudado2 = new javax.swing.JLabel();
        BArlo = new javax.swing.JButton();
        Caballero3 = new javax.swing.JLabel();
        RCaballero3 = new javax.swing.JTextField();
        TCaballero3 = new javax.swing.JLabel();
        Dama3 = new javax.swing.JLabel();
        RDama3 = new javax.swing.JTextField();
        TDama3 = new javax.swing.JLabel();
        Tintura3 = new javax.swing.JLabel();
        RTintura3 = new javax.swing.JTextField();
        TTintura3 = new javax.swing.JLabel();
        Peinado3 = new javax.swing.JLabel();
        RPeinado3 = new javax.swing.JTextField();
        TPeinado3 = new javax.swing.JLabel();
        Servicios3 = new javax.swing.JLabel();
        RServicios3 = new javax.swing.JTextField();
        Recaudado3 = new javax.swing.JLabel();
        TRecaudado3 = new javax.swing.JLabel();
        BIsen = new javax.swing.JButton();
        Caballero4 = new javax.swing.JLabel();
        RCaballero4 = new javax.swing.JTextField();
        TCaballero4 = new javax.swing.JLabel();
        Dama4 = new javax.swing.JLabel();
        RDama4 = new javax.swing.JTextField();
        TDama4 = new javax.swing.JLabel();
        Tintura4 = new javax.swing.JLabel();
        RTintura4 = new javax.swing.JTextField();
        TTintura4 = new javax.swing.JLabel();
        Peinado4 = new javax.swing.JLabel();
        RPeinado4 = new javax.swing.JTextField();
        TPeinado4 = new javax.swing.JLabel();
        Servicios4 = new javax.swing.JLabel();
        RServicios4 = new javax.swing.JTextField();
        Recaudado4 = new javax.swing.JLabel();
        TRecaudado4 = new javax.swing.JLabel();
        BInicio = new javax.swing.JButton();
        BTotales = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();
        IJhon = new javax.swing.JLabel();
        ISeraphina = new javax.swing.JLabel();
        IArlo = new javax.swing.JLabel();
        IIsen = new javax.swing.JLabel();
        lUniversidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BJhon.setText("Registrar Jhon");
        BJhon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BJhonMouseClicked(evt);
            }
        });
        getContentPane().add(BJhon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        Caballero1.setText("Corte de Cabello");
        getContentPane().add(Caballero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        RCaballero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RCaballero1.setText("0");
        getContentPane().add(RCaballero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 40, 20));

        TCaballero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TCaballero1.setText("$0");
        TCaballero1.setToolTipText("");
        getContentPane().add(TCaballero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 60, 20));

        Dama1.setText("Corte de Dama");
        getContentPane().add(Dama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        RDama1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RDama1.setText("0");
        getContentPane().add(RDama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 40, 20));

        TDama1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TDama1.setText("$0");
        getContentPane().add(TDama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 60, 20));

        Tintura1.setText("Tintura de Cabello");
        getContentPane().add(Tintura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        RTintura1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RTintura1.setText("0");
        getContentPane().add(RTintura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 40, 20));

        TTintura1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TTintura1.setText("$0");
        getContentPane().add(TTintura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 60, 20));

        Peinado1.setText("Peinado");
        getContentPane().add(Peinado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        RPeinado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RPeinado1.setText("0");
        getContentPane().add(RPeinado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 40, 20));

        TPeinado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TPeinado1.setText("$0");
        getContentPane().add(TPeinado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 60, 20));

        Servicios1.setText("Total de Servicios");
        getContentPane().add(Servicios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        RServicios1.setEditable(false);
        RServicios1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RServicios1.setText("0");
        getContentPane().add(RServicios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 40, 20));

        Recaudado1.setText("Total de Recaudado");
        getContentPane().add(Recaudado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        TRecaudado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRecaudado1.setText("$0");
        getContentPane().add(TRecaudado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 60, 20));

        BSeraphina.setText("Registrar Seraphina");
        BSeraphina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BSeraphinaMouseClicked(evt);
            }
        });
        getContentPane().add(BSeraphina, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        Caballero2.setText("Corte de Cabello");
        getContentPane().add(Caballero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        RCaballero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RCaballero2.setText("0");
        getContentPane().add(RCaballero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 40, 20));

        TCaballero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TCaballero2.setText("$0");
        getContentPane().add(TCaballero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 60, 20));

        Dama2.setText("Corte de Dama");
        getContentPane().add(Dama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        RDama2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RDama2.setText("0");
        getContentPane().add(RDama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 40, 20));

        TDama2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TDama2.setText("$0");
        getContentPane().add(TDama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 60, 20));

        Tintura2.setText("Tintura de Cabello");
        getContentPane().add(Tintura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        RTintura2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RTintura2.setText("0");
        getContentPane().add(RTintura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 40, 20));

        TTintura2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TTintura2.setText("$0");
        getContentPane().add(TTintura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 60, 20));

        Peinado2.setText("Peinado");
        getContentPane().add(Peinado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        RPeinado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RPeinado2.setText("0");
        getContentPane().add(RPeinado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 40, 20));

        TPeinado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TPeinado2.setText("$0");
        getContentPane().add(TPeinado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 60, 20));

        Servicios2.setText("Total de Servicios");
        getContentPane().add(Servicios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        RServicios2.setEditable(false);
        RServicios2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RServicios2.setText("0");
        getContentPane().add(RServicios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 40, 20));

        Recaudado2.setText("Total de Recaudado");
        getContentPane().add(Recaudado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        TRecaudado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRecaudado2.setText("$0");
        getContentPane().add(TRecaudado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 60, 20));

        BArlo.setText("Registrar Arlo");
        BArlo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BArloMouseClicked(evt);
            }
        });
        getContentPane().add(BArlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        Caballero3.setText("Corte de Cabello");
        getContentPane().add(Caballero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        RCaballero3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RCaballero3.setText("0");
        getContentPane().add(RCaballero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 40, 20));

        TCaballero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TCaballero3.setText("$0");
        getContentPane().add(TCaballero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 60, 20));

        Dama3.setText("Corte de Dama");
        getContentPane().add(Dama3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        RDama3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RDama3.setText("0");
        getContentPane().add(RDama3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 40, 20));

        TDama3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TDama3.setText("$0");
        getContentPane().add(TDama3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 60, 20));

        Tintura3.setText("Tintura de Cabello");
        getContentPane().add(Tintura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        RTintura3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RTintura3.setText("0");
        getContentPane().add(RTintura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 40, 20));

        TTintura3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TTintura3.setText("$0");
        getContentPane().add(TTintura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 60, 20));

        Peinado3.setText("Peinado");
        getContentPane().add(Peinado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        RPeinado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RPeinado3.setText("0");
        getContentPane().add(RPeinado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 40, 20));

        TPeinado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TPeinado3.setText("$0");
        getContentPane().add(TPeinado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 60, 20));

        Servicios3.setText("Total de Servicios");
        getContentPane().add(Servicios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        RServicios3.setEditable(false);
        RServicios3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RServicios3.setText("0");
        getContentPane().add(RServicios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 40, 20));

        Recaudado3.setText("Total de Recaudado");
        getContentPane().add(Recaudado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        TRecaudado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRecaudado3.setText("$0");
        getContentPane().add(TRecaudado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 60, 20));

        BIsen.setText("Registrar Isen");
        BIsen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BIsenMouseClicked(evt);
            }
        });
        getContentPane().add(BIsen, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        Caballero4.setText("Corte de Cabello");
        getContentPane().add(Caballero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, -1, -1));

        RCaballero4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RCaballero4.setText("0");
        getContentPane().add(RCaballero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 40, 20));

        TCaballero4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TCaballero4.setText("$0");
        getContentPane().add(TCaballero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 60, 20));

        Dama4.setText("Corte de Dama");
        getContentPane().add(Dama4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));

        RDama4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RDama4.setText("0");
        getContentPane().add(RDama4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 40, 20));

        TDama4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TDama4.setText("$0");
        getContentPane().add(TDama4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 60, 20));

        Tintura4.setText("Tintura de Cabello");
        getContentPane().add(Tintura4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));

        RTintura4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RTintura4.setText("0");
        getContentPane().add(RTintura4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 40, 20));

        TTintura4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TTintura4.setText("$0");
        getContentPane().add(TTintura4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 60, 20));

        Peinado4.setText("Peinado");
        getContentPane().add(Peinado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        RPeinado4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RPeinado4.setText("0");
        getContentPane().add(RPeinado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 40, 20));

        TPeinado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TPeinado4.setText("$0");
        getContentPane().add(TPeinado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, 60, 20));

        Servicios4.setText("Total de Servicios");
        getContentPane().add(Servicios4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, -1, -1));

        RServicios4.setEditable(false);
        RServicios4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RServicios4.setText("0");
        getContentPane().add(RServicios4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 40, 20));

        Recaudado4.setText("Total de Recaudado");
        getContentPane().add(Recaudado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, -1, -1));

        TRecaudado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRecaudado4.setText("0");
        getContentPane().add(TRecaudado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 60, 20));

        BInicio.setText("Iniciar Dia");
        BInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BInicioMouseClicked(evt);
            }
        });
        getContentPane().add(BInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        BTotales.setText("Ver Totales");
        BTotales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTotalesMouseClicked(evt);
            }
        });
        getContentPane().add(BTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        Bsalir.setText("Salir");
        Bsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BsalirMouseClicked(evt);
            }
        });
        getContentPane().add(Bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, -1));

        IJhon.setIcon(new javax.swing.ImageIcon("D:\\Users\\johan\\OneDrive\\Documentos\\Jhon.jpg")); // NOI18N
        getContentPane().add(IJhon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 130));

        ISeraphina.setIcon(new javax.swing.ImageIcon("D:\\Users\\johan\\OneDrive\\Imágenes\\Capturas de pantalla\\Nueva carpeta\\Seraphina.jpg")); // NOI18N
        getContentPane().add(ISeraphina, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 110, 130));

        IArlo.setIcon(new javax.swing.ImageIcon("D:\\Users\\johan\\OneDrive\\Imágenes\\Capturas de pantalla\\Nueva carpeta\\Arlo.jpg")); // NOI18N
        getContentPane().add(IArlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, 130));

        IIsen.setIcon(new javax.swing.ImageIcon("D:\\Users\\johan\\OneDrive\\Imágenes\\Capturas de pantalla\\Nueva carpeta\\Isen.jpg")); // NOI18N
        getContentPane().add(IIsen, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 100, 130));

        lUniversidad.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lUniversidad.setText("UNIVERSIDAD DE CUNDINAMARCA PELUQUERIA");
        lUniversidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSeraphinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BSeraphinaMouseClicked
        if (evt.getClickCount() == 1) {
            Seraphina Seraphina = new Seraphina();
            Seraphina.setCaballero2(Integer.parseInt(RCaballero2.getText()));
            Seraphina.setDama2(Integer.parseInt(RDama2.getText()));
            Seraphina.setTintura2(Integer.parseInt(RTintura2.getText()));
            Seraphina.setPeinado2(Integer.parseInt(RPeinado2.getText()));
            TCaballero2.setText("$" + Integer.toString(Seraphina.caballero));
            TDama2.setText("$" + Integer.toString(Seraphina.dama));
            TTintura2.setText("$" + Integer.toString(Seraphina.tintura));
            TPeinado2.setText("$" + Integer.toString(Seraphina.peinado));
            RServicios2.setText(Integer.toString(Seraphina.getServicios2()));
            TRecaudado2.setText("$" + Integer.toString(Seraphina.getTotal2()));
            Seraphina1 = Seraphina.getTotal2();
        }
    }//GEN-LAST:event_BSeraphinaMouseClicked

    private void BJhonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BJhonMouseClicked
        if (evt.getClickCount() == 1) {
            Jhon Jhon = new Jhon();
            Jhon.setCaballero1(Integer.parseInt(RCaballero1.getText()));
            Jhon.setDama1(Integer.parseInt(RDama1.getText()));
            Jhon.setTintura1(Integer.parseInt(RTintura1.getText()));
            Jhon.setPeinado1(Integer.parseInt(RPeinado1.getText()));
            TCaballero1.setText("$" + Integer.toString(Jhon.caballero));
            TDama1.setText("$" + Integer.toString(Jhon.dama));
            TTintura1.setText("$" + Integer.toString(Jhon.tintura));
            TPeinado1.setText("$" + Integer.toString(Jhon.peinado));
            RServicios1.setText(Integer.toString(Jhon.getServicios1()));
            TRecaudado1.setText("$" + Integer.toString(Jhon.getTotal1()));
            Jhon1 = Jhon.getTotal1();
        }
    }//GEN-LAST:event_BJhonMouseClicked

    private void BArloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BArloMouseClicked
        if (evt.getClickCount() == 1) {
            Arlo Arlo = new Arlo();
            Arlo.setCaballero3(Integer.parseInt(RCaballero3.getText()));
            Arlo.setDama3(Integer.parseInt(RDama3.getText()));
            Arlo.setTintura3(Integer.parseInt(RTintura3.getText()));
            Arlo.setPeinado3(Integer.parseInt(RPeinado3.getText()));
            TCaballero3.setText("$" + Integer.toString(Arlo.caballero));
            TDama3.setText("$" + Integer.toString(Arlo.dama));
            TTintura3.setText("$" + Integer.toString(Arlo.tintura));
            TPeinado3.setText("$" + Integer.toString(Arlo.peinado));
            RServicios3.setText(Integer.toString(Arlo.getServicios3()));
            TRecaudado3.setText("$" + Integer.toString(Arlo.getTotal3()));
            Arlo1 = Arlo.getTotal3();
        }
    }//GEN-LAST:event_BArloMouseClicked

    private void BIsenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BIsenMouseClicked
        if (evt.getClickCount() == 1) {
            Isen Isen = new Isen();
            Isen.setCaballero4(Integer.parseInt(RCaballero4.getText()));
            Isen.setDama4(Integer.parseInt(RDama4.getText()));
            Isen.setTintura4(Integer.parseInt(RTintura4.getText()));
            Isen.setPeinado4(Integer.parseInt(RPeinado4.getText()));
            TCaballero4.setText("$" + Integer.toString(Isen.caballero));
            TDama4.setText("$" + Integer.toString(Isen.dama));
            TTintura4.setText("$" + Integer.toString(Isen.tintura));
            TPeinado4.setText("$" + Integer.toString(Isen.peinado));
            RServicios4.setText(Integer.toString(Isen.getServicios4()));
            TRecaudado4.setText("$" + Integer.toString(Isen.getTotal4()));
            Isen1 = Isen.getTotal4();
        }
    }//GEN-LAST:event_BIsenMouseClicked

    private void BInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BInicioMouseClicked
        RCaballero1.setText(Integer.toString(0));
        RDama1.setText(Integer.toString(0));
        RTintura1.setText(Integer.toString(0));
        RPeinado1.setText(Integer.toString(0));
        BJhonMouseClicked(evt);
        RCaballero2.setText(Integer.toString(0));
        RDama2.setText(Integer.toString(0));
        RTintura2.setText(Integer.toString(0));
        RPeinado2.setText(Integer.toString(0));
        BSeraphinaMouseClicked(evt);
        RCaballero3.setText(Integer.toString(0));
        RDama3.setText(Integer.toString(0));
        RTintura3.setText(Integer.toString(0));
        RPeinado3.setText(Integer.toString(0));
        BArloMouseClicked(evt);
        RCaballero4.setText(Integer.toString(0));
        RDama4.setText(Integer.toString(0));
        RTintura4.setText(Integer.toString(0));
        RPeinado4.setText(Integer.toString(0));
        BIsenMouseClicked(evt);
    }//GEN-LAST:event_BInicioMouseClicked

    private void BTotalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTotalesMouseClicked
        
        int a1 = Integer.parseInt(RServicios1.getText());
        int b1 = Integer.parseInt(RServicios2.getText());
        int c1 = Integer.parseInt(RServicios3.getText());
        int d1 = Integer.parseInt(RServicios4.getText());
        int e1 = tot.sumaServicios(a1, b1, c1, d1);
        
        int a2 = Jhon1, b2 = Seraphina1, c2 = Arlo1, d2 = Isen1;
        int e2 = tot.sumaRecaudado(a2, b2, c2, d2);
        JOptionPane.showMessageDialog(this, "Total de Servicios: " + e1 + "\n" + "Total de Recaudo:  $" + e2);
    }//GEN-LAST:event_BTotalesMouseClicked

    private void BsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsalirMouseClicked
        tot.Total();
    }//GEN-LAST:event_BsalirMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peluqueria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BArlo;
    private javax.swing.JButton BInicio;
    private javax.swing.JButton BIsen;
    private javax.swing.JButton BJhon;
    private javax.swing.JButton BSeraphina;
    private javax.swing.JButton BTotales;
    private javax.swing.JButton Bsalir;
    private javax.swing.JLabel Caballero1;
    private javax.swing.JLabel Caballero2;
    private javax.swing.JLabel Caballero3;
    private javax.swing.JLabel Caballero4;
    private javax.swing.JLabel Dama1;
    private javax.swing.JLabel Dama2;
    private javax.swing.JLabel Dama3;
    private javax.swing.JLabel Dama4;
    private javax.swing.JLabel IArlo;
    private javax.swing.JLabel IIsen;
    private javax.swing.JLabel IJhon;
    private javax.swing.JLabel ISeraphina;
    private javax.swing.JLabel Peinado1;
    private javax.swing.JLabel Peinado2;
    private javax.swing.JLabel Peinado3;
    private javax.swing.JLabel Peinado4;
    private javax.swing.JTextField RCaballero1;
    private javax.swing.JTextField RCaballero2;
    private javax.swing.JTextField RCaballero3;
    private javax.swing.JTextField RCaballero4;
    private javax.swing.JTextField RDama1;
    private javax.swing.JTextField RDama2;
    private javax.swing.JTextField RDama3;
    private javax.swing.JTextField RDama4;
    private javax.swing.JTextField RPeinado1;
    private javax.swing.JTextField RPeinado2;
    private javax.swing.JTextField RPeinado3;
    private javax.swing.JTextField RPeinado4;
    private javax.swing.JTextField RServicios1;
    private javax.swing.JTextField RServicios2;
    private javax.swing.JTextField RServicios3;
    private javax.swing.JTextField RServicios4;
    private javax.swing.JTextField RTintura1;
    private javax.swing.JTextField RTintura2;
    private javax.swing.JTextField RTintura3;
    private javax.swing.JTextField RTintura4;
    private javax.swing.JLabel Recaudado1;
    private javax.swing.JLabel Recaudado2;
    private javax.swing.JLabel Recaudado3;
    private javax.swing.JLabel Recaudado4;
    private javax.swing.JLabel Servicios1;
    private javax.swing.JLabel Servicios2;
    private javax.swing.JLabel Servicios3;
    private javax.swing.JLabel Servicios4;
    private javax.swing.JLabel TCaballero1;
    private javax.swing.JLabel TCaballero2;
    private javax.swing.JLabel TCaballero3;
    private javax.swing.JLabel TCaballero4;
    private javax.swing.JLabel TDama1;
    private javax.swing.JLabel TDama2;
    private javax.swing.JLabel TDama3;
    private javax.swing.JLabel TDama4;
    private javax.swing.JLabel TPeinado1;
    private javax.swing.JLabel TPeinado2;
    private javax.swing.JLabel TPeinado3;
    private javax.swing.JLabel TPeinado4;
    private javax.swing.JLabel TRecaudado1;
    private javax.swing.JLabel TRecaudado2;
    private javax.swing.JLabel TRecaudado3;
    private javax.swing.JLabel TRecaudado4;
    private javax.swing.JLabel TTintura1;
    private javax.swing.JLabel TTintura2;
    private javax.swing.JLabel TTintura3;
    private javax.swing.JLabel TTintura4;
    private javax.swing.JLabel Tintura1;
    private javax.swing.JLabel Tintura2;
    private javax.swing.JLabel Tintura3;
    private javax.swing.JLabel Tintura4;
    private javax.swing.JLabel lUniversidad;
    // End of variables declaration//GEN-END:variables
}
