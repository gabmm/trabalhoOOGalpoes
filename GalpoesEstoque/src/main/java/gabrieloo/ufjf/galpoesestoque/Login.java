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

public class Login extends JFrame implements ActionListener
{
	private static JTextField campoUsuario;
	private static JPasswordField campoSenha;
	private static JLabel aviso;
	private static int c = 0;

    public  Login()
    {
        super("Login");

        criarLogin();
    }

    private void criarLogin()
    {
        setLayout(new BorderLayout());

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
	public void actionPerformed(ActionEvent e)
	{
		String u = campoUsuario.getText();
		String s = campoSenha.getText();

		if(c < 3)
		{

			if(Autenticacao.busca(u, s))
			{
				TelaPrincipal telaPrincipal = new TelaPrincipal(AdministraDados.funcionarioLista.get(1));
        		telaPrincipal.abreTela();
				dispose();

			}
			else
			{
				aviso.setText("Os dados informados estão incorretos.");
				c++;
			}
		}
		else
		{
			aviso.setText(c+" tentativas erradas. Aguarde"+(c - 2)*15 +" minutos.");
		}

	}
}
