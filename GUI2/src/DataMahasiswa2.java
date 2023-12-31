/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author irvin
 */
import javax.swing.*;

public class DataMahasiswa2 extends javax.swing.JFrame {

    String nama, nim, alamat, fakultas, prodi, kalimat, jeniskelamin;

    /**
     * Creates new form DataMahasiswa2
     */
    public DataMahasiswa2() {
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

        buttonGroupJenisKelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldNim = new javax.swing.JTextField();
        jRadioButtonLaki = new javax.swing.JRadioButton();
        jRadioButtonPeremuan = new javax.swing.JRadioButton();
        jCheckBoxBaca = new javax.swing.JCheckBox();
        jCheckBoxOlahRaga = new javax.swing.JCheckBox();
        jCheckBoxCoding = new javax.swing.JCheckBox();
        jComboBoxFakultas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProdi = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAlamat = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaData = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Mahasiswa"));

        jLabel1.setText("Nama");

        jLabel2.setText("NIM");

        jLabel3.setText("Jenis Kelamin ");

        jLabel4.setText("Hobi");

        jLabel5.setText("Fakultas");

        jLabel6.setText("Prodi");

        jTextFieldNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNamaFocusLost(evt);
            }
        });

        jTextFieldNim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNimFocusLost(evt);
            }
        });

        buttonGroupJenisKelamin.add(jRadioButtonLaki);
        jRadioButtonLaki.setSelected(true);
        jRadioButtonLaki.setText("Laki - laki");

        buttonGroupJenisKelamin.add(jRadioButtonPeremuan);
        jRadioButtonPeremuan.setText("Perempuan");

        jCheckBoxBaca.setText("Baca");

        jCheckBoxOlahRaga.setText("Olahraga");

        jCheckBoxCoding.setText("Coding");

        jComboBoxFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknologi Informasi", "Teknik Sipil" }));
        jComboBoxFakultas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxFakultasItemStateChanged(evt);
            }
        });

        jListProdi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Teknik Informatika", "Sistem Informasi" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListProdi);

        jButton1.setText("Tampil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Alamat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxBaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxOlahRaga)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxCoding))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonLaki)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonPeremuan)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButtonLaki)
                    .addComponent(jRadioButtonPeremuan))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBoxBaca)
                    .addComponent(jCheckBoxOlahRaga)
                    .addComponent(jCheckBoxCoding))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tampil Data"));

        jTextAreaData.setColumns(20);
        jTextAreaData.setRows(5);
        jScrollPane2.setViewportView(jTextAreaData);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //validasi nama
    private void checkNama() {
        boolean checkNama;
        nama = jTextFieldNama.getText().toString();
        String ErrorNama = "Nama Hanya Terdiri dari Karakter huruf a - Z";

        checkNama = nama.matches("[a-zA-Z\s]+");

        if (checkNama == false) {
            JOptionPane.showMessageDialog(null, ErrorNama, "Alert", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNama.setText("");
        }

    }
    
    //set prodi
    private void setProdi(){
        if(jComboBoxFakultas.getSelectedItem().toString().equalsIgnoreCase("Teknologi Informasi")){
            jListProdi.setModel(new javax.swing.AbstractListModel<String>(){
                String[] strings={"Teknik Informatika","Sistem Informasi"};
                public int getSize(){return strings.length;}
                public String getElementAt(int i){return strings[i];}
            });
        }
        else if(jComboBoxFakultas.getSelectedItem().toString().equalsIgnoreCase("Teknik Sipil")){
            jListProdi.setModel(new javax.swing.AbstractListModel<String>(){
                String[] strings={"Arsitektur","Sipil"};
                public int getSize(){return strings.length;}
                public String getElementAt(int i){return strings[i];}
            });
        }
        else{
            jListProdi.setModel(new javax.swing.AbstractListModel<String>(){
                String[] strings={""};
                public int getSize(){return strings.length;}
                public String getElementAt(int i){return strings[i];}
            });
        }
    }
    
     //validasi Nim
    private void checkNim() {
        boolean checkNim;
        nim = jTextFieldNim.getText().toString();
        String ErrorNama = "Nim Hanya Terdiri dari Angka sebanyak 10 Digit";

        checkNim = nim.matches("[0-9]{10}$");

        if (checkNim == false) {
            JOptionPane.showMessageDialog(null, ErrorNama, "Alert", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNim.setText("");
        }

    }

    //validasi nim
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //validasi Nama
        if(jTextFieldNama.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Text Nama Harus Diisi!", "Alert", JOptionPane.INFORMATION_MESSAGE);
         return;
        }
        //validasi nim
        if(jTextFieldNim.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Text NIM Harus Diisi!", "Alert", JOptionPane.INFORMATION_MESSAGE);
         return;
        }
        
        //validasi jlist
        if(jListProdi.getSelectedIndex() !=1){
            prodi ="";
        }else{
              prodi = jListProdi.getSelectedValue().toString();

        }
        
        
        String hobi = "";
       
        nama = jTextFieldNama.getText();
        nim = jTextFieldNim.getText();
        alamat = jTextFieldAlamat.getText();
        fakultas = jComboBoxFakultas.getSelectedItem().toString();
      
        //jenis kelamin
        if (jRadioButtonLaki.isSelected()) {
            jeniskelamin = jRadioButtonLaki.getText();
        } else if (jRadioButtonPeremuan.isSelected()) {
            jeniskelamin = jRadioButtonPeremuan.getText();
        }

        
        if(!jCheckBoxBaca.isSelected() && !jCheckBoxCoding.isSelected() && !jCheckBoxOlahRaga.isSelected()){
            
            hobi ="Tidak ada Hobi";
        }
        
        
         
        //hobi
        if (jCheckBoxBaca.isSelected()) {
            hobi = hobi + jCheckBoxBaca.getText() + " ";
        }
        if (jCheckBoxCoding.isSelected()) {
            hobi = hobi + jCheckBoxCoding.getText() + " ";
        }
        if (jCheckBoxOlahRaga.isSelected()) {
            hobi = hobi + jCheckBoxOlahRaga.getText() + " ";
        }

        kalimat = "Data Mahasiswa \nNama: " + nama
                + "\nNIM: " + nim
                + "\nAlamat : " + alamat
                + "\nJenis Kelamin : " + jeniskelamin
                + "\nHobi : " + hobi
                + "\nFakultas : " + fakultas
                + "\nProdi : " + prodi;

        jTextAreaData.setText(kalimat);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNamaFocusLost
        // TODO add your handling code here:
        //  JOptionPane.showMessageDialog(null, "Ini adalah pesan alert dengan tombol OK saja.", "Alert", JOptionPane.INFORMATION_MESSAGE);
        checkNama();
    }//GEN-LAST:event_jTextFieldNamaFocusLost

    private void jTextFieldNimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNimFocusLost
        // TODO add your handling code here:
         checkNim();
    }//GEN-LAST:event_jTextFieldNimFocusLost

    private void jComboBoxFakultasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFakultasItemStateChanged

        // TODO add your handling code here:
setProdi();
    }//GEN-LAST:event_jComboBoxFakultasItemStateChanged

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
                if ("Windoows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataMahasiswa2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupJenisKelamin;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxBaca;
    private javax.swing.JCheckBox jCheckBoxCoding;
    private javax.swing.JCheckBox jCheckBoxOlahRaga;
    private javax.swing.JComboBox<String> jComboBoxFakultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListProdi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonLaki;
    private javax.swing.JRadioButton jRadioButtonPeremuan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaData;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNim;
    // End of variables declaration//GEN-END:variables
}
