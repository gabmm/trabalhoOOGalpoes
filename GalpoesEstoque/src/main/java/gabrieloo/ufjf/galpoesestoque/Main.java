/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import java.util.ArrayList;

public class Main {

    private static void rotinaInicializacao() {
        AdministraDados.inicializacaoListas();

        // CPU =======================
        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(0).setMarca(6);
        AdministraDados.listaCPU.get(0).setPreco(1300);
        AdministraDados.listaCPU.get(0).setNome("Ryzen 5 3500x");
        AdministraDados.listaCPU.get(0).setCoreThreads(0);
        AdministraDados.listaCPU.get(0).setQuantidade(6);

        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(1).setMarca(8);
        AdministraDados.listaCPU.get(1).setPreco(1238);
        AdministraDados.listaCPU.get(1).setNome("Core i5 10400F");
        AdministraDados.listaCPU.get(1).setCoreThreads(7);
        AdministraDados.listaCPU.get(1).setQuantidade(10);

        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(2).setMarca(8);
        AdministraDados.listaCPU.get(2).setPreco(890);
        AdministraDados.listaCPU.get(2).setNome("Core i3 10100F");
        AdministraDados.listaCPU.get(2).setCoreThreads(5);
        AdministraDados.listaCPU.get(2).setQuantidade(2);

        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(3).setMarca(6);
        AdministraDados.listaCPU.get(3).setPreco(1420);
        AdministraDados.listaCPU.get(3).setNome("Ryzen 5 3500X");
        AdministraDados.listaCPU.get(3).setCoreThreads(6);
        AdministraDados.listaCPU.get(3).setQuantidade(30);

        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(4).setMarca(6);
        AdministraDados.listaCPU.get(4).setPreco(940);
        AdministraDados.listaCPU.get(4).setNome("Ryzen 3 2200G");
        AdministraDados.listaCPU.get(4).setCoreThreads(4);
        AdministraDados.listaCPU.get(4).setQuantidade(12);

        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(5).setMarca(8);
        AdministraDados.listaCPU.get(5).setPreco(890);
        AdministraDados.listaCPU.get(5).setNome("Core i7 3770");
        AdministraDados.listaCPU.get(5).setCoreThreads(5);
        AdministraDados.listaCPU.get(5).setQuantidade(10);

        // DA =======================
        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(0).setMarca(7);
        AdministraDados.listaDA.get(0).setPreco(250);
        AdministraDados.listaDA.get(0).setTipo(0);
        AdministraDados.listaDA.get(0).setCapacidade(4);
        AdministraDados.listaDA.get(0).setQuantidade(20);

        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(1).setMarca(10);
        AdministraDados.listaDA.get(1).setPreco(292);
        AdministraDados.listaDA.get(1).setTipo(0);
        AdministraDados.listaDA.get(1).setCapacidade(5);
        AdministraDados.listaDA.get(1).setQuantidade(12);

        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(2).setMarca(10);
        AdministraDados.listaDA.get(2).setPreco(635);
        AdministraDados.listaDA.get(2).setTipo(0);
        AdministraDados.listaDA.get(2).setCapacidade(6);
        AdministraDados.listaDA.get(2).setQuantidade(7);

        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(3).setMarca(7);
        AdministraDados.listaDA.get(3).setPreco(360);
        AdministraDados.listaDA.get(3).setTipo(1);
        AdministraDados.listaDA.get(3).setCapacidade(2);
        AdministraDados.listaDA.get(3).setQuantidade(22);

        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(4).setMarca(11);
        AdministraDados.listaDA.get(4).setPreco(303);
        AdministraDados.listaDA.get(4).setTipo(1);
        AdministraDados.listaDA.get(4).setCapacidade(2);
        AdministraDados.listaDA.get(4).setQuantidade(8);

        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(5).setMarca(11);
        AdministraDados.listaDA.get(5).setPreco(445);
        AdministraDados.listaDA.get(5).setTipo(1);
        AdministraDados.listaDA.get(5).setCapacidade(3);
        AdministraDados.listaDA.get(5).setQuantidade(18);

        // Fonte =======================
        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(0).setMarca(3);
        AdministraDados.listaFonte.get(0).setPreco(500);
        AdministraDados.listaFonte.get(0).setEficiencia(2);
        AdministraDados.listaFonte.get(0).setPower(6);
        AdministraDados.listaFonte.get(0).setQuantidade(20);

        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(1).setMarca(12);
        AdministraDados.listaFonte.get(1).setPreco(150);
        AdministraDados.listaFonte.get(1).setEficiencia(0);
        AdministraDados.listaFonte.get(1).setPower(4);
        AdministraDados.listaFonte.get(1).setQuantidade(12);

        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(2).setMarca(0);
        AdministraDados.listaFonte.get(2).setPreco(300);
        AdministraDados.listaFonte.get(2).setEficiencia(1);
        AdministraDados.listaFonte.get(2).setPower(4);
        AdministraDados.listaFonte.get(2).setQuantidade(11);

        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(3).setMarca(13);
        AdministraDados.listaFonte.get(3).setPreco(410);
        AdministraDados.listaFonte.get(3).setEficiencia(1);
        AdministraDados.listaFonte.get(3).setPower(5);
        AdministraDados.listaFonte.get(3).setQuantidade(6);

        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(4).setMarca(13);
        AdministraDados.listaFonte.get(4).setPreco(660);
        AdministraDados.listaFonte.get(4).setEficiencia(2);
        AdministraDados.listaFonte.get(4).setPower(9);
        AdministraDados.listaFonte.get(4).setQuantidade(30);

        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(5).setMarca(14);
        AdministraDados.listaFonte.get(5).setPreco(50);
        AdministraDados.listaFonte.get(5).setEficiencia(0);
        AdministraDados.listaFonte.get(5).setPower(3);
        AdministraDados.listaFonte.get(5).setQuantidade(6);

        // GPU =======================
        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(0).setMarca(0);
        AdministraDados.listaGPU.get(0).setPreco(2300);
        AdministraDados.listaGPU.get(0).setNome("RTX 2060");
        AdministraDados.listaGPU.get(0).setMemoria(6);
        AdministraDados.listaGPU.get(0).setQuantidade(6);

        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(1).setMarca(1);
        AdministraDados.listaGPU.get(1).setPreco(10510);
        AdministraDados.listaGPU.get(1).setNome("RX 2070");
        AdministraDados.listaGPU.get(1).setMemoria(4);
        AdministraDados.listaGPU.get(1).setQuantidade(12);

        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(2).setMarca(9);
        AdministraDados.listaGPU.get(2).setPreco(2267);
        AdministraDados.listaGPU.get(2).setNome("RX 6800");
        AdministraDados.listaGPU.get(2).setMemoria(9);
        AdministraDados.listaGPU.get(2).setQuantidade(9);

        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(3).setMarca(1);
        AdministraDados.listaGPU.get(3).setPreco(1700);
        AdministraDados.listaGPU.get(3).setNome("RX 6800");
        AdministraDados.listaGPU.get(3).setMemoria(4);
        AdministraDados.listaGPU.get(3).setQuantidade(13);

        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(4).setMarca(9);
        AdministraDados.listaGPU.get(4).setPreco(2267);
        AdministraDados.listaGPU.get(4).setNome("GTX 1650");
        AdministraDados.listaGPU.get(4).setMemoria(5);
        AdministraDados.listaGPU.get(4).setQuantidade(15);

        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(5).setMarca(6);
        AdministraDados.listaGPU.get(5).setPreco(2070);
        AdministraDados.listaGPU.get(5).setNome("RX 5500");
        AdministraDados.listaGPU.get(5).setMemoria(6);
        AdministraDados.listaGPU.get(5).setQuantidade(22);

        //RAM =======================
        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(0).setMarca(4);
        AdministraDados.listaRAM.get(0).setPreco(250);
        AdministraDados.listaRAM.get(0).setCapacidade(4);
        AdministraDados.listaRAM.get(0).setClock(2667);
        AdministraDados.listaRAM.get(0).setQuantidade(42);

        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(1).setMarca(16);
        AdministraDados.listaRAM.get(1).setPreco(600);
        AdministraDados.listaRAM.get(1).setCapacidade(9);
        AdministraDados.listaRAM.get(1).setClock(4000);
        AdministraDados.listaRAM.get(1).setQuantidade(20);

        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(2).setMarca(5);
        AdministraDados.listaRAM.get(2).setPreco(295);
        AdministraDados.listaRAM.get(2).setCapacidade(6);
        AdministraDados.listaRAM.get(2).setClock(3200);
        AdministraDados.listaRAM.get(2).setQuantidade(14);

        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(3).setMarca(13);
        AdministraDados.listaRAM.get(3).setPreco(350);
        AdministraDados.listaRAM.get(3).setCapacidade(6);
        AdministraDados.listaRAM.get(3).setClock(2400);
        AdministraDados.listaRAM.get(3).setQuantidade(21);

        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(4).setMarca(7);
        AdministraDados.listaRAM.get(4).setPreco(80);
        AdministraDados.listaRAM.get(4).setCapacidade(2);
        AdministraDados.listaRAM.get(4).setClock(887);
        AdministraDados.listaRAM.get(4).setQuantidade(39);

        // MB =======================
        AdministraDados.cadastraMotherboard();
        AdministraDados.listaMB.get(0).setMarca(2);
        AdministraDados.listaMB.get(0).setPreco(570);
        AdministraDados.listaMB.get(0).setChipset(1);
        AdministraDados.listaMB.get(0).setTamanho(2);
        AdministraDados.listaMB.get(0).setQuantidade(19);

        AdministraDados.cadastraMotherboard();
        AdministraDados.listaMB.get(1).setMarca(1);
        AdministraDados.listaMB.get(1).setPreco(1200);
        AdministraDados.listaMB.get(1).setChipset(9);
        AdministraDados.listaMB.get(1).setTamanho(1);
        AdministraDados.listaMB.get(1).setQuantidade(3);

        AdministraDados.cadastraMotherboard();
        AdministraDados.listaMB.get(2).setMarca(17);
        AdministraDados.listaMB.get(2).setPreco(440);
        AdministraDados.listaMB.get(2).setChipset(18);
        AdministraDados.listaMB.get(2).setTamanho(2);
        AdministraDados.listaMB.get(2).setQuantidade(9);

        AdministraDados.cadastraMotherboard();
        AdministraDados.listaMB.get(3).setMarca(18);
        AdministraDados.listaMB.get(3).setPreco(1890);
        AdministraDados.listaMB.get(3).setChipset(16);
        AdministraDados.listaMB.get(3).setTamanho(0);
        AdministraDados.listaMB.get(3).setQuantidade(4);

        AdministraDados.cadastraMotherboard();
        AdministraDados.listaMB.get(4).setMarca(19);
        AdministraDados.listaMB.get(4).setPreco(690);
        AdministraDados.listaMB.get(4).setChipset(3);
        AdministraDados.listaMB.get(4).setTamanho(3);
        AdministraDados.listaMB.get(4).setQuantidade(12);

        // PESSOAS =======================
        AdministraDados.cadastraGerente();
        AdministraDados.funcionarioLista.get(0).setNome("Jober Arauto");
        AdministraDados.funcionarioLista.get(0).setEmail("joarauto@galpoes.com");
        AdministraDados.funcionarioLista.get(0).setSalarioBase(4800);
        AdministraDados.funcionarioLista.get(0).setLogin("jober");
        AdministraDados.funcionarioLista.get(0).setSenha(Autenticacao.md5("jojo123"));

        AdministraDados.cadastraGerente();
        AdministraDados.funcionarioLista.get(1).setNome("Roberto Justus");
        AdministraDados.funcionarioLista.get(1).setEmail("jusus@galpoes.com");
        AdministraDados.funcionarioLista.get(1).setSalarioBase(4800);
        AdministraDados.funcionarioLista.get(1).setLogin("justus");
        AdministraDados.funcionarioLista.get(1).setSenha(Autenticacao.md5("juju123"));

        AdministraDados.cadastraCliente();
        AdministraDados.clienteLista.get(0).setNome("Julia Trista");
        AdministraDados.clienteLista.get(0).setEmail("jujuzinha2014@hotmail.com");
        AdministraDados.clienteLista.get(0).setTelefone("(21) 9 9188-9988");
        AdministraDados.clienteLista.get(0).setEndereco("R. das Pedras, 301 - Rio de Janeiro");
        AdministraDados.clienteLista.get(0).setDataNascimento("11/01/1998");

        AdministraDados.cadastraCliente();
        AdministraDados.clienteLista.get(1).setNome("Enzo Valentino");
        AdministraDados.clienteLista.get(1).setEmail("valenteenzo69@gmail.com");
        AdministraDados.clienteLista.get(1).setTelefone("(32) 9 9188-9988");
        AdministraDados.clienteLista.get(1).setEndereco("Av. Rio Branco, 1010 - Juiz de Fora");
        AdministraDados.clienteLista.get(1).setDataNascimento("27/01/1998");

        AdministraDados.cadastraCliente();
        AdministraDados.clienteLista.get(2).setNome("Caetano Veloso");
        AdministraDados.clienteLista.get(2).setEmail("velosocaetano@gmail.com");
        AdministraDados.clienteLista.get(2).setTelefone("(61) 9 9188-9988");
        AdministraDados.clienteLista.get(2).setEndereco("R. Almeira Vilela, 699 - Brasília");
        AdministraDados.clienteLista.get(2).setDataNascimento("01/03/1961");

        AdministraDados.cadastraCliente();
        AdministraDados.clienteLista.get(3).setNome("Rainha Elizabeth II");
        AdministraDados.clienteLista.get(3).setEmail("elizabethtk@gmail.com");
        AdministraDados.clienteLista.get(3).setTelefone("+13 (555) 1927-6541");
        AdministraDados.clienteLista.get(3).setEndereco("John Rutherford St., 301 - Londres");
        AdministraDados.clienteLista.get(3).setDataNascimento("13/07/1929");

        AdministraDados.cadastraCliente();
        AdministraDados.clienteLista.get(4).setNome("Luiz Inácio");
        AdministraDados.clienteLista.get(4).setEmail("lula@partido.pt.com");
        AdministraDados.clienteLista.get(4).setTelefone("(11) 9 9992-4416");
        AdministraDados.clienteLista.get(4).setEndereco("R. dos Bandeirantes, 22 - São Bernardo");
        AdministraDados.clienteLista.get(4).setDataNascimento("01/05/1951");

        AdministraDados.cadastraVendedor();
        AdministraDados.funcionarioLista.get(2).setNome("Ana Gabriela de Passos Lima");
        AdministraDados.funcionarioLista.get(2).setEmail("anagabi@galpoes.com");
        AdministraDados.funcionarioLista.get(2).setSalarioBase(2200);
        AdministraDados.funcionarioLista.get(2).setLogin("anagabi");
        AdministraDados.funcionarioLista.get(2).setSenha(Autenticacao.md5("senha"));

        AdministraDados.cadastraVendedor();
        AdministraDados.funcionarioLista.get(3).setNome("Silvio Santos");
        AdministraDados.funcionarioLista.get(3).setEmail("silviosantos@galpoes.com");
        AdministraDados.funcionarioLista.get(3).setSalarioBase(2200);
        AdministraDados.funcionarioLista.get(3).setLogin("ssantos");
        AdministraDados.funcionarioLista.get(3).setSenha(Autenticacao.md5("sbtss"));

        AdministraDados.cadastraVendedor();
        AdministraDados.funcionarioLista.get(4).setNome("Bettina Rudolph");
        AdministraDados.funcionarioLista.get(4).setEmail("rudolphbettina@galpoes.com");
        AdministraDados.funcionarioLista.get(4).setSalarioBase(2200);
        AdministraDados.funcionarioLista.get(4).setLogin("bettina");
        AdministraDados.funcionarioLista.get(4).setSenha(Autenticacao.md5("empiricus"));
        
        //Vendas
        ArrayList<Produto> vendas0 = new ArrayList<>();
        vendas0.add(AdministraDados.listaCPU.get(0));
        vendas0.add(AdministraDados.listaRAM.get(1));
        vendas0.add(AdministraDados.listaRAM.get(1));
        vendas0.add(AdministraDados.listaMB.get(2));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(0), AdministraDados.clienteLista.get(0), true, vendas0);
        

        ArrayList<Produto> vendas1 = new ArrayList<>();
        vendas1.add(AdministraDados.listaFonte.get(2));
        vendas1.add(AdministraDados.listaGPU.get(1));
        vendas1.add(AdministraDados.listaDA.get(0));
        vendas1.add(AdministraDados.listaMB.get(1));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(1), AdministraDados.clienteLista.get(0), true, vendas1);
        

        ArrayList<Produto> vendas2 = new ArrayList<>();
        vendas2.add(AdministraDados.listaCPU.get(4));
        vendas2.add(AdministraDados.listaGPU.get(0));
        vendas2.add(AdministraDados.listaDA.get(3));
        vendas2.add(AdministraDados.listaRAM.get(1));
        vendas2.add(AdministraDados.listaMB.get(4));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(3), AdministraDados.clienteLista.get(3), false, vendas2);
        

        ArrayList<Produto> vendas3 = new ArrayList<>();
        vendas3.add(AdministraDados.listaGPU.get(3));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(1), AdministraDados.clienteLista.get(4), true, vendas3);
        
  
        ArrayList<Produto> vendas4 = new ArrayList<>();
        vendas4.add(AdministraDados.listaCPU.get(1));
        vendas4.add(AdministraDados.listaRAM.get(0));
        vendas4.add(AdministraDados.listaRAM.get(0));
        vendas4.add(AdministraDados.listaRAM.get(0));
        vendas4.add(AdministraDados.listaRAM.get(0));
        vendas4.add(AdministraDados.listaFonte.get(1));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(2), AdministraDados.clienteLista.get(1), false, vendas4);
        

        ArrayList<Produto> vendas5 = new ArrayList<>();
        vendas5.add(AdministraDados.listaCPU.get(4));
        vendas5.add(AdministraDados.listaFonte.get(3));
        vendas5.add(AdministraDados.listaDA.get(1));
        vendas5.add(AdministraDados.listaDA.get(4));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(4), AdministraDados.clienteLista.get(2), false, vendas5);
        

        ArrayList<Produto> vendas6 = new ArrayList<>();
        vendas6.add(AdministraDados.listaGPU.get(2));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(3), AdministraDados.clienteLista.get(1), true, vendas6);
        

        ArrayList<Produto> vendas7 = new ArrayList<>();
        vendas7.add(AdministraDados.listaCPU.get(2));
        vendas7.add(AdministraDados.listaDA.get(0));
        vendas7.add(AdministraDados.listaFonte.get(3));
        vendas7.add(AdministraDados.listaMB.get(0));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(2), AdministraDados.clienteLista.get(4), true, vendas7);
        

        ArrayList<Produto> vendas8 = new ArrayList<>();
        vendas8.add(AdministraDados.listaCPU.get(3));
        vendas8.add(AdministraDados.listaMB.get(2));
        vendas8.add(AdministraDados.listaFonte.get(4));
        vendas8.add(AdministraDados.listaFonte.get(3));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(1), AdministraDados.clienteLista.get(3), true, vendas8);
        

        ArrayList<Produto> vendas9 = new ArrayList<>();
        vendas9.add(AdministraDados.listaCPU.get(1));
        vendas9.add(AdministraDados.listaRAM.get(0));
        vendas9.add(AdministraDados.listaRAM.get(3));
        vendas9.add(AdministraDados.listaMB.get(3));
        AdministraDados.realizaVenda(AdministraDados.funcionarioLista.get(4), AdministraDados.clienteLista.get(0), false, vendas9);
        

        
        
    }

    public static void main(String[] args) {

        rotinaInicializacao();
        TelaPrincipal telaPrincipal = new TelaPrincipal(AdministraDados.funcionarioLista.get(1));
        telaPrincipal.abreTela();
    }

}
