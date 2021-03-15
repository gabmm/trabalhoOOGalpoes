/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
 */
package gabrieloo.ufjf.galpoesestoque;

import java.util.Date;

public class Main {

    private static void rotinaInicializacao() {
        AdministraDados.inicializacaoListas();

        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(0).setMarca(6);
        AdministraDados.listaCPU.get(0).setPreco(1300);
        AdministraDados.listaCPU.get(0).setNome("Ryzen 5 3500x");
        AdministraDados.listaCPU.get(0).setCoreThreads(0);
        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(1).setMarca(8);
        AdministraDados.listaCPU.get(1).setPreco(1238);
        AdministraDados.listaCPU.get(1).setNome("CORE I5-10400F");
        AdministraDados.listaCPU.get(1).setCoreThreads(7);
        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(2).setMarca(8);
        AdministraDados.listaCPU.get(2).setPreco(890);
        AdministraDados.listaCPU.get(2).setNome("Core i3 10100F");
        AdministraDados.listaCPU.get(2).setCoreThreads(5);
        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(3).setMarca(6);
        AdministraDados.listaCPU.get(3).setPreco(1420);
        AdministraDados.listaCPU.get(3).setNome("RYZEN 5 3500X");
        AdministraDados.listaCPU.get(3).setCoreThreads(6);
        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(4).setMarca(6);
        AdministraDados.listaCPU.get(4).setPreco(940);
        AdministraDados.listaCPU.get(4).setNome("Ryzen 3 2200G");
        AdministraDados.listaCPU.get(4).setCoreThreads(4);
        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(5).setMarca(8);
        AdministraDados.listaCPU.get(5).setPreco(890);
        AdministraDados.listaCPU.get(5).setNome("Core I7 3770");
        AdministraDados.listaCPU.get(5).setCoreThreads(5);

        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(0).setMarca(7);
        AdministraDados.listaDA.get(0).setPreco(250);
        AdministraDados.listaDA.get(0).setTipo(0);
        AdministraDados.listaDA.get(0).setCapacidade(4);
        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(1).setMarca(10);
        AdministraDados.listaDA.get(1).setPreco(292);
        AdministraDados.listaDA.get(1).setTipo(0);
        AdministraDados.listaDA.get(1).setCapacidade(5);
        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(2).setMarca(10);
        AdministraDados.listaDA.get(2).setPreco(635);
        AdministraDados.listaDA.get(2).setTipo(0);
        AdministraDados.listaDA.get(2).setCapacidade(6);
        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(3).setMarca(7);
        AdministraDados.listaDA.get(3).setPreco(360);
        AdministraDados.listaDA.get(3).setTipo(1);
        AdministraDados.listaDA.get(3).setCapacidade(2);
        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(4).setMarca(11);
        AdministraDados.listaDA.get(4).setPreco(303);
        AdministraDados.listaDA.get(4).setTipo(1);
        AdministraDados.listaDA.get(4).setCapacidade(2);
        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(5).setMarca(11);
        AdministraDados.listaDA.get(5).setPreco(445);
        AdministraDados.listaDA.get(5).setTipo(1);
        AdministraDados.listaDA.get(5).setCapacidade(3);

        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(0).setMarca(3);
        AdministraDados.listaFonte.get(0).setPreco(500);
        AdministraDados.listaFonte.get(0).setEficiencia(2);
        AdministraDados.listaFonte.get(0).setPower(6);
        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(1).setMarca(12);
        AdministraDados.listaFonte.get(1).setPreco(150);
        AdministraDados.listaFonte.get(1).setEficiencia(0);
        AdministraDados.listaFonte.get(1).setPower(4);
        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(2).setMarca(0);
        AdministraDados.listaFonte.get(2).setPreco(300);
        AdministraDados.listaFonte.get(2).setEficiencia(1);
        AdministraDados.listaFonte.get(2).setPower(4);
        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(3).setMarca(13);
        AdministraDados.listaFonte.get(3).setPreco(410);
        AdministraDados.listaFonte.get(3).setEficiencia(1);
        AdministraDados.listaFonte.get(3).setPower(5);
        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(4).setMarca(13);
        AdministraDados.listaFonte.get(4).setPreco(660);
        AdministraDados.listaFonte.get(4).setEficiencia(2);
        AdministraDados.listaFonte.get(4).setPower(9);
        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(5).setMarca(14);
        AdministraDados.listaFonte.get(5).setPreco(50);
        AdministraDados.listaFonte.get(5).setEficiencia(0);
        AdministraDados.listaFonte.get(5).setPower(3);

        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(0).setMarca(0);
        AdministraDados.listaGPU.get(0).setPreco(2300);
        AdministraDados.listaGPU.get(0).setNome("RTX 2060");
        AdministraDados.listaGPU.get(0).setMemoria(6);
        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(1).setMarca(1);
        AdministraDados.listaGPU.get(1).setPreco(10510);
        AdministraDados.listaGPU.get(1).setNome("RX 2070");
        AdministraDados.listaGPU.get(1).setMemoria(4);
        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(2).setMarca(9);
        AdministraDados.listaGPU.get(2).setPreco(2267);
        AdministraDados.listaGPU.get(2).setNome("RX 6800");
        AdministraDados.listaGPU.get(2).setMemoria(9);
        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(3).setMarca(1);
        AdministraDados.listaGPU.get(3).setPreco(1700);
        AdministraDados.listaGPU.get(3).setNome("RX 6800");
        AdministraDados.listaGPU.get(3).setMemoria(4);
        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(4).setMarca(9);
        AdministraDados.listaGPU.get(4).setPreco(2267);
        AdministraDados.listaGPU.get(4).setNome("GTX 1650");
        AdministraDados.listaGPU.get(4).setMemoria(5);
        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(5).setMarca(6);
        AdministraDados.listaGPU.get(5).setPreco(2070);
        AdministraDados.listaGPU.get(5).setNome("RX 5500");
        AdministraDados.listaGPU.get(5).setMemoria(6);
        
        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(0).setMarca(4);
        AdministraDados.listaRAM.get(0).setPreco(200);
        AdministraDados.listaRAM.get(0).setCapacidade(4);
        AdministraDados.listaRAM.get(0).setClock(2667);
        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(1).setMarca(3);
        AdministraDados.listaRAM.get(1).setPreco(120);
        AdministraDados.listaRAM.get(1).setCapacidade(2);
        AdministraDados.listaRAM.get(1).setClock(1334);
        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(2).setMarca(4);
        AdministraDados.listaRAM.get(2).setPreco(295);
        AdministraDados.listaRAM.get(2).setCapacidade(6);
        AdministraDados.listaRAM.get(2).setClock(2666);
        
        AdministraDados.cadastraMotherboard();
        AdministraDados.listaMB.get(0).setMarca(1);
        AdministraDados.listaMB.get(0).setPreco(770);
        AdministraDados.listaMB.get(0).setChipset(8);
        AdministraDados.listaMB.get(0).setTamanho(0);

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
    }

    public static void main(String[] args) {

        rotinaInicializacao();

//        System.out.println(AdministraDados.listaCPU.get(0));
//        System.out.println(AdministraDados.listaDA.get(0));
//        System.out.println(AdministraDados.listaFonte.get(0));
//        System.out.println(AdministraDados.listaGPU.get(0));
//        System.out.println(AdministraDados.listaRAM.get(0));
//        System.out.println(AdministraDados.listaRAM.get(1));
//        System.out.println(AdministraDados.listaMB.get(0));
//        System.out.println("");
//        System.out.println(AdministraDados.clienteLista.get(0));
//        System.out.println("");
//        System.out.println(AdministraDados.funcionarioLista.get(0));
//        System.out.println("Salario: R$" + AdministraDados.funcionarioLista.get(0).calculaSalario());
//        System.out.println(AdministraDados.funcionarioLista.get(1));
//        System.out.println("Salario: R$" + AdministraDados.funcionarioLista.get(1).calculaSalario());
//        System.out.println("");
//        System.out.println(AdministraDados.funcionarioLista.get(1).vendasRealizadas.get(0));
//        System.out.println(AdministraDados.clienteLista.get(0).ordens.get(1));
//        System.out.println("Valor em caixa: R$" + Caixa.getCaixa());
//        System.out.println("Valor a pagar de salarios: R$" + Caixa.calculaPagamentoSalarios());
//        System.out.println("Saldo: R$" + Caixa.getSaldo());
//
//        TelaLogin tela = new TelaLogin();
//        tela.abreTela();
//        TelaProduto tela = new TelaProduto();
//        tela.incializaTelaProduto();
        TelaPrincipal telaPrincipal = new TelaPrincipal(AdministraDados.funcionarioLista.get(1));
        telaPrincipal.abreTela();
    }

}
