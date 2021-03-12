/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public TelaPrincipal(Funcionario funcionario) {
        this.usuarioAtual = funcionario;
        this.nomeUsuario = this.usuarioAtual.getNome();
        this.tipoUsuario = this.usuarioAtual.getClass().getSimpleName();
    }

    public void abreTela() {
        this.main = new JPanel();

        this.rightPanel = new JPanel();
        this.leftPanel = new JPanel();
        this.topPanel = new JPanel();
        this.bottomPanel = new JPanel();
        this.centerPanel = new JPanel();

        this.main.setLayout(new BorderLayout());

        String msgSuperior = "Bem vindo, " + this.tipoUsuario + " " + this.nomeUsuario;

        this.btnTelaProduto = new JButton("Produtos");
        btnTelaProduto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaProduto tela = new TelaProduto();
                tela.incializaTelaProduto();
                dispose();
            }
        });

        this.btnTelaPessoa = new JButton("Pessoas");
        btnTelaProduto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                TelaPessoa tela = new TelaPessoa();
//                tela.incializaTelaPessoa();
//                dispose();
            }
        });

        this.btnTelaVenda = new JButton("Vendas");
        btnTelaProduto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                TelaProduto tela = new TelaVenda();
//                tela.incializaTelaVenda();
//                dispose();
            }
        });

        this.btnTelaLogin = new JButton("Voltar");
        btnTelaProduto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                TelaLogin tela = new TelaLogin();
//                tela.incializaTelaLogin();
//                dispose();
            }
        });

        this.topPanel.setLayout(new BorderLayout());
        this.topPanel.add(new JLabel(msgSuperior), BorderLayout.WEST);

        this.rightPanel.setLayout(new BorderLayout());
        this.rightPanel.add(btnTelaLogin, BorderLayout.SOUTH);
        this.rightPanel.add(btnTelaVenda, BorderLayout.NORTH);
       

        this.main.add(rightPanel, BorderLayout.EAST);
        this.main.add(leftPanel, BorderLayout.WEST);
        this.main.add(topPanel, BorderLayout.NORTH);
        this.main.add(bottomPanel, BorderLayout.SOUTH);
        this.main.add(centerPanel, BorderLayout.CENTER);

        this.centerPanel.add(btnTelaProduto);
        this.leftPanel.add(btnTelaPessoa);

        this.add(this.main);
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
