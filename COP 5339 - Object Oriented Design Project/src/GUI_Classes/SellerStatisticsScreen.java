package GUI_Classes;

import Kitten_Creation_Classes.AccountDataBase;
import Kitten_Creation_Classes.Seller;
import Kitten_Creation_Classes.Session;

/**
 * SellerStatisticsScreen is a JFrame that displays to the user
 * the sale statistics
 * @author Joshua
 */
public class SellerStatisticsScreen extends javax.swing.JFrame {

    /**
     * Constructs a SellerStatisticsScreen 
     * @param aDataBase takes an AccountDataBase object
     * @param currentSession takes a Session object
     */
    public SellerStatisticsScreen(AccountDataBase aDataBase, Session currentSession) {
        initComponents();
        kittenCreationDataBase = aDataBase;
        // retrieves and stores the user currently in session in the variable
        currentUser = (Seller)kittenCreationDataBase.retrieve(currentSession.getUserInSession());
        // the remaining code in this function displays and loads the sellers
        // statistics onto the screen
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setTextFields();
        loadStatistics();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        costsField = new javax.swing.JTextField();
        revenueField = new javax.swing.JTextField();
        profitField = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Total Costs");

        jLabel2.setText("Total Revenue");

        jLabel3.setText("Total Profits");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Sale Statistics");

        costsField.setEditable(false);

        revenueField.setEditable(false);

        profitField.setEditable(false);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profitField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revenueField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costsField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(revenueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Function that is called from within an ActionListener which reacts to the
     * exit button that is on the Statistics screen
     * @param evt takes an ActionEvent object
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // disposes of the window when the use clicks on the exit buton
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * Function gets the sellers life time inventory costs. revenue and profit made
     * and loads it onto the text fields displayed on the screen
     */
    private void loadStatistics() {
        costsField.setText("$" + Double.toString(currentUser.getInventory().getLifeTimeInventoryCosts()));
        revenueField.setText("$" + Double.toString(currentUser.getRevenue()));
        profitField.setText("$" + Double.toString(currentUser.calculateProfit()));
    }
    
    /**
     * Set's the text fields on screen to "$0.00"
     */
    private void setTextFields() {
        costsField.setText("$0.00");
        revenueField.setText("$0.00");
        profitField.setText("$0.00");
    }
    
    private final AccountDataBase kittenCreationDataBase;
    private final Seller currentUser;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField costsField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField profitField;
    private javax.swing.JTextField revenueField;
    // End of variables declaration//GEN-END:variables
}
