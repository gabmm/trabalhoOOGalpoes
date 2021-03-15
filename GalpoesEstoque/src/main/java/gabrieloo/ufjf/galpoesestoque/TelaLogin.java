/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
 */
package gabrieloo.ufjf.galpoesestoque;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame implements ActionListener {

    private static JTextField campoUsuario;
    private static JPasswordField campoSenha;
    private static JLabel aviso;
    private static int c = 0, t = 0;

    public TelaLogin() {
        super("Login");
        criarLogin();
    }

    private void criarLogin() {
        setLayout(new BorderLayout());
        this.setSize(540, 200);
        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(new FlowLayout());
        JLabel titulo = new JLabel("Login de funcionário:");
        titulo.setFont(new Font("Verdana", Font.PLAIN, 16));
        panelLogin.add(titulo);

        JPanel usuario = new JPanel();
        panelLogin.setLayout(new FlowLayout());

        aviso = new JLabel("");
        aviso.setForeground(Color.red);

        JLabel nomeUsuario = new JLabel("NOME: ");
        campoUsuario = new JTextField(40);

        JLabel senhaUsuario = new JLabel("SENHA: ");
        campoSenha = new JPasswordField(40);

        usuario.add(nomeUsuario);
        usuario.add(campoUsuario);
        usuario.add(senhaUsuario);
        usuario.add(campoSenha);
        usuario.add(aviso);

        JPanel botoes = new JPanel();
        panelLogin.setLayout(new FlowLayout());
        JButton botaoEntrar = new JButton("Entrar");
        botaoEntrar.addActionListener(this);
        botoes.add(botaoEntrar);

        add(panelLogin, BorderLayout.NORTH);
        add(usuario, BorderLayout.CENTER);
        add(botoes, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Autenticacao.getTempo()) {

            if (c < 2) {
			int id = 0;
			while(id < AdministraDados.funcionarioLista.size())
			{
				if(campoUsuario.getText().equals(AdministraDados.funcionarioLista.get(id).getLogin()));
				{
					if(Autenticacao.md5(campoSenha.getText()).equals(AdministraDados.funcionarioLista.get(id).getSenha()))
					{
						TelaPrincipal telaPrincipal = new TelaPrincipal(AdministraDados.funcionarioLista.get(id));
						telaPrincipal.abreTela();
						dispose();
					}
				}
				id++;
			}
			aviso.setText("Os dados informados estão incorretos.");
			c++;
            } else {
                t += c;
				c = 0;
                aviso.setText((t+1) + " tentativas erradas. Aguarde 1 minuto.");
                Autenticacao.setTempo();
            }
        }
    }

    public void abreTela() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setPreferredSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);
        //this.setSize(600, 400);
        this.setVisible(true);
        //this.setExtendedState(MAXIMIZED_BOTH);
    }
}
