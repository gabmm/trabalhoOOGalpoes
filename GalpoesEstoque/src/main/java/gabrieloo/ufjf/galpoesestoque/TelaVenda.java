/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Cliente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import gabrieloo.ufjf.galpoesestoque.produtos.CPU;
import gabrieloo.ufjf.galpoesestoque.produtos.DispositivoArmazenamento;
import gabrieloo.ufjf.galpoesestoque.produtos.Fonte;
import gabrieloo.ufjf.galpoesestoque.produtos.GPU;
import gabrieloo.ufjf.galpoesestoque.produtos.MemoriaRAM;
import gabrieloo.ufjf.galpoesestoque.produtos.Motherboard;
import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author gabriel
 */
public class TelaVenda extends JFrame {

    private JPanel principalVenda;

    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel centerPanel;

    private JList<Produto> ordem;
    private JList<Produto> listaProdutos;
    private JList<Cliente> listaClientes;

    private DefaultListModel<Produto> modelOrdem;
    private DefaultComboBoxModel<Produto> modelTodosProdutos;
    private DefaultComboBoxModel<Cliente> modelTodosClientes;

    private JComboBox comboMostraCliente;
    private JComboBox comboMostraProduto;

    private Cliente cliente;

    private Funcionario funcionario;

    private JLabel valorTotal;

    private double valorTotalVenda = 0;

    private JButton btnTelaPrincipal;
    private JButton btnRealizaVenda;
    private JButton btnSelecionaProduto;
    private JButton btnRemoveProduto;

    private JCheckBox ehCartao;

    public TelaVenda(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public TelaVenda() {
    }

    public void instanciaListas() {
        this.ordem = new JList<>();

        this.modelOrdem = new DefaultListModel<>();
        this.modelTodosClientes = new DefaultComboBoxModel<>();
        this.modelTodosProdutos = new DefaultComboBoxModel<>();

        for (CPU cpu : AdministraDados.listaCPU) {
            this.modelTodosProdutos.addElement(cpu);
        }

        for (GPU gpu : AdministraDados.listaGPU) {
            this.modelTodosProdutos.addElement(gpu);
        }

        for (Motherboard mb : AdministraDados.listaMB) {
            this.modelTodosProdutos.addElement(mb);
        }

        for (MemoriaRAM ram : AdministraDados.listaRAM) {
            this.modelTodosProdutos.addElement(ram);
        }

        for (Fonte fonte : AdministraDados.listaFonte) {
            this.modelTodosProdutos.addElement(fonte);
        }

        for (DispositivoArmazenamento da : AdministraDados.listaDA) {
            this.modelTodosProdutos.addElement(da);
        }

        for (Cliente cliente : AdministraDados.clienteLista) {
            this.modelTodosClientes.addElement(cliente);
        }

        this.configuraCombos();
    }

    public void configuraBotoes() {

        this.valorTotal = new JLabel("");
        this.ehCartao = new JCheckBox("Cartao");

        this.btnSelecionaProduto = new JButton("Adicionar");
        this.btnSelecionaProduto.addActionListener((ActionEvent e) -> {
            modelOrdem.addElement(modelTodosProdutos.getElementAt(comboMostraProduto.getSelectedIndex()));
            ordem.setModel(modelOrdem);
            valorTotalVenda += modelTodosProdutos.getElementAt(comboMostraProduto.getSelectedIndex()).getPreco();
            valorTotal.setText("R$ " + valorTotalVenda);
        });

        this.btnRemoveProduto = new JButton("Remover");
        this.btnRemoveProduto.addActionListener((ActionEvent e) -> {
            try {
                valorTotalVenda -= modelOrdem.get(ordem.getSelectedIndex()).getPreco();
                valorTotal.setText("R$ " + valorTotalVenda);
                modelOrdem.removeElementAt(ordem.getSelectedIndex());
                ordem.setModel(modelOrdem);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("usuario tentou remover sem selecionar");
            }
        });

        this.btnRealizaVenda = new JButton("Realizar Venda");
        this.btnRealizaVenda.addActionListener((ActionEvent e) -> {

            ArrayList<Produto> produtos = new ArrayList<>();

            for (int i = 0; i < modelOrdem.getSize(); i++) {
                produtos.add(modelOrdem.get(i));
            }

            AdministraDados.realizaVenda(this.funcionario, this.modelTodosClientes.getElementAt(comboMostraCliente.getSelectedIndex()), this.ehCartao.isSelected(), produtos);
            
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja prosseguir com a venda?");
            
            if(escolha != JOptionPane.YES_OPTION){
                return;
            }
                    
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!", "Confirmação de Venda", JOptionPane.INFORMATION_MESSAGE, null);
               
            TelaPrincipal tela = new TelaPrincipal(this.funcionario);
            tela.abreTela();
            dispose();
        });

        this.btnTelaPrincipal = new JButton("Voltar");
        this.btnTelaPrincipal.addActionListener((ActionEvent e) -> {
            TelaPrincipal tela = new TelaPrincipal(this.funcionario);
            tela.abreTela();
            dispose();
        });

    }

    public void configuraCombos() {
        this.comboMostraCliente = new JComboBox(modelTodosClientes);
        this.comboMostraProduto = new JComboBox(modelTodosProdutos);
    }

    public void configuraPainel() {
        this.principalVenda = new JPanel();
        this.principalVenda.add(this.comboMostraCliente);
        this.principalVenda.add(this.comboMostraProduto);
        this.principalVenda.add(new JScrollPane(this.ordem));
        this.principalVenda.add(this.btnSelecionaProduto);
        this.principalVenda.add(this.btnRemoveProduto);
        this.principalVenda.add(this.valorTotal);
        this.principalVenda.add(this.ehCartao);
        this.principalVenda.add(this.btnRealizaVenda);
        this.principalVenda.add(this.btnTelaPrincipal);
    }

    public void abreTela() {
        this.instanciaListas();
        this.configuraBotoes();
        this.configuraPainel();

        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(this.principalVenda);
        this.setVisible(true);
    }

}