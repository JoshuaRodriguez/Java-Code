package GUI_Classes;

import Kitten_Creation_Classes.AccountDataBase;
import Kitten_Creation_Classes.Buyer;
import Kitten_Creation_Classes.Seller;
import javax.swing.JOptionPane;

public class SignUpScreen extends javax.swing.JFrame 
{   
    /**
     * Constructs a SignUpScreen object
     * @param aDataBase takes an Account DataBase object
     */
    public SignUpScreen(AccountDataBase aDataBase) {
        initComponents();
        kittenCreationDataBase = aDataBase;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    /**
     * Initializes all the components that are on the LandingScreen JFrame
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fullNameLabel = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        screenTitle = new javax.swing.JLabel();
        reenterPasswordLabel = new javax.swing.JLabel();
        creditcardLabel = new javax.swing.JLabel();
        CCVLabel = new javax.swing.JLabel();
        accountTypeLabel = new javax.swing.JLabel();
        pawsLabel = new javax.swing.JLabel();
        fullNameInputField = new javax.swing.JTextField();
        userIDInputField = new javax.swing.JTextField();
        passwordInputField = new javax.swing.JTextField();
        reenterPasswordField = new javax.swing.JTextField();
        creditcardNumberInputField = new javax.swing.JTextField();
        CCVInputField = new javax.swing.JTextField();
        createAccountButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        buyerSellerComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(537, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fullNameLabel.setText("Full Name");
        getContentPane().add(fullNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 93, -1, 17));

        userIDLabel.setText("User ID");
        getContentPane().add(userIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 153, -1, -1));

        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 219, -1, -1));

        screenTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        screenTitle.setText("Create An Account");
        getContentPane().add(screenTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 23, -1, -1));

        reenterPasswordLabel.setText("Reenter Password");
        getContentPane().add(reenterPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 288, -1, -1));

        creditcardLabel.setText("Credit Card");
        getContentPane().add(creditcardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 354, -1, -1));

        CCVLabel.setText("CCV");
        getContentPane().add(CCVLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 354, -1, -1));

        accountTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountTypeLabel.setText("Account Type");
        getContentPane().add(accountTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 93, 96, -1));

        pawsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/catPaws.png"))); // NOI18N
        getContentPane().add(pawsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 206, -1, 83));
        getContentPane().add(fullNameInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 116, 240, -1));
        getContentPane().add(userIDInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 175, 240, -1));
        getContentPane().add(passwordInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 241, 240, -1));
        getContentPane().add(reenterPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 310, 240, -1));
        getContentPane().add(creditcardNumberInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 376, 240, -1));
        getContentPane().add(CCVInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 376, 59, -1));

        createAccountButton.setText("Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 454, 128, -1));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 454, 128, -1));

        buyerSellerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buyer", "Seller" }));
        getContentPane().add(buyerSellerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 115, 96, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Function that is called from within an ActionListener which reacts to the
     * cancel button that is on the Sign up Screen
     * @param evt takes an ActionEvent object
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // disposes of the signup screen completely
        this.dispose();
        // creates a new instance of the login screen
        LandingScreen backToLogin = new LandingScreen(kittenCreationDataBase);
        // set the login screen view to visible
        backToLogin.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Function that is called from within an ActionListener which reacts to the
     * create account button that is on the Sign up Screen
     * @param evt takes an ActionEvent object
     */
    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        String[] allUserInput = new String[6]; 
        int accountTypeSelection = 2;
        
        if(buyerSellerComboBox.getSelectedIndex() == 0)
            accountTypeSelection = 0;
        
        else if(buyerSellerComboBox.getSelectedIndex() == 1)
            accountTypeSelection = 1;
        
        allUserInput[0] = fullNameInputField.getText().trim();
        allUserInput[1] = userIDInputField.getText().trim();
        allUserInput[2] = passwordInputField.getText().trim();
        allUserInput[3] = reenterPasswordField.getText().trim();
        allUserInput[4] = creditcardNumberInputField.getText().trim();
        allUserInput[5] = CCVInputField.getText().trim();
        
        // The following if statements essentially check for empty fields in the textfields,
        // and it checks for specified lengths on username, password, creditcard and ccv fields.
        // Below is also a check to see if the username exists in the DataBase already.
        // If the username does exists it notifies the user its taken and prevents account creation
        // if not the program proceeds with creating the account. Below also, the account is created
        // depending on what the user chose the account type to be via the combo box on screen
        // once the account is successfully created and stored in the DataBase, the screen is disposed
        // off and the program returns to the login screen
        if(allUserInput[0].length() < 1) {
            JOptionPane.showMessageDialog(null, "Cannot leave full name field blank", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(allUserInput[1].length() < 5 || allUserInput[1].length() > 16) {
            JOptionPane.showMessageDialog(null, "Username must be between 5 and 16 characters", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(allUserInput[2].length() < 6) {
            JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(!allUserInput[2].equals(allUserInput[3])) {
            JOptionPane.showMessageDialog(null, "Password does not match", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(allUserInput[4].length() < 16 || allUserInput[4].length() >= 17) {
            JOptionPane.showMessageDialog(null, "Incorrect Credit Card Length", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            for(int i = 0; i < allUserInput[4].length(); i++) {
                if(Character.isDigit(allUserInput[4].charAt(i))) {
                   // do nothing
                } 
                else {
                    JOptionPane.showMessageDialog(null, "credit card number cannot contains characters or symbols", 
                                                  "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
        
        if(allUserInput[5].length() < 3 || allUserInput[5].length() >= 4) {
            JOptionPane.showMessageDialog(null, "CCV number has incorrect length", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(kittenCreationDataBase.search(allUserInput[1])) {
            JOptionPane.showMessageDialog(null, "The username: " + allUserInput[1] + " is already taken", 
                                          "Error", JOptionPane.WARNING_MESSAGE);
        }
        else {
            if(accountTypeSelection == 0) { 
                Buyer aNewBuyer = new Buyer(allUserInput[0], allUserInput[1], allUserInput[2], allUserInput[4], allUserInput[5]);
                kittenCreationDataBase.insert(aNewBuyer);
                JOptionPane.showMessageDialog(null, "\tSignup Successful, Please log in.", "Success!", JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                LandingScreen backToLogin = new LandingScreen(kittenCreationDataBase);
                backToLogin.setVisible(true);
            }
            else if(accountTypeSelection == 1) {
                Seller aNewSeller = new Seller(allUserInput[0], allUserInput[1], allUserInput[2], allUserInput[4], allUserInput[5]);
                kittenCreationDataBase.insert(aNewSeller);
                JOptionPane.showMessageDialog(null, "\tSignup Successful, Please log in.", "Success!", JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                LandingScreen backToLogin = new LandingScreen(kittenCreationDataBase);
                backToLogin.setVisible(true);
            }
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed

    // My variable declaration(s) for JFrame
    private AccountDataBase kittenCreationDataBase;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCVInputField;
    private javax.swing.JLabel CCVLabel;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JComboBox<String> buyerSellerComboBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel creditcardLabel;
    private javax.swing.JTextField creditcardNumberInputField;
    private javax.swing.JTextField fullNameInputField;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField passwordInputField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel pawsLabel;
    private javax.swing.JTextField reenterPasswordField;
    private javax.swing.JLabel reenterPasswordLabel;
    private javax.swing.JLabel screenTitle;
    private javax.swing.JTextField userIDInputField;
    private javax.swing.JLabel userIDLabel;
    // End of variables declaration//GEN-END:variables
}
