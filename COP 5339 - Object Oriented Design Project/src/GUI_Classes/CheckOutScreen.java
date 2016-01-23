package GUI_Classes;

import Kitten_Creation_Classes.AccountDataBase;
import Kitten_Creation_Classes.Buyer;
import Kitten_Creation_Classes.Product;
import Kitten_Creation_Classes.Seller;
import Kitten_Creation_Classes.Session;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CheckOutScreen extends javax.swing.JFrame {

    /**
     * Constructs a CheckOutScreen object
     * @param aDataBase an AccountDataBase object
     * @param currentSession a Session object
     */
    public CheckOutScreen(AccountDataBase aDataBase, Session currentSession) {
        initComponents();
        kittenCreationDataBase = aDataBase;
        this.currentSession = currentSession;
        currentUser = (Buyer)kittenCreationDataBase.retrieve(currentSession.getUserInSession());
        loadCartToScreen();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        completePurchaseButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        returnToMPButton = new javax.swing.JButton();
        updateQtyButton = new javax.swing.JButton();
        cartTotal = new javax.swing.JTextField();
        cartText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(774, 609));
        setSize(new java.awt.Dimension(774, 609));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checkOutCart.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 30, -1, 69));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 33)); // NOI18N
        jLabel2.setText("Checkout");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 45, -1, -1));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Price", "Seller", "Qty In Cart", "Qty To Add", "Remove/Add/Update"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.setColumnSelectionAllowed(true);
        cartTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(cartTable);
        cartTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (cartTable.getColumnModel().getColumnCount() > 0) {
            cartTable.getColumnModel().getColumn(0).setMinWidth(100);
            cartTable.getColumnModel().getColumn(0).setMaxWidth(100);
            cartTable.getColumnModel().getColumn(1).setMinWidth(90);
            cartTable.getColumnModel().getColumn(1).setMaxWidth(90);
            cartTable.getColumnModel().getColumn(2).setMinWidth(55);
            cartTable.getColumnModel().getColumn(2).setMaxWidth(55);
            cartTable.getColumnModel().getColumn(3).setMinWidth(90);
            cartTable.getColumnModel().getColumn(3).setMaxWidth(90);
            cartTable.getColumnModel().getColumn(4).setMinWidth(90);
            cartTable.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 111, 711, 364));

        completePurchaseButton.setText("Complete Purchase");
        completePurchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completePurchaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(completePurchaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 487, 150, -1));

        deleteButton.setText("Delete Items");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 487, 110, -1));

        returnToMPButton.setText("Return To Market Place");
        returnToMPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMPButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnToMPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 487, 170, -1));

        updateQtyButton.setText("Update Qty");
        updateQtyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateQtyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateQtyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 487, 100, -1));

        cartTotal.setEditable(false);
        cartTotal.setText("$0.00");
        getContentPane().add(cartTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 534, 80, -1));

        cartText.setText("Cart Total:");
        getContentPane().add(cartText, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the CheckOutScreen
     * @param evt takes an ActionEvent object
     */
    private void returnToMPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMPButtonActionPerformed
        this.dispose();
        MarketPlaceScreen buyersProductPage = new MarketPlaceScreen(kittenCreationDataBase, currentSession);
        buyersProductPage.setVisible(true);
    }//GEN-LAST:event_returnToMPButtonActionPerformed

     /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the CheckOutScreen
     * @param evt takes an ActionEvent object
     */
    private void completePurchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completePurchaseButtonActionPerformed
        // This essentially takes all the products in the shopping cart and calculates the total revenue
        // made from the sale, and it reflects the amount sold on the inventory of the seller. So if a seller 
        // had 100 items and the buyer got 20, the MArketPlace and inventory both show 80 items left.
        
        int i = 0;
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        
        if(cartTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No items in the cart!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(Product item : currentUser.getCart().getAllItems()) {
            Seller theSeller = (Seller)kittenCreationDataBase.retrieve((String)theCartTable.getValueAt(i, 3));
            String productID = (String)theCartTable.getValueAt(i, 1);
            Product product = theSeller.getInventory().getProductInstance(productID);
            double revenueMade = item.getQuantity() * item.getSellingPrice();
            theSeller.calculateRevenue(revenueMade);
            product.setQuantity(product.getQuantity() - item.getQuantity());
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "Thank you for your transaction!", "Success", JOptionPane.INFORMATION_MESSAGE);
        deleteAllItemsFromCart();
        loadCartTotal();
    }//GEN-LAST:event_completePurchaseButtonActionPerformed

     /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the CheckOutScreen
     * @param evt takes an ActionEvent object
     */
    private void updateQtyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateQtyButtonActionPerformed
        // Refer to the MarketPlaceScreen addToCart function, very similar behavior
        
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        Seller theSeller; String productID; Product itemPurchased; Integer quantitySold;
        Product productToAdd; Product itemInCart = null; int itemLimit;
        
         if(cartTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no items", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(int i = 0; i < cartTable.getRowCount(); i++) {
            boolean isChecked = (boolean)cartTable.getValueAt(i, 6);
            if(isChecked) {
                break;
            }
            else if(i == cartTable.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "No items are selected in the cart", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
         for(int i = 0; i < cartTable.getRowCount(); i++) {
            boolean isChecked = (boolean)cartTable.getValueAt(i, 6);
            
            if(isChecked) {
                theSeller = (Seller)kittenCreationDataBase.retrieve((String)theCartTable.getValueAt(i, 3));
                productID = (String)theCartTable.getValueAt(i, 1);
                itemPurchased = theSeller.getInventory().getProductInstance(productID);
                quantitySold = (Integer)theCartTable.getValueAt(i, 5);
                itemLimit = itemStockCount.get(i);
                
                if(quantitySold > itemPurchased.getQuantity()) {
                    JOptionPane.showMessageDialog(null, "Cannot purchase more than whats in stock.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                if(quantitySold > itemLimit) {
                    JOptionPane.showMessageDialog(null, "Cannot purchase more than whats in stock.", "Error", JOptionPane.WARNING_MESSAGE);
                    
                     if(itemLimit == 0) {
                        JOptionPane.showMessageDialog(null, "Purchase limit has been reached for this item.", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                    return;
                }
                
                if(quantitySold <= 0) {
                    if(quantitySold == 0)
                        JOptionPane.showMessageDialog(null, "You have no specified a quantity", "Error", JOptionPane.WARNING_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "You cannot purchase negative amounts", "Error", JOptionPane.WARNING_MESSAGE);
                    
                    return;
                }
                
                if(currentUser.getCart().search(productID)) {
                    itemInCart = currentUser.getCart().getProductInstance(productID);
                    itemInCart.setQuantity(itemInCart.getQuantity() + quantitySold);
                    itemLimit -= quantitySold;
                }
                
                itemStockCount.set(i, itemLimit);
                theCartTable.setValueAt(itemInCart.getQuantity(), i, 4);
                theCartTable.setValueAt(0, i, 5);
                JOptionPane.showMessageDialog(null, "Quantity added!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
         
         loadCartTotal();
    }//GEN-LAST:event_updateQtyButtonActionPerformed

     /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the CheckOutScreen
     * @param evt takes an ActionEvent object
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // removes all the seleceted items from the cart
        
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel(); 
        
        for(int i = 0; i < cartTable.getRowCount(); i++) {
            boolean isChecked = (boolean)cartTable.getValueAt(i, 6);
            if(isChecked) {
                break;
            }
            else if(i == cartTable.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "No items are selected to remove", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        for(int i = 0; i < cartTable.getRowCount(); i++) {
            boolean isChecked = (boolean)cartTable.getValueAt(i, 6);

            if(isChecked) {
                String productID = (String)theCartTable.getValueAt(i, 1);
                currentUser.getCart().remove(productID);
                theCartTable.removeRow(i);
                i--;                
            }
        }
        
        loadCartTotal();
    }//GEN-LAST:event_deleteButtonActionPerformed

     /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the CheckOutScreen
     * @param evt takes an ActionEvent object
     */
    private void loadCartToScreen() {
        // loads the users cart onto the screen
        
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        ArrayList<Product> shoppingCart = currentUser.getCart().getAllItems();
        for(Product item : shoppingCart) {
            theCartTable.addRow(new Object[]{item.getName(), item.getID(), item.getSellingPrice(), item.getSeller(), 
                                             item.getQuantity(), 0, false});
        }
            
        loadCartTotal();
        itemStockCount = new ArrayList<>();
        for(int i = 0; i < cartTable.getRowCount(); i++) {
            String seller = (String)theCartTable.getValueAt(i, 3);
            Seller theSeller = (Seller)kittenCreationDataBase.retrieve(seller);
            String productID = (String)theCartTable.getValueAt(i, 1);
            Product theItem = theSeller.getInventory().getProductInstance(productID);
            int quantityLeft = theItem.getQuantity() - (Integer)theCartTable.getValueAt(i, 4);
            itemStockCount.add(quantityLeft);
        }
    }
    
    /**
     * resets all check boxes on the screen
     */
    private void resetCheckBoxes() {
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        for(int i = 0; i < theCartTable.getRowCount(); i++) {
            theCartTable.setValueAt(false, i, 6);
        }
    }
    
    /**
     * Calculates the cart total
     */
    private void loadCartTotal() {
        DecimalFormat df = new DecimalFormat("#.##");
        cartTotal.setText("$" + df.format(currentUser.getCart().calculateCartTotal()));
    }
    
    /**
     * this function removes all items from the shopping cart.
     * it is used with in the completePurchase Action event
     */
    private void deleteAllItemsFromCart() {
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        currentUser.getCart().clear();
        while(!(cartTable.getRowCount() == 0))
            theCartTable.removeRow(0);
    }
    
    // My variable declaration(s) for the jframe
    private final AccountDataBase kittenCreationDataBase;
    private final Session currentSession;
    private final Buyer currentUser;
    private ArrayList<Integer> itemStockCount;
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel cartText;
    private javax.swing.JTextField cartTotal;
    private javax.swing.JButton completePurchaseButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnToMPButton;
    private javax.swing.JButton updateQtyButton;
    // End of variables declaration//GEN-END:variables
}
