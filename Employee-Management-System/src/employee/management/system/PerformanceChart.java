package employee.management.system;

import GFX.ModelChart;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class PerformanceChart extends JFrame{
    
    Random ran = new Random();
    int n = ran.nextInt(99);
    
    /**
     * Creates new form PerformanceChart
     */
    public PerformanceChart() {
        initComponents();
        chart.setTitle("PERFORMANCE");
        chart.addLegend("Sales", Color.decode("#7b4397"), Color.decode("#dc2430"));
        chart.addLegend("Profit", Color.decode("#0099F7"), Color.decode("#F11712"));
       

        setData(); 
    }
    
    private void setData()
    {
        chart.addData(new ModelChart("Jan", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("Feb", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("March", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("April", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("May", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("June", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("July", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("Aug", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("Sept", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("Oct", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("Nov", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.addData(new ModelChart("Dec", new double[]{ran.nextInt(99),ran.nextInt(99)}));
        chart.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new GFX.PanelShadow();
        chart = new GFX.CurveLineChart();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelShadow1.setBackground(new java.awt.Color(34, 59, 68));
        panelShadow1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelShadow1.setColorGradient(new java.awt.Color(17, 37, 45));

        chart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chartMouseClicked(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 300, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chartMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PerformanceChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerformanceChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerformanceChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerformanceChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerformanceChart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GFX.CurveLineChart chart;
    private javax.swing.JButton jButton1;
    private GFX.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
