package poo.exercicio.pkg01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         
        Cadastro cadastrar = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        int codigo;
        
        System.out.println("\n --- Menu --- \n");
        
        whilePrograma:
        while(true){
            System.out.println("1 - Cadastrar funcionário:");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Remover funcionário");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            codigo = scanner.nextInt();
            switch(codigo){
                case 1:
                    cadastrar.cadastrarFuncionario();
                    break;
                case 2:
                    cadastrar.listarFuncionarios();
                    break;
                case 3:
                    cadastrar.deletarFuncionarios();
                    break;
                case 4:
                    break whilePrograma;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        
        
        }
        
        
    }
    
}
