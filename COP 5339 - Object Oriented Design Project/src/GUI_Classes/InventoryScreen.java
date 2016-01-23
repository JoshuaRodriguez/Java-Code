package GUI_Classes;

import Kitten_Creation_Classes.AccountDataBase;
import Kitten_Creation_Classes.Inventory;
import Kitten_Creation_Classes.Product;
import Kitten_Creation_Classes.Seller;
import Kitten_Creation_Classes.Session;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InventoryScreen extends javax.swing.JFrame 
{
    /**
     * Construct an InventoryScreen object
     * @param aDataBase an AccountDataBase object
     * @param currentSession a Session object
     */
    public InventoryScreen(AccountDataBase aDataBase, Session currentSession) {
        initComponents();
        kittenCreationDataBase = aDataBase;
        this.currentSession = currentSession;
        currentUser = (Seller)kittenCreationDataBase.retrieve(currentSession.getUserInSession());
        this.loadInventory();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * Loads all components onto the JFrame
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tProductName = new javax.swing.JTextField();
        tProductID = new javax.swing.JTextField();
        tProductType = new javax.swing.JTextField();
        tQuantity = new javax.swing.JTextField();
        tInvoicePrice = new javax.swing.JTextField();
        tSellingPrice = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateItemsButton = new javax.swing.JButton();
        inventoryScrollPane = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tProductDescription = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(823, 690));
        setPreferredSize(new java.awt.Dimension(823, 690));
        setResizable(false);
        setSize(new java.awt.Dimension(823, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountButton.setText("Account");
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });
        getContentPane().add(accountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, 80, -1));

        logoutButton.setText("Log out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 610, 80, -1));

        pageLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 33)); // NOI18N
        pageLabel.setText("Inventory");
        getContentPane().add(pageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, 50));

        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 103, -1, 20));

        jLabel3.setText("Product ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 103, -1, 20));

        jLabel4.setText("Product Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 183, -1, -1));

        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 140, -1, 20));

        jLabel6.setText("Invoice Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 140, -1, 20));

        jLabel7.setText("Selling Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 183, -1, -1));
        getContentPane().add(tProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 100, 243, -1));
        getContentPane().add(tProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 100, 243, -1));
        getContentPane().add(tProductType, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 180, 243, -1));
        getContentPane().add(tQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 140, 243, -1));
        getContentPane().add(tInvoicePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 140, 243, -1));
        getContentPane().add(tSellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 178, 243, -1));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 70, -1));

        updateItemsButton.setText("Update Items");
        updateItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateItemsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 110, -1));

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Product Type", "Quantity", "Invoice Price", "Selling Price", "Quantity To Buy", "Remove/Update/Buy More"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryTable.setColumnSelectionAllowed(true);
        inventoryTable.getTableHeader().setReorderingAllowed(false);
        inventoryScrollPane.setViewportView(inventoryTable);
        inventoryTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (inventoryTable.getColumnModel().getColumnCount() > 0) {
            inventoryTable.getColumnModel().getColumn(0).setMinWidth(94);
            inventoryTable.getColumnModel().getColumn(0).setMaxWidth(94);
            inventoryTable.getColumnModel().getColumn(1).setMinWidth(70);
            inventoryTable.getColumnModel().getColumn(1).setMaxWidth(70);
            inventoryTable.getColumnModel().getColumn(2).setMinWidth(90);
            inventoryTable.getColumnModel().getColumn(2).setMaxWidth(90);
            inventoryTable.getColumnModel().getColumn(3).setMinWidth(60);
            inventoryTable.getColumnModel().getColumn(3).setMaxWidth(60);
            inventoryTable.getColumnModel().getColumn(4).setMinWidth(82);
            inventoryTable.getColumnModel().getColumn(4).setMaxWidth(82);
            inventoryTable.getColumnModel().getColumn(5).setMinWidth(81);
            inventoryTable.getColumnModel().getColumn(5).setMaxWidth(81);
            inventoryTable.getColumnModel().getColumn(6).setMinWidth(108);
            inventoryTable.getColumnModel().getColumn(6).setMaxWidth(108);
            inventoryTable.getColumnModel().getColumn(7).setMinWidth(170);
            inventoryTable.getColumnModel().getColumn(7).setMaxWidth(170);
        }

        getContentPane().add(inventoryScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 250, 760, 330));

        deleteButton.setText("Delete Items");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 110, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 80, 50));

        buyButton.setText("Buy More");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(buyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 90, -1));

        jLabel1.setText("Product Detail");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(tProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 216, 662, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the InventoryScreeen
     * @param evt takes an ActionEvent object
     */
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        LandingScreen backToLoginScreen = new LandingScreen(kittenCreationDataBase);
        backToLoginScreen.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

     /**
     * Function that is called from within an ActionListener which reacts to the
     * accountButton that is on the InventoryScreeen
     * @param evt takes an ActionEvent object
     */
    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        this.dispose();
        SellerAccountScreen sellersAccount = new SellerAccountScreen(kittenCreationDataBase, currentSession);
        sellersAccount.setVisible(true);
    }//GEN-LAST:event_accountButtonActionPerformed

     /**
     * Function that is called from within an ActionListener which reacts to the
     * addButton that is on the InventoryScreeen
     * @param evt takes an ActionEvent object
     */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // The following if statements essentially check for empty fields in the textfields
        // Once the fields are all completely filled, the program then grabs the texts in the fields
        // and creates a new row onto the JTable that is display on the screen. The remaining code in the 
        // action event takes the texts in the field and calls the Product constructor and stores the item into
        // the sellers inventory. The textfields then are reset back to empty on the screen
        
        if(tProductName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Product Name Field Cannot Be Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(tProductID.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Product ID Field Cannot Be Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(tQuantity.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Quantity Field Cannot Be Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(tInvoicePrice.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Invoice Price Field Cannot Be Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(tSellingPrice.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Selling Price Field Cannot Be Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(tProductType.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Product Type Field Cannot Be Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(tProductType.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Product Type Field Cannot Be Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(tProductDescription.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Product Type Field Cannot Be Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Add new product to the table
        DefaultTableModel theInventoryTable = (DefaultTableModel) inventoryTable.getModel();
        theInventoryTable.addRow(new Object[]{tProductName.getText(), tProductID.getText(), tProductType.getText(), 
                                              Integer.parseInt(tQuantity.getText()), Double.parseDouble(tInvoicePrice.getText()), 
                                              Double.parseDouble(tSellingPrice.getText()), 0, false});
        
        // Store new product added into the users inventory
        Inventory userInventory = currentUser.getInventory();
        userInventory.add(new Product(tProductName.getText(), tProductID.getText(), tProductType.getText(), 
                                      Integer.parseInt(tQuantity.getText()), Double.parseDouble(tInvoicePrice.getText()), 
                                      Double.parseDouble(tSellingPrice.getText()), currentUser.getUserName(), 
                                      tProductDescription.getText()));
        
        // Reset fields back to empty
        tProductName.setText("");  tProductID.setText("");     tProductType.setText(""); 
        tQuantity.setText("");     tInvoicePrice.setText("");  tSellingPrice.setText("");
        tProductDescription.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

     /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the InventoryScreeen
     * @param evt takes an ActionEvent object
     */
    private void updateItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemsButtonActionPerformed
        
        // The action performed within this function is the following: Here we have the intention of updating
        // any selected objects. The first thing we do is grab the Sellers inventory, and then we grab all
        // the items that is in the inventory and store it into an ArrayList. There is a check to see if there are
        // any items in the inventory, or if any items are checked at all. Once the two conditions are passed (items
        // exist in the table, and there are checked boxes) there is a for loop that runs through the column on the JTable
        // that contains all the check boxes. This for loop checks to see what boxes are checked. In the instance it finds a checked
        // box, it updates the selected product in inventory with the new edited information.
        
        //If the user attempts to change the quantity of a product and its greater than what is already in stock, a warning is issued
        // and the user is asked to buy more stock for the product. This is accomplished by checking the buy more boxes for a 
        // particular item and entering some quantity
        
        DefaultTableModel theInventoryTable = (DefaultTableModel) inventoryTable.getModel();
        String productID; Product productToEdit; Inventory userInventory = currentUser.getInventory(); 
        ArrayList<Product> allItems = currentUser.getInventory().getAllItems();
        
        if(inventoryTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no items in the inventory to update", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(int i = 0; i < inventoryTable.getRowCount(); i++) {
            boolean isChecked = (boolean)inventoryTable.getValueAt(i, 7);
            if(isChecked) {
                break;
            }
            else if(i == inventoryTable.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "No items are selected to update", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        
        for(int i = 0; i < inventoryTable.getRowCount(); i++) {
            boolean isChecked = (boolean)inventoryTable.getValueAt(i, 7);
           
            if(isChecked) {
                productID = allItems.get(i).getID();
                productToEdit = userInventory.getProductInstance(productID);
                
                if((Integer)theInventoryTable.getValueAt(i, 3) > productToEdit.getQuantity()) {
                    JOptionPane.showMessageDialog(null, "Cannot change quantity greater than whats in stock, please buy some more stock", 
                                                        "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }   
                productToEdit.setName((String)theInventoryTable.getValueAt(i, 0));
                productToEdit.setID((String)theInventoryTable.getValueAt(i, 1));
                productToEdit.setType((String)theInventoryTable.getValueAt(i, 2));
                productToEdit.setQuantity((Integer)theInventoryTable.getValueAt(i, 3));
                productToEdit.setInvoicePrice((Double)theInventoryTable.getValueAt(i, 4));
                productToEdit.setSellingPrice((Double)theInventoryTable.getValueAt(i, 5));
            }
        }

        JOptionPane.showMessageDialog(null, "Selected Items Have Been Updated", "Successfully Update", JOptionPane.INFORMATION_MESSAGE);
        resetCheckBoxes();
    }//GEN-LAST:event_updateItemsButtonActionPerformed

     /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the InventoryScreeen
     * @param evt takes an ActionEvent object
     */
    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // This first performs checks to see if there are any items in inventory, then its check to see if there
        // are any items that are checked. If there are no items checked then the program issues a warning that there 
        // are no items selected. Once the conditions are passed, the program does a similar repeat of the update action
        // event. The column containing the check boxes are checked in a for loop. If a box is checked in the particular instance
        // it is found to be check we issue the following happens: the quantity to buy is picked up from the table, as well as the 
        // invoice price. The quantity and invoice price of the particular product are mutlipled to give a total spending. 
        
        // The total from the result is added to the life time inventory costs of the seller, and the product in the sellers
        // inventory is updated with the new quantity. The checked boxes are then reset after all this is completed.
        
        DefaultTableModel theInventoryTable = (DefaultTableModel) inventoryTable.getModel();
        int quantityToBuy;  double invoicePrice; double totalCost; Product theProduct;
        
        if(inventoryTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no items in the inventory!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(int i = 0; i < inventoryTable.getRowCount(); i++) {
            boolean isChecked = (boolean)inventoryTable.getValueAt(i, 7);
            if(isChecked) {
                break;
            }
            else if(i == inventoryTable.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "No items are selected", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        for(int i = 0; i < inventoryTable.getRowCount(); i++) {
            boolean isChecked = (boolean)inventoryTable.getValueAt(i, 7);
           
            if(isChecked) {
                quantityToBuy = (Integer)theInventoryTable.getValueAt(i, 6);
                invoicePrice = (Double)theInventoryTable.getValueAt(i, 4);
                totalCost = quantityToBuy * invoicePrice;
                currentUser.getInventory().addToLifeTimeInventoryCosts(totalCost);
                theProduct = currentUser.getInventory().getProductInstance((String)theInventoryTable.getValueAt(i, 1));
                theProduct.setQuantity(theProduct.getQuantity() + quantityToBuy);
                theInventoryTable.setValueAt(theProduct.getQuantity(), i, 3);
                theInventoryTable.setValueAt(0, i, 6);
            }
        }
        
        System.out.println(currentUser);
        
        resetCheckBoxes();
    }//GEN-LAST:event_buyButtonActionPerformed

     /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the InventoryScreeen
     * @param evt takes an ActionEvent object
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // To keep things simple most of the same check with the boxes are repeated, and at each instance
        // a check box is found the item is simply removed from the table and from the Sellers inventory
        DefaultTableModel theInventoryTable = (DefaultTableModel) inventoryTable.getModel();
        String productID; Inventory userInventory = currentUser.getInventory();

        if(inventoryTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no items in inventory to remove", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for(int i = 0; i < inventoryTable.getRowCount(); i++) {
            boolean isChecked = (boolean)inventoryTable.getValueAt(i, 7);
            if(isChecked) {
                break;
            }
            else if(i == inventoryTable.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "No items are selected to remove", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        for(int i = 0; i < inventoryTable.getRowCount(); i++) {
            boolean isChecked = (boolean)inventoryTable.getValueAt(i, 7);

            if(isChecked) {
                productID = (String)theInventoryTable.getValueAt(i, 1);
                userInventory.remove(productID);
                theInventoryTable.removeRow(i);
                i--;
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * Loads the Sellers inventory onto the JTable in the Inventory Screen
     */
    private void loadInventory() {
        DefaultTableModel theInventoryTable = (DefaultTableModel) inventoryTable.getModel();
        ArrayList<Product> allItems = currentUser.getInventory().getAllItems();
        
        // adds rows to the JTable on the screen using the attributes of the Product objects from the Sellers
        // inventory
        for(Product item : allItems) {
            theInventoryTable.addRow(new Object[]{item.getName(), item.getID(), item.getType(), item.getQuantity(),
                                                  item.getInvoicePrice(), item.getSellingPrice(), 0, false});
        }
    }
    
    /**
     * This function resets all the checks boxes on the JTable.
     */
    private void resetCheckBoxes() {
        DefaultTableModel theInventoryTable = (DefaultTableModel) inventoryTable.getModel();
        for(int i = 0; i < inventoryTable.getRowCount(); i++) {
            theInventoryTable.setValueAt(false, i, 7);
        }
    }
   
    // My variable declaration(s) for JFrame
    private final AccountDataBase kittenCreationDataBase;
    private final Seller currentUser;
    private final Session currentSession;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton buyButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane inventoryScrollPane;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JTextField tInvoicePrice;
    private javax.swing.JTextField tProductDescription;
    private javax.swing.JTextField tProductID;
    private javax.swing.JTextField tProductName;
    private javax.swing.JTextField tProductType;
    private javax.swing.JTextField tQuantity;
    private javax.swing.JTextField tSellingPrice;
    private javax.swing.JButton updateItemsButton;
    // End of variables declaration//GEN-END:variables
}
