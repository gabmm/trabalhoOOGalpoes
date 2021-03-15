/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Cliente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import gabrieloo.ufjf.galpoesestoque.pessoas.Gerente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Usuario;
import gabrieloo.ufjf.galpoesestoque.pessoas.Vendedor;
import gabrieloo.ufjf.galpoesestoque.vendas.Venda;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.colorchooser.DefaultColorSelectionModel;

/**
 *
 * @author gabriel
 */
public class TelaPessoas extends JFrame {

    private JPanel leftPanel;
    public JPanel rightTopPanel;
    public JPanel rightBottomPanel;
    public JPanel rightPanel;
    private JPanel mainPanel;
    private JPanel buttonPanel;

    private JLabel pessoaNome;
    private JLabel pessoaEmail;
    private JLabel pessoaEndeSala;
    private JLabel pessoaTelValor;
    private JLabel pessoaDataSalaTotal;

    private Funcionario funcionario;

    private JComboBox comboPessoa;

    private JList<Usuario> listaPessoas;
    public JList<Venda> listaVenda;

    private DefaultListModel<Usuario> modelCliente;
    private DefaultListModel<Usuario> modelFuncionario;

    private DefaultListModel<Venda> modelVenda;

    private JButton btnTelaPrincipal;
    private JButton btnCadastraNovo;
    private JButton btnRemoveUsuario;

    int ultimoIndex;

    public TelaPessoas(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.ultimoIndex = 0;
    }

    public JLabel getPessoaNome() {
        return pessoaNome;
    }

    public JLabel getPessoaEmail() {
        return pessoaEmail;
    }

    public JLabel getPessoaEndeSala() {
        return pessoaEndeSala;
    }

    public JLabel getPessoaTelValor() {
        return pessoaTelValor;
    }

    public JLabel getPessoaDataSalaTotal() {
        return pessoaDataSalaTotal;
    }

    public void setUltimoIndex(int ultimoIndex) {
        this.ultimoIndex = ultimoIndex;
    }

    public JList<Usuario> getListaPessoas() {
        return listaPessoas;
    }

    private void configuraBotoes() {
        this.btnTelaPrincipal = new JButton("Voltar");
        this.btnTelaPrincipal.addActionListener((ActionEvent e) -> {
            TelaPrincipal tela = new TelaPrincipal(this.funcionario);
            tela.abreTela();
            dispose();
        });

        this.btnCadastraNovo = new JButton("Cadastra Novo");
        this.btnCadastraNovo.addActionListener((ActionEvent e) -> {
            TelaCadastraPessoa tela = new TelaCadastraPessoa(funcionario, comboPessoa.getSelectedIndex());
            tela.abreTela();
            dispose();
        });

        this.btnRemoveUsuario = new JButton("Remove");
        this.btnRemoveUsuario.addActionListener((ActionEvent e) -> {
            try {
                int opcao = comboPessoa.getSelectedIndex();
                int prod = listaPessoas.getSelectedIndex();
                if (AdministraDados.removeUsuario(opcao, prod)) {
                    TelaPessoas repintandoTela = new TelaPessoas(funcionario);
                    repintandoTela.abreTela();
                    dispose();
                }
            } catch (ArrayIndexOutOfBoundsException ex1) {
                System.out.println("Usuario tentou remover sem selecionar");
            }
        });
    }

    private void atualizaListaPessoas() {
        String[] pessoasTipo = {"Clientes", "Funcionarios"};
        this.comboPessoa = new JComboBox(pessoasTipo);

        this.modelCliente = new DefaultListModel<>();
        this.modelFuncionario = new DefaultListModel<>();

        this.modelVenda = new DefaultListModel<>();

        this.listaPessoas = new JList<>();
        this.listaPessoas.setPreferredSize(new Dimension(400, 200));
        this.listaPessoas.setVisible(true);
        this.listaPessoas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        this.listaVenda = new JList<>();
        this.listaVenda.setPreferredSize(new Dimension(400, 200));
        this.listaVenda.setVisible(true);
        this.listaVenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        for (Cliente cliente : AdministraDados.clienteLista) {
            this.modelCliente.addElement(cliente);
        }

        for (Funcionario funcionario : AdministraDados.funcionarioLista) {
            this.modelFuncionario.addElement(funcionario);
        }
    }

    private void configuraPainelSelecao() {
        this.atualizaListaPessoas();

        this.leftPanel = new JPanel();
        this.leftPanel.setSize(400, 400);
        this.leftPanel.setLayout(new BorderLayout());

        this.comboPessoa.addActionListener((ActionEvent e) -> {
            int opcao = comboPessoa.getSelectedIndex();
            if (opcao == 0) {
                listaPessoas.setModel(modelCliente);
            } else if (opcao == 1) {
                listaPessoas.setModel(modelFuncionario);
            }
        });

        this.listaPessoas.addListSelectionListener(new TrataListaPessoas(this, this.comboPessoa));

        this.leftPanel.add(new JScrollPane(listaPessoas), BorderLayout.CENTER);
        this.leftPanel.add(this.comboPessoa, BorderLayout.NORTH);

    }

    private void configuraPainelInformacoes() {

        this.rightPanel = new JPanel();
        this.rightPanel.setLayout(new BoxLayout(this.rightPanel, BoxLayout.Y_AXIS));
        this.rightPanel.setSize(400, 400);

        //InfoTop
        this.rightTopPanel = new JPanel();
        this.rightTopPanel.setLayout(new BoxLayout(this.rightTopPanel, BoxLayout.Y_AXIS));

        this.pessoaNome = new JLabel("");
        this.rightTopPanel.add(pessoaNome);

        this.rightTopPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        this.pessoaEmail = new JLabel("");
        this.rightTopPanel.add(pessoaEmail);

        this.rightTopPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        this.pessoaEndeSala = new JLabel("");
        this.rightTopPanel.add(pessoaEndeSala);

        this.rightTopPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        this.pessoaTelValor = new JLabel("");
        this.rightTopPanel.add(pessoaTelValor);

        this.rightTopPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        this.pessoaDataSalaTotal = new JLabel("");
        this.rightTopPanel.add(pessoaDataSalaTotal);
        
        this.rightTopPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        
        //InfoBottom
        this.rightBottomPanel = new JPanel();
        this.rightBottomPanel.setBorder(BorderFactory.createTitledBorder("Vendas"));
        this.rightBottomPanel.add(new JScrollPane(this.listaVenda));
        
        //add os dois
        
        this.rightPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        this.rightPanel.add(this.rightTopPanel);
        this.rightPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        this.rightPanel.add(this.rightBottomPanel);

    }
    
    public void configuraPainelBotoes()
    {
        this.configuraBotoes();
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new BoxLayout(this.buttonPanel, BoxLayout.X_AXIS));
        
        this.buttonPanel.add(Box.createRigidArea(new Dimension(150, 0)));
        this.buttonPanel.add(btnCadastraNovo);
        this.buttonPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        this.buttonPanel.add(btnRemoveUsuario);
        this.buttonPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        this.buttonPanel.add(btnTelaPrincipal);
        this.buttonPanel.add(Box.createRigidArea(new Dimension(300, 0)));
    }

    public void configuraPainelPrincipal() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.setBorder(BorderFactory.createTitledBorder("Pessoas"));

        this.configuraPainelSelecao();
        this.configuraPainelInformacoes();
        this.configuraPainelBotoes();

        this.mainPanel.add(this.leftPanel, BorderLayout.WEST);
        this.mainPanel.add(this.rightPanel, BorderLayout.CENTER);
        this.mainPanel.add(this.buttonPanel, BorderLayout.SOUTH);
    }

    public void abreTela() {
        configuraPainelPrincipal();

        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(this.mainPanel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
