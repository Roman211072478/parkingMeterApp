/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterapp.com.app;

import com.parking.meter.calculations.CalculateHours;
import com.parking.meter.calculations.CalculateValueOfDenominators;
import com.parking.meter.logic.AmountPayable;
import com.parking.meter.models.Denominators;
import com.parking.meter.view.builder.components.DateComponent;
import java.awt.FlowLayout;
import javax.swing.JSpinner;
import parkingmeterapp.com.app.components.OutputBuilder;


/**
 *
 * @author Rafiq
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    //Custom variables
    private JSpinner entryTimeDateSpinner;
    private JSpinner exitTimeDateSpinner;
    private long hours;
    private double amount = 0.00;
    private Denominators denominators;
    private Denominators changesObject;
    private double amountEntered = 0.00;
    private CalculateValueOfDenominators calculateDenominator;
    private String yourChanges;
    private String txtTime,txtEnterAmount,txtChange,txtDenominators = "";
    private OutputBuilder outputBuilder;
    
    public MainFrame() {
        initComponents();
        CustomizedInitialize();
    }

    private void CustomizedInitialize() {
        
        createLeftPanels();
     
        
    }
    private void setDenominatorMainObject()
    {
        this.denominators = Denominators.builder()
                .fifthCent(0)
                .fiftyRand(0)
                .fiveRand(0)
                .oneHunderdRand(0)
                .tenRand(0)
                .twoRand(0)
                .twoHunderdRand(0)
                .tenCent(0)
                .twentyCent(0)
                .twentyRand(0)
                .oneRand(0)
                .build();
    }
    private void createLeftPanels()
    {
         this.entryTimeDateSpinner = DateComponent.create();
         
        this.entryTimePanel.setLayout(new FlowLayout());
        this.entryTimePanel.add(this.entryTimeDateSpinner);
        
        this.exitTimeDateSpinner = DateComponent.create();
       
        this.exitTimePanel.setLayout(new FlowLayout());
        this.exitTimePanel.add(this.exitTimeDateSpinner);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entryTimePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitTimePanel = new javax.swing.JPanel();
        calcPaymentBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputReceipts = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        lbAmountToPay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entryTimePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Entry Time", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DejaVu Sans", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        entryTimePanel.setName("pEntry"); // NOI18N

        javax.swing.GroupLayout entryTimePanelLayout = new javax.swing.GroupLayout(entryTimePanel);
        entryTimePanel.setLayout(entryTimePanelLayout);
        entryTimePanelLayout.setHorizontalGroup(
            entryTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );
        entryTimePanelLayout.setVerticalGroup(
            entryTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Parking Meter Application");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        exitTimePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Exit Time", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DejaVu Sans", 0, 12))); // NOI18N

        javax.swing.GroupLayout exitTimePanelLayout = new javax.swing.GroupLayout(exitTimePanel);
        exitTimePanel.setLayout(exitTimePanelLayout);
        exitTimePanelLayout.setHorizontalGroup(
            exitTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );
        exitTimePanelLayout.setVerticalGroup(
            exitTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        calcPaymentBtn.setText("Calculate Payment");
        calcPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcPaymentBtnActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "How Are you paying?", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DejaVu Sans", 0, 12))); // NOI18N

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel3.setText("R0.10");

        jLabel4.setText("R0.20");

        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jLabel5.setText("R0.50");

        jLabel6.setText("R1.00");

        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });

        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });

        jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner6StateChanged(evt);
            }
        });

        jSpinner7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner7StateChanged(evt);
            }
        });

        jSpinner8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner8StateChanged(evt);
            }
        });

        jSpinner9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner9StateChanged(evt);
            }
        });

        jSpinner10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner10StateChanged(evt);
            }
        });

        jLabel7.setText("R2.00");

        jLabel8.setText("R5.00");

        jLabel9.setText("R10.00");

        jLabel10.setText("R20.00");

        jLabel11.setText("R50.00");

        jLabel12.setText("R100.00");

        jLabel13.setText("R200.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jSpinner10)
                    .addComponent(jSpinner9)
                    .addComponent(jSpinner8)
                    .addComponent(jSpinner7)
                    .addComponent(jSpinner6)
                    .addComponent(jSpinner1)
                    .addComponent(jSpinner2)
                    .addComponent(jSpinner3)
                    .addComponent(jSpinner4)
                    .addComponent(jSpinner5))
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        outputReceipts.setColumns(20);
        outputReceipts.setRows(5);
        jScrollPane1.setViewportView(outputReceipts);

        jButton2.setText("Pay");

        lbAmountToPay.setEditable(false);
        lbAmountToPay.setText("R 0.00");

        jLabel2.setText("Amount to pay:");

        jButton3.setText("Reset");

        jButton4.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(entryTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcPaymentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAmountToPay))
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entryTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(exitTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(calcPaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAmountToPay)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcPaymentBtnActionPerformed
        
        this.outputReceipts.setText("");
        this.outputBuilder = new OutputBuilder();
        
        
        //Calculate hour much hours
        this.hours = CalculateHours.Calculate(entryTimeDateSpinner, exitTimeDateSpinner);
        this.outputBuilder.setHours((int)hours);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
     
        //Calculate the amount payable by using the logic in the jar file
         amount =(double) AmountPayable.AmountToBePaid(hours);
         //this.outputBuilder.set
         
        //Set text to show amount payable
        this.lbAmountToPay.setText("R "+String.valueOf(amount));
        
        //Initialize for denominators
        setDenominatorMainObject();
        this.calculateDenominator = new CalculateValueOfDenominators(amount);
        
    }//GEN-LAST:event_calcPaymentBtnActionPerformed

   
    
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        this.denominators.getTenCent().setQuantity(this.denominators.getTenCent().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        this.denominators.getTwentyCent().setQuantity(this.denominators.getTwentyCent().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
         this.denominators.getFifthCent().setQuantity(this.denominators.getFifthCent().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
         this.denominators.getOneRand().setQuantity(this.denominators.getOneRand().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
         this.denominators.getTwoRand().setQuantity(this.denominators.getTwoRand().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner5StateChanged

    private void jSpinner6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6StateChanged
          this.denominators.getFiveRand().setQuantity(this.denominators.getFiveRand().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner6StateChanged

    private void jSpinner7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner7StateChanged
          this.denominators.getTenRand().setQuantity(this.denominators.getTenRand().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner7StateChanged

    private void jSpinner8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner8StateChanged
         this.denominators.getTwentyRand().setQuantity(this.denominators.getTwentyRand().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner8StateChanged

    private void jSpinner9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner9StateChanged
          this.denominators.getFiftyRand().setQuantity(this.denominators.getFiftyRand().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner9StateChanged

    private void jSpinner10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner10StateChanged
           this.denominators.getOneHunderdRand().setQuantity(this.denominators.getOneHunderdRand().getQuantity()+1);
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
    }//GEN-LAST:event_jSpinner10StateChanged

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcPaymentBtn;
    private javax.swing.JPanel entryTimePanel;
    private javax.swing.JPanel exitTimePanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextField lbAmountToPay;
    private javax.swing.JTextArea outputReceipts;
    // End of variables declaration//GEN-END:variables

    
}
