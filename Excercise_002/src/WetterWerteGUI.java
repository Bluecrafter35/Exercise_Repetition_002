
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class WetterWerteGUI extends javax.swing.JFrame
{
    WetterBL wettermod = new WetterBL();
    /**
     * Creates new form WetterWerteGUI
     */
    public WetterWerteGUI()
    {
        initComponents();
        this.jlListe.setModel(wettermod);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jsTemperatur = new javax.swing.JSlider();
        lbTemperatur = new javax.swing.JLabel();
        jsLuftfeuchtigkeit = new javax.swing.JSlider();
        lbLuftfeuchtigkeit = new javax.swing.JLabel();
        btEinfuegen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlListe = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmDatei = new javax.swing.JMenu();
        jmiSpeichern = new javax.swing.JMenuItem();
        jmiLaden = new javax.swing.JMenuItem();
        jmiExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jsTemperatur.setMajorTickSpacing(10);
        jsTemperatur.setMaximum(40);
        jsTemperatur.setMinimum(-20);
        jsTemperatur.setMinorTickSpacing(5);
        jsTemperatur.setPaintLabels(true);
        jsTemperatur.setPaintTicks(true);
        jsTemperatur.setToolTipText("");
        jsTemperatur.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jsTemperatur.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                onTempChange(evt);
            }
        });

        lbTemperatur.setText("Temperatur");

        jsLuftfeuchtigkeit.setMajorTickSpacing(20);
        jsLuftfeuchtigkeit.setMinorTickSpacing(10);
        jsLuftfeuchtigkeit.setPaintLabels(true);
        jsLuftfeuchtigkeit.setPaintTicks(true);
        jsLuftfeuchtigkeit.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                onLuftChange(evt);
            }
        });

        lbLuftfeuchtigkeit.setText("Luftfeuchtigkeit");

        btEinfuegen.setText("Hinzufügen");
        btEinfuegen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onEinfuegen(evt);
            }
        });

        jlListe.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlListe);

        jmDatei.setText("Datei");

        jmiSpeichern.setText("Speichern");
        jmiSpeichern.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onSpeichern(evt);
            }
        });
        jmDatei.add(jmiSpeichern);

        jmiLaden.setText("Laden");
        jmiLaden.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onLaden(evt);
            }
        });
        jmDatei.add(jmiLaden);

        jmiExit.setText("Exit");
        jmiExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onExit(evt);
            }
        });
        jmDatei.add(jmiExit);

        jMenuBar1.add(jmDatei);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTemperatur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsTemperatur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLuftfeuchtigkeit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsLuftfeuchtigkeit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEinfuegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTemperatur, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jsTemperatur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEinfuegen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onEinfuegen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onEinfuegen
    {//GEN-HEADEREND:event_onEinfuegen
        try{
            Date datum = new Date();
            WetterWert ww = new WetterWert(datum, this.jsTemperatur.getValue(), this.jsLuftfeuchtigkeit.getValue());
            wettermod.add(ww);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_onEinfuegen

    private void onTempChange(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_onTempChange
    {//GEN-HEADEREND:event_onTempChange
        try{
            String text = "Temperatur: ";
            text+=this.jsTemperatur.getValue()+"°";
            this.lbTemperatur.setText(text);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_onTempChange

    private void onLuftChange(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_onLuftChange
    {//GEN-HEADEREND:event_onLuftChange
        try{
            String text = "Luftfeuchtigkeit: ";
            text+=this.jsLuftfeuchtigkeit.getValue()+"%";
            this.lbLuftfeuchtigkeit.setText(text);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_onLuftChange

    private void onSpeichern(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onSpeichern
    {//GEN-HEADEREND:event_onSpeichern
        JFileChooser chooser = new JFileChooser("C:\\Users\\Christoph Mautner\\Desktop\\Schule\\3BHIF\\POS Aufgaben\\Exercise_Repetition_002");
        int ret = chooser.showOpenDialog(null);
        if(ret == JFileChooser.APPROVE_OPTION)
        {
            File f = chooser.getSelectedFile();
            wettermod.speichern(f);
            if (!f.toString().substring(f.toString().length() - 4, f.toString().length()).equals(".csv")) {
               ArrayList<String> array=new ArrayList();

                String [] arrayKlein=f.toString().split("\\.");
                if(arrayKlein.length==0){
                 array.add(f.getAbsolutePath());
                }else{
                    JOptionPane.showMessageDialog(null,"Dein Dateiformat ist nicht verfügbar und wurde daher in einem CSV-File gespeichert.");
                    array.add(arrayKlein[0]);
                }

                final File renamed = new File(array.get(0) + ".csv");
                f = renamed;
            }
        }
    }//GEN-LAST:event_onSpeichern

    private void onLaden(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onLaden
    {//GEN-HEADEREND:event_onLaden
        JFileChooser chooser = new JFileChooser("C:\\Users\\Christoph Mautner\\Desktop\\Schule\\3BHIF\\POS Aufgaben\\Exercise_Repetition_002");
        int ret = chooser.showOpenDialog(null);
        if(ret == JFileChooser.APPROVE_OPTION)
        {
            File f = chooser.getSelectedFile();
            wettermod.load(f);
        }
    }//GEN-LAST:event_onLaden

    private void onExit(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onExit
    {//GEN-HEADEREND:event_onExit
        System.exit(0);
    }//GEN-LAST:event_onExit

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new WetterWerteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEinfuegen;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlListe;
    private javax.swing.JMenu jmDatei;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiLaden;
    private javax.swing.JMenuItem jmiSpeichern;
    private javax.swing.JSlider jsLuftfeuchtigkeit;
    private javax.swing.JSlider jsTemperatur;
    private javax.swing.JLabel lbLuftfeuchtigkeit;
    private javax.swing.JLabel lbTemperatur;
    // End of variables declaration//GEN-END:variables
}
