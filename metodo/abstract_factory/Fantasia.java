package abstract_factory;

public class Fantasia implements Livro{

    @Override
    public void exibirInfoLivro() {
        System.out.println("Categoria: Fantasia \nSinopse: Era uma vez... \nN° Paginas:...");
    }
}
