/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gabriel
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

    private JButton btnTelaLogin;
    private JButton btnTelaProduto;
    private JButton btnTelaPessoa;
    private JButton btnTelaVenda;
    private JButton btnTelaCaixa;

    public TelaPrincipal(Funcionario funcionario) {
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

        this.btnTelaPessoa = new JButton("        Pessoas         ");
        btnTelaProduto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                TelaPessoa tela = new TelaPessoa();
//                tela.incializaTelaPessoa();
//                dispose();
            }
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

        this.btnTelaLogin = new JButton("Logout");
        btnTelaLogin.addActionListener((ActionEvent e) -> {
            TelaLogin tela = new TelaLogin();
            tela.abreTela();
            dispose();

        });
    }
    
    public void configuraPainelSuperior(){
        this.topPanel = new JPanel();
        this.topPanel.setLayout(new BoxLayout(this.topPanel, BoxLayout.X_AXIS));
        
        String msgSuperior = "Bem vindo, " + this.tipoUsuario + " " + this.nomeUsuario;
        this.topPanel.add(new JLabel(msgSuperior));
        this.topPanel.add(Box.createRigidArea(new Dimension(60, 0)));
        this.topPanel.add(btnTelaLogin);
        this.topPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        
    }
    
    public void configuraPainelCentral(){
        this.centerPanel = new JPanel();
        this.centerPanel.setLayout(new BoxLayout(this.centerPanel, BoxLayout.X_AXIS));
        
        this.centerPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.centerPanel.add(btnTelaPessoa);
        this.centerPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.centerPanel.add(btnTelaProduto);
        this.centerPanel.add(Box.createRigidArea(new Dimension(30, 0)));
    }
    
    public void configuraPainelInferior(){
        this.bottomPanel = new JPanel();
        this.bottomPanel.setLayout(new BoxLayout(this.bottomPanel, BoxLayout.X_AXIS));
        
        this.bottomPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.bottomPanel.add(btnTelaCaixa);
        this.bottomPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        this.bottomPanel.add(btnTelaVenda);
        this.bottomPanel.add(Box.createRigidArea(new Dimension(30, 0)));
    }
    
    public void configuraPainelPrincipal()
    {
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
        this.setSize(550, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.pack();
        this.setVisible(true);

    }

}
