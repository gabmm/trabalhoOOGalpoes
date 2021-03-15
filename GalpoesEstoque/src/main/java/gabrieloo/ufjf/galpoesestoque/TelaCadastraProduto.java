/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import static gabrieloo.ufjf.galpoesestoque.AdministraDados.listaCPU;
import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gabriel
 */
public class TelaCadastraProduto extends JFrame {

    private JPanel principalCadastra;
    private JPanel painelCenter;
    private JPanel painelBottom;

    private JComboBox comboMarcas;
    private JComboBox combo1;
    private JComboBox combo2;

    private DefaultComboBoxModel<String> modelMarcas;
    private DefaultComboBoxModel<String> modelCombo1;
    private DefaultComboBoxModel<String> modelCombo2;
    private DefaultComboBoxModel<Integer> modelInt;

    private boolean deuErro;

    private JTextField text1;
    private JTextField textPreco;

    private Funcionario funcionario;

    private JButton btnTelaProduto;
    private JButton btnCadastra;

    private int selecao;

    public TelaCadastraProduto(Funcionario funcionario, int selecao) {
        this.funcionario = funcionario;
        this.selecao = selecao;
        this.deuErro = false;
    }

    public void configuraBotoes() {

        this.btnTelaProduto = new JButton("Voltar");
        this.btnTelaProduto.addActionListener((ActionEvent e) -> {
            TelaProduto tela = new TelaProduto(this.funcionario);
            tela.abreTela();
            dispose();
        });

        this.btnCadastra = new JButton("Confirma");
        this.btnCadastra.addActionListener((ActionEvent e) -> {

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja prosseguir com o cadastro?");

            if (escolha != JOptionPane.YES_OPTION) {
                return;
            }

            try {

                if (selecao == 0) {
                    AdministraDados.cadastraCPU();
                    AdministraDados.listaCPU.get(AdministraDados.listaCPU.size() - 1).setMarca(comboMarcas.getSelectedIndex());
                    AdministraDados.listaCPU.get(AdministraDados.listaCPU.size() - 1).setPreco(Double.parseDouble(textPreco.getText()));
                    AdministraDados.listaCPU.get(AdministraDados.listaCPU.size() - 1).setCoreThreads(combo1.getSelectedIndex());
                    AdministraDados.listaCPU.get(AdministraDados.listaCPU.size() - 1).setNome(text1.getText());
                } else if (selecao == 1) {
                    AdministraDados.cadastraGPU();
                    AdministraDados.listaGPU.get(AdministraDados.listaGPU.size() - 1).setMarca(comboMarcas.getSelectedIndex());
                    AdministraDados.listaGPU.get(AdministraDados.listaGPU.size() - 1).setPreco(Double.parseDouble(textPreco.getText()));
                    AdministraDados.listaGPU.get(AdministraDados.listaGPU.size() - 1).setMemoria(combo1.getSelectedIndex());
                    AdministraDados.listaGPU.get(AdministraDados.listaGPU.size() - 1).setNome(text1.getText());
                } else if (selecao == 2) {
                    AdministraDados.cadastraRAM();
                    AdministraDados.listaRAM.get(AdministraDados.listaRAM.size() - 1).setMarca(comboMarcas.getSelectedIndex());
                    AdministraDados.listaRAM.get(AdministraDados.listaRAM.size() - 1).setPreco(Double.parseDouble(textPreco.getText()));
                    AdministraDados.listaRAM.get(AdministraDados.listaRAM.size() - 1).setCapacidade(combo1.getSelectedIndex());
                    AdministraDados.listaRAM.get(AdministraDados.listaRAM.size() - 1).setClock(Integer.parseInt(text1.getText()));
                } else if (selecao == 3) {
                    AdministraDados.cadastraMotherboard();
                    AdministraDados.listaMB.get(AdministraDados.listaMB.size() - 1).setMarca(comboMarcas.getSelectedIndex());
                    AdministraDados.listaMB.get(AdministraDados.listaMB.size() - 1).setPreco(Double.parseDouble(textPreco.getText()));
                    AdministraDados.listaMB.get(AdministraDados.listaMB.size() - 1).setTamanho(combo1.getSelectedIndex());
                    AdministraDados.listaMB.get(AdministraDados.listaMB.size() - 1).setChipset(combo2.getSelectedIndex());
                } else if (selecao == 4) {
                    AdministraDados.cadastraDA();
                    AdministraDados.listaDA.get(AdministraDados.listaDA.size() - 1).setMarca(comboMarcas.getSelectedIndex());
                    AdministraDados.listaDA.get(AdministraDados.listaDA.size() - 1).setPreco(Double.parseDouble(textPreco.getText()));
                    AdministraDados.listaDA.get(AdministraDados.listaDA.size() - 1).setTipo(combo1.getSelectedIndex());
                    AdministraDados.listaDA.get(AdministraDados.listaDA.size() - 1).setCapacidade(combo2.getSelectedIndex());
                } else if (selecao == 5) {
                    AdministraDados.cadastraFonte();
                    AdministraDados.listaFonte.get(AdministraDados.listaFonte.size() - 1).setMarca(comboMarcas.getSelectedIndex());
                    AdministraDados.listaFonte.get(AdministraDados.listaFonte.size() - 1).setPreco(Double.parseDouble(textPreco.getText()));
                    AdministraDados.listaFonte.get(AdministraDados.listaFonte.size() - 1).setPower(combo1.getSelectedIndex());
                    AdministraDados.listaFonte.get(AdministraDados.listaFonte.size() - 1).setEficiencia(combo2.getSelectedIndex());
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Preço e Clock precisam ser inseridos como números. Por favor, refaça o cadastro.", "AVISO", JOptionPane.INFORMATION_MESSAGE, null);
                if (selecao == 0) {
                    AdministraDados.listaCPU.remove(AdministraDados.listaCPU.size() - 1);
                } else if (selecao == 1) {
                    AdministraDados.listaGPU.remove(AdministraDados.listaGPU.size() - 1);
                } else if (selecao == 2) {
                    AdministraDados.listaRAM.remove(AdministraDados.listaRAM.size() - 1);
                } else if (selecao == 3) {
                    AdministraDados.listaMB.remove(AdministraDados.listaMB.size() - 1);
                } else if (selecao == 4) {
                    AdministraDados.listaDA.remove(AdministraDados.listaDA.size() - 1);
                } else if (selecao == 5) {
                    AdministraDados.listaFonte.remove(AdministraDados.listaFonte.size() - 1);
                }

                TelaProduto tela2 = new TelaProduto(this.funcionario);
                tela2.abreTela();
                dispose();
                this.deuErro = true;
            }
            

            if (!this.deuErro) {
                JOptionPane.showMessageDialog(null, "Cadastro de produto realizado com sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE, null);

                int escolha2 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro produto?");

                if (escolha2 != JOptionPane.YES_OPTION) {
                    TelaProduto tela = new TelaProduto(this.funcionario);
                    tela.abreTela();
                    dispose();
                } else {
                    TelaCadastraProduto tela1 = new TelaCadastraProduto(funcionario, selecao);
                    tela1.abreTela();
                    dispose();
                }
            }

        });

    }

    public void configuraPainelCentral() {

        this.painelCenter = new JPanel();
        this.painelCenter.setLayout(new BoxLayout(this.painelCenter, BoxLayout.Y_AXIS));

        this.configuraMarcas();
        
        this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));
        this.painelCenter.add(new JLabel("Marca: "));
        this.painelCenter.add(comboMarcas);
        this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

        if (this.selecao == 0) {
            this.painelCenter.setBorder(BorderFactory.createTitledBorder("Cadastra nova CPU"));

            this.configuraCPU();

            this.painelCenter.add(new JLabel("Nome: "));
            this.text1 = new JTextField();
            this.painelCenter.add(text1);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Core/Threads: "));
            this.painelCenter.add(combo1);
        } else if (this.selecao == 1) {
            this.painelCenter.setBorder(BorderFactory.createTitledBorder("Cadastra nova GPU"));

            this.configuraGPU();

            this.painelCenter.add(new JLabel("Nome: "));
            this.text1 = new JTextField();
            this.painelCenter.add(text1);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Memória: "));
            this.painelCenter.add(combo1);
        } else if (this.selecao == 2) {
            this.painelCenter.setBorder(BorderFactory.createTitledBorder("Cadastra nova Memória RAM"));

            this.configuraRAM();

            this.painelCenter.add(new JLabel("Capacidade: "));
            this.painelCenter.add(combo1);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Clock: "));
            this.text1 = new JTextField("0");
            this.painelCenter.add(text1);
        } else if (this.selecao == 3) {
            this.painelCenter.setBorder(BorderFactory.createTitledBorder("Cadastra nova Placa-mãe"));

            this.configuraMB();

            this.painelCenter.add(new JLabel("Tamanho: "));
            this.painelCenter.add(combo1);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Chipset: "));
            this.painelCenter.add(combo2);
        } else if (this.selecao == 4) {
            this.painelCenter.setBorder(BorderFactory.createTitledBorder("Cadastra novo Dispositivo de Armazenamento"));

            this.configuraDA();

            this.painelCenter.add(new JLabel("Tipo: "));
            this.painelCenter.add(combo1);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Capacidade: "));
            this.painelCenter.add(combo2);
        } else if (this.selecao == 5) {
            this.painelCenter.setBorder(BorderFactory.createTitledBorder("Cadastra nova Fonte"));

            this.configuraFonte();

            this.painelCenter.add(new JLabel("Potência: "));
            this.painelCenter.add(combo1);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Eficiência: "));
            this.painelCenter.add(combo2);
        }

        this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));
        this.painelCenter.add(new JLabel("Preço: "));
        this.textPreco = new JTextField("0");
        this.painelCenter.add(textPreco);
        this.painelCenter.add(Box.createRigidArea(new Dimension(0, 600)));
    }

    private void configuraMarcas() {
        this.modelMarcas = new DefaultComboBoxModel<>();

        for (String string : AdministraDados.marcaLista) {
            this.modelMarcas.addElement(string);
        }

        this.comboMarcas = new JComboBox(modelMarcas);

    }

    private void configuraCPU() {
        this.modelCombo1 = new DefaultComboBoxModel<>();

        for (String string : AdministraDados.coreThreadLista) {
            this.modelCombo1.addElement(string);
        }

        this.combo1 = new JComboBox(modelCombo1);
    }

    private void configuraGPU() {
        this.modelCombo1 = new DefaultComboBoxModel<>();

        for (String string : AdministraDados.memoriaCapacidadeLista) {
            this.modelCombo1.addElement(string);
        }

        this.combo1 = new JComboBox(modelCombo1);
    }

    private void configuraRAM() {
        this.modelCombo1 = new DefaultComboBoxModel<>();

        for (String string : AdministraDados.memoriaCapacidadeLista) {
            this.modelCombo1.addElement(string);
        }

        this.combo1 = new JComboBox(modelCombo1);
    }

    private void configuraMB() {
        this.modelCombo1 = new DefaultComboBoxModel<>();

        for (String string : AdministraDados.tamanhoMBLista) {
            this.modelCombo1.addElement(string);
        }

        this.combo1 = new JComboBox(modelCombo1);

        this.modelCombo2 = new DefaultComboBoxModel<>();

        for (String string : AdministraDados.chipsetLista) {
            this.modelCombo2.addElement(string);
        }

        this.combo2 = new JComboBox(modelCombo2);
    }

    private void configuraDA() {
        this.modelCombo1 = new DefaultComboBoxModel<>();

        for (String string : AdministraDados.tipoArmazenamentoLista) {
            this.modelCombo1.addElement(string);
        }

        this.combo1 = new JComboBox(modelCombo1);

        this.modelCombo2 = new DefaultComboBoxModel<>();

        for (String string : AdministraDados.capacidadeArmazenamentoLista) {
            this.modelCombo2.addElement(string);
        }

        this.combo2 = new JComboBox(modelCombo2);
    }

    private void configuraFonte() {
        this.modelInt = new DefaultComboBoxModel<>();

        for (Integer power : AdministraDados.powerLista) {
            this.modelInt.addElement(power);
        }

        this.combo1 = new JComboBox(modelInt);

        this.modelCombo2 = new DefaultComboBoxModel<>();

        for (String string : AdministraDados.plus80Lista) {
            this.modelCombo2.addElement(string);
        }

        this.combo2 = new JComboBox(modelCombo2);
    }

    private void configuraPainelInferior() {
        this.painelBottom = new JPanel();
        this.painelBottom.setLayout(new BoxLayout(this.painelBottom, BoxLayout.X_AXIS));

        this.configuraBotoes();

        this.painelBottom.add(Box.createRigidArea(new Dimension(10, 0)));
        this.painelBottom.add(btnCadastra);
        this.painelBottom.add(Box.createRigidArea(new Dimension(10, 0)));
        this.painelBottom.add(btnTelaProduto);
        this.painelBottom.add(Box.createRigidArea(new Dimension(10, 0)));
    }

    private void configuraPainelPrincipal() {
        this.principalCadastra = new JPanel();
        this.principalCadastra.setLayout(new BorderLayout());

        this.configuraPainelCentral();
        this.configuraPainelInferior();

        this.principalCadastra.add(this.painelCenter, BorderLayout.CENTER);
        this.principalCadastra.add(this.painelBottom, BorderLayout.SOUTH);
    }

    public void abreTela() {
        this.configuraPainelPrincipal();

        this.setSize(200, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(this.principalCadastra);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
