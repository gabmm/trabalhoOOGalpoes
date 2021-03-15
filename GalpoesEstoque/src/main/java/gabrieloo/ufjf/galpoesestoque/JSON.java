/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import gabrieloo.ufjf.galpoesestoque.pessoas.Cliente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import gabrieloo.ufjf.galpoesestoque.pessoas.Gerente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Vendedor;
import gabrieloo.ufjf.galpoesestoque.produtos.CPU;
import gabrieloo.ufjf.galpoesestoque.produtos.DispositivoArmazenamento;
import gabrieloo.ufjf.galpoesestoque.produtos.Fonte;
import gabrieloo.ufjf.galpoesestoque.produtos.GPU;
import gabrieloo.ufjf.galpoesestoque.produtos.MemoriaRAM;
import gabrieloo.ufjf.galpoesestoque.produtos.Motherboard;
import gabrieloo.ufjf.galpoesestoque.vendas.Venda;
import java.util.ArrayList;

/**
 *
 * @author gabriel  - matricula 201935032
 */
public class JSON {
    
    public static String toJSONCliente(ArrayList<Cliente> clientes){
        Gson gson = new Gson();
        String json = gson.toJson(clientes);
        
        return json;
    }
    
    public static ArrayList<Cliente> toCliente(String conteudo){
        Gson gson = new Gson();
        Type clientesTipo = new TypeToken<ArrayList<Cliente>>() {
        }.getType();
        ArrayList<Cliente> clientes = gson.fromJson(conteudo, clientesTipo);
        
        return clientes;
    }
    
//    public static String toJSONFuncionario(ArrayList<Funcionario> funcionarios){
//        Gson gson = new Gson();
//        String json = gson.toJson(funcionarios);
//        
//        return json;
//    }
//    
//    public static ArrayList<Funcionario> toFuncionario(String conteudo){
//        Gson gson = new Gson();
//        Type funcionariosTipo = new TypeToken<ArrayList<Funcionario>>() {
//        }.getType();
//        ArrayList<Funcionario> funcionarios = gson.fromJson(conteudo, funcionariosTipo);
//        
//        return funcionarios;
//    }
    
    public static String toJSONGerente(ArrayList<Funcionario> funcionarios){
        Gson gson = new Gson();
        
        ArrayList<Gerente> gerentes = new ArrayList<>();
        
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getClass().getSimpleName().equals("Gerente"))
                gerentes.add((Gerente) funcionario);
        }
        
        String json = gson.toJson(funcionarios);
        
        return json;
    }
    
    public static ArrayList<Gerente> toGerente(String conteudo){
        Gson gson = new Gson();
        Type gerenteTipo = new TypeToken<ArrayList<Gerente>>() {
        }.getType();
        ArrayList<Gerente> gerentes = gson.fromJson(conteudo, gerenteTipo);
        
        return gerentes;
    }
    
    public static String toJSONVendedor(ArrayList<Funcionario> funcionarios){
        Gson gson = new Gson();
        
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getClass().getSimpleName().equals("Vendedor"))
                vendedores.add((Vendedor) funcionario);
        }
        
        String json = gson.toJson(vendedores);
        
        return json;
    }
    
    public static ArrayList<Vendedor> toVendedor(String conteudo){
        Gson gson = new Gson();
        Type vendedoresTipo = new TypeToken<ArrayList<Vendedor>>() {
        }.getType();
        ArrayList<Vendedor> vendedores = gson.fromJson(conteudo, vendedoresTipo);
        
        return vendedores;
    }
    
    public static String toJSONVenda(ArrayList<Venda> vendas){
        Gson gson = new Gson();
        String json = gson.toJson(vendas);
        
        return json;
    }
    
    public static ArrayList<Venda> toVenda(String conteudo){
        Gson gson = new Gson();
        Type vendasTipo = new TypeToken<ArrayList<Venda>>() {
        }.getType();
        ArrayList<Venda> vendas = gson.fromJson(conteudo, vendasTipo);
        
        return vendas;
    }
    
    public static String toJSONCPU(ArrayList<CPU> cpus){
        Gson gson = new Gson();
        String json = gson.toJson(cpus);
        
        return json;
    }
    
    public static ArrayList<CPU> toCPU(String conteudo){
        Gson gson = new Gson();
        Type cpusTipo = new TypeToken<ArrayList<CPU>>() {
        }.getType();
        ArrayList<CPU> cpus = gson.fromJson(conteudo, cpusTipo);
        
        return cpus;
    }
    
    public static String toJSONGPU(ArrayList<GPU> gpus){
        Gson gson = new Gson();
        String json = gson.toJson(gpus);
        
        return json;
    }
    
    public static ArrayList<GPU> toGPU(String conteudo){
        Gson gson = new Gson();
        Type gpusTipo = new TypeToken<ArrayList<GPU>>() {
        }.getType();
        ArrayList<GPU> gpus = gson.fromJson(conteudo, gpusTipo);
        
        return gpus;
    }
    
    public static String toJSONMemoriaRAM(ArrayList<MemoriaRAM> rams){
        Gson gson = new Gson();
        String json = gson.toJson(rams);
        
        return json;
    }
    
    public static ArrayList<MemoriaRAM> toMemoriaRAM(String conteudo){
        Gson gson = new Gson();
        Type ramsTipo = new TypeToken<ArrayList<MemoriaRAM>>() {
        }.getType();
        ArrayList<MemoriaRAM> rams = gson.fromJson(conteudo, ramsTipo);
        
        return rams;
    }
    
    public static String toJSONMotherboard(ArrayList<Motherboard> mb){
        Gson gson = new Gson();
        String json = gson.toJson(mb);
        
        return json;
    }
    
    public static ArrayList<Motherboard> toMotherboard(String conteudo){
        Gson gson = new Gson();
        Type mbTipo = new TypeToken<ArrayList<Motherboard>>() {
        }.getType();
        ArrayList<Motherboard> mb = gson.fromJson(conteudo, mbTipo);
        
        return mb;
    }
    
    public static String toJSONFonte(ArrayList<Fonte> fontes){
        Gson gson = new Gson();
        String json = gson.toJson(fontes);
        
        return json;
    }
    
    public static ArrayList<Fonte> toFonte(String conteudo){
        Gson gson = new Gson();
        Type fontesTipo = new TypeToken<ArrayList<Fonte>>() {
        }.getType();
        ArrayList<Fonte> fontes = gson.fromJson(conteudo, fontesTipo);
        
        return fontes;
    }
    
    public static String toJSONDispositivoArmazenamento(ArrayList<DispositivoArmazenamento> da){
        Gson gson = new Gson();
        String json = gson.toJson(da);
        
        return json;
    }
    
    public static ArrayList<DispositivoArmazenamento> toDispositivoArmazenamento(String conteudo){
        Gson gson = new Gson();
        Type daTipo = new TypeToken<ArrayList<DispositivoArmazenamento>>() {
        }.getType();
        ArrayList<DispositivoArmazenamento> da = gson.fromJson(conteudo, daTipo);
        
        return da;
    }
    
}
