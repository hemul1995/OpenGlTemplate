/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opengltemplate;

/**
 *
 * @author Dima
 */
public class RenderForm extends javax.swing.JFrame
{
    BodyOpenGl bodyOpenGl;
    /** Creates new form RenderForm */
    public RenderForm()
    {
        initComponents();
        bodyOpenGl = new BodyOpenGl(Render_gLJPanel1);
    }
    
    /** This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Render_gLJPanel1 = new com.jogamp.opengl.awt.GLJPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Render_gLJPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                Render_gLJPanel1MouseDragged(evt);
            }
        });
        Render_gLJPanel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                Render_gLJPanel1MousePressed(evt);
            }
        });
        Render_gLJPanel1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                Render_gLJPanel1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Render_gLJPanel1Layout = new javax.swing.GroupLayout(Render_gLJPanel1);
        Render_gLJPanel1.setLayout(Render_gLJPanel1Layout);
        Render_gLJPanel1Layout.setHorizontalGroup(
            Render_gLJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        Render_gLJPanel1Layout.setVerticalGroup(
            Render_gLJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Render_gLJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Render_gLJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Render_gLJPanel1.getAccessibleContext().setAccessibleName("");
        Render_gLJPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Render_gLJPanel1MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_Render_gLJPanel1MouseDragged
    {//GEN-HEADEREND:event_Render_gLJPanel1MouseDragged
        bodyOpenGl.rotation(evt.getPoint());
    }//GEN-LAST:event_Render_gLJPanel1MouseDragged

    private void Render_gLJPanel1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_Render_gLJPanel1KeyPressed
    {//GEN-HEADEREND:event_Render_gLJPanel1KeyPressed
        bodyOpenGl.motion(evt.getKeyCode());
    }//GEN-LAST:event_Render_gLJPanel1KeyPressed

    private void Render_gLJPanel1MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_Render_gLJPanel1MousePressed
    {//GEN-HEADEREND:event_Render_gLJPanel1MousePressed
        bodyOpenGl.setPoint(evt.getPoint());
    }//GEN-LAST:event_Render_gLJPanel1MousePressed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.jogamp.opengl.awt.GLJPanel Render_gLJPanel1;
    // End of variables declaration//GEN-END:variables
}
