/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.avaliacaopraticabackend;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

/**
 *
 * @author pedagogico
 */
public class TECLADO extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TECLADO.class.getName());

    /**
     * Creates new form TECLADO
     */
    public TECLADO() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(143, 168, 181));
        
        addKeyListener(new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e){
                
            Color corOriginal = btnQ.getBackground();
            
            if(e.getKeyCode() == KeyEvent.VK_Q){
                 System.out.println("Você apertou Q!");
                 btnQ.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "q";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnQ.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
            }else if(e.getKeyCode() == KeyEvent.VK_W){
                 System.out.println("Você apertou W!");
                 btnW.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "w";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnW.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_E){
                 System.out.println("Você apertou E!");
                 btnE.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "e";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnE.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if (e.getKeyCode() == KeyEvent.VK_R){
                 System.out.println("Você apertou R!");
                 btnR.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "r";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnR.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_T){
                 System.out.println("Você apertou T!");
                 btnT.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "t";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnT.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if (e.getKeyCode() == KeyEvent.VK_Y){
                 System.out.println("Você apertou Y!");
                 btnY.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "Ÿ";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnR.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_U){
                 System.out.println("Você apertou U!");
                 btnU.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "u";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnR.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_I){
                 System.out.println("Você apertou I!");
                 btnR.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "i";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnI.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_O){
                 System.out.println("Você apertou O!");
                 btnR.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "o";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnO.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start(); 
        }else if(e.getKeyCode() == KeyEvent.VK_P){
                 System.out.println("Você apertou P!");
                 btnP.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "p";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnP.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_A){
                 System.out.println("Você apertou A!");
                 btnR.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "a";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnA.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_S){
                 System.out.println("Você apertou S!");
                 btnS.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "s";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnS.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_D){
                 System.out.println("Você apertou D!");
                 btnR.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "d";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnD.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_F){
                 System.out.println("Você apertou F!");
                 btnF.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "F";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnF.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_G){
                 System.out.println("Você apertou G!");
                 btnG.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "g";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnG.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_H){
                 System.out.println("Você apertou H!");
                 btnH.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "H";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnH.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_J){
                 System.out.println("Você apertou J!");
                 btnJ.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "j";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnJ.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_K){
                 System.out.println("Você apertou K!");
                 btnK.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "k";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnK.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_L){
                 System.out.println("Você apertou L!");
                 btnL.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "L";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnL.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_Z){
                 System.out.println("Você apertou Z!");
                 btnZ.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "z";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnZ.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_X){
                 System.out.println("Você apertou X!");
                 btnX.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "x";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnX.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_C){
                 System.out.println("Você apertou G!");
                 btnC.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "c";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnC.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_V){
                 System.out.println("Você apertou V!");
                 btnV.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "v";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnV.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_B){
                 System.out.println("Você apertou B!");
                 btnB.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "b";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnB.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_N){
                 System.out.println("Você apertou N!");
                 btnN.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "n";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnN.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_1){
                 System.out.println("Você apertou 1!");
                 btn1.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "1";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btn1.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_2){
                 System.out.println("Você apertou 2!");
                 btn2.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "2";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btn2.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_3){
                 System.out.println("Você apertou 3!");
                 btn3.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "3";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btn3.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_4){
                 System.out.println("Você apertou 4!");
                 btn4.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "4";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btn4.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_5){
                 System.out.println("Você apertou 5!");
                 btn5.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "5";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btn5.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_6){
                 System.out.println("Você apertou 6!");
                 btn6.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "6";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btn6.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
        }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
                 }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
                 }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
                 }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
                 }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
                 }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
                 }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
                 }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);  
                 Timer timer = new Timer(1000, (ActionEvent evt) ->{
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
                }
        }
         @Override
         public void keyReleased(KeyEvent e){
            
         }
        
         @Override
         public void keyTyped(KeyEvent e){
            
         }
      });
        setFocusable(true);
   }

    /**
     * This method is called from within the constructor to in
        
        addKeyListener(new KeyListener)
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        btnAcentoTiu = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();
        btnTAB = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnColchetes = new javax.swing.JButton();
        btnCOlchates = new javax.swing.JButton();
        btnAcentoAgudo = new javax.swing.JButton();
        btnCaps = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnDoisPontos = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnShift = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnPontoFinal = new javax.swing.JButton();
        btnInterrogação = new javax.swing.JButton();
        btnSetaCima = new javax.swing.JButton();
        btnSetaEsquerda = new javax.swing.JButton();
        btnSetaBaixo = new javax.swing.JButton();
        btnSetaDireita = new javax.swing.JButton();
        BtnBarraEspaço = new javax.swing.JButton();

        jButton1.setText("Q");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        txt1.setText("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed ");

        txt2.setText("Note: Cliking the buttons with your mouse will not perform any action");

        btnAcentoTiu.setText("~");

        btn1.setText("1");

        btn2.setText("2");

        btn3.setText("3");

        btn4.setText("4");

        btn5.setText("5");

        btn6.setText("6");

        btn7.setText("7");

        btn8.setText("8");

        btn9.setText("9");

        btn0.setText("0");

        btnMenos.setText("-");

        btnSoma.setText("+");

        btnBackSpace.setText("Backspace");

        btnTAB.setText("TAB");

        btnQ.setText("Q");

        btnW.setText("W");
        btnW.addActionListener(this::btnWActionPerformed);

        btnE.setText("E");
        btnE.addActionListener(this::btnEActionPerformed);

        btnR.setText("R");
        btnR.addActionListener(this::btnRActionPerformed);

        btnT.setText("T");
        btnT.addActionListener(this::btnTActionPerformed);

        btnY.setText("Y");
        btnY.addActionListener(this::btnYActionPerformed);

        btnU.setText("U");
        btnU.addActionListener(this::btnUActionPerformed);

        btnI.setText("I");
        btnI.addActionListener(this::btnIActionPerformed);

        btnO.setText("O");
        btnO.addActionListener(this::btnOActionPerformed);

        btnP.setText("P");
        btnP.addActionListener(this::btnPActionPerformed);

        btnColchetes.setText("[");
        btnColchetes.addActionListener(this::btnColchetesActionPerformed);

        btnCOlchates.setText("]");
        btnCOlchates.addActionListener(this::btnCOlchatesActionPerformed);

        btnAcentoAgudo.setText("`");
        btnAcentoAgudo.addActionListener(this::btnAcentoAgudoActionPerformed);

        btnCaps.setText("Caps");

        btnA.setText("A");
        btnA.addActionListener(this::btnAActionPerformed);

        btnS.setText("S");

        btnD.setText("D");

        btnF.setText("F");

        btnG.setText("G");

        btnH.setText("H");

        btnJ.setText("J");

        btnK.setText("K");

        btnL.setText("L");

        btnDoisPontos.setText(":");

        jButton41.setText("-");

        btnEnter.setText("ENTER");

        btnShift.setText("SHIFT");

        btnZ.setText("Z");
        btnZ.addActionListener(this::btnZActionPerformed);

        btnX.setText("X");
        btnX.addActionListener(this::btnXActionPerformed);

        btnC.setText("C");
        btnC.addActionListener(this::btnCActionPerformed);

        btnV.setText("V");
        btnV.addActionListener(this::btnVActionPerformed);

        btnB.setText("B");
        btnB.addActionListener(this::btnBActionPerformed);

        btnN.setText("N");
        btnN.addActionListener(this::btnNActionPerformed);

        btnM.setText("M");
        btnM.addActionListener(this::btnMActionPerformed);

        btnVirgula.setText(",");
        btnVirgula.addActionListener(this::btnVirgulaActionPerformed);

        btnPontoFinal.setText(".");
        btnPontoFinal.addActionListener(this::btnPontoFinalActionPerformed);

        btnInterrogação.setText("?");
        btnInterrogação.addActionListener(this::btnInterrogaçãoActionPerformed);

        btnSetaCima.setText("^");
        btnSetaCima.addActionListener(this::btnSetaCimaActionPerformed);

        btnSetaEsquerda.setText("<");
        btnSetaEsquerda.addActionListener(this::btnSetaEsquerdaActionPerformed);

        btnSetaBaixo.setText("ᐯ");
        btnSetaBaixo.addActionListener(this::btnSetaBaixoActionPerformed);

        btnSetaDireita.setText(">");
        btnSetaDireita.addActionListener(this::btnSetaDireitaActionPerformed);

        BtnBarraEspaço.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAcentoTiu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBackSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(txt1)
                        .addComponent(txt2)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnTAB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnColchetes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCOlchates, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAcentoAgudo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BtnBarraEspaço, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnShift, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnPontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnInterrogação, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(76, 76, 76)
                                            .addComponent(btnSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnSetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcentoTiu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTAB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColchetes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCOlchates, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAcentoAgudo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShift, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInterrogação, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBarraEspaço, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnYActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPActionPerformed

    private void btnColchetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColchetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnColchetesActionPerformed

    private void btnCOlchatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOlchatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCOlchatesActionPerformed

    private void btnAcentoAgudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcentoAgudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcentoAgudoActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVirgulaActionPerformed

    private void btnPontoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPontoFinalActionPerformed

    private void btnInterrogaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterrogaçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInterrogaçãoActionPerformed

    private void btnSetaCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaCimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetaCimaActionPerformed

    private void btnSetaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetaEsquerdaActionPerformed

    private void btnSetaBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaBaixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetaBaixoActionPerformed

    private void btnSetaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaDireitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetaDireitaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TECLADO().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBarraEspaço;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAcentoAgudo;
    private javax.swing.JButton btnAcentoTiu;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCOlchates;
    private javax.swing.JButton btnCaps;
    private javax.swing.JButton btnColchetes;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDoisPontos;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnInterrogação;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnPontoFinal;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnSetaBaixo;
    private javax.swing.JButton btnSetaCima;
    private javax.swing.JButton btnSetaDireita;
    private javax.swing.JButton btnSetaEsquerda;
    private javax.swing.JButton btnShift;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnTAB;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton41;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
