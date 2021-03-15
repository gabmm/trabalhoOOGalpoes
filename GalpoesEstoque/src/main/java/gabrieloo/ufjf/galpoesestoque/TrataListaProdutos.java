package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.produtos.CPU;
import gabrieloo.ufjf.galpoesestoque.produtos.DispositivoArmazenamento;
import gabrieloo.ufjf.galpoesestoque.produtos.Fonte;
import gabrieloo.ufjf.galpoesestoque.produtos.GPU;
import gabrieloo.ufjf.galpoesestoque.produtos.MemoriaRAM;
import gabrieloo.ufjf.galpoesestoque.produtos.Motherboard;
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
                tela.getMarcaLabel().setText("Marca: " + elementAt0.getMarca());
                tela.getPrecoProduto().setText("Preço: R$" + String.format("%.2f", elementAt0.getPreco()));
                tela.getQtdLabel().setText("Qtd. estoque: " + elementAt0.getQuantidade() + " unidades");
                tela.getSpecLabel1().setText("Core/Threads: " + elementAt0.getCoreThreads());
                tela.getSpecLabel2().setText(elementAt0.getNome());
                
            } else if (comboBox.getSelectedIndex() == 1) {
                GPU elementAt1 = (GPU) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaLabel().setText("Marca: " + elementAt1.getMarca());
                tela.getPrecoProduto().setText("Preço: R$" + String.format("%.2f", elementAt1.getPreco()));
                tela.getQtdLabel().setText("Qtd. estoque: " + elementAt1.getQuantidade() + " unidades");
                tela.getSpecLabel1().setText("Memória: " + elementAt1.getMemoria());
                tela.getSpecLabel2().setText(elementAt1.getNome());

            } else if (comboBox.getSelectedIndex() == 2) {
                MemoriaRAM elementAt2 = (MemoriaRAM) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaLabel().setText("Marca: " + elementAt2.getMarca());
                tela.getPrecoProduto().setText("Preço: R$" + String.format("%.2f", elementAt2.getPreco()));
                tela.getQtdLabel().setText("Qtd. estoque: " + elementAt2.getQuantidade() + " unidades");
                tela.getSpecLabel1().setText("Capacidade: " + elementAt2.getCapacidade());
                tela.getSpecLabel2().setText("Clock: " + elementAt2.getClock() + "MHz");

            } else if (comboBox.getSelectedIndex() == 3) {
                Motherboard elementAt3 = (Motherboard) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaLabel().setText("Marca: " + elementAt3.getMarca());
                tela.getPrecoProduto().setText("Preço: R$" + String.format("%.2f", elementAt3.getPreco()));
                tela.getQtdLabel().setText("Qtd. estoque: " + elementAt3.getQuantidade() + " unidades");
                tela.getSpecLabel1().setText("Tamanho: " + elementAt3.getTamanho());
                tela.getSpecLabel2().setText("Chipset: " + elementAt3.getChipset());

            } else if (comboBox.getSelectedIndex() == 4) {
                DispositivoArmazenamento elementAt4 = (DispositivoArmazenamento) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaLabel().setText("Marca: " + elementAt4.getMarca());
                tela.getPrecoProduto().setText("Preço: R$" + String.format("%.2f", elementAt4.getPreco()));
                tela.getQtdLabel().setText("Qtd. estoque: " + elementAt4.getQuantidade() + " unidades");
                tela.getSpecLabel2().setText(elementAt4.getTipo());
                tela.getSpecLabel1().setText("Capacidade: " + elementAt4.getCapacidade());

            } else if (comboBox.getSelectedIndex() == 5) {
                Fonte elementAt5 = (Fonte) tela.getListaProduto().getModel().getElementAt(primeiroIndex);
                tela.getMarcaLabel().setText("Marca: " + elementAt5.getMarca());
                tela.getPrecoProduto().setText("Preço: R$" + String.format("%.2f", elementAt5.getPreco()));
                tela.getQtdLabel().setText("Qtd. estoque: " + elementAt5.getQuantidade() + " unidades");
                tela.getSpecLabel2().setText("Power: " + elementAt5.getPower() + "W");
                tela.getSpecLabel1().setText("Eficiência: " + elementAt5.getEficiencia());

            }
            
            tela.setUltimoIndex(primeiroIndex);

        }

    }

}
