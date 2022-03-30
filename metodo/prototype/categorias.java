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
public abstract class categorias {
    String livros;
    String autores;
    String editora;
    String área;
    ArrayList<String> display = new ArrayList();

    public categorias(String livros, String autores, String editora, String área) {
        this.livros = livros;
        this.autores = autores;
        this.editora = editora;
        this.área = área;
    }

    public String getLivros() {
        return livros;
    }

    public void setLivros(String livros) {
        this.livros = livros;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getÁrea() {
        return área;
    }

    public void setÁrea(String área) {
        this.área = área;
    }
    public void inserir(){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o nome do livro: ");
        setLivros(input.next());
        this.display.add(getLivros());
        System.out.print("Insira o autor do livro: ");
        setAutores(input.next());
        this.display.add(getAutores());
        System.out.print("Insira a editora do livro: ");
        setEditora(input.next());
        this.display.add(getEditora());
        System.out.print("Insira a area de conhecimento do livro: ");
        setÁrea(input.next());
        this.display.add(getÁrea());
        
        
        
    }
    public void print(){
        System.out.println("Informações registradas:");
        for(int i = 0; i < this.display.size(); i++) {
            System.out.println(display.get(i));
            System.out.println("---------------------------");
            
        }
    }
    public abstract categorias clonar();
    
}
