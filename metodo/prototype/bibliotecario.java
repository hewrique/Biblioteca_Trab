/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class bibliotecario extends categorias{
    String login;
    String senha;
    ArrayList<String> usuario = new ArrayList();

    public bibliotecario(String login, String senha, String livros, String autores, String editora, String área) {
        super(livros, autores, editora, área);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void registrar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o Login: ");
        this.usuario.add(input.next());
        System.out.print("Insira a senha: ");
        this.usuario.add(input.next());
        menu();
    }
    public Boolean login(){
        Boolean retorno = false;
        int contagem = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o Login: ");
        if (this.usuario.contains(input.next())) {
            contagem+=1;
        }
        System.out.print("Insira a senha: ");
        if (this.usuario.contains(input.next())) {
            contagem+=1;
        }
        if(contagem ==2){
            retorno = true;
        }
        return retorno;
    }
    public void menu(){
        Scanner input = new Scanner(System.in);
        Boolean login = true;
        System.out.println("Menu:\n0 - registrar novo usuário \n1 - registrar livro \n2 - mostrar livros \n3 - logout");
        String caso = input.next();
        switch(caso){
            case "0":
                registrar();
                menu();
            
            case "1":
                super.inserir();
                menu();
            
            case "2":
                super.print();
                menu();
            
            case "3":
                login = login();
                if(login == false){
                    System.out.println("Usuário não encontrado");
                    while(login ==false){
                        login = login();
                    }
                    menu();
                    
                    break;
                }
                if(login == true){
                    System.out.println("Usuário logado com sucesso!");
                    menu();
                    break;
                }
                
            
            default:
                System.out.println("Opção inválida");
                menu();
            }
        }
        
                
    
    @Override
    public categorias clonar(){
        return new bibliotecario(this.login, this.senha, this.livros, this.autores, this.editora, this.área);
    }
    
}

