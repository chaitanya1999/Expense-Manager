
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Earnings.java
 *
 * Created on Dec 29, 2015, 11:09:33 AM
 */

/**
 *
 * @author Nilkanth
 */
public class Earnings extends javax.swing.JFrame {

    /** Creates new form Earnings */
    public Earnings() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        theTitle = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEarn = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("frame3"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        theTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24));
        theTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        theTitle.setText("Total Earnings");

        back.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        back.setText("<--  Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        add.setText("Add Earning");
        add.setMaximumSize(new java.awt.Dimension(141, 29));
        add.setMinimumSize(new java.awt.Dimension(141, 29));
        add.setPreferredSize(new java.awt.Dimension(141, 29));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        edit.setText("Edit Earning");
        edit.setMaximumSize(new java.awt.Dimension(141, 29));
        edit.setMinimumSize(new java.awt.Dimension(141, 29));
        edit.setPreferredSize(new java.awt.Dimension(141, 23));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        tbEarn.setBackground(new java.awt.Color(255, 255, 225));
        tbEarn.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        tbEarn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "e_id", "Title", "Amount", "Month"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEarn.setRowHeight(20);
        tbEarn.setSelectionBackground(new java.awt.Color(153, 255, 153));
        tbEarn.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbEarn);
        tbEarn.getColumnModel().getColumn(0).setResizable(false);
        tbEarn.getColumnModel().getColumn(1).setResizable(false);
        tbEarn.getColumnModel().getColumn(2).setResizable(false);
        tbEarn.getColumnModel().getColumn(3).setResizable(false);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(169, 169, 169)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(theTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(theTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    this.dispose();
    globalvar.frame1.setLocation(this.getLocation());
    globalvar.frame1.setVisible(true);
}//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    AddEarn ae = new AddEarn();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int X = (int) ((dimension.getWidth() - ae.getWidth()) / 2);
    int Y = (int) ((dimension.getHeight() - ae.getHeight()) / 2);
    ae.setLocation(X, Y);
    ae.show();
}//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
    if(tbEarn.getSelectedRow()!=-1){
    UpdateEarn ue = new UpdateEarn();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int X = (int) ((dimension.getWidth() - ue.getWidth()) / 2);
    int Y = (int) ((dimension.getHeight() - ue.getHeight()) / 2);
    ue.setLocation(X, Y);
    ue.show();
    }
    else{
    JOptionPane.showMessageDialog(null,"No record selected.");
    }
}//GEN-LAST:event_editActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            Class.forName("java.sql.DriverManager");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp12cay" + globalvar.year,"root","admin");
            Statement st = c.createStatement();
            ResultSet earnings = st.executeQuery("select * from earnings order by month;");
            DefaultTableModel m = (DefaultTableModel) tbEarn.getModel();
            while(earnings.next()){
                String s1 = earnings.getString("e_id");
                String s2 = earnings.getString("title");
                String s3 = earnings.getString("amount");
                String s = earnings.getString("month").substring(2);
                String s4 = s.substring(0,1).toUpperCase() + s.substring(1);
                m.addRow(new Object[]{s1,s2,s3,s4});
            }
            tbEarn.removeColumn(tbEarn.getColumn("e_id"));//Hides the column
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    globalvar.frame1.setLocation(this.getLocation());
    globalvar.frame1.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Earnings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton edit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tbEarn;
    public javax.swing.JLabel theTitle;
    // End of variables declaration//GEN-END:variables

}