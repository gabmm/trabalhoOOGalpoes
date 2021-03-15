/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class TelaMudaSenha extends JFrame {

	private JPasswordField campoSenha;
	private JPasswordField campoNovaSenha;

	private JLabel aviso;
    private JLabel senha;
    private JLabel novaSenha;
	private JLabel nomeFuncionario;

    private JPanel principalMudaSenha;
	private JPanel topPanel;
	private JPanel formulario;
	private JPanel botoes;

    private JButton btnTelaPrincipal;
	private JButton btnMudaSenha;

    private Funcionario funcionario;

    public TelaMudaSenha(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void configuraPainelSuperior() {
        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
		nomeFuncionario = new JLabel(funcionario.getClass().getSimpleName() + " " + funcionario.getNome());
        topPanel.add(nomeFuncionario, BorderLayout.WEST);
    }

	public void configuraFormulario() {
		formulario = new JPanel();
		formulario.setLayout(new BoxLayout(formulario, BoxLayout.Y_AXIS));
		senha = new JLabel("Senha atual: ");
		formulario.add(senha);

		campoSenha = new JPasswordField(30);
		formulario.add(campoSenha);

		novaSenha = new JLabel("Nova senha: ");
		formulario.add(novaSenha);

		campoNovaSenha = new JPasswordField(30);
		formulario.add(campoNovaSenha);
	}

	public void configuraPainelPrincipal() {

		principalMudaSenha = new JPanel();
		principalMudaSenha.setBorder(BorderFactory.createTitledBorder("Mudar Senha"));
        principalMudaSenha.setLayout(new BorderLayout());

		configuraPainelSuperior();
		configuraFormulario();
		configuraBotoes();

		principalMudaSenha.add(topPanel, BorderLayout.NORTH);
		principalMudaSenha.add(formulario, BorderLayout.CENTER);
		principalMudaSenha.add(botoes, BorderLayout.SOUTH);
	}

    public void configuraBotoes() {
		botoes = new JPanel();
		botoes.setLayout(new BoxLayout(botoes, BoxLayout.X_AXIS));

        this.btnTelaPrincipal = new JButton("Voltar");
        this.btnTelaPrincipal.addActionListener((ActionEvent e) -> {
            TelaPrincipal tela = new TelaPrincipal(this.funcionario);
            tela.abreTela();
            dispose();
        });

		this.btnMudaSenha = new JButton("Confirmar");
		this.btnMudaSenha.addActionListener((ActionEvent e) -> {
			if(Autenticacao.md5(campoSenha.getText()).equals(funcionario.getSenha()))
			{
				funcionario.setSenha(Autenticacao.md5(campoNovaSenha.getText()));
				TelaPrincipal tela = new TelaPrincipal(this.funcionario);
				tela.abreTela();
				dispose();
				System.out.println("Senha alterada");
			}
			else {
				aviso.setText("Senha atual incorreta.");
			}
		});

		aviso = new JLabel("");
		aviso.setForeground(Color.red);

		botoes.add(btnMudaSenha, BorderLayout.WEST);
		botoes.add(btnTelaPrincipal, BorderLayout.EAST);
		botoes.add(aviso);
    }

    public void abreTela() {
        configuraPainelPrincipal();

        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(principalMudaSenha);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
