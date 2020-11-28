package br.edu.materdei.tas.desktop.gui.core;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JPanel;


public class TasDialogButton extends JPanel {
      
    public static enum DialogButtonType {
        DEFAULT_BUTTON,
        SUCCESS_BUTTON,
        WARNING_BUTTON,
        DANGER_BUTTON
    }
    
    private final Color backgroudStandby = new Color(237,237,237);
    private final Color backgroudDefault = new Color(228,240,252);
    private final Color backgroudSuccess = new Color(223,240,216);
    private final Color backgroudWarning = new Color(252,248,227);
    private final Color backgroudDanger = new Color(242,222,222);
    
    private final Color borderStandby = new Color(171,171,171);
    private final Color borderDefault = new Color(126,180,234);
    private final Color borderSuccess = new Color(60,118,61);
    private final Color borderWarning = new Color(138,109,59);
    private final Color borderDanger = new Color(169,68,66);        
    
    private DialogButtonType buttonType;
    
    /**
     * Creates new form TasDialogButton
     */
    public TasDialogButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 237, 237));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 171, 171)));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("jLabel1");
        add(label, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        if (this.buttonType == DialogButtonType.SUCCESS_BUTTON) {
            this.setBorder(BorderFactory.createLineBorder(borderSuccess));
            this.setBackground(backgroudSuccess); 
            
        } else if (this.buttonType == DialogButtonType.WARNING_BUTTON) {
            this.setBorder(BorderFactory.createLineBorder(borderWarning));
            this.setBackground(backgroudWarning); 
            label.setForeground(borderWarning);
            
        } else if (this.buttonType == DialogButtonType.DANGER_BUTTON) {
            this.setBorder(BorderFactory.createLineBorder(borderDanger));
            this.setBackground(backgroudDanger); 
                
        } else {
            this.setBorder(BorderFactory.createLineBorder(borderDefault));
            this.setBackground(backgroudDefault);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable(){     
            @Override
            public void run(){     
                revalidate();  
                repaint();     
            }              
        });
    }//GEN-LAST:event_formMouseMoved

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBorder(BorderFactory.createLineBorder(borderStandby));
        this.setBackground(backgroudStandby); 
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
    
    /**
     * @param buttonType the buttonType to set
     */
    public void setButtonType(DialogButtonType buttonType) {
        if (buttonType == null) {
            buttonType = DialogButtonType.DEFAULT_BUTTON;
        }
        this.buttonType = buttonType;
    } 
    
    public void setLabel(String text) {
        label.setText(text);
    }
    
    public void setIcon(Icon icon) {
        label.setIcon(icon);
    }
}