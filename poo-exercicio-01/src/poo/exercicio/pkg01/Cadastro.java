package poo.exercicio.pkg01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import poo.exercicio.pkg01.vo.Funcionario;
import poo.exercicio.pkg01.vo.Setor;

public class Cadastro {
    
    public ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public void cadastrarFuncionario() throws IOException{
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        System.out.println("--- Cadastro de funcionários ---");
        System.out.print("Código: ");
        funcionario.setCodigo(scanner.nextInt());
        System.out.print("Nome: ");
        funcionario.setNome(in.readLine());
        System.out.print("Idade: ");
        funcionario.setIdade(scanner.nextInt());
        Setor setor = new Setor();
        scanner = new Scanner(System.in);
        System.out.print("Codigo do setor: ");
        setor.setCodigo(scanner.nextInt());
        System.out.print("Nome do setor: ");
        setor.setNome((in.readLine()));
        
        funcionario.setSetor(setor);
        this.funcionarios.add(funcionario);
        
        System.out.println("Funcionário cadastrado com sucesso!");
    }
    
    public void listarFuncionarios(){
        
        System.out.println("--- Funcionarios cadastrados --- \n");
        for(Funcionario funcionario : funcionarios){
            System.out.println("Código: "+funcionario.getCodigo());
            System.out.println("Nome: "+funcionario.getNome());
            System.out.println("Idade: "+funcionario.getIdade());
            Setor setor = funcionario.getSetor();
            System.out.println("Setor: "+setor.getNome());
            System.out.println("");
        
        }   
    }
    
    public void deletarFuncionarios(){
       Scanner scanner = new Scanner(System.in);
       int codigo;
       Funcionario funcionario = new Funcionario();
       System.out.println("--- Remover Funcionário --- \n");
       System.out.print("Digite o código do funciońario a ser deletado: ");
       codigo = scanner.nextInt();
       funcionario.setCodigo(codigo);
       funcionarios.remove(funcionario);       
       System.out.println("\n Funcionario removido com sucesso");
    }
    
}
