package abstract_factory;

public class Romance implements Livro {

    @Override
    public void exibirInfoLivro() {
        System.out.println("Categoria: Romance \nSinopse: Era uma vez... \nN° Paginas:...");
    }
}
