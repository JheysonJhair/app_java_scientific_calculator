package calculadora;

public class VentanaCalculadora extends javax.swing.JFrame {
    
    private boolean Inicio = true ;
    private boolean Igual;
    private boolean Operacion1;
    private boolean Operacion2;
    
    private double Valor1;
    private double Valor2;
    private double Result;
    
    private double sin;
    private double cos;
    private double tan;
    private double asin;
    private double acos;
    private double atan;
    
    private double Memoria;
    
    private String TipoOperacion;
    private String Funciones;
    
    public VentanaCalculadora() {
        initComponents();
        LabelMemoria.setVisible(false);
        this.setTitle("Calculator-By-Jhair");
        this.setLocationRelativeTo(null);
	setResizable(false); 

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TextFieldPrevio = new javax.swing.JTextField();
        TextFieldEntrada = new javax.swing.JTextField();
        RadioButtonSexages = new javax.swing.JRadioButton();
        RadioButtonRadiance = new javax.swing.JRadioButton();
        ButtonCos = new javax.swing.JButton();
        ButtonCosInversa = new javax.swing.JButton();
        ButtonPi = new javax.swing.JButton();
        Button10x = new javax.swing.JButton();
        ButtonFactorial = new javax.swing.JButton();
        ButtonE = new javax.swing.JButton();
        ButtonSin = new javax.swing.JButton();
        ButtonSinInversa = new javax.swing.JButton();
        ButtonElevadoMenos1 = new javax.swing.JButton();
        ButtonRaizX = new javax.swing.JButton();
        ButtonRaizCubica = new javax.swing.JButton();
        ButtonEXP = new javax.swing.JButton();
        ButtonTan = new javax.swing.JButton();
        ButtonTanInversa = new javax.swing.JButton();
        ButtonPotencia = new javax.swing.JButton();
        ButtonExponenteCubica = new javax.swing.JButton();
        ButtonExponenteCuadrado = new javax.swing.JButton();
        ButtonLog = new javax.swing.JButton();
        jButtonMC = new javax.swing.JButton();
        ButtonRetroceso = new javax.swing.JButton();
        ButtonN7 = new javax.swing.JButton();
        ButtonN4 = new javax.swing.JButton();
        ButtonN1 = new javax.swing.JButton();
        ButtonN8 = new javax.swing.JButton();
        ButtonN5 = new javax.swing.JButton();
        ButtonN2 = new javax.swing.JButton();
        ButtonN3 = new javax.swing.JButton();
        ButtonN6 = new javax.swing.JButton();
        ButtonN9 = new javax.swing.JButton();
        ButtonN0 = new javax.swing.JButton();
        ButtonPunto = new javax.swing.JButton();
        ButtonMMas = new javax.swing.JButton();
        ButtonSigno = new javax.swing.JButton();
        ButtonDivision = new javax.swing.JButton();
        ButtonMultiplicacion = new javax.swing.JButton();
        ButtonResta = new javax.swing.JButton();
        ButtonRaiz = new javax.swing.JButton();
        ButtonOperacionInversa = new javax.swing.JButton();
        ButtonPorcentaje = new javax.swing.JButton();
        ButtonMMenos = new javax.swing.JButton();
        ButtonSuma = new javax.swing.JButton();
        ButtonIgual = new javax.swing.JButton();
        ButtonMS = new javax.swing.JButton();
        ButtonCE = new javax.swing.JButton();
        ButtonMR = new javax.swing.JButton();
        LabelMemoria = new javax.swing.JLabel();
        ButtonC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TextFieldPrevio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextFieldPrevio.setBorder(null);
        TextFieldPrevio.setFocusable(false);

        TextFieldEntrada.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        TextFieldEntrada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextFieldEntrada.setText("0");
        TextFieldEntrada.setToolTipText("");
        TextFieldEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(RadioButtonSexages);
        RadioButtonSexages.setSelected(true);
        RadioButtonSexages.setText("Sexages");

        buttonGroup1.add(RadioButtonRadiance);
        RadioButtonRadiance.setText("Radiance");
        RadioButtonRadiance.setToolTipText("");

        ButtonCos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonCos.setText("cos");
        ButtonCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCosActionPerformed(evt);
            }
        });

        ButtonCosInversa.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonCosInversa.setText("cos-1");
        ButtonCosInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCosInversaActionPerformed(evt);
            }
        });

        ButtonPi.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonPi.setText("pi(n)");
        ButtonPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPiActionPerformed(evt);
            }
        });

        Button10x.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        Button10x.setText("10^x");
        Button10x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10xActionPerformed(evt);
            }
        });

        ButtonFactorial.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonFactorial.setText("n!");
        ButtonFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFactorialActionPerformed(evt);
            }
        });

        ButtonE.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonE.setText("e");
        ButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEActionPerformed(evt);
            }
        });

        ButtonSin.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonSin.setText("sin");
        ButtonSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSinActionPerformed(evt);
            }
        });

        ButtonSinInversa.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonSinInversa.setText("sin-1");
        ButtonSinInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSinInversaActionPerformed(evt);
            }
        });

        ButtonElevadoMenos1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonElevadoMenos1.setText("x^-1");
        ButtonElevadoMenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonElevadoMenos1ActionPerformed(evt);
            }
        });

        ButtonRaizX.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonRaizX.setText("y√x");
        ButtonRaizX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRaizXActionPerformed(evt);
            }
        });

        ButtonRaizCubica.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonRaizCubica.setText("3√x");
        ButtonRaizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRaizCubicaActionPerformed(evt);
            }
        });

        ButtonEXP.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonEXP.setText("EXP");
        ButtonEXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEXPActionPerformed(evt);
            }
        });

        ButtonTan.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonTan.setText("tan");
        ButtonTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTanActionPerformed(evt);
            }
        });

        ButtonTanInversa.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonTanInversa.setText("tan-1");
        ButtonTanInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTanInversaActionPerformed(evt);
            }
        });

        ButtonPotencia.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonPotencia.setText("x^y");
        ButtonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPotenciaActionPerformed(evt);
            }
        });

        ButtonExponenteCubica.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonExponenteCubica.setText("x^3");
        ButtonExponenteCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExponenteCubicaActionPerformed(evt);
            }
        });

        ButtonExponenteCuadrado.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonExponenteCuadrado.setText("x^2");
        ButtonExponenteCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExponenteCuadradoActionPerformed(evt);
            }
        });

        ButtonLog.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ButtonLog.setText("log");
        ButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogActionPerformed(evt);
            }
        });

        jButtonMC.setText("MC");
        jButtonMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMCActionPerformed(evt);
            }
        });

        ButtonRetroceso.setText("<-");
        ButtonRetroceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRetrocesoActionPerformed(evt);
            }
        });

        ButtonN7.setText("7");
        ButtonN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN7ActionPerformed(evt);
            }
        });

        ButtonN4.setText("4");
        ButtonN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN4ActionPerformed(evt);
            }
        });

        ButtonN1.setText("1");
        ButtonN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN1ActionPerformed(evt);
            }
        });

        ButtonN8.setText("8");
        ButtonN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN8ActionPerformed(evt);
            }
        });

        ButtonN5.setText("5");
        ButtonN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN5ActionPerformed(evt);
            }
        });

        ButtonN2.setText("2");
        ButtonN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN2ActionPerformed(evt);
            }
        });

        ButtonN3.setText("3");
        ButtonN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN3ActionPerformed(evt);
            }
        });

        ButtonN6.setText("6");
        ButtonN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN6ActionPerformed(evt);
            }
        });

        ButtonN9.setText("9");
        ButtonN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN9ActionPerformed(evt);
            }
        });

        ButtonN0.setText("0");
        ButtonN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonN0ActionPerformed(evt);
            }
        });

        ButtonPunto.setText(".");
        ButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPuntoActionPerformed(evt);
            }
        });

        ButtonMMas.setText("M+");
        ButtonMMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMMasActionPerformed(evt);
            }
        });

        ButtonSigno.setText("±");
        ButtonSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSignoActionPerformed(evt);
            }
        });

        ButtonDivision.setText("/");
        ButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivisionActionPerformed(evt);
            }
        });

        ButtonMultiplicacion.setText("*");
        ButtonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultiplicacionActionPerformed(evt);
            }
        });

        ButtonResta.setText("-");
        ButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRestaActionPerformed(evt);
            }
        });

        ButtonRaiz.setText("√");
        ButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRaizActionPerformed(evt);
            }
        });

        ButtonOperacionInversa.setText("1/x");
        ButtonOperacionInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOperacionInversaActionPerformed(evt);
            }
        });

        ButtonPorcentaje.setText("%");
        ButtonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPorcentajeActionPerformed(evt);
            }
        });

        ButtonMMenos.setText("M-");
        ButtonMMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMMenosActionPerformed(evt);
            }
        });

        ButtonSuma.setText("+");
        ButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSumaActionPerformed(evt);
            }
        });

        ButtonIgual.setText("=");
        ButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIgualActionPerformed(evt);
            }
        });

        ButtonMS.setText("MS");
        ButtonMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMSActionPerformed(evt);
            }
        });

        ButtonCE.setText("CE");
        ButtonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCEActionPerformed(evt);
            }
        });

        ButtonMR.setText("MR");
        ButtonMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMRActionPerformed(evt);
            }
        });

        LabelMemoria.setText("M");

        ButtonC.setText("C");
        ButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadioButtonSexages)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButtonRadiance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelMemoria))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ButtonCosInversa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonCos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(ButtonPi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ButtonFactorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Button10x, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ButtonSinInversa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonSin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ButtonElevadoMenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ButtonRaizCubica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonRaizX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ButtonEXP, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ButtonTanInversa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ButtonTan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ButtonRetroceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)
                                        .addComponent(ButtonMR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ButtonPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ButtonExponenteCuadrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ButtonExponenteCubica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ButtonLog, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ButtonN0, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ButtonPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(ButtonN1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(ButtonN4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(12, 12, 12))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(ButtonN7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(ButtonN5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ButtonN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ButtonN8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ButtonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 57, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ButtonN9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ButtonN6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ButtonN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ButtonMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ButtonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ButtonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonMMas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ButtonRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonMMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ButtonOperacionInversa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ButtonPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(TextFieldEntrada)
                    .addComponent(TextFieldPrevio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextFieldPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RadioButtonRadiance)
                        .addComponent(LabelMemoria))
                    .addComponent(RadioButtonSexages))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonCos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCosInversa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonPi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonFactorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button10x))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSinInversa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonElevadoMenos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonRaizX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonRaizCubica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEXP))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonMMas)
                        .addComponent(ButtonMS))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonTan)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonMC)
                                        .addComponent(ButtonMR)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonTanInversa)
                                    .addComponent(ButtonRetroceso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonCE)
                                    .addComponent(ButtonC)
                                    .addComponent(ButtonSigno)
                                    .addComponent(ButtonRaiz))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonPotencia)
                                    .addComponent(ButtonN7)
                                    .addComponent(ButtonN8)
                                    .addComponent(ButtonN9)
                                    .addComponent(ButtonDivision)
                                    .addComponent(ButtonPorcentaje))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonExponenteCubica)
                                    .addComponent(ButtonN4)
                                    .addComponent(ButtonN5)
                                    .addComponent(ButtonN6)
                                    .addComponent(ButtonMultiplicacion)
                                    .addComponent(ButtonOperacionInversa)))
                            .addComponent(ButtonMMenos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonExponenteCuadrado)
                                    .addComponent(ButtonN1)
                                    .addComponent(ButtonN2)
                                    .addComponent(ButtonN3)
                                    .addComponent(ButtonResta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonLog)
                                    .addComponent(ButtonN0)
                                    .addComponent(ButtonPunto)
                                    .addComponent(ButtonSuma))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //BOTONES!
    private void ButtonN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN0ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("0");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"0");
        }
    }//GEN-LAST:event_ButtonN0ActionPerformed

    private void ButtonN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN1ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("1");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"1");
        }
    }//GEN-LAST:event_ButtonN1ActionPerformed

    private void ButtonN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN2ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("2");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"2");
        }
    }//GEN-LAST:event_ButtonN2ActionPerformed

    private void ButtonN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN3ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("3");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"3");
        }
    }//GEN-LAST:event_ButtonN3ActionPerformed

    private void ButtonN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN4ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("4");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"4");
        }
    }//GEN-LAST:event_ButtonN4ActionPerformed

    private void ButtonN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN5ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("5");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"5");
        }
    }//GEN-LAST:event_ButtonN5ActionPerformed

    private void ButtonN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN6ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("6");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"6");
        }
    }//GEN-LAST:event_ButtonN6ActionPerformed

    private void ButtonN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN7ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("7");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"7");
        }
    }//GEN-LAST:event_ButtonN7ActionPerformed

    private void ButtonN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN8ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("8");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"8");
        }
    }//GEN-LAST:event_ButtonN8ActionPerformed

    private void ButtonN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonN9ActionPerformed
        //Variable Inicio
        if(Inicio==true){
            TextFieldEntrada.setText(" ");
            TextFieldEntrada.setText("9");
            Inicio = false;   
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+"9");
        }
    }//GEN-LAST:event_ButtonN9ActionPerformed

    private void ButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPuntoActionPerformed
        //Variable Inicio-constains contains () es un método Java para verificar si String contiene otra subcadena o no
        if(TextFieldEntrada.getText().contains(".")){
  
        }else{
            TextFieldEntrada.setText(TextFieldEntrada.getText()+".");
            Inicio = false; 
        }
    }//GEN-LAST:event_ButtonPuntoActionPerformed
    //OPERACIONES
    
    private void ButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRestaActionPerformed
        Inicio = true;
        Igual = true;
        if(Operacion1=true){
            Valor1 = Double.parseDouble(TextFieldEntrada.getText());
            TextFieldPrevio.setText(" ");
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" - ");
            Operacion1 = false;
        }else{
            if(Operacion2=true){
            Valor2 = Double.parseDouble(TextFieldEntrada.getText());
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" - ");
            Operacion2 = false;
        }else{
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" - ");  
            Operaciones(Result, Valor2);
            }
        }
        TipoOperacion = "-";
    }//GEN-LAST:event_ButtonRestaActionPerformed

    private void ButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSumaActionPerformed
        Inicio = true;
        Igual = true;
        if(Operacion1=true){
            Valor1 = Double.parseDouble(TextFieldEntrada.getText());
            TextFieldPrevio.setText(" ");
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" + ");
            Operacion1 = false;
        }else{
            if(Operacion2=true){
            Valor2 = Double.parseDouble(TextFieldEntrada.getText());
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" + ");
            Operacion2 = false;
        }else{
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" + ");  
            Operaciones(Result, Valor2);
            }
        }
        TipoOperacion = "+";
    }//GEN-LAST:event_ButtonSumaActionPerformed

    private void ButtonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultiplicacionActionPerformed
        Inicio = true;
        Igual = true;
        if(Operacion1=true){
            Valor1 = Double.parseDouble(TextFieldEntrada.getText());
            TextFieldPrevio.setText(" ");
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" * ");
            Operacion1 = false;
        }else{
            if(Operacion2=true){
            Valor2 = Double.parseDouble(TextFieldEntrada.getText());
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" * ");
            Operacion2 = false;
        }else{
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" * ");  
            Operaciones(Result, Valor2);
            }
        }
        TipoOperacion = "*";
    }//GEN-LAST:event_ButtonMultiplicacionActionPerformed

    private void ButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivisionActionPerformed
        Inicio = true;
        Igual = true;
        if(Operacion1=true){
            Valor1 = Double.parseDouble(TextFieldEntrada.getText());
            TextFieldPrevio.setText(" ");
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" / ");
            Operacion1 = false;
        }else{
            if(Operacion2=true){
            Valor2 = Double.parseDouble(TextFieldEntrada.getText());
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" / ");
            Operacion2 = false;
        }else{
            TextFieldPrevio.setText(TextFieldEntrada.getText()+" / ");  
            Operaciones(Result, Valor2);
            }
        }
        TipoOperacion = "/";
    }//GEN-LAST:event_ButtonDivisionActionPerformed
    //METODO OPERACIONES
    private void Operaciones(double valor1, double valor2){
        switch(TipoOperacion){
            case "+":
                Result = valor1 + valor2;
                TextFieldEntrada.setText(Result+"");
                Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                break;
            case "-":
                Result = valor1 - valor2;
                TextFieldEntrada.setText(Result+"");
                Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                break;
            case "*":
                Result = valor1 * valor2;
                TextFieldEntrada.setText(Result+"");
                Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                break;
            case "/":
                if(Valor2 == 0){
                    TextFieldEntrada.setText("Error!");
                    break;
                }else{
                Result = valor1 + valor2;
                TextFieldEntrada.setText(Result+"");
                Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                break;
                }
            case "Potencia":

                Result = Math.pow(Valor1, Valor2);
                TextFieldEntrada.setText(Result+" ");
                break;
            case "RaizX":
                if(Valor2 <=0){
                    TextFieldEntrada.setText("Error!");
                    break;
                }else{
                    double a = 1/Valor2;
                    Result = Math.pow(Valor1, a);
                    TextFieldEntrada.setText(Result+" ");
                break;
                }
        }
    }
    private void ButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIgualActionPerformed
        Inicio = true;
        Operacion1 = true;
        if(Igual = true){
            if(TipoOperacion == null){

            }else{
                Valor2 = Double.parseDouble(TextFieldEntrada.getText());
                TextFieldPrevio.setText(TextFieldPrevio.getText()+TextFieldEntrada.getText());
                TextFieldEntrada.setText(""); 
                Operaciones(Valor1, Valor2);
                Igual = false;
            }
        }else{
            TextFieldPrevio.setText(" ");
            Operaciones(Valor1, Valor2);
        }        
    }//GEN-LAST:event_ButtonIgualActionPerformed

    private void ButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRaizActionPerformed
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        if(Valor1 >= 0){
            TextFieldPrevio.setText("sqrt( "+TextFieldEntrada.getText()+" )");
            TextFieldEntrada.setText(Math.sqrt(Valor1)+" ");
        }else{
            TextFieldEntrada.setText("Error!");
        }
    }//GEN-LAST:event_ButtonRaizActionPerformed

    private void ButtonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPorcentajeActionPerformed
        Valor2 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText(TextFieldPrevio.getText()+TextFieldEntrada.getText()+"%");
        TextFieldEntrada.setText((Valor1 * Valor2)/100 +" ");
        Igual = true;
    }//GEN-LAST:event_ButtonPorcentajeActionPerformed

    private void ButtonOperacionInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOperacionInversaActionPerformed
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText("reciproc( "+TextFieldEntrada.getText()+" )");
        TextFieldEntrada.setText(1/Valor1 +" ");
    }//GEN-LAST:event_ButtonOperacionInversaActionPerformed

    private void ButtonSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSignoActionPerformed
        double a;
        double b = 0;
        double c;
        a = Double.parseDouble(TextFieldEntrada.getText());
        c = b - a;
        TextFieldEntrada.setText(c+" ");
    }//GEN-LAST:event_ButtonSignoActionPerformed

    private void ButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCActionPerformed
        TextFieldEntrada.setText("0");
        TextFieldPrevio.setText(" ");
        Inicio = true;
        Funciones = "";
        Operacion1 = true;
        Operacion2 = true;
        Igual = true;
        Valor1 = 0;
        Valor2 = 0;
        Result = 0;
        Result = 0;
        
    }//GEN-LAST:event_ButtonCActionPerformed

    private void ButtonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCEActionPerformed
        TextFieldEntrada.setText("0");
        TextFieldPrevio.setText(" ");
        Inicio = true;
        Funciones = "";
    }//GEN-LAST:event_ButtonCEActionPerformed

    private void ButtonRetrocesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRetrocesoActionPerformed
        if(TextFieldEntrada.getText().length()>1){
            TextFieldEntrada.setText(TextFieldEntrada.getText().substring(0, TextFieldEntrada.getText().length()-1));
            if(TextFieldEntrada.getText().length()==1){
                TextFieldEntrada.setText("0");
                Inicio = true;
            }
        }
    }//GEN-LAST:event_ButtonRetrocesoActionPerformed
    //Trigonometria
    private void Trigonometria(){
        if(RadioButtonSexages.isSelected()){
            switch(Funciones){
                case "sin":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("sin( "+Valor1+" )");
                    sin = Math.sin((Math.PI*(Valor1)/180));
                    TextFieldEntrada.setText(sin+" ");
                    break;
                case "Asin":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("asin( "+Valor1+" )");
                    asin = Math.asin((Valor1)*180/Math.PI);
                    TextFieldEntrada.setText(asin+" ");
                    break;
                case "cos":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("cos( "+Valor1+" )");
                    cos = Math.cos((Math.PI*(Valor1)/180));
                    TextFieldEntrada.setText(cos+" ");
                    break;
                case "Acos":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("acos( "+Valor1+" )");
                    acos = Math.acos((Valor1)*180/Math.PI);
                    TextFieldEntrada.setText(acos+" ");
                    break;
                case "tan":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("tan( "+Valor1+" )");
                    tan = Math.tan((Math.PI*(Valor1)/180));
                    TextFieldEntrada.setText(tan+" ");
                    break;
                case "Atan":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("atan( "+Valor1+" )");
                    atan = Math.atan((Valor1)*180/Math.PI);
                    TextFieldEntrada.setText(atan+" ");
                    break;
            }          
        }else{
            if(RadioButtonRadiance.isSelected()){
            switch(Funciones){
                case "sin":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("sinr( "+Valor1+" )");
                    sin = Math.sin(Valor1);
                    TextFieldEntrada.setText(sin+" ");
                    break;
                case "Asin":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("asinr( "+Valor1+" )");
                    asin = Math.asin(Valor1);
                    TextFieldEntrada.setText(asin+" ");
                    break;
                case "cos":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("cosr( "+Valor1+" )");
                    cos = Math.cos(Valor1);
                    TextFieldEntrada.setText(cos+" ");
                    break;
                case "Acos":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("acosr( "+Valor1+" )");
                    acos = Math.acos(Valor1);
                    TextFieldEntrada.setText(acos+" ");
                    break;
                case "tan":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("tanr( "+Valor1+" )");
                    tan = Math.tan(Valor1);
                    TextFieldEntrada.setText(tan+" ");
                    break;
                case "Atan":
                    Valor1 = Double.parseDouble(TextFieldEntrada.getText());
                    TextFieldPrevio.setText("atanr( "+Valor1+" )");
                    atan = Math.atan(Valor1);
                    TextFieldEntrada.setText(atan+" ");
                    break;
            }
        }
    }     
    }
    private void ButtonCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCosActionPerformed
        Funciones = "cos";
        Trigonometria();
    }//GEN-LAST:event_ButtonCosActionPerformed

    private void ButtonSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSinActionPerformed
        Funciones = "sin";
        Trigonometria();
    }//GEN-LAST:event_ButtonSinActionPerformed

    private void ButtonTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTanActionPerformed
        Funciones = "tan";
        Trigonometria();
    }//GEN-LAST:event_ButtonTanActionPerformed

    private void ButtonCosInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCosInversaActionPerformed
        Funciones = "Acos";
        Trigonometria();
    }//GEN-LAST:event_ButtonCosInversaActionPerformed

    private void ButtonSinInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSinInversaActionPerformed
        Funciones = "Asin";
        Trigonometria();
    }//GEN-LAST:event_ButtonSinInversaActionPerformed

    private void ButtonTanInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTanInversaActionPerformed
        Funciones = "Atan";
        Trigonometria();
    }//GEN-LAST:event_ButtonTanInversaActionPerformed

    private void ButtonPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPiActionPerformed
        TextFieldPrevio.setText("PI");
        TextFieldEntrada.setText(Math.PI+" ");  
    }//GEN-LAST:event_ButtonPiActionPerformed

    private void ButtonElevadoMenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonElevadoMenos1ActionPerformed
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText(Valor1+ " ^-1");
        TextFieldEntrada.setText(Math.pow(Valor1, -1)+" ");
        
    }//GEN-LAST:event_ButtonElevadoMenos1ActionPerformed

    private void ButtonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPotenciaActionPerformed
        Inicio = true;
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText(Valor1+ " ^");
        TipoOperacion = "Potencia";
        Operacion1 = false;
        Igual = true;
    }//GEN-LAST:event_ButtonPotenciaActionPerformed

    private void ButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEActionPerformed
        TextFieldPrevio.setText("E");
        TextFieldEntrada.setText(Math.E+" ");  
    }//GEN-LAST:event_ButtonEActionPerformed

    private void ButtonRaizXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRaizXActionPerformed
        Inicio = true;
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText(Valor1+ " √");
        TipoOperacion = "RaizX";
        Operacion1 = false;
        Igual = true;
    }//GEN-LAST:event_ButtonRaizXActionPerformed

    private void ButtonExponenteCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExponenteCubicaActionPerformed
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText(Valor1+ " ^3");
        TextFieldEntrada.setText(Math.pow(Valor1, 3)+" ");
    }//GEN-LAST:event_ButtonExponenteCubicaActionPerformed

    private void ButtonFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFactorialActionPerformed
        
        double f = 1;
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        for(int i=1;i<=Valor1;i++){
            f = f * i;
        }
        TextFieldEntrada.setText(f+"");
    }//GEN-LAST:event_ButtonFactorialActionPerformed

    private void ButtonRaizCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRaizCubicaActionPerformed
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText( "3√ "+ Valor1);
        double a = 1;
        double b = 3;
        double c = a/b;
        TextFieldEntrada.setText(Math.pow(Valor1, c)+" ");
    }//GEN-LAST:event_ButtonRaizCubicaActionPerformed

    private void ButtonExponenteCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExponenteCuadradoActionPerformed
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText(Valor1+ " ^2");
        TextFieldEntrada.setText(Math.pow(Valor1, 2)+" ");
    }//GEN-LAST:event_ButtonExponenteCuadradoActionPerformed

    private void Button10xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10xActionPerformed
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText("10^ "+Valor1);
        TextFieldEntrada.setText(Math.pow(10, Valor1)+" ");
    }//GEN-LAST:event_Button10xActionPerformed

    private void ButtonEXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEXPActionPerformed
        TextFieldPrevio.setText("EXP");
        TextFieldEntrada.setText(Math.exp(Valor1)+" "); 
    }//GEN-LAST:event_ButtonEXPActionPerformed

    private void ButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogActionPerformed
        Valor1 = Double.parseDouble(TextFieldEntrada.getText());
        TextFieldPrevio.setText("log( "+Valor1+" )");
        TextFieldEntrada.setText(Math.log(Valor1)+" ");
    }//GEN-LAST:event_ButtonLogActionPerformed

    private void jButtonMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMCActionPerformed
        Memoria = 0;
        LabelMemoria.setVisible(false);
    }//GEN-LAST:event_jButtonMCActionPerformed

    private void ButtonMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMRActionPerformed
        TextFieldEntrada.setText(Memoria+" ");
    }//GEN-LAST:event_ButtonMRActionPerformed

    private void ButtonMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMSActionPerformed
        Memoria = Double.parseDouble(TextFieldEntrada.getText()); 
        LabelMemoria.setVisible(true);
    }//GEN-LAST:event_ButtonMSActionPerformed

    private void ButtonMMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMMasActionPerformed
        Memoria = Memoria + Double.parseDouble(TextFieldEntrada.getText());
        LabelMemoria.setVisible(true);
    }//GEN-LAST:event_ButtonMMasActionPerformed

    private void ButtonMMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMMenosActionPerformed
        Memoria = Memoria - Double.parseDouble(TextFieldEntrada.getText());
        LabelMemoria.setVisible(true);
    }//GEN-LAST:event_ButtonMMenosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button10x;
    private javax.swing.JButton ButtonC;
    private javax.swing.JButton ButtonCE;
    private javax.swing.JButton ButtonCos;
    private javax.swing.JButton ButtonCosInversa;
    private javax.swing.JButton ButtonDivision;
    private javax.swing.JButton ButtonE;
    private javax.swing.JButton ButtonEXP;
    private javax.swing.JButton ButtonElevadoMenos1;
    private javax.swing.JButton ButtonExponenteCuadrado;
    private javax.swing.JButton ButtonExponenteCubica;
    private javax.swing.JButton ButtonFactorial;
    private javax.swing.JButton ButtonIgual;
    private javax.swing.JButton ButtonLog;
    private javax.swing.JButton ButtonMMas;
    private javax.swing.JButton ButtonMMenos;
    private javax.swing.JButton ButtonMR;
    private javax.swing.JButton ButtonMS;
    private javax.swing.JButton ButtonMultiplicacion;
    private javax.swing.JButton ButtonN0;
    private javax.swing.JButton ButtonN1;
    private javax.swing.JButton ButtonN2;
    private javax.swing.JButton ButtonN3;
    private javax.swing.JButton ButtonN4;
    private javax.swing.JButton ButtonN5;
    private javax.swing.JButton ButtonN6;
    private javax.swing.JButton ButtonN7;
    private javax.swing.JButton ButtonN8;
    private javax.swing.JButton ButtonN9;
    private javax.swing.JButton ButtonOperacionInversa;
    private javax.swing.JButton ButtonPi;
    private javax.swing.JButton ButtonPorcentaje;
    private javax.swing.JButton ButtonPotencia;
    private javax.swing.JButton ButtonPunto;
    private javax.swing.JButton ButtonRaiz;
    private javax.swing.JButton ButtonRaizCubica;
    private javax.swing.JButton ButtonRaizX;
    private javax.swing.JButton ButtonResta;
    private javax.swing.JButton ButtonRetroceso;
    private javax.swing.JButton ButtonSigno;
    private javax.swing.JButton ButtonSin;
    private javax.swing.JButton ButtonSinInversa;
    private javax.swing.JButton ButtonSuma;
    private javax.swing.JButton ButtonTan;
    private javax.swing.JButton ButtonTanInversa;
    private javax.swing.JLabel LabelMemoria;
    private javax.swing.JRadioButton RadioButtonRadiance;
    private javax.swing.JRadioButton RadioButtonSexages;
    private javax.swing.JTextField TextFieldEntrada;
    private javax.swing.JTextField TextFieldPrevio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonMC;
    // End of variables declaration//GEN-END:variables
}
