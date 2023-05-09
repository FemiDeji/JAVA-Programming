
package currency.converter;

import javax.swing.JOptionPane;

public class CurrencyConverter extends javax.swing.JFrame {

    public CurrencyConverter() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //creating a label to add text to and text from
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        textAmount = new javax.swing.JLabel();
        TextField = new javax.swing.JTextField();
        textFrom = new javax.swing.JLabel();
        textTo = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox();
        ComboBox2 = new javax.swing.JComboBox();
        Convert = new javax.swing.JButton();

        //creating a text field in which the amount is going to be entered
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Amount");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //creating the title and the GUI
        Header.setBackground(new java.awt.Color(153, 153, 255));
        Header.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("CURRENCY CONVERTER");
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        //creating a text field in which the amount is going to be entered
        textAmount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAmount.setText("Amount");
        textAmount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextField.setBackground(new java.awt.Color(204, 204, 255));
        TextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });

        //creating a text box for text from
        textFrom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textFrom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textFrom.setText("From");
        textFrom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        //creating a text box for text to
        textTo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textTo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTo.setText("To");
        textTo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        //storing all available currencies in an array for the text from
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USD", "NGN", "EUR", "GBP", "JPY" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        //storing all available currencies in an array for the text to
        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NGN", "EUR", "USD", "JPY", "GBP" }));
        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });
        //creating the button "Convert"
        Convert.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Convert.setText("CONVERT");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        //generated code as a result of drag and drop in designing the GUI
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField)
                            .addComponent(ComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox2, 0, 165, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextField)
                    .addComponent(textAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBox1)
                    .addComponent(textFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textTo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(ComboBox2))
                .addGap(18, 18, 18)
                .addComponent(Convert, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        
    }//GEN-LAST:event_TextFieldActionPerformed

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed

        //declaring the variables to convert the amount entered
        Double convert;
        Double amount = Double.parseDouble(TextField.getText());
        
        //Converting USD to NGN
        if(ComboBox1.getSelectedItem().toString()=="USD" && ComboBox2.getSelectedItem().toString()=="NGN"){
            convert = amount * 460.49;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" NGN");
        }
        //Converting USD to JPY
        if(ComboBox1.getSelectedItem().toString()=="USD" && ComboBox2.getSelectedItem().toString()=="JPY"){
            convert = amount * 136.18;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," Tha amount is: "+convert.toString()+" JPY");
        }
        //Converting USD to GBP
        if(ComboBox1.getSelectedItem().toString()=="USD" && ComboBox2.getSelectedItem().toString()=="GBP"){
            convert = amount * 0.84;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," Tha amount is: "+convert.toString()+" GBP");
        }
        //Converting USD to EUR
        if(ComboBox1.getSelectedItem().toString()=="USD" && ComboBox2.getSelectedItem().toString()=="EUR"){
            convert = amount * 0.95;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," Tha amount is: "+convert.toString()+" EUR");
        }
        //Converting NGN to USD
        if(ComboBox1.getSelectedItem().toString()=="NGN" && ComboBox2.getSelectedItem().toString()=="USD"){
            convert = amount * 0.0022;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" USD");
        }
        //Converting NGN to EUR
        if(ComboBox1.getSelectedItem().toString()=="NGN" && ComboBox2.getSelectedItem().toString()=="EUR"){
            convert = amount * 0.0021;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" EUR");
        }
        //Converting NGN to JPY
         if(ComboBox1.getSelectedItem().toString()=="NGN" && ComboBox2.getSelectedItem().toString()=="JPY"){
            convert = amount * 0.30;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" JPY");
         }
         //Converting NGN to GBP
         if(ComboBox1.getSelectedItem().toString()=="NGN" && ComboBox2.getSelectedItem().toString()=="GBP"){
            convert = amount * 0.0018;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" GBP");
         }
         //Converting GBP to USD
         if(ComboBox1.getSelectedItem().toString()=="GBP" && ComboBox2.getSelectedItem().toString()=="USD"){
            convert = amount * 1.19 ;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" USD");
         }
         //Converting GBP to NGN
         if(ComboBox1.getSelectedItem().toString()=="GBP" && ComboBox2.getSelectedItem().toString()=="NGN"){
            convert = amount * 547.68;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" NGN");
         }
         //Converting GBP to EUR
         if(ComboBox1.getSelectedItem().toString()=="GBP" && ComboBox2.getSelectedItem().toString()=="EUR"){
            convert = amount * 1.12;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" EUR");
         }
         //Converting GBP to JPY
         if(ComboBox1.getSelectedItem().toString()=="GBP" && ComboBox2.getSelectedItem().toString()=="JPY"){
            convert = amount * 161.98;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" JPY");
         }
         //Converting EUR to USD
         if(ComboBox1.getSelectedItem().toString()=="EUR" && ComboBox2.getSelectedItem().toString()=="USD"){
            convert = amount * 1.06;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" USD");
         }
         //Converting EUR to NGN
         if(ComboBox1.getSelectedItem().toString()=="EUR" && ComboBox2.getSelectedItem().toString()=="NGN"){
            convert = amount * 486.93;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" NGN");
         }
         //Converting EUR to GBP
         if(ComboBox1.getSelectedItem().toString()=="EUR" && ComboBox2.getSelectedItem().toString()=="GBP"){
            convert = amount * 0.89;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" GBP");
         }
         //Converting EUR to JPY
         if(ComboBox1.getSelectedItem().toString()=="EUR" && ComboBox2.getSelectedItem().toString()=="JPY"){
            convert = amount * 144.05;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" JPY");
         }
         //Converting JPY to USD
         if(ComboBox1.getSelectedItem().toString()=="JPY" && ComboBox2.getSelectedItem().toString()=="USD"){
            convert = amount * 0.0073;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" USD");
         }
         //Converting JPY to NGN
         if(ComboBox1.getSelectedItem().toString()=="JPY" && ComboBox2.getSelectedItem().toString()=="NGN"){
            convert = amount * 3.38;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" NGN");
         }
         //Converting JPY to EUR
         if(ComboBox1.getSelectedItem().toString()=="JPY" && ComboBox2.getSelectedItem().toString()=="EUR"){
            convert = amount * 0.0069;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" EUR");
         }
         //Converting JPY to GBP
         if(ComboBox1.getSelectedItem().toString()=="JPY" && ComboBox2.getSelectedItem().toString()=="GBP"){
            convert = amount * 0.0062;
            //TextField.setText(convert.toString());
            JOptionPane.showMessageDialog(this," The amount is: "+convert.toString()+" GBP");
         }
    }//GEN-LAST:event_ConvertActionPerformed

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
       
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        
    }//GEN-LAST:event_ComboBox2ActionPerformed
       
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox1;
    private javax.swing.JComboBox ComboBox2;
    private javax.swing.JButton Convert;
    private javax.swing.JLabel Header;
    private javax.swing.JTextField TextField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textAmount;
    private javax.swing.JLabel textFrom;
    private javax.swing.JLabel textTo;
    // End of variables declaration//GEN-END:variables
}
