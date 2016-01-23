package GUI_Classes;

import Kitten_Creation_Classes.Account;
import Kitten_Creation_Classes.AccountDataBase;
import Kitten_Creation_Classes.Session;
import javax.swing.JOptionPane;

public class BuyerAccountScreen extends javax.swing.JFrame 
{    
    /**
     * Constructs a BuyerAccountScreen object
     * @param aDataBase
     * @param currentSession 
     */
    public BuyerAccountScreen(AccountDataBase aDataBase, Session currentSession) {
        initComponents();
        kittenCreationDataBase = aDataBase;
        this.currentSession = currentSession;
        currentUser = kittenCreationDataBase.retrieve(currentSession.getUserInSession());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        fillInAccountPage();
    }
    
    /**
     * This function retrieves the currentUsers account information
     * and stores it into the text fields that are displayed on the JFrame
     * to be seen
     */
    public void fillInAccountPage()
    {
        nameField.setText(currentUser.getFullName());
        usernameField.setText(currentUser.getUserName());
        passwordField.setText(currentUser.getPassWord());
        creditcardField.setText(currentUser.getCreditCardNumber());
        CCVField.setText(currentUser.getCCV());
    }

    /**
     * Loads components onto the JFrame and its attributes
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        retToProductsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("My Kitten Creations Account");

        jLabel2.setText("Name:");

        jLabel3.setText("User Name:");

        jLabel4.setText("Password:");

        jLabel5.setText("Credit Card #:");

        jLabel6.setText("CCV #:");

        jLabel7.setText("Account Type:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/catShadow.png"))); // NOI18N

        nameField.setEditable(false);

        passwordField.setEditable(false);

        creditcardField.setEditable(false);

        usernameField.setEditable(false);

        CCVField.setEditable(false);

        accountTypeField.setEditable(false);
        accountTypeField.setText("Buyer");

        editSaveButton.setText("Edit Account");
        editSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSaveButtonActionPerformed(evt);
            }
        });

        retToProductsButton.setText("Return To Products");
        retToProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retToProductsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(143, 143, 143))
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
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
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
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(editSaveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retToProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(creditcardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CCVField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(accountTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retToProductsButton)
                    .addComponent(editSaveButton))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Function that is called from within an ActionListener which reacts to the
     * returnToInventory button that is on the SellerAccountScreen
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
            retToProductsButton.setEnabled(false);
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
            
            editSaveButton.setText("Edit Account");
            nameField.setEditable(false);
            passwordField.setEditable(false);
            creditcardField.setEditable(false);
            CCVField.setEditable(false);
            retToProductsButton.setEnabled(true);
            
            currentSession.setUserInSession(currentUser.getUserName());
            
            JOptionPane.showMessageDialog(null, "Changes were successful", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_editSaveButtonActionPerformed
    
    /**
     * Function that is called from within an ActionListener which reacts to the
     * returnToProducts button that is on the BuyerAccountScreen
     * @param evt takes an ActionEvent object
     */
    private void retToProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retToProductsButtonActionPerformed
        this.dispose();
        MarketPlaceScreen backToProducts = new MarketPlaceScreen(kittenCreationDataBase, currentSession);
        backToProducts.setVisible(true);
    }//GEN-LAST:event_retToProductsButtonActionPerformed

    // My variable declaration(s) for JFrame
    private final AccountDataBase kittenCreationDataBase;
    private final Account currentUser;
    private final Session currentSession;
    private boolean editState = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCVField;
    private javax.swing.JTextField accountTypeField;
    private javax.swing.JTextField creditcardField;
    private javax.swing.JButton editSaveButton;
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
    private javax.swing.JButton retToProductsButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
