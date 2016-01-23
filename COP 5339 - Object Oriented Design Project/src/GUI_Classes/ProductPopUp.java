package GUI_Classes;

public class ProductPopUp extends javax.swing.JFrame 
{

    /**
     * Constructs a ProductPopUp object
     * @param itemDescription takes in a String object (which describes the object to be shown)
     */
    public ProductPopUp(String itemDescription) {
        initComponents();
        itemDescrip = itemDescription;
        loadItemDescription();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        itemDescriptionTextArea.setEditable(false);
    }

    /**
     * Loads all components onto the JFrame(ProductPopUp Screen)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        screenTitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemDescriptionTextArea = new javax.swing.JTextArea();
        aboutItemLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        screenTitleLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        screenTitleLabel.setText("Product Description");

        itemDescriptionTextArea.setEditable(false);
        itemDescriptionTextArea.setColumns(20);
        itemDescriptionTextArea.setLineWrap(true);
        itemDescriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(itemDescriptionTextArea);

        aboutItemLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        aboutItemLabel.setText("About The Item");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(screenTitleLabel))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aboutItemLabel)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(screenTitleLabel)
                .addGap(27, 27, 27)
                .addComponent(aboutItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /**
     * Function that is called from within an ActionListener which reacts to the
     * exit button that is on the ProductPopUp
     * @param evt takes an ActionEvent object
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * Loads the item description into the text area in the ProductPopUp screen
     */
    public void loadItemDescription() {
        itemDescriptionTextArea.setText(itemDescrip);
    }
    
    // My Variables Declared For The JFrame
    private final String itemDescrip;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutItemLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextArea itemDescriptionTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel screenTitleLabel;
    // End of variables declaration//GEN-END:variables
}
