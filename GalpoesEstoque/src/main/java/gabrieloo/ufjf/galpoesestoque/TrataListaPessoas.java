/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Cliente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import gabrieloo.ufjf.galpoesestoque.vendas.Venda;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author gabriel
 */
public class TrataListaPessoas implements ListSelectionListener {

    TelaPessoas tela;
    JComboBox comboBox;

    public TrataListaPessoas(TelaPessoas tela, JComboBox comboBox) {
        this.tela = tela;
        this.comboBox = comboBox;
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        int primeiroIndex = tela.getListaPessoas().getSelectedIndex();

        if (primeiroIndex != -1) {
            if (comboBox.getSelectedIndex() == 0) {
                Cliente elementAt0 = (Cliente) tela.getListaPessoas().getModel().getElementAt(primeiroIndex);
                tela.getPessoaNome().setText("Nome: " + elementAt0.getNome());
                tela.getPessoaEmail().setText("Email: " + elementAt0.getEmail());
                tela.getPessoaEndeSala().setText("Endereço: " + elementAt0.getEndereco());
                tela.getPessoaTelValor().setText("Telefone: " + elementAt0.getTelefone());
                tela.getPessoaDataSalaTotal().setText("Data Nascimento: " + elementAt0.getDataNascimento());
                tela.listaVenda.setModel(getOrdens(elementAt0));
                tela.repaint();
            }
            if (comboBox.getSelectedIndex() == 1) {
                Funcionario elementAt1 = (Funcionario) tela.getListaPessoas().getModel().getElementAt(primeiroIndex);
                tela.getPessoaNome().setText(elementAt1.getClass().getSimpleName() + ": " + elementAt1.getNome());
                tela.getPessoaEmail().setText("Email: " + elementAt1.getEmail());
                tela.getPessoaEndeSala().setText("Salário Base: R$" + String.format("%.2f", elementAt1.getSalarioBase()));
                tela.getPessoaTelValor().setText("Valor Vendido: R$" + String.format("%.2f", elementAt1.getValorVendasRealizadas()));
                tela.getPessoaDataSalaTotal().setText("Salário Total: R$" + String.format("%.2f", elementAt1.calculaSalario()));
                tela.listaVenda.setModel(getVendas(elementAt1));
                tela.repaint();
            }

        }
        tela.setUltimoIndex(primeiroIndex);

    }

    private DefaultListModel<Venda> getOrdens(Cliente cliente) {
        DefaultListModel<Venda> modelOrdens = new DefaultListModel<>();

        for (Venda ordem : cliente.ordens) {
            modelOrdens.addElement(ordem);
        }
        
        return modelOrdens;
    }

    private DefaultListModel<Venda> getVendas(Funcionario funcionario) {
        DefaultListModel<Venda> modelVendas = new DefaultListModel<>();

        for (Venda vendas : funcionario.vendasRealizadas) {
            modelVendas.addElement(vendas);
        }
        return modelVendas;
    }

}
