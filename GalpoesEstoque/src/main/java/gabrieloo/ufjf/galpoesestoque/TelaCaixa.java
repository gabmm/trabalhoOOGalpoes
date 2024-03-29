package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import gabrieloo.ufjf.galpoesestoque.vendas.Venda;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author gabriel  - matricula 201935032
 */
public class TelaCaixa extends JFrame {

    private JLabel qtdCaixa;
    private JLabel custos;
    private JLabel receita;
    private JLabel qtdVendasRealizadas;

    private JLabel nomeFuncionario;
    private JLabel numVendasFuncionario;
    private JLabel valorTotalVendido;
    private JLabel salarioBase;
    private JLabel salarioTotal;

    private JList<Venda> funcionarioVendas;

    private DefaultListModel<Venda> funcionarioVendasModel;

    private JPanel principalCaixa;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel topPanel;

    private JButton btnTelaPrincipal;

    private Funcionario funcionario;

    public TelaCaixa(Funcionario funcionario) {
        super("Caixa");
        this.funcionario = funcionario;
    }

    public void atualizaValoresGerais() {
        receita = new JLabel("Receita: R$" + String.format("%.2f", Caixa.getReceita()));
        custos = new JLabel("Custos: R$-" + String.format("%.2f", Caixa.calculaPagamentoSalarios()));
        custos.setForeground(Color.red);
        qtdCaixa = new JLabel("Caixa: R$" + String.format("%.2f", Caixa.getSaldo()));
        qtdVendasRealizadas = new JLabel("Numero total de vendas: " + AdministraDados.getQuantidadeVendas());
    }

    public void atualizaValoresFuncionario() {
        nomeFuncionario = new JLabel(funcionario.getClass().getSimpleName() + " " + funcionario.getNome());
        numVendasFuncionario = new JLabel("Vendas Realizadas: " + funcionario.getQuantidadeVendasRealizadas());
        valorTotalVendido = new JLabel("Valor Total: R$ " + String.format("%.2f", funcionario.getValorVendasRealizadas()));
        salarioBase = new JLabel("Salário Base: R$ " + String.format("%.2f", funcionario.getSalarioBase()));
        salarioTotal = new JLabel("Salário Total: R$ " + String.format("%.2f", funcionario.calculaSalario()));
    }

    public void configuraPainelEsquerda() {
        leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createTitledBorder("Informações Gerais"));
        leftPanel.add(qtdVendasRealizadas);
        leftPanel.add(receita);
        leftPanel.add(custos);
        leftPanel.add(qtdCaixa);
    }

    public void configuraPainelSuperior() {
        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        configuraBotoes();

        topPanel.add(nomeFuncionario, BorderLayout.WEST);
        topPanel.add(btnTelaPrincipal, BorderLayout.EAST);
    }

    public void configuraPainelDireita() {
        rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createTitledBorder("Informações Funcionário"));
        rightPanel.add(numVendasFuncionario);
        rightPanel.add(valorTotalVendido);
        rightPanel.add(salarioBase);
        rightPanel.add(salarioTotal);
    }

    public void configuraPainelPrincipal() {
        principalCaixa = new JPanel();
        principalCaixa.setBorder(BorderFactory.createTitledBorder("Caixa"));
        principalCaixa.setLayout(new BorderLayout());

        configuraPainelDireita();
        configuraPainelEsquerda();
        configuraPainelSuperior();

        principalCaixa.add(leftPanel, BorderLayout.WEST);
        principalCaixa.add(topPanel, BorderLayout.NORTH);
        principalCaixa.add(rightPanel, BorderLayout.CENTER);
    }

    public void configuraBotoes() {
        this.btnTelaPrincipal = new JButton("Voltar");
        this.btnTelaPrincipal.addActionListener((ActionEvent e) -> {
            TelaPrincipal tela = new TelaPrincipal(this.funcionario);
            tela.abreTela();
            dispose();
        });
    }

    public void abreTela() {
        atualizaValoresGerais();
        atualizaValoresFuncionario();

        configuraPainelPrincipal();

        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(principalCaixa);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
