/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.produtos.CPU;
import gabrieloo.ufjf.galpoesestoque.produtos.DispositivoArmazenamento;
import gabrieloo.ufjf.galpoesestoque.produtos.Fonte;
import gabrieloo.ufjf.galpoesestoque.produtos.GPU;
import gabrieloo.ufjf.galpoesestoque.produtos.MemoriaRAM;
import gabrieloo.ufjf.galpoesestoque.produtos.Motherboard;
import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import javax.swing.JComboBox;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author gabriel
 */
public class TrataListaProdutos implements ListSelectionListener {

    TelaProduto tela;
    JComboBox comboBox;

    public TrataListaProdutos(TelaProduto tela, JComboBox comboBox) {
        this.tela = tela;
        this.comboBox = comboBox;
    }
    
    


    @Override
    public void valueChanged(ListSelectionEvent e) {
        int primeiroIndex = tela.getListaProduto().getSelectedIndex();

        if (primeiroIndex != -1) {
            
            if (comboBox.getSelectedIndex() == 0) {
                CPU elementAt0 = (CPU) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaProduto().setText(elementAt0.getMarca());
                tela.getPrecoProduto().setText("" + elementAt0.getPreco());
                tela.getQuantidadeProduto().setText("" + elementAt0.getQuantidade());
                tela.getSpecText1().setText(elementAt0.getCoreThreads());
                tela.getSpecText2().setText(elementAt0.getNome());
                
            } else if (comboBox.getSelectedIndex() == 1) {
                GPU elementAt1 = (GPU) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaProduto().setText(elementAt1.getMarca());
                tela.getPrecoProduto().setText("" + elementAt1.getPreco());
                tela.getQuantidadeProduto().setText("" + elementAt1.getQuantidade());
                tela.getSpecText1().setText(elementAt1.getMemoria());
                tela.getSpecText2().setText(elementAt1.getNome());

            } else if (comboBox.getSelectedIndex() == 2) {
                MemoriaRAM elementAt2 = (MemoriaRAM) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaProduto().setText(elementAt2.getMarca());
                tela.getPrecoProduto().setText("" + elementAt2.getPreco());
                tela.getQuantidadeProduto().setText("" + elementAt2.getQuantidade());
                tela.getSpecText1().setText(elementAt2.getCapacidade());
                tela.getSpecText2().setText("" + elementAt2.getClock());

            } else if (comboBox.getSelectedIndex() == 3) {
                Motherboard elementAt3 = (Motherboard) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaProduto().setText(elementAt3.getMarca());
                tela.getPrecoProduto().setText("" + elementAt3.getPreco());
                tela.getQuantidadeProduto().setText("" + elementAt3.getQuantidade());
                tela.getSpecText1().setText(elementAt3.getTamanho());
                tela.getSpecText2().setText(elementAt3.getChipset());

            } else if (comboBox.getSelectedIndex() == 4) {
                DispositivoArmazenamento elementAt4 = (DispositivoArmazenamento) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaProduto().setText(elementAt4.getMarca());
                tela.getPrecoProduto().setText("" + elementAt4.getPreco());
                tela.getQuantidadeProduto().setText("" + elementAt4.getQuantidade());
                tela.getSpecText1().setText(elementAt4.getTipo());
                tela.getSpecText2().setText(elementAt4.getCapacidade());

            } else if (comboBox.getSelectedIndex() == 5) {
                Fonte elementAt5 = (Fonte) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaProduto().setText(elementAt5.getMarca());
                tela.getPrecoProduto().setText("" + elementAt5.getPreco());
                tela.getQuantidadeProduto().setText("" + elementAt5.getQuantidade());
                tela.getSpecText1().setText("" + elementAt5.getPower());
                tela.getSpecText2().setText(elementAt5.getEficiencia());

            }
            
            tela.setUltimoIndex(primeiroIndex);

        }

    }

}
