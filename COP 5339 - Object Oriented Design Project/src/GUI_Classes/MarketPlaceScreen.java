package GUI_Classes;

import Kitten_Creation_Classes.AccountDataBase;
import Kitten_Creation_Classes.Buyer;
import Kitten_Creation_Classes.Product;
import Kitten_Creation_Classes.Seller;
import Kitten_Creation_Classes.Session;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MarketPlaceScreen extends javax.swing.JFrame 
{
    /**
     * 
     * @param aDataBase
     * @param currentSession 
     */
    public MarketPlaceScreen(AccountDataBase aDataBase, Session currentSession) {
        initComponents();
        kittenCreationDataBase = aDataBase;
        this.currentSession = currentSession;
        currentUser = (Buyer)kittenCreationDataBase.retrieve(currentSession.getUserInSession());
        this.loadInventoryFromAllSellers();
        this.loadCartTotal();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        screenTitle = new javax.swing.JLabel();
        productsScrollPane = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        cartTotal = new javax.swing.JTextField();
        cartText = new javax.swing.JLabel();
        accountButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        screenTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 33)); // NOI18N
        screenTitle.setText("The Marketplace");

        productTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2) {
                    JTable target = (JTable)e.getSource();
                    int row = target.getSelectedRow();
                    int column = target.getSelectedColumn();
                    Seller theSeller = (Seller)kittenCreationDataBase.retrieve(productTable.getValueAt(productTable.getSelectedRow(), 5).toString());
                    String productId = (productTable.getValueAt(productTable.getSelectedRow(), 1).toString());
                    String description = theSeller.getInventory().getProductInstance(productId).getProductDescription();
                    ProductPopUp itemDescriptionPopUp = new ProductPopUp(description);
                    itemDescriptionPopUp.setVisible(true);
                }
            }
        });
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Product ID", "Price", "Amt In Stock", "Qty To Buy", "Seller", "Purchase?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setAutoscrolls(false);
        productTable.setSelectionBackground(new java.awt.Color(0, 153, 204));
        productTable.getTableHeader().setReorderingAllowed(false);
        productsScrollPane.setViewportView(productTable);

        cartTotal.setEditable(false);
        cartTotal.setText("$0.00");

        cartText.setText("Cart Total:");

        accountButton.setText("Account");
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Log out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add To Cart");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shoppingBasket.png"))); // NOI18N

        clearButton.setText("Clear Cart");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        checkOutButton.setText("View Cart");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(488, 488, 488)
                            .addComponent(cartText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cartTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(productsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(screenTitle)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(screenTitle))
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addComponent(productsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addButton)
                        .addComponent(clearButton)
                        .addComponent(checkOutButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartText))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the MarketPlaceScreen
     * @param evt takes an ActionEvent object
     */
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        LandingScreen backToLoginScreen = new LandingScreen(kittenCreationDataBase);
        backToLoginScreen.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    /**
     * Function that is called from within an ActionListener which reacts to the
     * accountButton that is on the MarketPlaceScreen
     * @param evt takes an ActionEvent object
     */
    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        this.dispose();
        BuyerAccountScreen buyersAccount = new BuyerAccountScreen(kittenCreationDataBase, currentSession);
        buyersAccount.setVisible(true);
    }//GEN-LAST:event_accountButtonActionPerformed

    /**
     * Function that is called from within an ActionListener which reacts to the
     * addButton that is on the MarketPlaceScreen
     * @param evt takes an ActionEvent object
     */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // This action adds items from the MarketPlace into the Buyers Cart
        // This first checks to see if the following conditions are met: 
        // Are there any items in the MarketPlace, and are there any rows selected
        // via the checkboxes? If both of these conditions fail then a warning is issued
        // and actions are prevented from continuing. If thats no the case, then the program 
        // checks each row and looks for checked boxes. At the instance the checkboxes are found
        // the following actions occur in the program:
        
        // The seller of the product is retrieved from the database, the Product ID is grabbed from the JTable,
        // the item is fetched from the Sellers inventory via the product ID, the quantity that is going to be
        // purchased is grabbed from the JTable, an array which contains the current limit in stock for each item
        // is referenced to see if the user is able to buy the amount of product that is specified. If the quantity is
        // greater than what is in stock then the program issues a warning, in the instance that the product stock has 
        // reached zero, the program also issues another warning on the screen. If the user for some reason attempts to
        // buy negative quantities (yes idiots like that exist), another warning is issued. Any warnings issued prevent
        // the action from continuing any further.
        
        // if all conditions for a successful purchase are satisfied, then the item is added to the cart.
        // If the item is already in the cart and the user simply wanted to add more quantity. The item in the cart
        // is referenced and the quantity attribute of the product is simply changed. At this point, the referenced array
        // we are using to keep track of the number of stock is reduced in respect to the proper number. 
        
        // at the end the cart total is always recalcuated after purchase.
        
        DefaultTableModel theProductTable = (DefaultTableModel) productTable.getModel();
        Seller theSeller; String productID; Product itemPurchased; Integer quantitySold;
        Product productToAdd; Product itemInCart; int itemLimit;
        
        if(productTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no items to purchase", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(int i = 0; i < productTable.getRowCount(); i++) {
            boolean isChecked = (boolean)productTable.getValueAt(i, 6);
            if(isChecked) {
                break;
            }
            else if(i == productTable.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "No items are selected for purchase", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        for(int i = 0; i < productTable.getRowCount(); i++) {
            boolean isChecked = (boolean)productTable.getValueAt(i, 6);
            
            if(isChecked) {
                theSeller = (Seller)kittenCreationDataBase.retrieve((String)theProductTable.getValueAt(i, 5));
                productID = (String)theProductTable.getValueAt(i, 1);
                itemPurchased = theSeller.getInventory().getProductInstance(productID);
                quantitySold = (Integer)theProductTable.getValueAt(i, 4);
                itemLimit = itemStockCountForMarketPlace.get(i);
                
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
                else {
                   productToAdd = new Product(itemPurchased);
                   productToAdd.setQuantity(quantitySold);
                   currentUser.getCart().add(productToAdd);
                   itemLimit -= quantitySold;
                }
                
                itemStockCountForMarketPlace.set(i, itemLimit);
                theProductTable.setValueAt(0, i, 4);
            }
        }
        
        DecimalFormat df = new DecimalFormat("#.##");
        cartTotal.setText("$" + df.format(currentUser.getCart().calculateCartTotal()));
        resetCheckBoxes();
        
        JOptionPane.showMessageDialog(null, "Items added to Cart!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println(currentUser);
    }//GEN-LAST:event_addButtonActionPerformed

    /**
     * Function that is called from within an ActionListener which reacts to the
     * clearButton that is on the MarketPlaceScreen
     * @param evt takes an ActionEvent object
     */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // this simply clears the users cart, recalculates the cart total (which is always
        // zeroed out) and takes our reference array for stock count and replenishes the original quantities
        // displayed in the jtable
        currentUser.getCart().clear();
        DecimalFormat df = new DecimalFormat("#.##");
        cartTotal.setText("$" + df.format(currentUser.getCart().calculateCartTotal()));
        resetCheckBoxes();
        
        itemStockCountForMarketPlace.clear();
        ArrayList<Seller> sellerList = kittenCreationDataBase.getAllSellers();
        ArrayList<Product> allItems = null;
        
        // adds back original stock quantites to array
        for(Seller seller : sellerList) {
            allItems = seller.getInventory().getAllItems();
            for(Product item : allItems) {
                itemStockCountForMarketPlace.add(item.getQuantity());
            }
        }
    }//GEN-LAST:event_clearButtonActionPerformed

    /**
     * Function that is called from within an ActionListener which reacts to the
     * checkOutButton that is on the MarketPlaceScreen
     * @param evt takes an ActionEvent object
     */
    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        this.dispose();
        CheckOutScreen theCheckOutScreen = new CheckOutScreen(kittenCreationDataBase, currentSession);
        theCheckOutScreen.setVisible(true);
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void loadInventoryFromAllSellers() {
        // this one is essentially pretty self explanatory. Each seller in the database and their
        // inventory is access and uploaded t othe jtable.
        DefaultTableModel theProductTable = (DefaultTableModel) productTable.getModel();
        ArrayList<Seller> sellerList = kittenCreationDataBase.getAllSellers();
        ArrayList<Product> allItems = null; 
        itemStockCountForMarketPlace = new ArrayList<>();
        
        for(Seller seller : sellerList) {
            allItems = seller.getInventory().getAllItems();
            for(Product item : allItems) {
                theProductTable.addRow(new Object[]{item.getName(), item.getID(), item.getSellingPrice(), item.getQuantity(), 
                                                    0, seller.getUserName(), false});
                
                itemStockCountForMarketPlace.add(item.getQuantity());
            }
        }
        
        replaceItemStockCount();
    }
    
    /**
     * Resets all the check boxes on the JTable
     */
    private void resetCheckBoxes() {
        DefaultTableModel theProductTable = (DefaultTableModel) productTable.getModel();
        for(int i = 0; i < productTable.getRowCount(); i++) {
            theProductTable.setValueAt(false, i, 6);
        }
    }
  
    /**
     * Recalculates the total of all items in the cart
     */
    private void loadCartTotal() {
        DecimalFormat df = new DecimalFormat("#.##");
        cartTotal.setText("$" + df.format(currentUser.getCart().calculateCartTotal()));
    }
    
    /**
     * This is used to properly set up our reference array for the stock count for each product in the 
     * MarketPlace. The cart is used as a reference to deduce the amount of items that can be allocated in
     * the buyers shopping cart. The reference array and this function exists as a way of preventing a user
     * from leaving the screen and entering more quantities than exist in the marketplace for a specific item
     */
    private void replaceItemStockCount() {
        DefaultTableModel theProductTable = (DefaultTableModel) productTable.getModel();
        for(int i = 0; i < productTable.getRowCount(); i++) {
            String seller = (String)theProductTable.getValueAt(i, 5);
            Seller theSeller = (Seller)kittenCreationDataBase.retrieve(seller);
            int quantity = (Integer)theProductTable.getValueAt(i, 3);
            String productID = (String)theProductTable.getValueAt(i, 1);
            
            if(currentUser.getCart().search(productID)) { 
                itemStockCountForMarketPlace.set(i, quantity - 
                                                currentUser.getCart().getProduct(productID).getQuantity());
            }
            else {
                itemStockCountForMarketPlace.set(i, quantity);
            }
        }
    }
    
   // My variable declaration(s) for JFrame
    private final AccountDataBase kittenCreationDataBase;
    private final Session currentSession;
    private final Buyer currentUser;
    ArrayList<Integer> itemStockCountForMarketPlace;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel cartText;
    private javax.swing.JTextField cartTotal;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTable productTable;
    private javax.swing.JScrollPane productsScrollPane;
    private javax.swing.JLabel screenTitle;
    // End of variables declaration//GEN-END:variables
}
