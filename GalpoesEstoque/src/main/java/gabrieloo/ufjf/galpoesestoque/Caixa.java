/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

/**
 *
 * @author gabriel
 */
public class Caixa {

    private static double caixa = 0;

    public static void addCaixa(double valor) {
        caixa += valor;
    }

    public static double getCaixa() {
        return caixa;
    }

    public static double getSaldo() {
        return (caixa - calculaPagamentoSalarios());
    }

    public static double calculaPagamentoSalarios() {
        double totalSalarios = 0;
        
        for (int i = 0; i < AdministraDados.funcionarioLista.size(); i++) {
            totalSalarios += AdministraDados.funcionarioLista.get(i).calculaSalario();
        }
       
        return totalSalarios;
    }

}
