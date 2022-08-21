
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

class PriceFinder{
    public int PriceFinderFunc(int x)
    {
        int[] Array = new int[]{5005,5246,3881,3990,5056,5260,3874,3982,2720,2816,2738,2812,4606,4720,14342,13670,3100,3000,5055,5100,5005,4955,3545,3567,9684,9700,6428,6300,6105,6200,8254,8345,5601,5745,2550,2600,3766,3800,3640,3700,7259,8597,10954,11000,4014,4000,3933,3876,4005,4000};
        return Array[x];
    }
}
public class Airline_reservation_system_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Airline_reservation_system_GUI
     */
    public Airline_reservation_system_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GIN = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        NameLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Button = new javax.swing.JButton();
        Ticket = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Pricee = new javax.swing.JTextField();
        Payment = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Meals = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NameLabel.setText("Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Age:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Gender:");

        Gender.setBackground(new java.awt.Color(255, 255, 153));
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender.setSelectedIndex(-1);

        NameLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NameLabel1.setText("Phone Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Name", "Age", "Gender", "Phone Number", "Identification Number"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Government Idendification Number:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("Airline Reservation");

        Button.setText("Add to List");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        Ticket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hyderabad to Delhi | Jet Airways | 8:30 to 10:40", "Delhi to Hyderabad | Jet Airways | 20:25 to 22:40", "Hyderabad to Bangalore | Jet Airways | 21:00 to 22:10", "Bangalore to Hyderabad | Jet Airways | 5:15 to 6:25", "Mumbai to Delhi | Jet Airways | 10:10 to 12: 20", "Delhi to Mumbai  | Jet Airways | 18:00 to 20: 10", "Hyderabad to Chennai | Jet Airways | 6:10 to 7:25", "Chennai to Hyderabad | Jet Airways | 16:35 to 17:50", "Hyderabad to Vijayawada | Jet Airways | 6:25 to 7:30", "Vijayawada to Hyderabad | Jet Airways | 18:35 to 19:50", "Chennai to Thiruvunanthapuram | Air India | 9:00 to 10: 15", "Thiruvunanthapuram to Chennai  | Air India | 17:00 to 18: 15", "Bangalore to Mumbai | Air India | 7:00 to 8:30", "Mumbai to Bangalore | Air India | 15:00 to 16:30", "Thiruvunanthapuram to Bangalore | Air India | 8:00 to 9:30", "Bangalore to Thiruvunanthapuram | Air India | 19:00 to 20:30", "Chennai to Bangalore | Air India | 12:00 to 13:15", "Bangalore to Chennai | Air India | 20:00 to 21:15", "Mumbai to Lucknow | Vistara | 18:00 to 21: 15", "Lucknow to Mumbai | Vistara | 9:00 to 12:15", "Delhi to Bhubaneswar | Vistara | 4:00 to 7:15", "Bhubaneswar to Delhi | Vistara | 15:00 to 18:15", "Gandhinagar to Kolkata | Vistara | 13:00 to 17:00", "Kolkata to Gandhinagar | Vistara | 4:00 to 8:00", "Jaipur to Srinagar | Vistara | 12:00 to 4:00", "Srinagar to Jaipur | Vistara | 19:00 to 23:00", "Patna to Kolkata | Go Air | 6:00 to 7:30", "Kolkata to Patna | Go Air | 16:00 to 17:30", "Mumbai to Kolkata | Go Air | 9:00 to 12:00", "Kolkata to Mumbai | Go Air | 16:00 to 17:00", "Kolkata to Chennai | Go Air | 15:00 to 17:30", "Chennai to Kolkata | Go Air | 4:00 to 6:30", "Kolkata to Delhi | Go Air | 10:00 to 12:30", "Delhi to Kolkata | Go Air | 19:00 to 9:30", "Mumbai to Panjim | Indigo | 9:00 to 10: 20", "Panjim to Mumbai  | Indigo | 18:00 to 19:20", "Bangalore to Goa | Indigo | 12:00 to 13:00", "Goa to Bangalore | Indigo | 18:00 to 19:00", "Delhi to Lucknow | Indigo | 7:00 to 8:20", "Lucknow to Delhi | Indigo | 16:00 to 17:30", "Lucknow to Bhubaneswar | Indigo | 9:45 to 16:45", "Ranchi to Lucknow | Indigo | 20:45 to 3:45", "Dharmashala to Bhopal | SpiceJet | 14:00 to 19:55", "Bhopal to Dharmashala | SpiceJet |  12:00 to 5:00", "Jaipur to Gandhinagar | SpiceJet | 16:00 to 17:30", "Gandhinagar to Jaipur | SpiceJet | 9:00 to 10: 30", "Hyderabad to Raipur | SpiceJet | 12:00 to 15:00", "Raipur to Hyderabad | SpiceJet | 9:00 to 11: 50", "Mumbai to Thiruvunanthapuram | SpiceJet | 4:00 to 6:20", "Thiruvunanthapuram to Mumbai | Spice jet | 18:00 to 20:20" }));
        Ticket.setSelectedIndex(-1);
        Ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Select Your Flight:");

        Pricee.setEditable(false);

        Payment.setText("Book the Tickets");
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Meals:");

        Meals.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veg ", "Non-Veg", "Snacks", "Drinks", "Other", "None" }));
        Meals.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel1)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel7)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Meals, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(NameLabel1)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(GIN, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(Pricee, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(292, 292, 292)
                                                .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(286, 286, 286)
                                                .addComponent(Payment))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Ticket, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                                .addComponent(Pricee)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(Meals, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(NameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(GIN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(Name.getText().toString().length()>0 && Age.getText().toString().length()>0 && (Gender.getSelectedIndex()>=0 && Gender.getSelectedIndex()<=2)&&PhoneNumber.getText().toString().length()==10 && GIN.getText().toString().length()>0 && jTable1.getRowCount()<4)
        {
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{
                    Name.getText().toString(),Age.getText().toString(),Gender.getSelectedItem().toString(),PhoneNumber.getText().toString(),GIN.getText().toString()
            });
            Name.setText("");
            Age.setText("");
            Gender.setSelectedIndex(-1);
            PhoneNumber.setText("");
            GIN.setText("");
            Meals.setSelectedIndex(-1);
        }
        else{
            if(jTable1.getRowCount()>=4)
                JOptionPane.showMessageDialog(this, "Only 4 Ticket is allowed");
            else
                JOptionPane.showMessageDialog(this, "Please Fill all the Data");
            if(PhoneNumber.getText().toString().length()!=10)
                JOptionPane.showMessageDialog(this, "Please Enter 10 DIgits Valid Phone Number");
        }
    }

    private void TicketActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        PriceFinder xyz= new PriceFinder();
        Pricee.setText("₹"+xyz.PriceFinderFunc(Ticket.getSelectedIndex()));
    }

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this," Thanks For using our Applet");
        Name.setText("");
        Age.setText("");
        Gender.setSelectedIndex(-1);
        PhoneNumber.setText("");
        GIN.setText("");
        Ticket.setSelectedIndex(-1);
        Pricee.setText("");
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
    }

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
            java.util.logging.Logger.getLogger(Airline_reservation_system_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Airline_reservation_system_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Airline_reservation_system_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Airline_reservation_system_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Airline_reservation_system_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField Age;
    private javax.swing.JButton Button;
    private javax.swing.JTextField GIN;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JComboBox<String> Meals;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JButton Payment;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JTextField Pricee;
    private javax.swing.JComboBox<String> Ticket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}