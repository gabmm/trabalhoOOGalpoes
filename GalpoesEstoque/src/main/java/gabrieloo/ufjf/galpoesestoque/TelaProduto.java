/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import gabrieloo.ufjf.galpoesestoque.produtos.CPU;
import gabrieloo.ufjf.galpoesestoque.produtos.DispositivoArmazenamento;
import gabrieloo.ufjf.galpoesestoque.produtos.Fonte;
import gabrieloo.ufjf.galpoesestoque.produtos.GPU;
import gabrieloo.ufjf.galpoesestoque.produtos.MemoriaRAM;
import gabrieloo.ufjf.galpoesestoque.produtos.Motherboard;
import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;

/**
 *
 * @author gabriel
 */
public class TelaProduto extends JFrame {

    private JComboBox comboMostraCategoria;
    //private JComboBox comboMostraMarcas;

    //private DefaultComboBoxModel<String> comboMarcasModel;
    private JPanel principalTelaProduto;
    private JPanel painelDados;
    private JPanel painelDadosTop;
    private JPanel painelDadosBottom;
    private JPanel painelSelecao;

    private JPanel painelInfoTop;
    private JPanel painelInfoBottom;
    private JPanel painelInfoTopMain;

    private JButton btnTelaPrincipal;
    private JButton btnEdita;
    private JButton btnCadastra;
    private JButton btnRemove;

    private DefaultListModel<Produto> modelCPU;
    private DefaultListModel<Produto> modelGPU;
    private DefaultListModel<Produto> modelMB;
    private DefaultListModel<Produto> modelRAM;
    private DefaultListModel<Produto> modelFonte;
    private DefaultListModel<Produto> modelDA;

    private final Funcionario funcionario;

    private JList<Produto> listaProdutos;

    //private JTextField precoProduto;
    //private JTextField quantidadeProduto;
    //private JTextField marcaProduto;
    private JLabel marcaLabel;
    private JLabel precoLabel;
    private JLabel qtdLabel;
    private JLabel qtdLabelValue;
    private JLabel specLabel1;
    //private JTextField specText1;
    private JLabel specLabel2;
    //private JTextField specText2;

    //private JSpinner qtdProdutos;
    int ultimoIndex;

    public TelaProduto(Funcionario funcionario) {
        super("Produtos");
        this.funcionario = funcionario;
        this.ultimoIndex = 0;

    }

//    public JTextField getSpecText1() {
//        return specText1;
//    }
//
//    public JTextField getSpecText2() {
//        return specText2;
//    }

    public JLabel getQtdLabelValue() {
        return qtdLabelValue;
    }
    
    
    public JLabel getQtdLabel() {
        return qtdLabel;
    }

    public JLabel getSpecLabel1() {
        return specLabel1;
    }

    public JLabel getSpecLabel2() {
        return specLabel2;
    }

    public JLabel getMarcaLabel() {
        return marcaLabel;
    }

    public void setUltimoIndex(int ultimoIndex) {
        this.ultimoIndex = ultimoIndex;
    }

    public JList<Produto> getListaProduto() {
        return listaProdutos;
    }

    public JLabel getPrecoProduto() {
        return precoLabel;
    }

//    public JTextField getQuantidadeProduto() {
//        return quantidadeProduto;
//    }
//    public JSpinner getQtdSpinner() {
//        return qtdProdutos;
//    }
//    public JTextField getMarcaProduto() {
//        return marcaProduto;
//    }
//    public JComboBox getComboMarca()
//    {
//        return comboMostraMarcas;
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
        this.listaProdutos.setPreferredSize(new Dimension(300, 200));

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
        this.painelSelecao.setSize(300, 300);
        this.painelSelecao.setBorder(BorderFactory.createTitledBorder("Selecao"));
        this.painelSelecao.setLayout(new BorderLayout());

        this.comboMostraCategoria = new JComboBox(categoriaProduto);

        this.atualizaListaProdutos();

        this.comboMostraCategoria.addActionListener((ActionEvent e) -> {
            int opcao = comboMostraCategoria.getSelectedIndex();
            if (opcao == 0) {
                this.listaProdutos.setModel(modelCPU);
//                this.specLabel1.setText("Core/Threads:");
//                this.specLabel2.setText("Nome:");

            } else if (opcao == 1) {
                listaProdutos.setModel(modelGPU);
//                this.specLabel1.setText("Memória:");
//                this.specLabel2.setText("Nome:");

            } else if (opcao == 2) {
                listaProdutos.setModel(modelRAM);
//                this.specLabel1.setText("Capacidade:");
//                this.specLabel2.setText("Clock:");

            } else if (opcao == 3) {
                listaProdutos.setModel(modelMB);
//                this.specLabel1.setText("Tamanho:");
//                this.specLabel2.setText("Chipset:");

            } else if (opcao == 4) {
                listaProdutos.setModel(modelDA);
//                this.specLabel1.setText("Tipo:");
//                this.specLabel2.setText("Capacidade:");

            } else if (opcao == 5) {
                listaProdutos.setModel(modelFonte);
//                this.specLabel1.setText("Potencia:");
//                this.specLabel2.setText("Eficiencia:");
            }
        });

        this.listaProdutos.addListSelectionListener(new TrataListaProdutos(this, this.comboMostraCategoria));

        this.painelSelecao.add(new JScrollPane(listaProdutos), BorderLayout.CENTER);
        this.painelSelecao.add(this.comboMostraCategoria, BorderLayout.NORTH);
    }

    public void configuraBotoes() {

        this.btnTelaPrincipal = new JButton("Voltar");
        this.btnTelaPrincipal.addActionListener((ActionEvent e) -> {
            TelaPrincipal tela = new TelaPrincipal(this.funcionario);
            tela.abreTela();
            dispose();
        });

        this.btnCadastra = new JButton("Cadastra Novo");
        this.btnCadastra.addActionListener((ActionEvent e) -> {
            int select = comboMostraCategoria.getSelectedIndex();
            TelaCadastraProduto tela = new TelaCadastraProduto(funcionario, select);
            tela.abreTela();
            dispose();
        });

        this.btnEdita = new JButton("Edita Qtd.");
        this.btnEdita.addActionListener((ActionEvent e) -> {
            int opcao = comboMostraCategoria.getSelectedIndex();
            int prod = listaProdutos.getSelectedIndex();
            String[] palavras = qtdLabel.getText().trim().split(" ");
            int valor = Integer.parseInt(palavras[2]);
            AdministraDados.editaProduto(opcao, prod, valor);
            this.repaint();
//                TelaProduto repintandoTela = new TelaProduto(funcionario);
//                repintandoTela.abreTela();
//                dispose();
        });

        this.btnRemove = new JButton("Remove");
        this.btnRemove.addActionListener((ActionEvent e) -> {
            try {
                /*usar o indice do comboBox para saber qual  categoria de produto indice da lista
selecionada pegar objeto, pegar o objeto do modelo, chamar a funcao removeObjeto
da classe Administra dado e implementar ela*/
                int opcao = comboMostraCategoria.getSelectedIndex();
                int prod = listaProdutos.getSelectedIndex();
                if (AdministraDados.removeProduto(opcao, prod)) {
                    TelaProduto repintandoTela = new TelaProduto(funcionario);
                    repintandoTela.abreTela();
                    dispose();
                }
            } catch (ArrayIndexOutOfBoundsException ex1) {
                System.out.println("Usuario tentou remover sem selecionar");
            }
        });

    }

//    public void iniciaComboMarcas()
//    {
//        this.comboMarcasModel = new DefaultComboBoxModel<>();
//        
//        for (String string : AdministraDados.marcaLista) {
//            this.comboMarcasModel.addElement(string);
//        }
//        
//        this.comboMostraMarcas = new JComboBox(comboMarcasModel);
//    }
    public void configuraPainelInfo() {
        this.painelInfoTop = new JPanel();
        this.painelInfoTop.setLayout(new BoxLayout(this.painelInfoTop, BoxLayout.Y_AXIS));

        this.marcaLabel = new JLabel("");
        this.painelInfoTop.add(marcaLabel);
        this.painelInfoTop.add(Box.createRigidArea(new Dimension(0, 15)));

        this.specLabel2 = new JLabel("");

        this.painelInfoTop.add(specLabel2);
        this.painelInfoTop.add(Box.createRigidArea(new Dimension(0, 15)));

        this.specLabel1 = new JLabel("");
        this.painelInfoTop.add(specLabel1);
        this.painelInfoTop.add(Box.createRigidArea(new Dimension(0, 15)));

        this.precoLabel = new JLabel("");
        this.painelInfoTop.add(precoLabel);
        this.painelInfoTop.add(Box.createRigidArea(new Dimension(0, 15)));

        this.qtdLabelValue = new JLabel();
        this.qtdLabel = new JLabel();
        this.painelInfoTop.add(qtdLabel);

        this.painelInfoBottom = new JPanel();
        this.painelInfoBottom.setLayout(new BoxLayout(this.painelInfoBottom, BoxLayout.X_AXIS));

        this.painelInfoTopMain = new JPanel();
        this.painelInfoTopMain.setLayout(new BorderLayout());
        this.painelInfoTopMain.add(this.painelInfoTop, BorderLayout.WEST);

        //this.painelInfoBottom.add(Box.createRigidArea(new Dimension(0, 300)));
    }

    public void configuraPainelDados() {

        this.painelDados = new JPanel();
        this.painelDados.setSize(400, 600);
        this.painelDados.setBorder(BorderFactory.createTitledBorder("Informacoes"));
        this.painelDados.setLayout(new BorderLayout());

        this.painelDadosTop = new JPanel();
        this.painelDadosTop.setLayout(new BoxLayout(this.painelDadosTop, BoxLayout.Y_AXIS));

        this.configuraPainelInfo();
        this.painelDadosTop.add(painelInfoTopMain);
        this.painelDadosTop.add(painelInfoBottom);
        this.painelDadosTop.add(Box.createRigidArea(new Dimension(0, 300)));

        this.painelDadosBottom = new JPanel();
        this.painelDadosBottom.setLayout(new BoxLayout(this.painelDadosBottom, BoxLayout.X_AXIS));

        this.configuraBotoes();

        this.painelDadosBottom.add(Box.createRigidArea(new Dimension(20, 0)));
        this.painelDadosBottom.add(btnCadastra);
        this.painelDadosBottom.add(Box.createRigidArea(new Dimension(20, 0)));
        this.painelDadosBottom.add(btnEdita);
        this.painelDadosBottom.add(Box.createRigidArea(new Dimension(20, 0)));
        this.painelDadosBottom.add(btnRemove);
        this.painelDadosBottom.add(Box.createRigidArea(new Dimension(20, 0)));
        this.painelDadosBottom.add(btnTelaPrincipal);
        this.painelDadosBottom.add(Box.createRigidArea(new Dimension(20, 0)));

        this.painelDados.add(painelDadosBottom, BorderLayout.SOUTH);
        this.painelDados.add(painelDadosTop, BorderLayout.CENTER);
    }

    public void configuraPainelPrincipal() {
        this.principalTelaProduto = new JPanel();
        this.principalTelaProduto.setSize(800, 600);
        this.principalTelaProduto.setBorder(BorderFactory.createTitledBorder("Produtos"));
        this.principalTelaProduto.setLayout(new BorderLayout());
        this.principalTelaProduto.add(painelDados, BorderLayout.CENTER);
        this.principalTelaProduto.add(painelSelecao, BorderLayout.WEST);
    }

    public void abreTela() {
        this.configuraPainelSelecao();
        this.configuraPainelDados();
        this.configuraPainelPrincipal();

        this.setSize(850, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(this.principalTelaProduto);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
