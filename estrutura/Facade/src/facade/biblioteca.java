/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class biblioteca{
    String login;
    String senha;
    ArrayList<String> usuario = new ArrayList();
    area area= new area("");
    autores autor=new autores("");
    editora editora =new editora("");
    titulo titulo = new titulo("");
    ArrayList<String> lista = new ArrayList<>();
    ArrayList<String> display = new ArrayList();

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
    

    

    
    public void inserir(){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o nome do livro: ");
        this.titulo.setTitulo(input.next());
        this.display.add(this.titulo.getTitulo());
        System.out.print("Insira o autor do livro: ");
        this.autor.setAutor(input.next());
        this.display.add(this.autor.getAutor());
        System.out.print("Insira a editora do livro: ");
        this.editora.setEditora(input.next());
        this.display.add(this.editora.getEditora());
        System.out.print("Insira a area de conhecimento do livro: ");
        this.area.setArea(input.next());
        this.display.add(this.area.getArea());
        
        
        
    }
    public void print(){
        System.out.println("Informações registradas:");
        for(int i = 0; i < this.display.size(); i++) {
            System.out.println(display.get(i));
            System.out.println("---------------------------");
            
        }
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
     public void registrar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o Login: ");
        this.usuario.add(input.next());
        System.out.print("Insira a senha: ");
        this.usuario.add(input.next());
        menu();
    }
    public void menu(){
        Scanner input = new Scanner(System.in);
        Boolean login = true;
        System.out.println("""
                           Menu:
                           0 - registrar novo usuário
                           1 - registrar livro
                           2 - mostrar livros
                           3 - logout
                           """);
        String caso = input.next();
        switch(caso){
            case "0" -> {
                registrar();
                menu();
            }
            case "1" -> {
                inserir();
                menu();
            }
            case "2" -> {
                print();
                menu();
            }
            case "3" -> {
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
                
            }
            default -> {
                System.out.println("Opção inválida");
                menu();
            }
        }
        
                
    }
    
    
}
