package Questão1;



import JavaBean.Alunos;
import java.util.Iterator;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Win10
 */
public class AlunoTela extends javax.swing.JFrame {    
    Cadastros d = new Cadastros();
    
    
    /**
     * Creates new form AlunoTeste
     */
    public AlunoTela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMatricula = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tdmatricula = new javax.swing.JTextField();
        tdnome = new javax.swing.JTextField();
        tdidade = new javax.swing.JTextField();
        tdnascimento = new javax.swing.JFormattedTextField();
        totalcad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tdtelefone = new javax.swing.JFormattedTextField();
        tdcpf = new javax.swing.JFormattedTextField();
        painelLateral = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CadastroAlunos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(43, 45, 66));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentMoved(evt);
            }
        });

        txtMatricula.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(253, 250, 236));
        txtMatricula.setText("Matricula:");

        jButton1.setBackground(new java.awt.Color(43, 45, 66));
        jButton1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 250, 236));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 250, 236));
        jLabel3.setText("Idade:");

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 250, 236));
        jLabel4.setText("DataNascimento:");

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 250, 236));
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(253, 250, 236));
        jLabel6.setText("Cpf: ");

        tdmatricula.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tdmatriculaComponentAdded(evt);
            }
        });
        tdmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdmatriculaActionPerformed(evt);
            }
        });

        tdnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdnomeActionPerformed(evt);
            }
        });

        tdidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdidadeActionPerformed(evt);
            }
        });

        try {
            tdnascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tdnascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tdnascimentoFocusLost(evt);
            }
        });
        tdnascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdnascimentoActionPerformed(evt);
            }
        });

        totalcad.setForeground(new java.awt.Color(253, 250, 236));
        totalcad.setText("0");

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 250, 236));
        jLabel1.setText("Total de alunos Cadastrados:");

        try {
            tdtelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+##(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tdtelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tdtelefoneFocusLost(evt);
            }
        });
        tdtelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdtelefoneActionPerformed(evt);
            }
        });

        try {
            tdcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tdcpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tdcpfFocusLost(evt);
            }
        });

        painelLateral.setBackground(new java.awt.Color(253, 250, 236));

        jLabel7.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 45, 66));
        jLabel7.setText("REGISTROS");

        jLabel8.setFont(new java.awt.Font("Lucida Console", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 45, 66));
        jLabel8.setText("SISTEMA DE");

        javax.swing.GroupLayout painelLateralLayout = new javax.swing.GroupLayout(painelLateral);
        painelLateral.setLayout(painelLateralLayout);
        painelLateralLayout.setHorizontalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        painelLateralLayout.setVerticalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalcad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMatricula))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tdtelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(tdnascimento)
                                    .addComponent(tdidade)
                                    .addComponent(tdnome)
                                    .addComponent(tdmatricula)
                                    .addComponent(tdcpf)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(165, 165, 165)
                .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtMatricula))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tdmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tdnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tdidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tdtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tdcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalcad))
                .addGap(38, 38, 38))
            .addComponent(painelLateral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(43, 45, 66));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jMenu1.setText("Criar");
        jMenu1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        jMenu7.setText("Crie um objeto da classe Aluno... ");
        jMenu7.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jMenuItem1.setText("e verifique se já está na lista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inserir");
        jMenu2.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jMenuItem8.setText("Insira um novo Aluno na terceira posição");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu10.setText("Obter");
        jMenu10.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        jMenu11.setText("Obter 3°elemento");
        jMenu11.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jMenuItem5.setText("e imprimir a quantidade de elementos da lista");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem5);

        jMenu10.add(jMenu11);

        jMenu12.setText("Obter a matricula ");
        jMenu12.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jMenuItem3.setText("do primeiro e ultimo elemento da lista");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem3);

        jMenu10.add(jMenu12);

        jMenuBar1.add(jMenu10);

        jMenu14.setText("Percorrer");
        jMenu14.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        jMenu15.setText("Percorrer toda a lista ");
        jMenu15.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jMenuItem7.setText("e identificar o aluno mais novo e mais velho");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem7);

        jMenu14.add(jMenu15);

        jMenuBar1.add(jMenu14);

        jMenu13.setBackground(new java.awt.Color(43, 45, 66));
        jMenu13.setText("Remover");
        jMenu13.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jMenuItem6.setText("Remover o último elemento da lista");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem6);

        jMenuBar1.add(jMenu13);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdnomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(tdmatricula.getText().trim().isEmpty()==true || tdnome.getText().trim().isEmpty()==true
                || tdidade.getText().trim().isEmpty()==true|| tdnascimento.getText().equals("  /  /    ")
                || tdtelefone.getText().equals("+  (  )     -    ") || tdcpf.getText().equals("   .   .   .  ")){
            JOptionPane.showMessageDialog(this,"Campos vazios!");
        }else{
            String matricula=tdmatricula.getText();
            String nome=tdnome.getText();
            int idade=Integer.parseInt(tdidade.getText());
            String dataNascimento=tdnascimento.getText();
            String telefone=tdtelefone.getText();
            String cpf=tdcpf.getText();            
            int validador=0;
            
            Alunos nc = new Alunos(matricula,idade,nome,dataNascimento,telefone,cpf);  

            Iterator<Alunos> Ai = d.alunosArray.iterator();             

            while(Ai.hasNext()&& d.alunosArray.isEmpty()==false){
                if( Ai.next().getMatricula().equals(tdmatricula.getText())){
                 validador=1;
                }            
            }
                if(validador==1){     
                    JOptionPane.showMessageDialog(this,"Aluno não Cadastrado!");
                }else{                 
                    d.cadastrar(nc);

                    totalcad.setText(d.numeroDeAlunos());

                    System.out.println(nc);

                    JOptionPane.showMessageDialog(this,"Aluno Cadastrado!");

                    tdmatricula.setText("");
                    tdnome.setText("");
                    tdidade.setText("");
                    tdnascimento.setText("");
                    tdtelefone.setText("");
                    tdcpf.setText("");
                    tdidade.setText("");
                } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tdmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdmatriculaActionPerformed

    private void tdmatriculaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tdmatriculaComponentAdded
        
    }//GEN-LAST:event_tdmatriculaComponentAdded

    private void tdnascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdnascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdnascimentoActionPerformed

    private void tdtelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdtelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdtelefoneActionPerformed

    private void jPanel1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentMoved

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
            if(d.alunosArray.size()<3){
            JOptionPane.showMessageDialog(this,"Quantidade de alunos insuficientes!");
        }else{ 
            JOptionPane.showMessageDialog(this,"Dados do terceiro aluno: "+d.alunosArray.get(2)+"\n"
                   +"Numero de alunos: "+d.numeroDeAlunos());
      }     
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
        if(d.alunosArray.size()<2){            
           JOptionPane.showMessageDialog(this,"Quantidade de alunos insuficientes!");
        }else{
            Iterator<Alunos> Ai = d.alunosArray.iterator();
            String mat;
            int i = 1;
        
            while(Ai.hasNext()){
                mat=Ai.next().getMatricula();

                if(i==1 ){
                    JOptionPane.showMessageDialog(this,"Matricula do primeiro aluno: "+ mat );
                }else if(i==d.alunosArray.size()){
                    JOptionPane.showMessageDialog(this,"Matricula do ultimo aluno: "+mat);
                }
              i++;
            }
        } 
                          
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(d.alunosArray.size()<1){
            JOptionPane.showMessageDialog(this,"Quantidade de alunos insuficientes!");
        }else{
        Iterator<Alunos> Ai = d.alunosArray.iterator();
       int i=1;
       String mat;
        while(Ai.hasNext()){ 
            mat=Ai.next().getMatricula();
            if(i==d.alunosArray.size()){
               Ai.remove(); 
               JOptionPane.showMessageDialog(this,"Matricula removida: "+mat);
            }
          i++;
        }
        totalcad.setText(d.numeroDeAlunos());
       }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       if(d.alunosArray.size()<3){
            JOptionPane.showMessageDialog(this,"Quantidade de alunos insuficientes!");
        }else{
            JOptionPane.showMessageDialog(this,"Digite o novo aluno para posição 3:");
            String matricula=JOptionPane.showInputDialog("Matricula:");        
            String nome=JOptionPane.showInputDialog("nome:"); 
            int idade=Integer.parseInt(JOptionPane.showInputDialog("idade:"));
            String dataN=JOptionPane.showInputDialog("Data de nascimento:","**/**/****");
            String telefone=JOptionPane.showInputDialog("telefone:","+**(**)*****-****");
            String cpf=JOptionPane.showInputDialog("cpf:","***.***.***");
            
            Cadastros cad = new Cadastros();
            
            if(cad.formataData(dataN) == null || cad.formataCpf(cpf) == null 
                    || cad.formataTelefone(telefone) == null){
                JOptionPane.showMessageDialog(this,"Dados incorretos para serem inseridos!");
               
            }else{  
                dataN=cad.formataData(dataN);
                cpf=cad.formataCpf(cpf);
                telefone=cad.formataTelefone(telefone);

               Alunos nc = new Alunos(matricula,idade,nome,dataN,telefone,cpf);
               Iterator<Alunos> Ai = d.alunosArray.iterator();
               int validador=0;

               while(Ai.hasNext()){
                   if( Ai.next().getMatricula().equals(matricula)){
                    validador=1;
                   }            
                }        
               if(validador==1){
                   JOptionPane.showMessageDialog(this,"Matricula já existente!");
               }else{   
                   d.alunosArray.set(2,nc);     
               }
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if(d.alunosArray.size()<2){
            JOptionPane.showMessageDialog(this,"Quantidade de alunos insuficientes!");
        }else{ 
        
        int count=0;
        Alunos maiorIdade = null, menorIdade = null;
for(Alunos aluno : d.alunosArray){
            if(count == 0){
                maiorIdade = aluno;
                menorIdade = aluno;
                count ++;
            } 
            if(aluno.getIdade() > maiorIdade.getIdade()){
                maiorIdade = aluno;
            }
            if(aluno.getIdade() < menorIdade.getIdade()){
                menorIdade = aluno;
            }
        }
   JOptionPane.showMessageDialog(null,"Aluno mais velho: "+maiorIdade.getNome()
                +", idade: "+maiorIdade.getIdade()+"\n"
                +"Aluno mais novo: "+menorIdade.getNome()
                +", idade: "+menorIdade.getIdade());
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void tdidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdidadeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       if(d.alunosArray.size()<1){
            JOptionPane.showMessageDialog(this,"Quantidade de alunos insuficientes!");
        }else{
            //String matricula=JOptionPane.showInputDialog("Digite a Matricula:");        
            String nome=JOptionPane.showInputDialog("Digite o nome:"); 
            //int idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            //String dataN=JOptionPane.showInputDialog("Data de nascimento:","**/**/****");
            //String telefone=JOptionPane.showInputDialog("telefone:","+**(**)*****-****");
           //String cpf=JOptionPane.showInputDialog("cpf:","***.***.***");
            
            Iterator<Alunos> Ai = d.alunosArray.iterator();
            
            if(Ai.next().getNome().equals(nome)){
                JOptionPane.showMessageDialog(this,"Aluno já está na lista!");
            }else{
                JOptionPane.showMessageDialog(this,"Nenhum aluno com esses dados foi encontrado!");
            }
        }
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tdcpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tdcpfFocusLost
        tdcpf.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_tdcpfFocusLost

    private void tdtelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tdtelefoneFocusLost
        tdtelefone.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_tdtelefoneFocusLost

    private void tdnascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tdnascimentoFocusLost
        tdnascimento.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_tdnascimentoFocusLost

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
            java.util.logging.Logger.getLogger(AlunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JFormattedTextField tdcpf;
    private javax.swing.JTextField tdidade;
    private javax.swing.JTextField tdmatricula;
    private javax.swing.JFormattedTextField tdnascimento;
    private javax.swing.JTextField tdnome;
    private javax.swing.JFormattedTextField tdtelefone;
    private javax.swing.JLabel totalcad;
    private javax.swing.JLabel txtMatricula;
    // End of variables declaration//GEN-END:variables
}
