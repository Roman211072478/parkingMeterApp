/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterapp.com.app;

import java.awt.FlowLayout;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import parkingmeterapp.com.app.calculations.CalculateChangeDenominators;
import parkingmeterapp.com.app.calculations.CalculateHours;
import parkingmeterapp.com.app.calculations.CalculateValueOfDenominators;
import parkingmeterapp.com.app.components.DateComponent;
import parkingmeterapp.com.app.components.OutputBuilder;
import parkingmeterapp.com.app.logic.AmountPayable;
import parkingmeterapp.com.app.models.Denominators;
import parkingmeterapp.com.app.repo.Impl.PaymentRepoImpl;
import parkingmeterapp.com.app.repo.PaymentRepo;
import parkingmeterapp.com.app.view.AdminFrame;


/**
 *
 * @author Rafiq
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    //Custom variables and object
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
    private CalculateChangeDenominators changeCalculator = new CalculateChangeDenominators();;
    
    public MainFrame() {
        initComponents();
        CustomizedInitialize();
    }

    private void CustomizedInitialize() {
        //My Custom initializer
        createLeftPanels();
        disableMiddleSpinners();        
    }
    
    //reinitializing of an Object, with a builder method
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
        //Calling a method for .jar to make a date Model spinner,and
        //adding it to the 2 panels
        this.entryTimeDateSpinner = DateComponent.create();
         
        this.entryTimePanel.setLayout(new FlowLayout());
        this.entryTimePanel.add(this.entryTimeDateSpinner);
        
        this.exitTimeDateSpinner = DateComponent.create();
       
        this.exitTimePanel.setLayout(new FlowLayout());
        this.exitTimePanel.add(this.exitTimeDateSpinner);
    }
    
    //Check if the amount entered is the meets requirements/more then fee
    private void checkForRightAmount()
    {        
        if(this.amountEntered < this.amount || this.amountEntered == 0){
             
            if(this.payBtn.isEnabled()){
             this.payBtn.setEnabled(false);
             }
             
            }
        else if(this.amountEntered >= this.amount){           
            if(!this.payBtn.isEnabled()){
             this.payBtn.setEnabled(true);
            }            
        }                   
    }
    
    private void reset()
    {
        //Reset everything to beginning phase/starting point
        jSpinner1.setValue(0);
        jSpinner1.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        lbAmountToPay.setText("R 0.00");
        outputReceipts.setText("");
        
        disableMiddleSpinners();
        this.hours = 0;
        this.amount = 0.00;
        
        calcPaymentBtn.setEnabled(true);
        entryTimeDateSpinner.setEnabled(true);  
        entryTimeDateSpinner.setValue(new Date());
        exitTimeDateSpinner.setEnabled(true);
        exitTimeDateSpinner.setValue(new Date());
    }
    private void disableMiddleSpinners(){
         //deisable denominators
        jSpinner1.setEnabled(false);
        jSpinner10.setEnabled(false);
        jSpinner11.setEnabled(false);
        jSpinner2.setEnabled(false);
        jSpinner3.setEnabled(false);
        jSpinner4.setEnabled(false);
        jSpinner5.setEnabled(false);
        jSpinner6.setEnabled(false);
        jSpinner7.setEnabled(false);
        jSpinner8.setEnabled(false);
        jSpinner9.setEnabled(false);
    }
     private void enableMiddleSpinners(){
        //Enable denominators
        jSpinner1.setEnabled(true);
        jSpinner10.setEnabled(true);
        jSpinner11.setEnabled(true);
        jSpinner2.setEnabled(true);
        jSpinner3.setEnabled(true);
        jSpinner4.setEnabled(true);
        jSpinner5.setEnabled(true);
        jSpinner6.setEnabled(true);
        jSpinner7.setEnabled(true);
        jSpinner8.setEnabled(true);
        jSpinner9.setEnabled(true);
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
        middlePanel = new javax.swing.JPanel();
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
        payBtn = new javax.swing.JButton();
        lbAmountToPay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parking Meter App");

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

        middlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "How Are you paying?", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DejaVu Sans", 0, 12))); // NOI18N

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel3.setText("R0.10");

        jLabel4.setText("R0.20");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jLabel5.setText("R0.50");

        jLabel6.setText("R1.00");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner6StateChanged(evt);
            }
        });

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner7StateChanged(evt);
            }
        });

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner8StateChanged(evt);
            }
        });

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner9StateChanged(evt);
            }
        });

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner10StateChanged(evt);
            }
        });

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner11StateChanged(evt);
            }
        });

        jLabel7.setText("R2.00");

        jLabel8.setText("R5.00");

        jLabel9.setText("R10.00");

        jLabel10.setText("R20.00");

        jLabel11.setText("R50.00");

        jLabel12.setText("R100.00");

        jLabel13.setText("R200.00");

        javax.swing.GroupLayout middlePanelLayout = new javax.swing.GroupLayout(middlePanel);
        middlePanel.setLayout(middlePanelLayout);
        middlePanelLayout.setHorizontalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, middlePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner11)
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
        middlePanelLayout.setVerticalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        outputReceipts.setColumns(20);
        outputReceipts.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        outputReceipts.setRows(5);
        jScrollPane1.setViewportView(outputReceipts);

        payBtn.setText("Pay");
        payBtn.setEnabled(false);
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        lbAmountToPay.setEditable(false);
        lbAmountToPay.setText("R 0.00");

        jLabel2.setText("Amount to pay:");

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Admin");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(entryTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcPaymentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAmountToPay))
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(middlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(21, Short.MAX_VALUE))
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
                            .addComponent(middlePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAmountToPay)
                    .addComponent(payBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

/**Calculator Button****/
    private void calcPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcPaymentBtnActionPerformed
        
        this.outputReceipts.setText("");//setTextArea to blank
        this.outputBuilder = new OutputBuilder();
               
        //Calculate hour much hours
        this.hours = CalculateHours.Calculate(entryTimeDateSpinner, exitTimeDateSpinner);
        this.outputBuilder.setHours((int)hours);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
     
        //Calculate the amount payable by using the logic in my jar file
         amount =(double) AmountPayable.AmountToBePaid(hours);
                  
        //Set text to show amount payable
        this.lbAmountToPay.setText("R "+String.valueOf(amount));
        
        //Initialize for denominators
        setDenominatorMainObject();
        this.calculateDenominator = new CalculateValueOfDenominators(amount);
        
         enableMiddleSpinners();
        
         entryTimeDateSpinner.setEnabled(false);
         exitTimeDateSpinner.setEnabled(false);
         
         calcPaymentBtn.setEnabled(false);         
    }//GEN-LAST:event_calcPaymentBtnActionPerformed

   /**Below is the spinners for the denominators, all 11 is pretty much the same.
    * First it sets the denominator model object quantity to the components value,
    * Then we calculate the amount entered. Which then we build a string output for
    * the textArea, and then we check if the amount was met and if so then the 
    * pay button becomes enabled. Everything mentioned applies to 11 elements. This
    * way it will update the value every time when an element's state is changed
    */
    
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        this.denominators.getTenCent().setQuantity((int)jSpinner1.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        this.denominators.getTwentyCent().setQuantity((int) jSpinner2.getValue());      
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
           
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
         this.denominators.getFifthCent().setQuantity((int)jSpinner3.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
         this.denominators.getOneRand().setQuantity((int)jSpinner4.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
         this.denominators.getTwoRand().setQuantity((int)jSpinner5.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner5StateChanged

    private void jSpinner6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6StateChanged
          this.denominators.getFiveRand().setQuantity((int)jSpinner6.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner6StateChanged

    private void jSpinner7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner7StateChanged
          this.denominators.getTenRand().setQuantity((int)jSpinner7.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner7StateChanged

    private void jSpinner8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner8StateChanged
         this.denominators.getTwentyRand().setQuantity((int)jSpinner8.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner8StateChanged

    private void jSpinner9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner9StateChanged
          this.denominators.getFiftyRand().setQuantity((int)jSpinner9.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner9StateChanged

    private void jSpinner10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner10StateChanged
           this.denominators.getOneHunderdRand().setQuantity((int)jSpinner10.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner10StateChanged

    private void jSpinner11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner11StateChanged
        this.denominators.getTwoHunderdRand().setQuantity((int)jSpinner11.getValue());
        this.amountEntered = Math.round(this.calculateDenominator.denominatorsToAmount(this.denominators)*100.00) /100.00;
      
        this.outputBuilder.setAmountEntered(this.amountEntered);
        this.outputReceipts.setText(this.outputBuilder.createFirstPortionString());
        checkForRightAmount();
    }//GEN-LAST:event_jSpinner11StateChanged
/***Reset button******/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reset();//reset all fields
    }//GEN-LAST:event_jButton3ActionPerformed

    /***Pay Button***/
    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
       //The Math.abs, which is absolute value, which shows how much is lefts after
       //the amount- amountEntered, which would say -x, where we only need x
        this.changesObject =  this.changeCalculator.calculate(Math.abs(amount-amountEntered));
        
        //Now to build an output
        this.outputBuilder.setChangeAmount(Math.abs(amount-amountEntered));
        this.outputBuilder.setChangeObject(this.changesObject);
        
        //Set the TextArea with the text that was just built 
        this.outputReceipts.setText(this.outputBuilder.createWholeString());
               
        PaymentRepo repo = new PaymentRepoImpl();
        repo.write(prepDataForRepo());
                
      this.payBtn.setEnabled(false);
      disableMiddleSpinners();
    }//GEN-LAST:event_payBtnActionPerformed
/***Administration Button**/
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        //Check if the is data available
        File myFile = new File(PaymentRepoImpl.FILE_NAME);
        
        if(myFile.exists())
            {
                //calls new Frame   
                AdminFrame nextFrame = new AdminFrame();
                nextFrame.setAlwaysOnTop(true);
                nextFrame.setVisible(true);
            }     
        else{
           JOptionPane.showMessageDialog(this,"There is no data available.",
           "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //Prepare a format to be written to text file
    private String prepDataForRepo()
    {      //All the data is converted into strings
        return  String.valueOf(this.entryTimeDateSpinner.getValue())+" - "+
                String.valueOf(this.exitTimeDateSpinner.getValue())+" - "+
                String.valueOf(this.hours) +" - "+
                String.valueOf(this.amount) +" - "+
                String.valueOf(this.amountEntered)+" - "+
                String.valueOf(Math.abs(amount-amountEntered))+" - ";
              
    }
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
    private javax.swing.JPanel middlePanel;
    private javax.swing.JTextArea outputReceipts;
    private javax.swing.JButton payBtn;
    // End of variables declaration//GEN-END:variables

    
}
