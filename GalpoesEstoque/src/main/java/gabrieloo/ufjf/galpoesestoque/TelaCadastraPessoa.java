package gabrieloo.ufjf.galpoesestoque;

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

/*
 * @author gabriel
 */
public class TelaCadastraPessoa extends JFrame {

    private JPanel principalCadastra;
    private JPanel painelCenter;
    private JPanel painelBottom;

    private JComboBox comboFuncionario;

    private DefaultComboBoxModel<String> modelMarcas;
    private DefaultComboBoxModel<String> modelCombo1;
    private DefaultComboBoxModel<String> modelCombo2;
    private DefaultComboBoxModel<Integer> modelInt;

    private boolean deuErro;

    private JTextField textNome;
    private JTextField textEmail;
    private JTextField textEndSal;
    private JTextField textTelLogin;
    private JTextField textDataSenha;

    private Funcionario funcionario;

    private JButton btnTelaPessoa;
    private JButton btnCadastra;

    private int selecao;

    public TelaCadastraPessoa(Funcionario funcionario, int selecao) {
        this.funcionario = funcionario;
        this.selecao = selecao;
        this.deuErro = false;
    }

    public void configuraBotoes() {

        this.btnTelaPessoa = new JButton("Voltar");
        this.btnTelaPessoa.addActionListener((ActionEvent e) -> {
            TelaPessoas tela = new TelaPessoas(this.funcionario);
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
                    AdministraDados.cadastraCliente();
                    AdministraDados.clienteLista.get(AdministraDados.clienteLista.size() - 1).setNome(textNome.getText());
                    AdministraDados.clienteLista.get(AdministraDados.clienteLista.size() - 1).setEmail(textEmail.getText());
                    AdministraDados.clienteLista.get(AdministraDados.clienteLista.size() - 1).setTelefone(textTelLogin.getText());
                    AdministraDados.clienteLista.get(AdministraDados.clienteLista.size() - 1).setEndereco(textEndSal.getText());
                    AdministraDados.clienteLista.get(AdministraDados.clienteLista.size() - 1).setDataNascimento(textDataSenha.getText());
                } else if (selecao == 1) {
                    if (this.comboFuncionario.getSelectedIndex() == 0) {
                        AdministraDados.cadastraVendedor();
                    } else if (this.comboFuncionario.getSelectedIndex() == 1) {
                        AdministraDados.cadastraGerente();
                    }
                    AdministraDados.funcionarioLista.get(AdministraDados.funcionarioLista.size() - 1).setNome(textNome.getText());
                    AdministraDados.funcionarioLista.get(AdministraDados.funcionarioLista.size() - 1).setEmail(textEmail.getText());
                    AdministraDados.funcionarioLista.get(AdministraDados.funcionarioLista.size() - 1).setSalarioBase(Double.parseDouble(textEndSal.getText()));
                    AdministraDados.funcionarioLista.get(AdministraDados.funcionarioLista.size() - 1).setLogin(textTelLogin.getText());
                    AdministraDados.funcionarioLista.get(AdministraDados.funcionarioLista.size() - 1).setSenha(Autenticacao.md5(textDataSenha.getText()));
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Alguns campos precisam ser inseridos como números. Por favor, refaça o cadastro.", "AVISO", JOptionPane.INFORMATION_MESSAGE, null);
                if (selecao == 0) {
                    AdministraDados.clienteLista.remove(AdministraDados.clienteLista.size() - 1);
                } else if (selecao == 1) {
                    AdministraDados.funcionarioLista.remove(AdministraDados.funcionarioLista.size() - 1);
                }

                TelaPessoas tela2 = new TelaPessoas(this.funcionario);
                tela2.abreTela();
                dispose();
                this.deuErro = true;
            }

            if (!this.deuErro) {
                JOptionPane.showMessageDialog(null, "Cadastro de pessoa realizado com sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE, null);

                int escolha2 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra pessoa?");

                if (escolha2 != JOptionPane.YES_OPTION) {
                    TelaPessoas tela = new TelaPessoas(this.funcionario);
                    tela.abreTela();
                    dispose();
                } else {
                    TelaCadastraPessoa tela1 = new TelaCadastraPessoa(funcionario, selecao);
                    tela1.abreTela();
                    dispose();
                }
            }

        });

    }

    public void configuraPainelCentral() {

        this.painelCenter = new JPanel();
        this.painelCenter.setLayout(new BoxLayout(this.painelCenter, BoxLayout.Y_AXIS));

        this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

        this.painelCenter.add(new JLabel("Nome: "));
        this.textNome = new JTextField();
        this.painelCenter.add(textNome);
        this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

        this.painelCenter.add(new JLabel("E-mail: "));
        this.textEmail = new JTextField();
        this.painelCenter.add(textEmail);
        this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

        if (this.selecao == 0) {
            this.painelCenter.setBorder(BorderFactory.createTitledBorder("Cadastra novo Cliente"));

            this.painelCenter.add(new JLabel("Endereço: "));
            this.textEndSal = new JTextField();
            this.painelCenter.add(textEndSal);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Telefone: "));
            this.textTelLogin = new JTextField();
            this.painelCenter.add(textTelLogin);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Data Nascimento (dd/mm/yyyy): "));
            this.textDataSenha = new JTextField();
            this.painelCenter.add(textDataSenha);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

        } else if (this.selecao == 1) {
            this.painelCenter.setBorder(BorderFactory.createTitledBorder("Cadastra novo Funcionário"));

            this.painelCenter.add(new JLabel("Salário Base: "));
            this.textEndSal = new JTextField();
            this.painelCenter.add(textEndSal);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Login: "));
            this.textTelLogin = new JTextField();
            this.painelCenter.add(textTelLogin);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.painelCenter.add(new JLabel("Senha: "));
            this.textDataSenha = new JTextField();
            this.painelCenter.add(textDataSenha);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

            this.modelCombo1 = new DefaultComboBoxModel<>();
            this.modelCombo1.addElement("Vendedor");
            this.modelCombo1.addElement("Gerente");

            this.comboFuncionario = new JComboBox(modelCombo1);

            this.painelCenter.add(new JLabel("Função: "));
            this.painelCenter.add(comboFuncionario);
            this.painelCenter.add(Box.createRigidArea(new Dimension(0, 15)));

        }

        this.painelCenter.add(Box.createRigidArea(new Dimension(0, 600)));
    }

    private void configuraPainelInferior() {
        this.painelBottom = new JPanel();
        this.painelBottom.setLayout(new BoxLayout(this.painelBottom, BoxLayout.X_AXIS));

        this.configuraBotoes();

        this.painelBottom.add(Box.createRigidArea(new Dimension(10, 0)));
        this.painelBottom.add(btnCadastra);
        this.painelBottom.add(Box.createRigidArea(new Dimension(150, 0)));
        this.painelBottom.add(btnTelaPessoa);
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

        this.setSize(350, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(this.principalCadastra);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
