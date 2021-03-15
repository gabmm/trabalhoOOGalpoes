package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* @author gabriel - matricula 201935032
 * @author Weyder
 */
public class TelaPrincipal extends JFrame {

    private JPanel main;

    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel centerPanel;

    private Funcionario usuarioAtual;

    private String nomeUsuario;
    private String tipoUsuario;

    private JButton btnTelaMudaSenha;
    private JButton btnTelaLogin;
    private JButton btnTelaProduto;
    private JButton btnTelaPessoa;
    private JButton btnTelaVenda;
    private JButton btnTelaCaixa;
    private JButton btnSalvar;

    public TelaPrincipal(Funcionario funcionario) {
        super("Tela principal");
        this.usuarioAtual = funcionario;
        this.nomeUsuario = this.usuarioAtual.getNome();
        this.tipoUsuario = this.usuarioAtual.getClass().getSimpleName();
    }

    public Funcionario getUsuarioAtual() {
        return usuarioAtual;
    }

    public void configuraBotoes() {
        this.btnTelaProduto = new JButton("        Produtos        ");
        this.btnTelaProduto.setPreferredSize(new Dimension(100, 60));
        btnTelaProduto.addActionListener((ActionEvent e) -> {
            TelaProduto tela = new TelaProduto(this.getUsuarioAtual());
            tela.abreTela();
            dispose();
        });

        this.btnSalvar = new JButton("        Salvar        ");
        this.btnSalvar.setPreferredSize(new Dimension(100, 60));
        btnSalvar.addActionListener((ActionEvent e) -> {
            
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja mesmo salvar?");
            
            if(escolha != JOptionPane.YES_OPTION){
                return;
            }
            
            JOptionPane.showMessageDialog(null, "Informações salvas!", "Confirmação", JOptionPane.INFORMATION_MESSAGE, null);

            String toJSONCliente = JSON.toJSONCliente(AdministraDados.clienteLista);
//            String toJSONVendedor = JSON.toJSONVendedor(AdministraDados.funcionarioLista);
//            String toJSONGerente = JSON.toJSONGerente(AdministraDados.funcionarioLista);
//            
//          String toJSONVenda = JSON.toJSONVenda(AdministraDados.vendaLista);
//            
//            String toJSONCPU = JSON.toJSONCPU(AdministraDados.listaCPU);
//            String toJSONGPU = JSON.toJSONGPU(AdministraDados.listaGPU);
//            String toJSONMemoriaRam = JSON.toJSONMemoriaRAM(AdministraDados.listaRAM);
//            String toJSONMotherboard = JSON.toJSONMotherboard(AdministraDados.listaMB);
//            String toJSONFonte = JSON.toJSONFonte(AdministraDados.listaFonte);
//            String toJSONDispositivoArmazenamento = JSON.toJSONDispositivoArmazenamento(AdministraDados.listaDA);

            Arquivo.escreverArquivo("dadosCliente", toJSONCliente);
//            Arquivo.escreverArquivo("dadosGerente", toJSONGerente);
//            Arquivo.escreverArquivo("dadosVendedor", toJSONVendedor);
 //           Arquivo.escreverArquivo("dadosVenda", toJSONVenda);

        });

        this.btnTelaPessoa = new JButton("        Pessoas         ");
        btnTelaPessoa.addActionListener((ActionEvent e) -> {
            TelaPessoas tela = new TelaPessoas(this.getUsuarioAtual());
            tela.abreTela();
            dispose();
        });

        this.btnTelaCaixa = new JButton("          Caixa            ");
        btnTelaCaixa.addActionListener((ActionEvent e) -> {
            TelaCaixa tela = new TelaCaixa(this.getUsuarioAtual());
            tela.abreTela();
            dispose();
        });

        this.btnTelaVenda = new JButton("          Vendas          ");
        btnTelaVenda.addActionListener((ActionEvent e) -> {
            TelaVenda tela = new TelaVenda(this.getUsuarioAtual());
            tela.abreTela();
            dispose();

        });
        this.btnTelaMudaSenha = new JButton("  Mudar Senha  ");
        btnTelaMudaSenha.addActionListener((ActionEvent e) -> {
            TelaMudaSenha tela = new TelaMudaSenha(this.getUsuarioAtual());
            tela.abreTela();
            dispose();

        });
        this.btnTelaLogin = new JButton("Logout");
        btnTelaLogin.addActionListener((ActionEvent e) -> {
            TelaLogin tela = new TelaLogin();
            tela.abreTela();
            dispose();

        });
    }

    public void configuraPainelSuperior() {
        this.topPanel = new JPanel();
        this.topPanel.setLayout(new BoxLayout(this.topPanel, BoxLayout.X_AXIS));

        this.topPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        String msgSuperior = "Bem vindo, " + this.tipoUsuario + " " + this.nomeUsuario;
        this.topPanel.add(new JLabel(msgSuperior));
        this.topPanel.add(Box.createRigidArea(new Dimension(250, 0)));
        this.topPanel.add(btnTelaLogin);
        this.topPanel.add(Box.createRigidArea(new Dimension(30, 0)));

    }

    public void configuraPainelCentral() {
        this.centerPanel = new JPanel();
        this.centerPanel.setLayout(new BoxLayout(this.centerPanel, BoxLayout.X_AXIS));

        this.centerPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.centerPanel.add(btnTelaPessoa);
        this.centerPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.centerPanel.add(btnTelaProduto);
        this.centerPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.centerPanel.add(btnSalvar);
        this.centerPanel.add(Box.createRigidArea(new Dimension(30, 0)));
    }

    public void configuraPainelInferior() {
        this.bottomPanel = new JPanel();
        this.bottomPanel.setLayout(new BoxLayout(this.bottomPanel, BoxLayout.X_AXIS));

        this.bottomPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.bottomPanel.add(btnTelaCaixa);
        this.bottomPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.bottomPanel.add(btnTelaVenda);
        this.bottomPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.bottomPanel.add(btnTelaMudaSenha);
        this.bottomPanel.add(Box.createRigidArea(new Dimension(30, 0)));
    }

    public void configuraPainelPrincipal() {
        this.main = new JPanel();
        this.main.setLayout(new BoxLayout(this.main, BoxLayout.Y_AXIS));

        this.main.add(topPanel);
        this.main.add(Box.createRigidArea(new Dimension(0, 30)));
        this.main.add(centerPanel);
        this.main.add(Box.createRigidArea(new Dimension(0, 30)));
        this.main.add(bottomPanel);
        this.main.add(Box.createRigidArea(new Dimension(0, 30)));
    }

    public void abreTela() {
        configuraBotoes();
        configuraPainelSuperior();
        configuraPainelCentral();
        configuraPainelInferior();
        configuraPainelPrincipal();

        this.add(this.main);
        this.setSize(700, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
