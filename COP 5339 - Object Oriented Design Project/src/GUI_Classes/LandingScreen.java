package GUI_Classes;

import GUI_Classes.SignUpScreen;
import Kitten_Creation_Classes.AccountDataBase;
import Kitten_Creation_Classes.Buyer;
import Kitten_Creation_Classes.Seller;
import Kitten_Creation_Classes.Session;
import javax.swing.JOptionPane;

public class LandingScreen extends javax.swing.JFrame 
{
    /**
     * Constructs a LandingScreen object
     * @param aDataBase takes an AccountDataBase object
     */
    public LandingScreen(AccountDataBase aDataBase) {
        initComponents();
        kittenCreationDataBase = aDataBase;
        this.setLocationRelativeTo(null);
        this.setResizable(false);;
    }

    /**
     * Initializes all the components that are on the LandingScreen JFrame
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        companyText = new javax.swing.JLabel();
        passwordInputField = new javax.swing.JPasswordField();
        usernameInputField = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(470, 350));
        setMinimumSize(new java.awt.Dimension(470, 350));
        setPreferredSize(new java.awt.Dimension(470, 350));
        setSize(new java.awt.Dimension(470, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 110, -1));

        signupButton.setText("Sign Up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 110, -1));

        usernameLabel.setText("Username");
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 70, 40));

        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 70, 40));

        companyText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        companyText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babyCatIcon.png"))); // NOI18N
        companyText.setText(" Kitten Creations ");
        getContentPane().add(companyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        getContentPane().add(passwordInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 200, 260, -1));
        getContentPane().add(usernameInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 150, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Function that is called from within an ActionListener which reacts to the
     * sign up button that is on the LandingScreen
     * @param evt takes an ActionEvent object
     */
    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // disposes complete of the LandinScreen
        this.dispose();
        // creates a new instance of the sign up screen
        SignUpScreen createAccountScreen = new SignUpScreen(kittenCreationDataBase);
        // sets window display onto the center of the screen
        createAccountScreen.setLocationRelativeTo(null);
        // makes the window visible on screen
        createAccountScreen.setVisible(true);
    }//GEN-LAST:event_signupButtonActionPerformed

    /**
     * Function that is called from within an ActionListener which reacts to the
     * log in button that is on the LandingScreen
     * @param evt takes an ActionEven object
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // the two function calls to usernameInputField and passwordInputField
        // retrieve the strings from within the text fields and stores them in
        // the variables
        String usernameEntered = usernameInputField.getText();
        String passwordEntered = passwordInputField.getText();
        
        // This block of code essentially checks to see if the usernameEntered on the log in
        // screen exists in the database. If the username doesn't exist in the database, then
        // the program returns a dialog that tells the user to check for correct log in credentials.
        // If the username does exist in the in the database, then the password entered in the login screen
        // is checked against the password stored in the database for the username, if they match the depending
        // on what the users account type is, they either log in into an inventory screen, or the marketplace. 
        // If the password does not match the password in the database set for the username, the same dialog
        // mentioned above is displayed on screen again.
        if(kittenCreationDataBase.search(usernameEntered)) {
            if(passwordEntered.equals(kittenCreationDataBase.retrieve(usernameEntered).getPassWord())) {
                if(kittenCreationDataBase.retrieve(usernameEntered).getClass() == Buyer.class) {
                    Session newSession = new Session(usernameEntered);
                    JOptionPane.showMessageDialog(null, "Welcome: " + usernameEntered, "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    MarketPlaceScreen buyersProductPage = new MarketPlaceScreen(kittenCreationDataBase, newSession);
                    buyersProductPage.setVisible(true);

                }
                else if(kittenCreationDataBase.retrieve(usernameEntered).getClass() == Seller.class) {
                    Session newSession = new Session(usernameEntered);
                    JOptionPane.showMessageDialog(null, "Welcome: " + usernameEntered, "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    InventoryScreen sellersInventory = new InventoryScreen(kittenCreationDataBase, newSession);
                    sellersInventory.setVisible(true);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Please verify that the username and password are correct", "Incorrect Login", JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please verify that the username and password are correct", "Incorrect Login", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed
    
    // My variable declaration(s) for JFrame
    private final AccountDataBase kittenCreationDataBase;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordInputField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameInputField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
