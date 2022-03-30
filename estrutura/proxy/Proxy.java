/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author gabri
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String login="";
        String senha="";
        String livros="";
        String autores="";
        String editora ="";
        String área = "";
        System.out.println("Primeiro registro:");
        bibliotecaProxy start = new bibliotecaProxy(login, senha, livros, autores, editora, área);
        start.registrar();
    }
    
}
