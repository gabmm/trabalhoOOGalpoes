/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.produtos.CPU;
import gabrieloo.ufjf.galpoesestoque.produtos.DispositivoArmazenamento;
import gabrieloo.ufjf.galpoesestoque.produtos.Fonte;
import gabrieloo.ufjf.galpoesestoque.produtos.GPU;
import gabrieloo.ufjf.galpoesestoque.produtos.MemoriaRAM;
import gabrieloo.ufjf.galpoesestoque.produtos.Motherboard;
import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author gabriel
 */
public class TelaProduto extends JFrame {

    private JComboBox comboMostraCategoria;

    private JPanel principalTelaProduto;
    private JPanel painelDados;
    private JPanel painelSelecao;

    private DefaultListModel<Produto> modelCPU;
    private DefaultListModel<Produto> modelGPU;
    private DefaultListModel<Produto> modelMB;
    private DefaultListModel<Produto> modelRAM;
    private DefaultListModel<Produto> modelFonte;
    private DefaultListModel<Produto> modelDA;

    private JList<Produto> listaProdutos;

    private JTextField precoProduto;
    private JTextField quantidadeProduto;
    private JTextField marcaProduto;

    private JLabel specLabel1;
    private JTextField specText1;

    private JLabel specLabel2;
    private JTextField specText2;

//    private JTextField coreThreadCPU;
//    private JTextField nomeCPU;
//
//    private JTextField memoriaGPU;
//    private JTextField nomeGPU;
//
//    private JTextField tamanhoMB;
//    private JTextField chipsetMB;
//
//    private JTextField eficienciaFonte;
//    private JTextField powerFonte;
//
//    private JTextField capacidadeRam;
//    private JTextField clockRam;
//
//    private JTextField tipoDA;
//    private JTextField capacidadeDA;
    
    int ultimoIndex;

    public TelaProduto() {
        this.ultimoIndex = 0;

    }

    public JTextField getSpecText1() {
        return specText1;
    }

    public JTextField getSpecText2() {
        return specText2;
    }

    public void setUltimoIndex(int ultimoIndex) {
        this.ultimoIndex = ultimoIndex;
    }

    public JList<Produto> getListaProduto() {
        return listaProdutos;

    }

    public JTextField getPrecoProduto() {
        return precoProduto;
    }

    public JTextField getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public JTextField getMarcaProduto() {
        return marcaProduto;
    }

//    public JTextField getPowerFonte() {
//        return powerFonte;
//    }
//
//    public JTextField getCapacidadeRam() {
//        return capacidadeRam;
//    }
//    public void iniciaTextFields() {
//        precoProduto = new JTextField(10);
//        quantidadeProduto = new JTextField(10);
//        marcaProduto = new JTextField(10);
//
//        coreThreadCPU = new JTextField(10);
//        nomeCPU = new JTextField(10);
//
//        memoriaGPU = new JTextField(10);
//        nomeGPU = new JTextField(10);
//        
//        tamanhoMB = new JTextField(10);
//        chipsetMB = new JTextField(10);
//
//        eficienciaFonte = new JTextField(10);
//        powerFonte = new JTextField(10);
//
//        capacidadeRam = new JTextField(10);
//        clockRam = new JTextField(10);
//
//        tipoDA = new JTextField(10);
//        capacidadeDA = new JTextField(10);
//    }
//    public void retiraTextFields()
//    {
//        coreThreadCPU.setVisible(false);
//        nomeCPU.setVisible(false);
//
//        memoriaGPU.setVisible(false);
//        nomeGPU.setVisible(false);
//        
//        tamanhoMB.setVisible(false);
//        chipsetMB.setVisible(false);
//
//        eficienciaFonte.setVisible(false);
//        powerFonte.setVisible(false);
//
//        capacidadeRam.setVisible(false);
//        clockRam.setVisible(false);
//
//        tipoDA.setVisible(false);
//        capacidadeDA.setVisible(false);
//    }
    public void atualizaListaProdutos() {

        this.modelCPU = new DefaultListModel<>();
        this.modelGPU = new DefaultListModel<>();
        this.modelMB = new DefaultListModel<>();
        this.modelRAM = new DefaultListModel<>();
        this.modelFonte = new DefaultListModel<>();
        this.modelDA = new DefaultListModel<>();

        this.listaProdutos = new JList<>();
        this.listaProdutos.setVisible(true);
        this.listaProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listaProdutos.setSize(600, 600);

        for (CPU cpu : AdministraDados.listaCPU) {
            this.modelCPU.addElement(cpu);
        }

        for (GPU gpu : AdministraDados.listaGPU) {
            this.modelGPU.addElement(gpu);
        }

        for (Motherboard mb : AdministraDados.listaMB) {
            this.modelMB.addElement(mb);
        }

        for (MemoriaRAM ram : AdministraDados.listaRAM) {
            this.modelRAM.addElement(ram);
        }

        for (Fonte fonte : AdministraDados.listaFonte) {
            this.modelFonte.addElement(fonte);
        }

        for (DispositivoArmazenamento da : AdministraDados.listaDA) {
            this.modelDA.addElement(da);
        }

    }

    public void configuraPainelSelecao() {
        String[] categoriaProduto = {"CPU", "GPU", "Memoria Ram", "Placa Mae", "Dispositivo de Armazenamento", "Fonte"};

        this.painelSelecao = new JPanel();
        this.painelSelecao.setSize(400, 600);
        this.painelSelecao.setBorder(BorderFactory.createTitledBorder("Selecao"));
        this.painelSelecao.setLayout(new BorderLayout());

        this.comboMostraCategoria = new JComboBox(categoriaProduto);

        this.atualizaListaProdutos();

        this.comboMostraCategoria.addActionListener((ActionEvent e) -> {
            int opcao = comboMostraCategoria.getSelectedIndex();
            if (opcao == 0) {
                this.listaProdutos.setModel(modelCPU);
                this.specLabel1.setText("Core/Threads:");
                this.specLabel2.setText("Nome:");

            } else if (opcao == 1) {
                listaProdutos.setModel(modelGPU);
                this.specLabel1.setText("Memória:");
                this.specLabel2.setText("Nome:");
                
            } else if (opcao == 2) {
                listaProdutos.setModel(modelRAM);
                this.specLabel1.setText("Capacidade:");
                this.specLabel2.setText("Clock:");
                
            } else if (opcao == 3) {
                listaProdutos.setModel(modelMB);
                this.specLabel1.setText("Tamanho:");
                this.specLabel2.setText("Chipset:");
                
            } else if (opcao == 4) {
                listaProdutos.setModel(modelDA);
                this.specLabel1.setText("Tipo:");
                this.specLabel2.setText("Capacidade:");
                
            } else if (opcao == 5) {
                listaProdutos.setModel(modelFonte);
                this.specLabel1.setText("Potencia:");
                this.specLabel2.setText("Eficiencia:");
            }
        });

        this.listaProdutos.addListSelectionListener(new TrataListaProdutos(this, this.comboMostraCategoria));

        this.painelSelecao.add(new JScrollPane(listaProdutos), BorderLayout.CENTER);
        this.painelSelecao.add(this.comboMostraCategoria, BorderLayout.NORTH);
    }

    public void configuraPainelDados() {
        this.painelDados = new JPanel();
        this.painelDados.setSize(400, 600);
        this.painelDados.setBorder(BorderFactory.createTitledBorder("Informacoes"));

        this.precoProduto = new JTextField(10);
        this.quantidadeProduto = new JTextField(10);
        this.marcaProduto = new JTextField(10);

        this.painelDados.add(new JLabel("Preco R$"));
        this.painelDados.add(precoProduto);

        this.painelDados.add(new JLabel("Marca: "));
        this.painelDados.add(marcaProduto);

        this.painelDados.add(new JLabel("Qtd. Estoque: "));
        this.painelDados.add(quantidadeProduto);

        this.specLabel1 = new JLabel("");
        this.specText1 = new JTextField(10);
        this.painelDados.add(specLabel1);
        this.painelDados.add(specText1);

        this.specLabel2 = new JLabel("");
        this.specText2 = new JTextField(10);
        this.painelDados.add(specLabel2);
        this.painelDados.add(specText2);

//        JLabel potenciaLabel = new JLabel("Potencia: ");
//        this.painelDados.add(potenciaLabel);
//        this.painelDados.add(powerFonte);
//        //this.powerFonte.setVisible(false);
//        //potenciaLabel.setVisible(false);
//
//        JLabel capacidadeLabel = new JLabel("Capacidade: ");
//        this.painelDados.add(capacidadeLabel);
//        this.painelDados.add(capacidadeRam);
//        //this.capacidadeRam.setVisible(false);
//        //capacidadeLabel.setVisible(false);
    }

    public void trocaDados(int index) {

    }

    public void configuraPainelPrincipal() {
        this.principalTelaProduto = new JPanel();
        this.principalTelaProduto.setSize(800, 600);
        this.principalTelaProduto.setBorder(BorderFactory.createTitledBorder("Produtos"));
        this.principalTelaProduto.setLayout(new BorderLayout());
        this.principalTelaProduto.add(painelDados, BorderLayout.CENTER);
        this.principalTelaProduto.add(painelSelecao, BorderLayout.WEST);
    }

    public void incializaTelaProduto() {

        this.configuraPainelSelecao();
        this.configuraPainelDados();
        this.configuraPainelPrincipal();

        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(this.principalTelaProduto);
        this.setVisible(true);
    }

}
