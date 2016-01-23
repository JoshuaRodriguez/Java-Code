package GUI_Classes;

import Kitten_Creation_Classes.AccountDataBase;
import Kitten_Creation_Classes.Seller;
import Kitten_Creation_Classes.Session;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Window which displays the Sellers account information
 * @author Joshua
 */
public class SellerAccountScreen extends javax.swing.JFrame 
{    
    /**
     * Constructs a SellerAccountScreen
     * @param aDataBase takes an AccountDataBase object
     * @param currentSession takes a Session object
     */
    public SellerAccountScreen(AccountDataBase aDataBase, Session currentSession) {
        // initializes components in the jframe 
        initComponents();
        kittenCreationDataBase = aDataBase;
        this.currentSession = currentSession;
        // retrieves seller that is currently in the session
        currentUser = (Seller)kittenCreationDataBase.retrieve(currentSession.getUserInSession());
        // Displays the window in the center of the screen, prevents resizability
        // and calls the fillInAccountPage function
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        fillInAccountPage();
    }
    
    /**
     * This function retrieves the currentUsers account information
     * and stores it into the text fields that are displayed on the JFrame
     * to be seen
     */
    private void fillInAccountPage()
    {
        nameField.setText(currentUser.getFullName());
        usernameField.setText(currentUser.getUserName());
        passwordField.setText(currentUser.getPassWord());
        creditcardField.setText(currentUser.getCreditCardNumber());
        CCVField.setText(currentUser.getCCV());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        creditcardField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        CCVField = new javax.swing.JTextField();
        accountTypeField = new javax.swing.JTextField();
        editSaveButton = new javax.swing.JButton();
        goToInventoryButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        saleStatsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jLabel2.setText("Name");

        jLabel3.setText("User Name");

        jLabel4.setText("Password");

        jLabel5.setText("Credit Card #");

        jLabel6.setText("CCV #");

        jLabel7.setText("Account Type:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/catShadow.png"))); // NOI18N

        nameField.setEditable(false);

        passwordField.setEditable(false);

        creditcardField.setEditable(false);

        usernameField.setEditable(false);

        CCVField.setEditable(false);

        accountTypeField.setEditable(false);
        accountTypeField.setText("Seller");

        editSaveButton.setText("Edit Account");
        editSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSaveButtonActionPerformed(evt);
            }
        });

        goToInventoryButton.setText("Return To Inventory");
        goToInventoryButton.setMaximumSize(new java.awt.Dimension(164, 29));
        goToInventoryButton.setMinimumSize(new java.awt.Dimension(164, 29));
        goToInventoryButton.setPreferredSize(new java.awt.Dimension(164, 29));
        goToInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToInventoryButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("My Kitten Creations Account");

        saleStatsButton.setText("Sale Statistics");
        saleStatsButton.setMaximumSize(new java.awt.Dimension(164, 29));
        saleStatsButton.setMinimumSize(new java.awt.Dimension(164, 29));
        saleStatsButton.setPreferredSize(new java.awt.Dimension(164, 29));
        saleStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleStatsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditcardField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CCVField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(saleStatsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addComponent(editSaveButton)
                        .addGap(58, 58, 58)
                        .addComponent(goToInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(creditcardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(CCVField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goToInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saleStatsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Function that is called from within an ActionListener which reacts to the
     * edit/save button that is on the SellerAccountScreen
     * @param evt takes an ActionEvent object
     */
    private void editSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSaveButtonActionPerformed
        // the if and else if statements are ran depending on the state of the 
        // edit-save button that is on the screen. When the screen first loads up
        // the button is currently in a false state, in which the button text shows
        // "Edit Account". If the button is clicked the state is changed from false
        // to true. This disables the return to inventory button and sale statistics
        // button that is on screen and allows the textfields to be changed.
        // When the button is in a false state the textfields are uneditable.
        // The same character length and username avaliability checks are in place
        // as the sign up screen. When the user decides to save any changes, the textfields
        // are overwritten with their new values, and the current user account information
        // is also changed (the actual object instance).
        if(!editState) {
            editState = true;
            goToInventoryButton.setEnabled(false);
            saleStatsButton.setEnabled(false);
            editSaveButton.setText("Save Changes");
            nameField.setEditable(true);
            passwordField.setEditable(true);
            creditcardField.setEditable(true);
            CCVField.setEditable(true);
        }
        else if(editState) {
            String[] allUserInput = new String[5];
            allUserInput[0] = nameField.getText().trim();
            allUserInput[2] = passwordField.getText().trim();
            allUserInput[3] = creditcardField.getText().trim();
            allUserInput[4] = CCVField.getText().trim();
        
            if(allUserInput[0].length() < 1) {
                JOptionPane.showMessageDialog(null, "Cannot leave full name field blank", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        
            if(allUserInput[2].length() < 6) {
                JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        
            if(allUserInput[3].length() < 16 || allUserInput[3].length() >= 17) {
                JOptionPane.showMessageDialog(null, "Incorrect Credit Card Length", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else {
                for(int i = 0; i < allUserInput[3].length(); i++) {
                    if(Character.isDigit(allUserInput[3].charAt(i))) {
                   
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "credit card number cannot contains characters or symbols", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }
        
            if(allUserInput[4].length() < 3 || allUserInput[4].length() >= 4) {
                JOptionPane.showMessageDialog(null, "CCV number has incorrect length", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        
            editState = false;
            currentUser.setFullName(allUserInput[0]);
            currentUser.setPassWord(allUserInput[2]);
            currentUser.setCreditCardNumber(allUserInput[3]);
            currentUser.setCCV(allUserInput[4]);
            
            currentUser.getInventory().changeProductOwnerShip(allUserInput[1]);
            
            editSaveButton.setText("Edit Account");
            nameField.setEditable(false);
            passwordField.setEditable(false);
            creditcardField.setEditable(false);
            CCVField.setEditable(false);
            goToInventoryButton.setEnabled(true);
            saleStatsButton.setEnabled(true);
            
            currentSession.setUserInSession(currentUser.getUserName());
            
            JOptionPane.showMessageDialog(null, "Changes were successful", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_editSaveButtonActionPerformed

   /**
     * Function that is called from within an ActionListener which reacts to the
     * returnToInventory button that is on the SellerAccountScreen
     * @param evt takes an ActionEvent object
     */
    private void goToInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToInventoryButtonActionPerformed
        this.dispose();
        InventoryScreen backToInventory = new InventoryScreen(kittenCreationDataBase, currentSession);
        backToInventory.setVisible(true);
    }//GEN-LAST:event_goToInventoryButtonActionPerformed

  /**
     * Function that is called from within an ActionListener which reacts to the
     * Sale Statistics button that is on the SellerAccountScreen
     * @param evt takes an ActionEvent object
     */
    private void saleStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleStatsButtonActionPerformed
        SellerStatisticsScreen sellerStats = new SellerStatisticsScreen(kittenCreationDataBase, currentSession);
        sellerStats.setVisible(true);
        sellerStats.setAlwaysOnTop(true);
        sellerStats.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_saleStatsButtonActionPerformed

    // My variable declaration(s) for JFrame
    private final AccountDataBase kittenCreationDataBase;
    private final Seller currentUser;
    private final Session currentSession;
    private boolean editState = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCVField;
    private javax.swing.JTextField accountTypeField;
    private javax.swing.JTextField creditcardField;
    private javax.swing.JButton editSaveButton;
    private javax.swing.JButton goToInventoryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton saleStatsButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
