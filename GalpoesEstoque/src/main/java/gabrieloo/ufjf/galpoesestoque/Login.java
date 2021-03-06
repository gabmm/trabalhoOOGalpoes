/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author caioa
 */

public class Login extends JFrame
{
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
        
        JLabel nomeUsuario = new JLabel("NOME: ");
        JTextField campoUsuario = new JTextField(40);
        
        JLabel senhaUsuario = new JLabel("SENHA: ");
        JTextField campoSenha = new JTextField(40);
        
        usuario.add(nomeUsuario);
        usuario.add(campoUsuario);
        usuario.add(senhaUsuario);
        usuario.add(campoSenha);
        
        JPanel botoes = new JPanel();
        panelLogin.setLayout(new FlowLayout());
        
        JButton botaoEntrar = new JButton("Entrar");
        
        botoes.add(botaoEntrar);
        
        add(panelLogin, BorderLayout.NORTH);
        add(usuario, BorderLayout.CENTER);
        add(botoes, BorderLayout.SOUTH);    
    }
}