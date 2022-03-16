package builder;

public class Cliente {
    
    public static void main(String[] args){
        Bibliotecario usuario = new Bibliotecario(new Livros());
        
        usuario.mostrar();
        
        Livros livro = usuario.getLivro();
        
        System.out.println("Livro: " + livro.nome + "\n" + livro.genero + "\n" + livro.autor);
        
        usuario = new Bibliotecario(new Editora());
        usuario.getEditora();
        Editora editora = usuario.getEditora();
        System.out.println("Editora: "+ editora.nomeE);
     
        
    }


}
